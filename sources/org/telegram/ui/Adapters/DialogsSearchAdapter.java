package org.telegram.ui.Adapters;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilteredSearchView;

public abstract class DialogsSearchAdapter extends RecyclerListView.SelectionAdapter {
    private Runnable cancelShowMoreAnimation;
    private int currentItemCount;
    private String currentMessagesQuery;
    public DialogsSearchAdapterDelegate delegate;
    private final DialogsActivity dialogsActivity;
    private int dialogsType;
    private ColoredImageSpan filterArrowsIcon;
    private ArrayList filterDialogIds;
    private FilteredSearchView.Delegate filtersDelegate;
    private int folderId;
    private boolean forceLoadingMessages;
    private RecyclerListView innerListView;
    private DefaultItemAnimator itemAnimator;
    private int lastForumReqId;
    private int lastGlobalSearchId;
    private int lastLocalSearchId;
    private int lastMessagesSearchFilterFlags;
    private int lastMessagesSearchId;
    private String lastMessagesSearchString;
    private int lastReqId;
    private int lastSearchId;
    private String lastSearchText;
    private long lastShowMoreUpdate;
    private boolean localMessagesSearchEndReached;
    private boolean localTipArchive;
    private final Context mContext;
    private EmptyLayout messagesEmptyLayout;
    private boolean messagesSearchEndReached;
    private int needMessagesSearch;
    private int nextSearchRate;
    public String publicPostsHashtag;
    public int publicPostsLastRate;
    public int publicPostsTotalCount;
    private final Theme.ResourcesProvider resourcesProvider;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchHashtagRunnable;
    private Runnable searchRunnable;
    private Runnable searchRunnable2;
    private boolean searchWas;
    private long selfUserId;
    public View showMoreHeader;
    private String sponsoredQuery;
    private int sponsoredReqId;
    int waitingResponseCount;
    private Filter currentMessagesFilter = Filter.All;
    private int searchHashtagRequest = -1;
    private ArrayList searchResult = new ArrayList();
    public ArrayList publicPosts = new ArrayList();
    private final ArrayList searchContacts = new ArrayList();
    private final ArrayList searchTopics = new ArrayList();
    private ArrayList searchResultNames = new ArrayList();
    private final ArrayList searchForumResultMessages = new ArrayList();
    private final ArrayList searchResultMessages = new ArrayList();
    private final ArrayList searchResultHashtags = new ArrayList();
    public final ArrayList sponsoredPeers = new ArrayList();
    private final HashSet seenSponsoredPeers = new HashSet();
    private int reqId = 0;
    private int reqForumId = 0;
    public int localMessagesLoadingRow = -1;
    public boolean showMoreAnimation = false;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList recentSearchObjects = new ArrayList();
    private final ArrayList filteredRecentSearchObjects = new ArrayList();
    private final ArrayList filtered2RecentSearchObjects = new ArrayList();
    private String filteredRecentQuery = null;
    private LongSparseArray recentSearchObjectsById = new LongSparseArray();
    private ArrayList localTipDates = new ArrayList();
    private int messagesSectionPosition = -1;
    boolean globalSearchCollapsed = true;
    boolean phoneCollapsed = true;

    public static class DialogSearchResult {
        public int date;
        public CharSequence name;
        public TLObject object;
    }

    public interface DialogsSearchAdapterDelegate {
        void didPressedBlockedDialog(View view, long j);

        void didPressedOnSubDialog(long j);

        long getSearchForumDialogId();

        boolean isSelected(long j);

        void needClearList();

        void needRemoveHint(long j);

        void runResultsEnterAnimation();

        void searchStateChanged(boolean z, boolean z2);
    }

    public interface OnRecentSearchLoaded {
        void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray);
    }

    public static class RecentSearchObject {
        public int date;
        public long did;
        public TLObject object;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    protected abstract void openBotApp(TLRPC.User user);

    protected abstract void openPublicPosts();

    protected abstract void openSponsoredOptions(ProfileSearchCell profileSearchCell, TLRPC.TL_sponsoredPeer tL_sponsoredPeer);

    public enum Filter {
        All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
        Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
        Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
        Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);

        public final int flags;
        public final int strFromResId;
        public final int strResId;

        Filter(int i, int i2, int i3) {
            this.flags = i;
            this.strResId = i2;
            this.strFromResId = i3;
        }
    }

    public void resetFilter() {
        this.currentMessagesFilter = Filter.All;
    }

    public void setFilterDialogIds(ArrayList arrayList) {
        this.filterDialogIds = arrayList;
    }

    public boolean isSearching() {
        return this.waitingResponseCount > 0;
    }

    public static class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private boolean drawChecked;
        private final Context mContext;
        private Theme.ResourcesProvider resourcesProvider;
        private boolean showPremiumBlock;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public CategoryAdapterRecycler(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            this.drawChecked = z;
            this.mContext = context;
            this.currentAccount = i;
            this.showPremiumBlock = z2;
            this.resourcesProvider = resourcesProvider;
        }

        public void setIndex(int i) {
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HintDialogCell hintDialogCell = new HintDialogCell(this.mContext, this.drawChecked, this.resourcesProvider);
            if (this.showPremiumBlock) {
                hintDialogCell.showPremiumBlocked();
            }
            hintDialogCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
            return new RecyclerListView.Holder(hintDialogCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String monoForumTitle;
            HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(this.currentAccount).hints.get(i);
            new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            TLRPC.User user = null;
            if (j != 0) {
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                chat = null;
            } else {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                } else {
                    long j3 = peer.chat_id;
                    if (j3 != 0) {
                        j = -j3;
                        chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                    } else {
                        chat = null;
                        j = 0;
                    }
                }
            }
            hintDialogCell.setTag(Long.valueOf(j));
            if (user != null) {
                monoForumTitle = UserObject.getFirstName(user);
            } else if (chat == null) {
                monoForumTitle = "";
            } else {
                monoForumTitle = chat.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat) : chat.title;
            }
            hintDialogCell.setDialog(j, true, monoForumTitle);
        }

        @Override
        public int getItemCount() {
            return MediaDataController.getInstance(this.currentAccount).hints.size();
        }
    }

    public boolean filter(Object obj) {
        if (this.dialogsType != 14) {
            return true;
        }
        if (obj instanceof TLRPC.User) {
            if (((TLRPC.User) obj).bot) {
                return this.dialogsActivity.allowBots;
            }
            return this.dialogsActivity.allowUsers;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        if (ChatObject.isChannel(chat)) {
            return this.dialogsActivity.allowChannels;
        }
        if (ChatObject.isMegagroup(chat)) {
            DialogsActivity dialogsActivity = this.dialogsActivity;
            return dialogsActivity.allowGroups || dialogsActivity.allowMegagroups;
        }
        DialogsActivity dialogsActivity2 = this.dialogsActivity;
        return dialogsActivity2.allowGroups || dialogsActivity2.allowLegacyGroups;
    }

    public DialogsSearchAdapter(Context context, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.itemAnimator = defaultItemAnimator;
        this.dialogsActivity = dialogsActivity;
        this.resourcesProvider = resourcesProvider;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) {
            @Override
            protected boolean filter(TLObject tLObject) {
                return DialogsSearchAdapter.this.filter(tLObject);
            }
        };
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
            @Override
            public LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
            }

            @Override
            public LongSparseArray getExcludeUsers() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
            }

            @Override
            public void onDataSetChanged(int i3) {
                DialogsSearchAdapter dialogsSearchAdapter = DialogsSearchAdapter.this;
                dialogsSearchAdapter.waitingResponseCount--;
                dialogsSearchAdapter.lastGlobalSearchId = i3;
                if (DialogsSearchAdapter.this.lastLocalSearchId != i3) {
                    DialogsSearchAdapter.this.searchResult.clear();
                }
                if (DialogsSearchAdapter.this.lastMessagesSearchId != i3) {
                    DialogsSearchAdapter.this.searchResultMessages.clear();
                }
                DialogsSearchAdapter.this.searchWas = true;
                DialogsSearchAdapter dialogsSearchAdapter2 = DialogsSearchAdapter.this;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter2.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter2.waitingResponseCount > 0, true);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = DialogsSearchAdapter.this.delegate;
                if (dialogsSearchAdapterDelegate2 != null) {
                    dialogsSearchAdapterDelegate2.runResultsEnterAnimation();
                }
            }

            @Override
            public void onSetHashtags(ArrayList arrayList, HashMap map) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    DialogsSearchAdapter.this.searchResultHashtags.add(((SearchAdapterHelper.HashtagObject) arrayList.get(i3)).hashtag);
                }
                DialogsSearchAdapter dialogsSearchAdapter = DialogsSearchAdapter.this;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, false);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
            }

            @Override
            public boolean canApplySearchResults(int i3) {
                return i3 == DialogsSearchAdapter.this.lastSearchId;
            }
        });
        this.searchAdapterHelper.setAllowGlobalResults(z);
        this.mContext = context;
        this.needMessagesSearch = i;
        this.dialogsType = i2;
        this.selfUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        loadRecentSearch();
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
    }

    public RecyclerListView getInnerListView() {
        return this.innerListView;
    }

    public void setDelegate(DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate) {
        this.delegate = dialogsSearchAdapterDelegate;
    }

    public boolean isMessagesSearchEndReached() {
        return (this.delegate.getSearchForumDialogId() == 0 || this.localMessagesSearchEndReached) && this.messagesSearchEndReached;
    }

    public void loadMoreSearchMessages() {
        if ((this.reqForumId == 0 || this.reqId == 0) && this.lastMessagesSearchId == this.lastSearchId) {
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() != 0 && !this.localMessagesSearchEndReached) {
                searchForumMessagesInternal(this.lastMessagesSearchString, this.lastMessagesSearchId);
            } else {
                searchMessagesInternal(this.lastMessagesSearchString, this.lastMessagesSearchId);
            }
        }
    }

    public String getLastSearchString() {
        return this.lastMessagesSearchString;
    }

    private void searchForumMessagesInternal(final String str, final int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() == 0 || this.needMessagesSearch == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.lastMessagesSearchString) && TextUtils.isEmpty(str)) {
            return;
        }
        if (this.reqForumId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqForumId, true);
            this.reqForumId = 0;
        }
        if (TextUtils.isEmpty(str)) {
            this.filteredRecentQuery = null;
            this.searchResultMessages.clear();
            this.searchForumResultMessages.clear();
            this.lastForumReqId = 0;
            this.lastMessagesSearchString = null;
            this.searchWas = false;
            notifyDataSetChanged();
            return;
        }
        if (this.dialogsType == 15) {
            return;
        }
        long searchForumDialogId = this.delegate.getSearchForumDialogId();
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchForumDialogId);
        if (str.equals(this.lastMessagesSearchString) && !this.searchForumResultMessages.isEmpty()) {
            tL_messages_search.add_offset = this.searchForumResultMessages.size();
        }
        this.lastMessagesSearchString = str;
        final int i2 = this.lastForumReqId + 1;
        this.lastForumReqId = i2;
        this.reqForumId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchForumMessagesInternal$1(str, i2, i, tL_messages_search, tLObject, tL_error);
            }
        }, 2);
    }

    public void lambda$searchForumMessagesInternal$1(final String str, final int i, final int i2, final TLRPC.TL_messages_search tL_messages_search, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat.id, chat);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user.id, user);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchForumMessagesInternal$0(i, i2, tL_error, str, tLObject, tL_messages_search, arrayList);
            }
        });
    }

    public void lambda$searchForumMessagesInternal$0(int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, ArrayList arrayList) {
        if (i == this.lastForumReqId && (i2 <= 0 || i2 == this.lastSearchId)) {
            this.waitingResponseCount--;
            if (tL_error == null) {
                this.currentMessagesQuery = str;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                if (tL_messages_search.add_offset == 0) {
                    this.searchForumResultMessages.clear();
                }
                this.nextSearchRate = messages_messages.next_rate;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    int i4 = MessagesController.getInstance(this.currentAccount).deletedHistory.get(MessageObject.getDialogId(message));
                    if (i4 == 0 || message.id > i4) {
                        this.searchForumResultMessages.add((MessageObject) arrayList.get(i3));
                    }
                }
                this.searchWas = true;
                this.localMessagesSearchEndReached = messages_messages.messages.size() != 20;
                if (i2 > 0) {
                    this.lastMessagesSearchId = i2;
                    if (this.lastLocalSearchId != i2) {
                        this.searchResult.clear();
                    }
                    if (this.lastGlobalSearchId != i2) {
                        this.searchAdapterHelper.clear();
                    }
                }
                this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(this.waitingResponseCount > 0, true);
                    this.delegate.runResultsEnterAnimation();
                }
                notifyDataSetChanged();
            }
        }
        this.reqForumId = 0;
    }

    private void searchTopics(String str) {
        this.searchTopics.clear();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.delegate.getSearchForumDialogId());
            String strTrim = str.trim();
            for (int i = 0; i < topics.size(); i++) {
                if (topics.get(i) != null && topics.get(i).title.toLowerCase().contains(strTrim)) {
                    this.searchTopics.add(topics.get(i));
                    topics.get(i).searchQuery = strTrim;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void searchMessagesInternal(final String str, final int i) {
        if (this.needMessagesSearch != 0) {
            if (TextUtils.isEmpty(this.lastMessagesSearchString) && TextUtils.isEmpty(str)) {
                return;
            }
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            if (TextUtils.isEmpty(str) || this.delegate.getSearchForumDialogId() != 0) {
                this.filteredRecentQuery = null;
                this.searchResultMessages.clear();
                this.searchForumResultMessages.clear();
                this.lastReqId = 0;
                this.lastMessagesSearchString = null;
                this.lastMessagesSearchFilterFlags = 0;
                this.searchWas = false;
                notifyDataSetChanged();
                return;
            }
            filterRecent(str);
            this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
            if (this.dialogsType == 15) {
                int i2 = this.waitingResponseCount - 1;
                this.waitingResponseCount = i2;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(i2 > 0, true);
                    this.delegate.runResultsEnterAnimation();
                    return;
                }
                return;
            }
            final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            int i3 = this.currentMessagesFilter.flags;
            tL_messages_searchGlobal.broadcasts_only = (i3 & 2) != 0;
            tL_messages_searchGlobal.groups_only = (i3 & 4) != 0;
            tL_messages_searchGlobal.users_only = (i3 & 8) != 0;
            tL_messages_searchGlobal.limit = 20;
            tL_messages_searchGlobal.q = str;
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = this.folderId;
            if (!str.equals(this.lastMessagesSearchString)) {
                this.forceLoadingMessages = false;
            }
            if (str.equals(this.lastMessagesSearchString) && this.lastMessagesSearchFilterFlags == this.currentMessagesFilter.flags && !this.searchResultMessages.isEmpty() && this.lastMessagesSearchId == this.lastSearchId) {
                ArrayList arrayList = this.searchResultMessages;
                MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.lastMessagesSearchString = str;
            this.lastMessagesSearchFilterFlags = this.currentMessagesFilter.flags;
            final int i4 = this.lastReqId + 1;
            this.lastReqId = i4;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$searchMessagesInternal$4(str, i4, i, tL_messages_searchGlobal, tLObject, tL_error);
                }
            }, 2);
        }
    }

    public void lambda$searchMessagesInternal$4(final String str, final int i, final int i2, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat.id, chat);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user.id, user);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        final HashSet hashSet = new HashSet();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            for (int i6 = 0; i6 < messages_messages2.messages.size(); i6++) {
                TLRPC.Message message = messages_messages2.messages.get(i6);
                long dialogId = MessageObject.getDialogId(message);
                if ((message.out ? MessagesController.getInstance(this.currentAccount).dialogs_read_outbox_max : MessagesController.getInstance(this.currentAccount).dialogs_read_inbox_max).get(Long.valueOf(dialogId)) == null) {
                    hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                }
            }
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchMessagesInternal$2(i, i2, tL_error, str, tLObject, tL_messages_searchGlobal, arrayList);
            }
        };
        if (hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(runnable);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchMessagesInternal$3(hashSet, runnable);
                }
            });
        }
    }

    public void lambda$searchMessagesInternal$2(int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, ArrayList arrayList) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        Integer num;
        boolean z;
        if (i == this.lastReqId && (i2 <= 0 || i2 == this.lastSearchId)) {
            this.waitingResponseCount--;
            if (tL_error == null) {
                this.currentMessagesQuery = str;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                if (tL_messages_searchGlobal.offset_id == 0) {
                    this.searchResultMessages.clear();
                }
                this.nextSearchRate = messages_messages.next_rate;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    int i4 = MessagesController.getInstance(this.currentAccount).deletedHistory.get(MessageObject.getDialogId(message));
                    if (i4 == 0 || message.id > i4) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i3);
                        if (this.searchForumResultMessages.isEmpty()) {
                            this.searchResultMessages.add(messageObject);
                            long dialogId = MessageObject.getDialogId(message);
                            if (message.out) {
                                concurrentHashMap = MessagesController.getInstance(this.currentAccount).dialogs_read_outbox_max;
                            } else {
                                concurrentHashMap = MessagesController.getInstance(this.currentAccount).dialogs_read_inbox_max;
                            }
                            num = concurrentHashMap.get(Long.valueOf(dialogId));
                            if (num == null) {
                                if (num.intValue() < message.id) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                message.unread = z;
                            }
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 < this.searchForumResultMessages.size()) {
                                    MessageObject messageObject2 = (MessageObject) this.searchForumResultMessages.get(i5);
                                    if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                        i5++;
                                    }
                                } else {
                                    this.searchResultMessages.add(messageObject);
                                    long dialogId2 = MessageObject.getDialogId(message);
                                    if (message.out) {
                                        concurrentHashMap = MessagesController.getInstance(this.currentAccount).dialogs_read_outbox_max;
                                    } else {
                                        concurrentHashMap = MessagesController.getInstance(this.currentAccount).dialogs_read_inbox_max;
                                    }
                                    num = concurrentHashMap.get(Long.valueOf(dialogId2));
                                    if (num == null) {
                                        if (num.intValue() < message.id) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        message.unread = z;
                                    }
                                }
                            }
                        }
                    }
                }
                this.searchWas = true;
                this.messagesSearchEndReached = messages_messages.messages.size() != 20;
                if (i2 > 0) {
                    this.lastMessagesSearchId = i2;
                    if (this.lastLocalSearchId != i2) {
                        this.searchResult.clear();
                    }
                    if (this.lastGlobalSearchId != i2) {
                        this.searchAdapterHelper.clear();
                    }
                }
                this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(this.waitingResponseCount > 0, true);
                    this.delegate.runResultsEnterAnimation();
                }
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                this.forceLoadingMessages = false;
                EmptyLayout emptyLayout = this.messagesEmptyLayout;
                if (emptyLayout != null) {
                    emptyLayout.setQuery(this.lastMessagesSearchString);
                }
                notifyDataSetChanged();
            }
        }
        this.reqId = 0;
    }

    public void lambda$searchMessagesInternal$3(HashSet hashSet, Runnable runnable) {
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
            Long l = (Long) pair.second;
            (zBooleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l, Integer.valueOf(MessagesStorage.getInstance(this.currentAccount).getDialogReadMaxSync(zBooleanValue, l.longValue())));
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public boolean hasRecentSearch() {
        return recentSearchAvailable() && getRecentItemsCount() > 0;
    }

    private boolean recentSearchAvailable() {
        int i = this.dialogsType;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15) ? false : true;
    }

    public boolean isSearchWas() {
        return this.searchWas;
    }

    public boolean isRecentSearchDisplayed() {
        return this.needMessagesSearch != 2 && hasRecentSearch();
    }

    public void loadRecentSearch() {
        int i = this.dialogsType;
        if (i == 15) {
            return;
        }
        loadRecentSearch(this.currentAccount, i, new OnRecentSearchLoaded() {
            @Override
            public final void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
                this.f$0.lambda$loadRecentSearch$5(arrayList, longSparseArray);
            }
        });
    }

    public static void loadRecentSearch(final int i, final int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.lambda$loadRecentSearch$8(i, i2, onRecentSearchLoaded);
            }
        });
    }

    public static void lambda$loadRecentSearch$8(int i, int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(i).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            final LongSparseArray longSparseArray = new LongSparseArray();
            while (sQLiteCursorQueryFinalized.next()) {
                long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                if (DialogObject.isEncryptedDialog(jLongValue)) {
                    if (i2 == 0 || i2 == 3) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                        if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                            arrayList3.add(Integer.valueOf(encryptedChatId));
                            RecentSearchObject recentSearchObject = new RecentSearchObject();
                            recentSearchObject.did = jLongValue;
                            recentSearchObject.date = sQLiteCursorQueryFinalized.intValue(1);
                            arrayList4.add(recentSearchObject);
                            longSparseArray.put(recentSearchObject.did, recentSearchObject);
                        }
                    }
                } else if (DialogObject.isUserDialog(jLongValue)) {
                    if (i2 != 2 && !arrayList.contains(Long.valueOf(jLongValue))) {
                        arrayList.add(Long.valueOf(jLongValue));
                        RecentSearchObject recentSearchObject2 = new RecentSearchObject();
                        recentSearchObject2.did = jLongValue;
                        recentSearchObject2.date = sQLiteCursorQueryFinalized.intValue(1);
                        arrayList4.add(recentSearchObject2);
                        longSparseArray.put(recentSearchObject2.did, recentSearchObject2);
                    }
                } else {
                    long j = -jLongValue;
                    if (!arrayList2.contains(Long.valueOf(j))) {
                        arrayList2.add(Long.valueOf(j));
                        RecentSearchObject recentSearchObject3 = new RecentSearchObject();
                        recentSearchObject3.did = jLongValue;
                        recentSearchObject3.date = sQLiteCursorQueryFinalized.intValue(1);
                        arrayList4.add(recentSearchObject3);
                        longSparseArray.put(recentSearchObject3.did, recentSearchObject3);
                    }
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                MessagesStorage.getInstance(i).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                    RecentSearchObject recentSearchObject4 = (RecentSearchObject) longSparseArray.get(DialogObject.makeEncryptedDialogId(arrayList6.get(i3).id));
                    if (recentSearchObject4 != null) {
                        recentSearchObject4.object = arrayList6.get(i3);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                MessagesStorage.getInstance(i).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                for (int i4 = 0; i4 < arrayList7.size(); i4++) {
                    TLRPC.Chat chat = arrayList7.get(i4);
                    long j2 = -chat.id;
                    if (chat.migrated_to != null) {
                        RecentSearchObject recentSearchObject5 = (RecentSearchObject) longSparseArray.get(j2);
                        longSparseArray.remove(j2);
                        if (recentSearchObject5 != null) {
                            arrayList4.remove(recentSearchObject5);
                        }
                    } else {
                        RecentSearchObject recentSearchObject6 = (RecentSearchObject) longSparseArray.get(j2);
                        if (recentSearchObject6 != null) {
                            recentSearchObject6.object = chat;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                MessagesStorage.getInstance(i).getUsersInternal(arrayList, arrayList5);
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TLRPC.User user = arrayList5.get(i5);
                    RecentSearchObject recentSearchObject7 = (RecentSearchObject) longSparseArray.get(user.id);
                    if (recentSearchObject7 != null) {
                        recentSearchObject7.object = user;
                    }
                }
            }
            Collections.sort(arrayList4, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return DialogsSearchAdapter.lambda$loadRecentSearch$6((DialogsSearchAdapter.RecentSearchObject) obj, (DialogsSearchAdapter.RecentSearchObject) obj2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    onRecentSearchLoaded.setRecentSearch(arrayList4, longSparseArray);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int lambda$loadRecentSearch$6(RecentSearchObject recentSearchObject, RecentSearchObject recentSearchObject2) {
        int i = recentSearchObject.date;
        int i2 = recentSearchObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void putRecentSearch(final long j, TLObject tLObject) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            recentSearchObject = new RecentSearchObject();
            this.recentSearchObjectsById.put(j, recentSearchObject);
        } else {
            this.recentSearchObjects.remove(recentSearchObject);
        }
        this.recentSearchObjects.add(0, recentSearchObject);
        recentSearchObject.did = j;
        recentSearchObject.object = tLObject;
        recentSearchObject.date = (int) (System.currentTimeMillis() / 1000);
        String str = this.lastSearchText;
        filterRecent(str != null ? str.trim() : null);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$putRecentSearch$9(j);
            }
        });
    }

    public void lambda$putRecentSearch$9(long j) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j);
            sQLitePreparedStatementExecuteFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearRecentSearch() {
        final StringBuilder sb;
        if (this.searchWas) {
            sb = null;
            while (this.filtered2RecentSearchObjects.size() > 0) {
                RecentSearchObject recentSearchObject = (RecentSearchObject) this.filtered2RecentSearchObjects.remove(0);
                this.recentSearchObjects.remove(recentSearchObject);
                this.filteredRecentSearchObjects.remove(recentSearchObject);
                this.recentSearchObjectsById.remove(recentSearchObject.did);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(recentSearchObject.did);
                } else {
                    sb.append(", ");
                    sb.append(recentSearchObject.did);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            this.filtered2RecentSearchObjects.clear();
            this.filteredRecentSearchObjects.clear();
            this.recentSearchObjects.clear();
            this.recentSearchObjectsById.clear();
            sb = new StringBuilder("1");
        }
        String str = this.lastSearchText;
        filterRecent(str != null ? str.trim() : null);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$clearRecentSearch$10(sb);
            }
        });
    }

    public void lambda$clearRecentSearch$10(StringBuilder sb) {
        try {
            sb.insert(0, "DELETE FROM search_recent WHERE ");
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast(sb.toString()).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeRecentSearch(final long j) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            return;
        }
        this.recentSearchObjectsById.remove(j);
        this.recentSearchObjects.remove(recentSearchObject);
        this.filtered2RecentSearchObjects.remove(recentSearchObject);
        this.filteredRecentSearchObjects.remove(recentSearchObject);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeRecentSearch$11(j);
            }
        });
    }

    public void lambda$removeRecentSearch$11(long j) {
        try {
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public void lambda$loadRecentSearch$5(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.recentSearchObjects = arrayList;
        this.recentSearchObjectsById = longSparseArray;
        for (int i = 0; i < this.recentSearchObjects.size(); i++) {
            RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjects.get(i);
            TLObject tLObject = recentSearchObject.object;
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(this.currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(this.currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(this.currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
            }
        }
        filterRecent(null);
        notifyDataSetChanged();
    }

    private void searchDialogsInternal(final String str, final int i) {
        if (this.needMessagesSearch == 2) {
            return;
        }
        final String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            this.lastSearchId = 0;
            updateSearchResults(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), this.lastSearchId);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogsInternal$13(lowerCase, i, str);
                }
            });
        }
    }

    public void lambda$searchDialogsInternal$13(String str, int i, String str2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<CharSequence> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        MessagesStorage.getInstance(this.currentAccount).localSearch(this.dialogsType, str, arrayList, arrayList2, arrayList3, this.filterDialogIds, -1);
        updateSearchResults(arrayList, arrayList2, arrayList3, arrayList4, i);
        FiltersView.fillTipDates(str, this.localTipDates);
        this.localTipArchive = false;
        if (str.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str2))) {
            this.localTipArchive = true;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDialogsInternal$12();
            }
        });
    }

    public void lambda$searchDialogsInternal$12() {
        FilteredSearchView.Delegate delegate = this.filtersDelegate;
        if (delegate != null) {
            delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
        }
    }

    private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, ArrayList arrayList4, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateSearchResults$15(i, arrayList, arrayList2, arrayList3);
            }
        });
    }

    public void lambda$updateSearchResults$15(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        final long j;
        this.waitingResponseCount--;
        if (i != this.lastSearchId) {
            return;
        }
        this.lastLocalSearchId = i;
        if (this.lastGlobalSearchId != i) {
            this.searchAdapterHelper.clear();
        }
        if (this.lastMessagesSearchId != i) {
            this.searchResultMessages.clear();
        }
        this.searchWas = true;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (!filter(arrayList.get(i2))) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        int size = this.filtered2RecentSearchObjects.size();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            final Object obj = arrayList.get(i3);
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                MessagesController.getInstance(this.currentAccount).putUser(user, true);
                j = user.id;
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                MessagesController.getInstance(this.currentAccount).putChat(chat, true);
                j = -chat.id;
            } else {
                if (obj instanceof TLRPC.EncryptedChat) {
                    MessagesController.getInstance(this.currentAccount).putEncryptedChat((TLRPC.EncryptedChat) obj, true);
                }
                j = 0;
            }
            if (j != 0 && ((TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(j)) == null) {
                MessagesStorage.getInstance(this.currentAccount).getDialogFolderId(j, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i4) {
                        this.f$0.lambda$updateSearchResults$14(j, obj, i4);
                    }
                });
            }
            if (recentSearchAvailable() && !(obj instanceof TLRPC.EncryptedChat)) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                boolean z = dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() == j;
                for (int i4 = 0; !z && i4 < size; i4++) {
                    RecentSearchObject recentSearchObject = (RecentSearchObject) this.filtered2RecentSearchObjects.get(i4);
                    if (recentSearchObject != null && recentSearchObject.did == j) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.remove(i3);
                    arrayList2.remove(i3);
                    i3--;
                }
            }
            i3++;
        }
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList3, true);
        this.searchResult = arrayList;
        this.searchResultNames = arrayList2;
        this.searchAdapterHelper.mergeResults(arrayList, this.filtered2RecentSearchObjects);
        notifyDataSetChanged();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
        if (dialogsSearchAdapterDelegate2 != null) {
            dialogsSearchAdapterDelegate2.searchStateChanged(this.waitingResponseCount > 0, true);
            this.delegate.runResultsEnterAnimation();
        }
    }

    public void lambda$updateSearchResults$14(long j, Object obj, int i) {
        if (i != -1) {
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = j;
            if (i != 0) {
                tL_dialog.folder_id = i;
            }
            if (obj instanceof TLRPC.Chat) {
                tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj) ? 1 : 0;
            }
            MessagesController.getInstance(this.currentAccount).dialogs_dict.put(j, tL_dialog);
            MessagesController.getInstance(this.currentAccount).getAllDialogs().add(tL_dialog);
            MessagesController.getInstance(this.currentAccount).sortDialogs(null);
        }
    }

    public boolean isHashtagSearch() {
        return !this.searchResultHashtags.isEmpty();
    }

    public void clearRecentHashtags() {
        this.searchAdapterHelper.clearRecentHashtags();
        this.searchResultHashtags.clear();
        notifyDataSetChanged();
    }

    public void searchDialogs(final String str, int i, boolean z) {
        if (str != null && str.equals(this.lastSearchText) && (i == this.folderId || TextUtils.isEmpty(str))) {
            return;
        }
        this.lastSearchText = str;
        this.folderId = i;
        final String str2 = null;
        if (this.searchRunnable != null) {
            Utilities.searchQueue.cancelRunnable(this.searchRunnable);
            this.searchRunnable = null;
        }
        Runnable runnable = this.searchRunnable2;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable2 = null;
        }
        Runnable runnable2 = this.searchHashtagRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchHashtagRunnable = null;
        }
        if (this.searchHashtagRequest >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.searchHashtagRequest, true);
            this.searchHashtagRequest = -1;
        }
        final String strTrim = str != null ? str.trim() : null;
        filterRecent(strTrim);
        if (!TextUtils.equals(this.sponsoredQuery, strTrim)) {
            this.sponsoredQuery = strTrim;
            this.sponsoredPeers.clear();
            if (this.sponsoredReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.sponsoredReqId, true);
                this.sponsoredReqId = 0;
            }
            if (strTrim == null || strTrim.length() < 4 || (UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).isSponsoredDisabled())) {
                this.sponsoredQuery = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.sponsoredQuery = strTrim;
                tL_contacts_getSponsoredPeers.q = strTrim;
                this.sponsoredReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getSponsoredPeers, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$searchDialogs$17(tLObject, tL_error);
                    }
                });
            }
        }
        if (TextUtils.isEmpty(strTrim)) {
            this.filteredRecentQuery = null;
            this.searchAdapterHelper.unloadRecentHashtags();
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchResultHashtags.clear();
            this.publicPostsTotalCount = 0;
            this.publicPostsLastRate = 0;
            this.publicPostsHashtag = null;
            this.publicPosts.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            int i2 = this.dialogsType;
            if (i2 != 15) {
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                boolean z2 = i2 != 11;
                boolean z3 = i2 != 11;
                boolean z4 = i2 == 2 || i2 == 11;
                boolean z5 = i2 == 0;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                searchAdapterHelper.queryServerSearch(null, true, true, z2, z3, z4, 0L, z5, 0, 0, dialogsSearchAdapterDelegate != null ? dialogsSearchAdapterDelegate.getSearchForumDialogId() : 0L);
            }
            this.searchWas = false;
            this.lastSearchId = 0;
            this.waitingResponseCount = 0;
            this.globalSearchCollapsed = true;
            this.phoneCollapsed = true;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
            if (dialogsSearchAdapterDelegate2 != null) {
                dialogsSearchAdapterDelegate2.searchStateChanged(false, true);
            }
            if (this.dialogsType != 15) {
                searchTopics(null);
                searchMessagesInternal(null, 0);
                searchForumMessagesInternal(null, 0);
            }
            notifyDataSetChanged();
            this.localTipDates.clear();
            this.localTipArchive = false;
            FilteredSearchView.Delegate delegate = this.filtersDelegate;
            if (delegate != null) {
                delegate.updateFiltersView(false, null, this.localTipDates, false);
                return;
            }
            return;
        }
        this.searchAdapterHelper.mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
        this.publicPostsTotalCount = 0;
        this.publicPostsLastRate = 0;
        this.publicPostsHashtag = null;
        this.publicPosts.clear();
        if (this.needMessagesSearch != 2 && strTrim.startsWith("#") && strTrim.length() == 1) {
            this.messagesSearchEndReached = true;
            if (this.searchAdapterHelper.loadRecentHashtags()) {
                this.searchResultMessages.clear();
                this.searchResultHashtags.clear();
                ArrayList hashtags = this.searchAdapterHelper.getHashtags();
                for (int i3 = 0; i3 < hashtags.size(); i3++) {
                    this.searchResultHashtags.add(((SearchAdapterHelper.HashtagObject) hashtags.get(i3)).hashtag);
                }
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                this.waitingResponseCount = 0;
                notifyDataSetChanged();
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate3 = this.delegate;
                if (dialogsSearchAdapterDelegate3 != null) {
                    dialogsSearchAdapterDelegate3.searchStateChanged(false, false);
                }
            }
        } else {
            this.searchResultHashtags.clear();
        }
        final int i4 = this.lastSearchId + 1;
        this.lastSearchId = i4;
        this.waitingResponseCount = 3;
        this.globalSearchCollapsed = true;
        this.phoneCollapsed = true;
        notifyDataSetChanged();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate4 = this.delegate;
        if (dialogsSearchAdapterDelegate4 != null) {
            dialogsSearchAdapterDelegate4.searchStateChanged(true, false);
        }
        if (z && strTrim != null) {
            String strTrim2 = strTrim.trim();
            if (strTrim2.length() > 1 && (strTrim2.charAt(0) == '#' || strTrim2.charAt(0) == '$')) {
                int iIndexOf = strTrim2.indexOf(64);
                String strSubstring = strTrim2.substring(1);
                if (iIndexOf >= 0) {
                    strTrim2.substring(iIndexOf + 1);
                }
                str2 = strSubstring;
            }
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        Runnable runnable3 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDialogs$19(strTrim, i4, str);
            }
        };
        this.searchRunnable = runnable3;
        dispatchQueue.postRunnable(runnable3, 300L);
        if (str2 != null) {
            this.waitingResponseCount++;
            Runnable runnable4 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogs$22(i4, str2);
                }
            };
            this.searchHashtagRunnable = runnable4;
            AndroidUtilities.runOnUIThread(runnable4, 300L);
        }
    }

    public void lambda$searchDialogs$17(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDialogs$16(tLObject);
            }
        });
    }

    public void lambda$searchDialogs$16(TLObject tLObject) {
        this.sponsoredReqId = 0;
        if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
            if (this.sponsoredPeers.isEmpty()) {
                return;
            }
            this.sponsoredPeers.clear();
            notifyDataSetChanged();
            return;
        }
        if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
            TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_sponsoredPeers.users, true);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_sponsoredPeers.chats, true);
            this.sponsoredPeers.addAll(tL_contacts_sponsoredPeers.peers);
            notifyDataSetChanged();
        }
    }

    public void lambda$searchDialogs$19(final String str, final int i, final String str2) {
        this.searchRunnable = null;
        searchDialogsInternal(str, i);
        if (this.dialogsType == 15) {
            this.waitingResponseCount -= 2;
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDialogs$18(i, str, str2);
            }
        };
        this.searchRunnable2 = runnable;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$searchDialogs$18(int i, String str, String str2) {
        int i2;
        this.searchRunnable2 = null;
        if (i != this.lastSearchId) {
            return;
        }
        if (this.needMessagesSearch != 2 && (i2 = this.dialogsType) != 6 && i2 != 5 && this.delegate.getSearchForumDialogId() == 0) {
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int i3 = this.dialogsType;
            boolean z = i3 != 4;
            boolean z2 = (i3 == 4 || i3 == 11) ? false : true;
            boolean z3 = i3 == 2 || i3 == 1;
            boolean z4 = i3 == 0;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            searchAdapterHelper.queryServerSearch(str, true, z, true, z2, z3, 0L, z4, 0, i, dialogsSearchAdapterDelegate != null ? dialogsSearchAdapterDelegate.getSearchForumDialogId() : 0L);
        } else {
            this.waitingResponseCount -= 2;
        }
        if (this.needMessagesSearch == 0 || this.dialogsType == 15) {
            this.waitingResponseCount--;
            return;
        }
        searchTopics(r13);
        searchMessagesInternal(str2, i);
        searchForumMessagesInternal(str2, i);
    }

    public void lambda$searchDialogs$22(final int i, final String str) {
        this.searchHashtagRunnable = null;
        if (i != this.lastSearchId) {
            return;
        }
        if (this.searchHashtagRequest >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.searchHashtagRequest, true);
        }
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
        tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
        tL_channels_searchPosts.hashtag = str;
        tL_channels_searchPosts.limit = 3;
        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
        this.searchHashtagRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_searchPosts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchDialogs$21(i, str, tLObject, tL_error);
            }
        });
    }

    public void lambda$searchDialogs$21(final int i, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchDialogs$20(i, tLObject, str);
            }
        });
    }

    public void lambda$searchDialogs$20(int i, TLObject tLObject, String str) {
        int size;
        if (i == this.lastSearchId && (tLObject instanceof TLRPC.messages_Messages)) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                size = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else {
                size = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
            }
            this.publicPostsTotalCount = size;
            this.publicPostsLastRate = messages_messages.next_rate;
            this.publicPostsHashtag = str;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                this.publicPosts.add(new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true));
            }
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate != null) {
                dialogsSearchAdapterDelegate.searchStateChanged(this.waitingResponseCount > 0, true);
            }
            notifyDataSetChanged();
        }
    }

    public int getRecentItemsCount() {
        ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        return (!arrayList.isEmpty() ? arrayList.size() + 1 : 0) + (hasHints() ? 1 : 0);
    }

    public int getRecentResultsCount() {
        ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        int i = 3;
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = !this.publicPosts.isEmpty() ? this.publicPosts.size() + 1 : 0;
        if (!this.searchResultHashtags.isEmpty()) {
            return size + this.searchResultHashtags.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        if (!this.searchTopics.isEmpty()) {
            size = size + 1 + this.searchTopics.size();
        }
        if (!this.searchContacts.isEmpty()) {
            size += this.searchContacts.size() + 1;
        }
        int size2 = this.searchResult.size();
        int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
        int i2 = size + size2 + size3;
        int size4 = this.searchAdapterHelper.getGlobalSearch().size();
        if (size4 > 3 && this.globalSearchCollapsed) {
            size4 = 3;
        }
        int size5 = size4 + this.sponsoredPeers.size();
        int size6 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size6 > 3 && this.phoneCollapsed) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            i2++;
        }
        if (size5 != 0) {
            i2 += size5 + 1;
        }
        if (size6 != 0) {
            i2 += size6;
        }
        int size7 = this.searchForumResultMessages.size();
        if (size7 != 0) {
            i2 += size7 + 1 + (!this.localMessagesSearchEndReached ? 1 : 0);
        }
        if (!this.localMessagesSearchEndReached) {
            this.localMessagesLoadingRow = i2;
        }
        int size8 = this.searchResultMessages.size();
        if ((this.currentMessagesFilter == Filter.All && !this.forceLoadingMessages) || !this.searchResultMessages.isEmpty()) {
            i = size8;
        } else if (!this.forceLoadingMessages) {
            i = 1;
        }
        int i3 = (this.searchForumResultMessages.isEmpty() || this.localMessagesSearchEndReached) ? i : 0;
        if (i3 != 0) {
            i2 += i3 + 1 + (!this.messagesSearchEndReached ? 1 : 0);
        }
        if (this.localMessagesSearchEndReached) {
            this.localMessagesLoadingRow = i2;
        }
        this.currentItemCount = i2;
        return i2;
    }

    public Object getItem(int i) {
        int size;
        int i2;
        Object chat;
        int i3;
        if (!this.publicPosts.isEmpty()) {
            if (i > 0 && (i3 = i - 1) < this.publicPosts.size()) {
                return this.publicPosts.get(i3);
            }
            i -= this.publicPosts.size() + 1;
        }
        if (!this.searchResultHashtags.isEmpty()) {
            if (i > 0) {
                return this.searchResultHashtags.get(i - 1);
            }
            return null;
        }
        if (isRecentSearchDisplayed()) {
            ?? HasHints = hasHints();
            ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > HasHints && (i2 = (i - 1) - (HasHints == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = ((RecentSearchObject) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC.User) {
                    chat = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                    if (chat == null) {
                        return tLObject;
                    }
                } else if (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) {
                    return tLObject;
                }
                return chat;
            }
            i -= getRecentItemsCount();
        }
        if (!this.searchTopics.isEmpty()) {
            if (i > 0 && i <= this.searchTopics.size()) {
                return this.searchTopics.get(i - 1);
            }
            i -= this.searchTopics.size() + 1;
        }
        if (!this.searchContacts.isEmpty()) {
            if (i > 0 && i <= this.searchContacts.size()) {
                return this.searchContacts.get(i - 1);
            }
            i -= this.searchContacts.size() + 1;
        }
        ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        ArrayList phoneSearch = this.searchAdapterHelper.getPhoneSearch();
        int size2 = this.searchResult.size();
        int size3 = localServerSearch.size();
        if (size2 + size3 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        int size4 = phoneSearch.size();
        if (size4 > 3 && this.phoneCollapsed) {
            size4 = 3;
        }
        int size5 = globalSearch.size();
        int i4 = 0;
        int size6 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : ((size5 <= 3 || !this.globalSearchCollapsed) ? size5 : 3) + this.sponsoredPeers.size() + 1;
        if (i >= 0 && i < size2) {
            return this.searchResult.get(i);
        }
        int i5 = i - size2;
        if (i5 >= 0 && i5 < size3) {
            return localServerSearch.get(i5);
        }
        int i6 = i5 - size3;
        if (i6 >= 0 && i6 < size4) {
            return phoneSearch.get(i6);
        }
        int i7 = i6 - size4;
        if (i7 <= 0 || i7 >= size6) {
            size = i7 - size6;
        } else {
            int i8 = i7 - 1;
            if (i8 >= 0 && i8 < this.sponsoredPeers.size()) {
                return this.sponsoredPeers.get(i8);
            }
            size = i8 - this.sponsoredPeers.size();
            if (size >= 0 && size < globalSearch.size()) {
                return globalSearch.get(size);
            }
        }
        int size7 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
        if (size > 0 && size <= this.searchForumResultMessages.size()) {
            return this.searchForumResultMessages.get(size - 1);
        }
        if (!this.localMessagesSearchEndReached && !this.searchForumResultMessages.isEmpty()) {
            i4 = 1;
        }
        int i9 = size - (size7 + i4);
        if (!this.searchResultMessages.isEmpty()) {
            this.searchResultMessages.size();
        }
        if (i9 <= 0 || i9 > this.searchResultMessages.size()) {
            return null;
        }
        return this.searchResultMessages.get(i9 - 1);
    }

    public boolean isGlobalSearch(int i) {
        if (!this.searchWas || !this.searchResultHashtags.isEmpty()) {
            return false;
        }
        if (!this.publicPosts.isEmpty()) {
            i -= this.publicPosts.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            ?? HasHints = hasHints();
            ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > HasHints && (i - 1) - (HasHints == true ? 1 : 0) < arrayList.size()) {
                return false;
            }
            i -= getRecentItemsCount();
        }
        ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        int size = this.searchResult.size();
        int size2 = localServerSearch.size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.size();
        int size5 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : ((size4 <= 3 || !this.globalSearchCollapsed) ? size4 : 3) + this.sponsoredPeers.size() + 1;
        int size6 = this.searchContacts.size();
        if (size6 > 0) {
            if (i >= 0 && i < size6) {
                return false;
            }
            i -= size6 + 1;
        }
        if (size + size2 > 0 && (getRecentItemsCount() > 0 || !this.searchTopics.isEmpty() || !this.publicPosts.isEmpty())) {
            if (i == 0) {
                return false;
            }
            i--;
        }
        if (i >= 0 && i < size) {
            return false;
        }
        int i2 = i - size;
        if (i2 >= 0 && i2 < size2) {
            return false;
        }
        int i3 = i2 - size2;
        if (i3 > 0 && i3 < size3) {
            return false;
        }
        int i4 = i3 - size3;
        if (i4 > 0 && i4 < size5) {
            return true;
        }
        int i5 = i4 - size5;
        int size7 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
        if (i5 > 0 && i5 < size7) {
            return false;
        }
        if (!this.searchResultMessages.isEmpty()) {
            this.searchResultMessages.size();
        }
        if (this.currentMessagesFilter != Filter.All || this.forceLoadingMessages) {
            this.searchResultMessages.isEmpty();
        }
        return false;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 4 || itemViewType == 10) ? false : true;
    }

    public void lambda$onCreateViewHolder$23(View view, int i) {
        if (view instanceof HintDialogCell) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            if (hintDialogCell.isBlocked()) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.didPressedBlockedDialog(view, hintDialogCell.getDialogId());
                    return;
                }
                return;
            }
        }
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
        if (dialogsSearchAdapterDelegate2 != null) {
            dialogsSearchAdapterDelegate2.didPressedOnSubDialog(((Long) view.getTag()).longValue());
        }
    }

    public boolean lambda$onCreateViewHolder$24(View view, int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null) {
            return true;
        }
        dialogsSearchAdapterDelegate.needRemoveHint(((Long) view.getTag()).longValue());
        return true;
    }

    public void lambda$onCreateViewHolder$25() {
        this.currentMessagesFilter = Filter.All;
        this.searchResultMessages.clear();
        int i = this.messagesSectionPosition;
        if (i >= 0 && i < getItemCount()) {
            notifyItemChanged(this.messagesSectionPosition);
        }
        loadMoreSearchMessages();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewShowPremiumBlock;
        switch (i) {
            case 0:
                viewShowPremiumBlock = new ProfileSearchCell(this.mContext).showPremiumBlock(this.dialogsType == 3);
                break;
            case 1:
                viewShowPremiumBlock = new GraySectionCell(this.mContext);
                break;
            case 2:
            case 9:
                viewShowPremiumBlock = new DialogCell(null, this.mContext, false, true) {
                    @Override
                    public boolean isForumCell() {
                        return false;
                    }
                };
                break;
            case 3:
                viewShowPremiumBlock = new TopicSearchCell(this.mContext);
                break;
            case 4:
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setViewType(1);
                flickerLoadingView.setIsSingleCell(true);
                viewShowPremiumBlock = flickerLoadingView;
                break;
            case 5:
                viewShowPremiumBlock = new HashtagSearchCell(this.mContext);
                break;
            case 6:
                RecyclerListView recyclerListView = new RecyclerListView(this.mContext) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                recyclerListView.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector));
                recyclerListView.setTag(9);
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                recyclerListView.setAdapter(new CategoryAdapterRecycler(this.mContext, this.currentAccount, false, this.dialogsType == 3, this.resourcesProvider));
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i2) {
                        this.f$0.lambda$onCreateViewHolder$23(view, i2);
                    }
                });
                recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                    @Override
                    public final boolean onItemClick(View view, int i2) {
                        return this.f$0.lambda$onCreateViewHolder$24(view, i2);
                    }
                });
                this.innerListView = recyclerListView;
                viewShowPremiumBlock = recyclerListView;
                break;
            case 7:
            default:
                viewShowPremiumBlock = new TextCell(this.mContext, 16, false);
                break;
            case 8:
                viewShowPremiumBlock = new ProfileSearchCell(this.mContext);
                break;
            case 10:
                EmptyLayout emptyLayout = new EmptyLayout(this.mContext, this.resourcesProvider, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCreateViewHolder$25();
                    }
                });
                this.messagesEmptyLayout = emptyLayout;
                emptyLayout.setQuery(this.lastMessagesSearchString);
                viewShowPremiumBlock = emptyLayout;
                break;
        }
        if (i == 5) {
            viewShowPremiumBlock.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(86.0f)));
        } else {
            viewShowPremiumBlock.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        return new RecyclerListView.Holder(viewShowPremiumBlock);
    }

    private boolean hasHints() {
        return (this.searchWas || MediaDataController.getInstance(this.currentAccount).hints.isEmpty() || (this.dialogsType == 14 && !this.dialogsActivity.allowUsers)) ? false : true;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.Chat chat;
        String publicUsername;
        ArrayList<TLRPC.TL_username> arrayList;
        String publicUsername2;
        boolean z;
        ArrayList arrayList2;
        int i2;
        int size;
        CharSequence charSequence;
        CharSequence charSequence2;
        ?? spannableStringBuilder;
        CharSequence string;
        boolean z2;
        ?? r2;
        int i3;
        String pluralStringSpaced;
        boolean z3;
        ?? Concat;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        Object obj;
        String lastFoundUsername;
        String monoForumTitle;
        String str;
        int iIndexOfIgnoreCase;
        int length;
        int iIndexOfIgnoreCase2;
        CharSequence charSequence3;
        int recentItemsCount;
        String string2;
        String string3;
        CharSequence charSequence4;
        final Runnable runnable;
        final int size2 = i;
        int i4 = -1;
        boolean z4 = false;
        switch (viewHolder.getItemViewType()) {
            case 0:
                ?? r4 = (ProfileSearchCell) viewHolder.itemView;
                r4.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                long dialogId = r4.getDialogId();
                boolean zIsGlobalSearch = isGlobalSearch(size2);
                Object item = getItem(size2);
                boolean z5 = item instanceof TLRPC.TL_sponsoredPeer;
                if (z5) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) item;
                    seenSponsoredPeer(tL_sponsoredPeer2);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer2.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            arrayList = user.usernames;
                            publicUsername2 = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                            item = item;
                            z5 = z5;
                            publicUsername = publicUsername2;
                            chat = null;
                            encryptedChat = null;
                        } else {
                            z5 = z5;
                            chat = null;
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (chat2 != null) {
                            arrayList = chat2.usernames;
                            chat = chat2;
                            publicUsername = DialogObject.getPublicUsername(chat2, this.currentMessagesQuery);
                            user = null;
                            encryptedChat = null;
                        } else {
                            chat = chat2;
                            item = item;
                            z5 = z5;
                            user = null;
                        }
                    }
                    publicUsername = null;
                    arrayList = null;
                    encryptedChat = null;
                } else if (item instanceof TLRPC.User) {
                    user = (TLRPC.User) item;
                    arrayList = user.usernames;
                    publicUsername2 = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                    item = item;
                    z5 = z5;
                    publicUsername = publicUsername2;
                    chat = null;
                    encryptedChat = null;
                } else if (item instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) item;
                    TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat3.id));
                    if (chat4 == null) {
                        chat4 = chat3;
                    }
                    arrayList = chat4.usernames;
                    publicUsername = DialogObject.getPublicUsername(chat4, this.currentMessagesQuery);
                    chat = chat4;
                    user = null;
                    encryptedChat = null;
                } else {
                    z5 = z5;
                    if (item instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat2 = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) item).id));
                        item = item;
                        encryptedChat = encryptedChat2;
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat2.user_id));
                        chat = null;
                        publicUsername = null;
                        arrayList = null;
                    } else {
                        user = null;
                        chat = null;
                        publicUsername = null;
                        arrayList = null;
                        encryptedChat = null;
                    }
                }
                if (!this.publicPosts.isEmpty()) {
                    size2 -= this.publicPosts.size() + 1;
                }
                if (isRecentSearchDisplayed()) {
                    if (size2 < getRecentItemsCount()) {
                        r4.useSeparator = size2 != getRecentItemsCount() - 1;
                        z = true;
                    } else {
                        z = false;
                    }
                    size2 -= getRecentItemsCount();
                } else {
                    z = false;
                }
                if (!this.searchTopics.isEmpty()) {
                    size2 -= this.searchTopics.size() + 1;
                }
                ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
                ArrayList phoneSearch = this.searchAdapterHelper.getPhoneSearch();
                int size3 = this.searchResult.size();
                int size4 = this.searchAdapterHelper.getLocalServerSearch().size();
                if (size3 + size4 > 0) {
                    if (getRecentItemsCount() > 0) {
                        size2 += i4;
                    } else if (!this.searchTopics.isEmpty() || !this.publicPosts.isEmpty()) {
                        i4 = -1;
                        size2 += i4;
                    }
                }
                int size5 = phoneSearch.size();
                String str2 = publicUsername;
                if (size5 > 3) {
                    arrayList2 = phoneSearch;
                    if (this.phoneCollapsed) {
                        size5 = 3;
                    }
                } else {
                    arrayList2 = phoneSearch;
                }
                int i5 = (size5 <= 0 || !(arrayList2.get(size5 + (-1)) instanceof String)) ? size5 : size5 - 2;
                int size6 = globalSearch.size();
                if (size6 > 3 && this.globalSearchCollapsed) {
                    size6 = 3;
                }
                if (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) {
                    i2 = 1;
                    size = 0;
                } else {
                    i2 = 1;
                    size = size6 + this.sponsoredPeers.size() + 1;
                }
                if (!z) {
                    r4.useSeparator = (size2 == (getItemCount() - getRecentItemsCount()) - i2 || size2 == ((i5 + size3) + size4) - i2 || size2 == (((size3 + size) + size5) + size4) - i2) ? false : true;
                }
                if (size2 >= 0 && size2 < this.searchResult.size() && user == null) {
                    charSequence3 = (CharSequence) this.searchResultNames.get(size2);
                    String publicUsername3 = UserObject.getPublicUsername(user);
                    if (charSequence3 != null && user != null && publicUsername3 != null) {
                        if (charSequence3.toString().startsWith("@" + publicUsername3)) {
                        }
                        if (spannableStringBuilder == 0) {
                            if (z) {
                                lastFoundUsername = this.filteredRecentQuery;
                            } else {
                                lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                            }
                            if (!TextUtils.isEmpty(lastFoundUsername)) {
                                if (user != null) {
                                    monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                                } else if (chat == null) {
                                    monoForumTitle = null;
                                } else if (chat.monoforum) {
                                    monoForumTitle = ForumUtilities.getMonoForumTitle(this.currentAccount, chat);
                                } else {
                                    monoForumTitle = chat.title;
                                }
                                charSequence2 = charSequence2;
                                if (monoForumTitle != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(monoForumTitle, lastFoundUsername)) != -1) {
                                    charSequence2 = charSequence2;
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(monoForumTitle);
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase2, lastFoundUsername.length() + iIndexOfIgnoreCase2, 33);
                                    charSequence2 = spannableStringBuilder2;
                                }
                                if (arrayList != null || arrayList.size() <= 1) {
                                    str = str2;
                                } else {
                                    String strSubstring = lastFoundUsername.startsWith("@") ? lastFoundUsername.substring(1) : lastFoundUsername;
                                    Iterator<TLRPC.TL_username> it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            TLRPC.TL_username next = it.next();
                                            if (next.active && next.username.startsWith(strSubstring)) {
                                                str = next.username;
                                            }
                                        } else {
                                            str = null;
                                        }
                                    }
                                    if (str == null) {
                                        for (TLRPC.TL_username tL_username : arrayList) {
                                            if (tL_username.active && tL_username.username.contains(strSubstring)) {
                                                str = tL_username.username;
                                            }
                                        }
                                    }
                                    if (str == null) {
                                        str = str2;
                                    }
                                }
                                if (str != null && (user == null || zIsGlobalSearch)) {
                                    if (lastFoundUsername.startsWith("@")) {
                                        lastFoundUsername = lastFoundUsername.substring(1);
                                    }
                                    try {
                                        spannableStringBuilder = new SpannableStringBuilder();
                                        spannableStringBuilder.append("@");
                                        spannableStringBuilder.append(str);
                                        iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername);
                                        if (iIndexOfIgnoreCase != -1) {
                                            length = lastFoundUsername.length();
                                            if (iIndexOfIgnoreCase == 0) {
                                                length++;
                                            } else {
                                                iIndexOfIgnoreCase++;
                                            }
                                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        spannableStringBuilder = str;
                                    }
                                }
                            }
                        }
                        r4.setChecked(false, false);
                        if (user == null && user.id == this.selfUserId && this.dialogsType != 16) {
                            string = LocaleController.getString(R.string.SavedMessages);
                            r2 = 0;
                            z2 = true;
                        } else {
                            string = charSequence2;
                            z2 = false;
                            r2 = spannableStringBuilder;
                        }
                        if (chat == null && chat.participants_count != 0) {
                            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                                pluralStringSpaced = LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            } else {
                                pluralStringSpaced = LocaleController.formatPluralStringSpaced("Members", chat.participants_count);
                            }
                            if (r2 instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) r2).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced);
                                z3 = true;
                                Concat = r2;
                            } else if (TextUtils.isEmpty(r2)) {
                                z3 = true;
                                Concat = pluralStringSpaced;
                            } else {
                                Concat = TextUtils.concat(new CharSequence[]{r2, ", ", pluralStringSpaced});
                                z3 = true;
                            }
                        } else if (user == null && user.bot && (i3 = user.bot_active_users) != 0) {
                            pluralStringSpaced = LocaleController.formatPluralStringSpaced("BotUsersShort", i3);
                            if (r2 instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) r2).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced);
                                z3 = true;
                                Concat = r2;
                            } else if (TextUtils.isEmpty(r2)) {
                                z3 = true;
                                Concat = pluralStringSpaced;
                            } else {
                                z3 = true;
                                Concat = TextUtils.concat(new CharSequence[]{r2, ", ", pluralStringSpaced});
                            }
                        } else {
                            z3 = true;
                            Concat = r2;
                        }
                        r4.allowBotOpenButton(z, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj2) {
                                this.f$0.openBotApp((TLRPC.User) obj2);
                            }
                        });
                        r4.setOnSponsoredOptionsClick(new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                this.f$0.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                            }
                        });
                        if (z5) {
                            tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                        } else {
                            tL_sponsoredPeer = null;
                        }
                        r4.setAd(tL_sponsoredPeer);
                        if (user != null) {
                            obj = user;
                        } else {
                            obj = chat;
                        }
                        r4.setData(obj, encryptedChat, string, Concat, true, z2);
                        boolean zIsSelected = this.delegate.isSelected(r4.getDialogId());
                        if (dialogId != r4.getDialogId()) {
                            z3 = false;
                        }
                        r4.setChecked(zIsSelected, z3);
                    }
                    charSequence = charSequence3;
                    charSequence2 = charSequence3;
                    spannableStringBuilder = 0;
                    if (spannableStringBuilder == 0) {
                        if (z) {
                            lastFoundUsername = this.filteredRecentQuery;
                        } else {
                            lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        }
                        if (!TextUtils.isEmpty(lastFoundUsername)) {
                            if (user != null) {
                                monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                            } else if (chat == null) {
                                monoForumTitle = null;
                            } else if (chat.monoforum) {
                                monoForumTitle = ForumUtilities.getMonoForumTitle(this.currentAccount, chat);
                            } else {
                                monoForumTitle = chat.title;
                            }
                            charSequence2 = charSequence2;
                            if (monoForumTitle != null) {
                                charSequence2 = charSequence2;
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(monoForumTitle);
                                spannableStringBuilder3.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase2, lastFoundUsername.length() + iIndexOfIgnoreCase2, 33);
                                charSequence2 = spannableStringBuilder3;
                            }
                            if (arrayList != null) {
                                str = str2;
                            } else {
                                str = str2;
                            }
                            if (str != null) {
                                if (lastFoundUsername.startsWith("@")) {
                                    lastFoundUsername = lastFoundUsername.substring(1);
                                }
                                spannableStringBuilder = new SpannableStringBuilder();
                                spannableStringBuilder.append("@");
                                spannableStringBuilder.append(str);
                                iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername);
                                if (iIndexOfIgnoreCase != -1) {
                                    length = lastFoundUsername.length();
                                    if (iIndexOfIgnoreCase == 0) {
                                        length++;
                                    } else {
                                        iIndexOfIgnoreCase++;
                                    }
                                    spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                                }
                            }
                        }
                    }
                    r4.setChecked(false, false);
                    if (user == null) {
                        string = charSequence2;
                        z2 = false;
                        r2 = spannableStringBuilder;
                    } else {
                        string = charSequence2;
                        z2 = false;
                        r2 = spannableStringBuilder;
                    }
                    if (chat == null) {
                        if (user == null) {
                            z3 = true;
                            Concat = r2;
                        } else {
                            z3 = true;
                            Concat = r2;
                        }
                    } else if (user == null) {
                        z3 = true;
                        Concat = r2;
                    } else {
                        z3 = true;
                        Concat = r2;
                    }
                    r4.allowBotOpenButton(z, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            this.f$0.openBotApp((TLRPC.User) obj2);
                        }
                    });
                    r4.setOnSponsoredOptionsClick(new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            this.f$0.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                        }
                    });
                    if (z5) {
                        tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                    } else {
                        tL_sponsoredPeer = null;
                    }
                    r4.setAd(tL_sponsoredPeer);
                    if (user != null) {
                        obj = user;
                    } else {
                        obj = chat;
                    }
                    r4.setData(obj, encryptedChat, string, Concat, true, z2);
                    boolean zIsSelected2 = this.delegate.isSelected(r4.getDialogId());
                    if (dialogId != r4.getDialogId()) {
                        z3 = false;
                    }
                    r4.setChecked(zIsSelected2, z3);
                } else {
                    charSequence = null;
                }
                charSequence = charSequence3;
                charSequence2 = null;
                spannableStringBuilder = charSequence;
                if (spannableStringBuilder == 0) {
                    if (z) {
                        lastFoundUsername = this.filteredRecentQuery;
                    } else {
                        lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                    }
                    if (!TextUtils.isEmpty(lastFoundUsername)) {
                        if (user != null) {
                            monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (chat == null) {
                            monoForumTitle = null;
                        } else if (chat.monoforum) {
                            monoForumTitle = ForumUtilities.getMonoForumTitle(this.currentAccount, chat);
                        } else {
                            monoForumTitle = chat.title;
                        }
                        charSequence2 = charSequence2;
                        if (monoForumTitle != null) {
                            charSequence2 = charSequence2;
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(monoForumTitle);
                            spannableStringBuilder4.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase2, lastFoundUsername.length() + iIndexOfIgnoreCase2, 33);
                            charSequence2 = spannableStringBuilder4;
                        }
                        if (arrayList != null) {
                            str = str2;
                        } else {
                            str = str2;
                        }
                        if (str != null) {
                            if (lastFoundUsername.startsWith("@")) {
                                lastFoundUsername = lastFoundUsername.substring(1);
                            }
                            spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append("@");
                            spannableStringBuilder.append(str);
                            iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str, lastFoundUsername);
                            if (iIndexOfIgnoreCase != -1) {
                                length = lastFoundUsername.length();
                                if (iIndexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    iIndexOfIgnoreCase++;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                            }
                        }
                    }
                }
                r4.setChecked(false, false);
                if (user == null) {
                    string = charSequence2;
                    z2 = false;
                    r2 = spannableStringBuilder;
                } else {
                    string = charSequence2;
                    z2 = false;
                    r2 = spannableStringBuilder;
                }
                if (chat == null) {
                    if (user == null) {
                        z3 = true;
                        Concat = r2;
                    } else {
                        z3 = true;
                        Concat = r2;
                    }
                } else if (user == null) {
                    z3 = true;
                    Concat = r2;
                } else {
                    z3 = true;
                    Concat = r2;
                }
                r4.allowBotOpenButton(z, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        this.f$0.openBotApp((TLRPC.User) obj2);
                    }
                });
                r4.setOnSponsoredOptionsClick(new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        this.f$0.openSponsoredOptions((ProfileSearchCell) obj2, (TLRPC.TL_sponsoredPeer) obj3);
                    }
                });
                if (z5) {
                    tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                } else {
                    tL_sponsoredPeer = null;
                }
                r4.setAd(tL_sponsoredPeer);
                if (user != null) {
                    obj = user;
                } else {
                    obj = chat;
                }
                r4.setData(obj, encryptedChat, string, Concat, true, z2);
                boolean zIsSelected3 = this.delegate.isSelected(r4.getDialogId());
                if (dialogId != r4.getDialogId()) {
                    z3 = false;
                }
                r4.setChecked(zIsSelected3, z3);
                break;
            case 1:
                final GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (!this.searchResultHashtags.isEmpty()) {
                    graySectionCell.setText(LocaleController.getString(R.string.Hashtags), LocaleController.getString(R.string.ClearButton), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onBindViewHolder$26(view);
                        }
                    });
                } else {
                    if (this.publicPosts.isEmpty()) {
                        recentItemsCount = size2;
                    } else if (size2 == 0) {
                        graySectionCell.setText(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onBindViewHolder$27(view);
                            }
                        });
                    } else {
                        recentItemsCount = size2 - (this.publicPosts.size() + 1);
                    }
                    final ArrayList globalSearch2 = this.searchAdapterHelper.getGlobalSearch();
                    if (isRecentSearchDisplayed() || !this.searchTopics.isEmpty() || !this.searchContacts.isEmpty() || !this.publicPosts.isEmpty()) {
                        ?? HasHints = hasHints();
                        if (recentItemsCount < HasHints) {
                            graySectionCell.setText(LocaleController.getString(R.string.ChatHints));
                        } else if (recentItemsCount == HasHints && isRecentSearchDisplayed()) {
                            if (!this.searchWas) {
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        this.f$0.lambda$onBindViewHolder$28(view);
                                    }
                                });
                            } else {
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view) {
                                        this.f$0.lambda$onBindViewHolder$29(view);
                                    }
                                });
                            }
                        } else if (recentItemsCount == getRecentItemsCount() + (this.searchTopics.isEmpty() ? 0 : this.searchTopics.size() + 1) + (this.searchContacts.isEmpty() ? 0 : this.searchContacts.size() + 1) && !this.searchResult.isEmpty()) {
                            graySectionCell.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                        } else {
                            recentItemsCount -= getRecentItemsCount();
                        }
                    }
                    int size7 = this.searchResult.size();
                    int size8 = this.searchAdapterHelper.getLocalServerSearch().size();
                    int size9 = this.searchAdapterHelper.getPhoneSearch().size();
                    if (size9 > 3 && this.phoneCollapsed) {
                        size9 = 3;
                    }
                    int size10 = globalSearch2.size();
                    if (size10 > 3 && this.globalSearchCollapsed) {
                        size10 = 3;
                    }
                    int size11 = (globalSearch2.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : size10 + this.sponsoredPeers.size() + 1;
                    int size12 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
                    if (!this.searchResultMessages.isEmpty()) {
                        this.searchResultMessages.size();
                    }
                    if (this.currentMessagesFilter != Filter.All || this.forceLoadingMessages) {
                        this.searchResultMessages.isEmpty();
                    }
                    if (this.searchTopics.isEmpty()) {
                        string2 = null;
                    } else {
                        string2 = recentItemsCount == 0 ? LocaleController.getString(R.string.Topics) : null;
                        recentItemsCount -= this.searchTopics.size() + 1;
                    }
                    if (!this.searchContacts.isEmpty()) {
                        if (recentItemsCount == 0) {
                            string2 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        recentItemsCount -= this.searchContacts.size() + 1;
                    }
                    if (string2 != null) {
                        string3 = string2;
                        charSequence4 = null;
                        runnable = null;
                    } else {
                        int i6 = recentItemsCount - (size7 + size8);
                        if (i6 < 0 || i6 >= size9) {
                            int i7 = i6 - size9;
                            if (i7 >= 0 && i7 < size11) {
                                string2 = LocaleController.getString(R.string.GlobalSearch);
                                if (this.searchAdapterHelper.getGlobalSearch().size() > 3) {
                                    z4 = this.globalSearchCollapsed;
                                    Runnable runnable2 = new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.lambda$onBindViewHolder$33(globalSearch2, size2, graySectionCell);
                                        }
                                    };
                                    charSequence4 = null;
                                    runnable = runnable2;
                                    string3 = string2;
                                } else {
                                    string3 = string2;
                                    charSequence4 = null;
                                    runnable = null;
                                }
                            } else if (this.delegate != null && size12 > 0 && i7 - size11 <= 1) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.delegate.getSearchForumDialogId()));
                                string2 = LocaleController.formatString(R.string.SearchMessagesIn, chat5 == null ? "null" : chat5.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat5) : chat5.title);
                                string3 = string2;
                                charSequence4 = null;
                                runnable = null;
                            } else {
                                this.messagesSectionPosition = i7;
                                CharSequence filterFromString = getFilterFromString(this.currentMessagesFilter);
                                Runnable runnable3 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$onBindViewHolder$35(graySectionCell);
                                    }
                                };
                                string3 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable3;
                                charSequence4 = filterFromString;
                            }
                        } else {
                            string2 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (this.searchAdapterHelper.getPhoneSearch().size() > 3) {
                                z4 = this.phoneCollapsed;
                                string3 = string2;
                                runnable = new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$onBindViewHolder$30(graySectionCell);
                                    }
                                };
                                charSequence4 = null;
                            } else {
                                string3 = string2;
                                charSequence4 = null;
                                runnable = null;
                            }
                        }
                    }
                    if (runnable == null) {
                        graySectionCell.setText(string3);
                    } else if (charSequence4 != null) {
                        graySectionCell.setText(string3, charSequence4, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                runnable.run();
                            }
                        });
                        graySectionCell.setRightTextMargin(6);
                    } else {
                        graySectionCell.setText(string3, LocaleController.getString(z4 ? R.string.ShowMore : R.string.ShowLess), new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                runnable.run();
                            }
                        });
                        graySectionCell.setRightTextMargin(16);
                    }
                }
                break;
            case 2:
            case 9:
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                dialogCell.useSeparator = size2 != getItemCount() - 1;
                MessageObject messageObject = (MessageObject) getItem(size2);
                dialogCell.useFromUserAsAvatar = this.searchForumResultMessages.contains(messageObject);
                if (messageObject == null) {
                    dialogCell.setDialog(0L, null, 0, false, false);
                } else {
                    dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
                break;
            case 3:
                ((TopicSearchCell) viewHolder.itemView).setTopic((TLRPC.TL_forumTopic) getItem(size2));
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = (HashtagSearchCell) viewHolder.itemView;
                hashtagSearchCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                hashtagSearchCell.setText((CharSequence) this.searchResultHashtags.get(size2 - 1));
                hashtagSearchCell.setNeedDivider(size2 != this.searchResultHashtags.size());
                break;
            case 6:
                ((CategoryAdapterRecycler) ((RecyclerListView) viewHolder.itemView).getAdapter()).setIndex(size2 / 2);
                break;
            case 7:
                String str3 = (String) getItem(size2);
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
                textCell.setText(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str3)), false);
                break;
            case 8:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                ContactsController.Contact contact = (ContactsController.Contact) getItem(size2);
                profileSearchCell.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), PhoneFormat.getInstance().format("+" + contact.shortPhones.get(0)), false, false);
                break;
        }
    }

    public void lambda$onBindViewHolder$26(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public void lambda$onBindViewHolder$27(View view) {
        openPublicPosts();
    }

    public void lambda$onBindViewHolder$28(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public void lambda$onBindViewHolder$29(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public void lambda$onBindViewHolder$30(GraySectionCell graySectionCell) {
        boolean z = this.phoneCollapsed;
        this.phoneCollapsed = !z;
        graySectionCell.setRightText(LocaleController.getString(!z ? R.string.ShowMore : R.string.ShowLess));
        notifyDataSetChanged();
    }

    public void lambda$onBindViewHolder$33(ArrayList arrayList, int i, GraySectionCell graySectionCell) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastShowMoreUpdate < 300) {
            return;
        }
        this.lastShowMoreUpdate = jElapsedRealtime;
        int size = this.sponsoredPeers.size();
        int size2 = arrayList.size();
        int i2 = (arrayList.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : size2 + size;
        int iMin = size + Math.min(3, size2);
        boolean z = getItemCount() > ((this.globalSearchCollapsed ? iMin : i2) + i) + 1;
        DefaultItemAnimator defaultItemAnimator = this.itemAnimator;
        if (defaultItemAnimator != null) {
            defaultItemAnimator.setAddDuration(z ? 45L : 200L);
            this.itemAnimator.setRemoveDuration(z ? 80L : 200L);
            this.itemAnimator.setRemoveDelay(z ? 270L : 0L);
        }
        this.globalSearchCollapsed = !this.globalSearchCollapsed;
        graySectionCell.setRightTextMargin(16);
        graySectionCell.setRightText(LocaleController.getString(this.globalSearchCollapsed ? R.string.ShowMore : R.string.ShowLess), this.globalSearchCollapsed);
        this.showMoreHeader = null;
        final View view = (View) graySectionCell.getParent();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int i3 = (!this.globalSearchCollapsed ? i + iMin : i2 + i) + 1;
            for (int i4 = 0; i4 < recyclerView.getChildCount(); i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (recyclerView.getChildAdapterPosition(childAt) == i3) {
                    this.showMoreHeader = childAt;
                    break;
                }
            }
        }
        final int i5 = i + iMin;
        int i6 = i5 + 1;
        int iMax = Math.max(0, size2 - 3);
        if (!this.globalSearchCollapsed) {
            notifyItemChanged(i5);
            notifyItemRangeInserted(i6, iMax);
        } else {
            notifyItemRangeRemoved(i6, iMax);
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onBindViewHolder$31(i5);
                    }
                }, 350L);
            } else {
                notifyItemChanged(i5);
            }
        }
        Runnable runnable = this.cancelShowMoreAnimation;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if (z) {
            this.showMoreAnimation = true;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onBindViewHolder$32(view);
                }
            };
            this.cancelShowMoreAnimation = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 400L);
            return;
        }
        this.showMoreAnimation = false;
    }

    public void lambda$onBindViewHolder$31(int i) {
        notifyItemChanged(i);
    }

    public void lambda$onBindViewHolder$32(View view) {
        this.showMoreAnimation = false;
        this.showMoreHeader = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$onBindViewHolder$35(final GraySectionCell graySectionCell) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.dialogsActivity, graySectionCell);
        for (final Filter filter : Filter.values()) {
            final boolean z = filter.flags == this.currentMessagesFilter.flags;
            itemOptionsMakeOptions.addChecked(z, LocaleController.getString(filter.strResId), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onBindViewHolder$34(z, graySectionCell, filter);
                }
            });
        }
        itemOptionsMakeOptions.setGravity(5).setOnTopOfScrim().setDrawScrim(false).setDimAlpha(0).show();
    }

    public void lambda$onBindViewHolder$34(boolean z, GraySectionCell graySectionCell, Filter filter) {
        if (z) {
            return;
        }
        this.currentMessagesFilter = filter;
        graySectionCell.setRightText(getFilterFromString(filter));
        graySectionCell.setRightTextMargin(6);
        this.searchResultMessages.clear();
        this.forceLoadingMessages = true;
        notifyDataSetChanged();
        loadMoreSearchMessages();
    }

    private CharSequence getFilterFromString(Filter filter) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(filter.strFromResId));
        spannableStringBuilder.append((CharSequence) "v");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
        this.filterArrowsIcon = coloredImageSpan;
        spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override
    public int getItemViewType(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsSearchAdapter.getItemViewType(int):int");
    }

    public void setFiltersDelegate(FilteredSearchView.Delegate delegate, boolean z) {
        this.filtersDelegate = delegate;
        if (delegate == null || !z) {
            return;
        }
        delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
    }

    public int getCurrentItemCount() {
        return this.currentItemCount;
    }

    public void filterRecent(String str) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate;
        String userName;
        String str2;
        this.filteredRecentQuery = str;
        this.filtered2RecentSearchObjects.clear();
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            this.filteredRecentSearchObjects.clear();
            int size = this.recentSearchObjects.size();
            while (i < size) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
                if ((dialogsSearchAdapterDelegate2 == null || dialogsSearchAdapterDelegate2.getSearchForumDialogId() != ((RecentSearchObject) this.recentSearchObjects.get(i)).did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i)).object)) {
                    this.filteredRecentSearchObjects.add((RecentSearchObject) this.recentSearchObjects.get(i));
                }
                i++;
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.recentSearchObjects.size();
        while (i < size2) {
            RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjects.get(i);
            if (recentSearchObject != null && recentSearchObject.object != null && (((dialogsSearchAdapterDelegate = this.delegate) == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() != recentSearchObject.did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i)).object))) {
                TLObject tLObject = recentSearchObject.object;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    userName = chat.monoforum ? ForumUtilities.getMonoForumTitle(this.currentAccount, chat) : chat.title;
                    str2 = ((TLRPC.Chat) recentSearchObject.object).username;
                } else if (tLObject instanceof TLRPC.User) {
                    userName = UserObject.getUserName((TLRPC.User) tLObject);
                    str2 = ((TLRPC.User) recentSearchObject.object).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    userName = ((TLRPC.ChatInvite) tLObject).title;
                    str2 = null;
                } else {
                    userName = null;
                    str2 = null;
                }
                if ((userName != null && wordStartsWith(userName.toLowerCase(), lowerCase)) || (str2 != null && wordStartsWith(str2.toLowerCase(), lowerCase))) {
                    this.filtered2RecentSearchObjects.add(recentSearchObject);
                }
                if (this.filtered2RecentSearchObjects.size() >= 5) {
                    return;
                }
            }
            i++;
        }
    }

    private boolean wordStartsWith(String str, String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        String[] strArrSplit = str.toLowerCase().split(" ");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3 != null && (str3.startsWith(str2) || str2.startsWith(strArrSplit[i]))) {
                return true;
            }
        }
        return false;
    }

    static class EmptyLayout extends LinearLayout {
        private TextView textView;

        public EmptyLayout(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
            super(context);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 27, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 17.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptyTitle));
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 0, 8, 0, 9));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.textView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
            this.textView.setGravity(17);
            addView(this.textView, LayoutHelper.createLinear(-1, -2, 1, 0, 0, 0, 14));
            TextView textView3 = new TextView(context);
            textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
            int i2 = Theme.key_featuredStickers_addButton;
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(6, 0, Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.15f)));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
            addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 38));
        }

        public void setQuery(String str) {
            this.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, str));
        }
    }

    private int globalSearchPosition() {
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = this.publicPosts.isEmpty() ? 0 : this.publicPosts.size() + 1;
        if (!this.searchResultHashtags.isEmpty()) {
            return size + this.searchResultHashtags.size() + 1;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        if (!this.searchTopics.isEmpty()) {
            size = size + 1 + this.searchTopics.size();
        }
        if (!this.searchContacts.isEmpty()) {
            size += this.searchContacts.size() + 1;
        }
        int size2 = this.searchResult.size();
        int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
        int i = size + size2 + size3;
        if (size2 + size3 > 0) {
            return (getRecentItemsCount() <= 0 && this.searchTopics.isEmpty() && this.publicPosts.isEmpty()) ? i : i + 1;
        }
        return i;
    }

    public void removeAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        int iIndexOf;
        int iGlobalSearchPosition;
        if (!this.sponsoredPeers.isEmpty() && (iIndexOf = this.sponsoredPeers.indexOf(tL_sponsoredPeer)) >= 0 && (iGlobalSearchPosition = globalSearchPosition()) < getItemCount()) {
            this.sponsoredPeers.remove(iIndexOf);
            notifyItemRemoved(iGlobalSearchPosition + 1 + iIndexOf);
            int size = this.searchAdapterHelper.getGlobalSearch().size();
            int size2 = this.sponsoredPeers.size();
            if (this.globalSearchCollapsed) {
                size = Math.min(3, size);
            }
            if (size2 + size <= 0) {
                notifyItemRemoved(iGlobalSearchPosition);
            }
        }
    }

    public void removeAllAds() {
        int iGlobalSearchPosition;
        if (!this.sponsoredPeers.isEmpty() && (iGlobalSearchPosition = globalSearchPosition()) < getItemCount()) {
            int size = this.sponsoredPeers.size();
            this.sponsoredPeers.clear();
            notifyItemRangeRemoved(iGlobalSearchPosition + 1, size);
            int size2 = this.searchAdapterHelper.getGlobalSearch().size();
            if (this.globalSearchCollapsed) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                notifyItemRemoved(iGlobalSearchPosition);
            }
        }
    }

    public void seenSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        Iterator it = this.seenSponsoredPeers.iterator();
        while (it.hasNext()) {
            if (Arrays.equals((byte[]) it.next(), tL_sponsoredPeer.random_id)) {
                return;
            }
        }
        this.seenSponsoredPeers.add(tL_sponsoredPeer.random_id);
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void clickedSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }
}
