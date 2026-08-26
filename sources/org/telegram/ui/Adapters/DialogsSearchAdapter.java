package org.telegram.ui.Adapters;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
import org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MediaDataController$$ExternalSyntheticLambda128;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda99;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell2$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
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
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0;

public abstract class DialogsSearchAdapter extends RecyclerListView.SelectionAdapter {
    public static final int VIEW_TYPE_ADD_BY_PHONE = 7;
    public static final int VIEW_TYPE_CATEGORY_LIST = 6;
    public static final int VIEW_TYPE_DIALOG_CELL = 2;
    public static final int VIEW_TYPE_EMPTY_RESULT = 10;
    public static final int VIEW_TYPE_GRAY_SECTION = 1;
    public static final int VIEW_TYPE_HASHTAG_CELL = 5;
    public static final int VIEW_TYPE_INVITE_CONTACT_CELL = 8;
    public static final int VIEW_TYPE_LOADING = 4;
    public static final int VIEW_TYPE_PROFILE_CELL = 0;
    public static final int VIEW_TYPE_PUBLIC_POST = 9;
    public static final int VIEW_TYPE_TOPIC_CELL = 3;
    private ArrayList<Object> allContacts;
    private Runnable cancelShowMoreAnimation;
    private int currentItemCount;
    private String currentMessagesQuery;
    public DialogsSearchAdapterDelegate delegate;
    private final DialogsActivity dialogsActivity;
    private int dialogsType;
    private ColoredImageSpan filterArrowsIcon;
    private ArrayList<Long> filterDialogIds;
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
    public int showMoreLastItem;
    private String sponsoredQuery;
    private int sponsoredReqId;
    int waitingResponseCount;
    private Filter currentMessagesFilter = Filter.All;
    private int searchHashtagRequest = -1;
    private ArrayList<Object> searchResult = new ArrayList<>();
    public ArrayList<MessageObject> publicPosts = new ArrayList<>();
    private final ArrayList<ContactsController.Contact> searchContacts = new ArrayList<>();
    private final ArrayList<TLRPC.TL_forumTopic> searchTopics = new ArrayList<>();
    private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
    private final ArrayList<MessageObject> searchForumResultMessages = new ArrayList<>();
    private final ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private final ArrayList<String> searchResultHashtags = new ArrayList<>();
    public final ArrayList<TLRPC.TL_sponsoredPeer> sponsoredPeers = new ArrayList<>();
    private final HashSet<byte[]> seenSponsoredPeers = new HashSet<>();
    private int reqId = 0;
    private int reqForumId = 0;
    public int localMessagesLoadingRow = -1;
    public boolean showMoreAnimation = false;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList<RecentSearchObject> recentSearchObjects = new ArrayList<>();
    private final ArrayList<RecentSearchObject> filteredRecentSearchObjects = new ArrayList<>();
    private final ArrayList<RecentSearchObject> filtered2RecentSearchObjects = new ArrayList<>();
    private String filteredRecentQuery = null;
    private LongSparseArray recentSearchObjectsById = new LongSparseArray();
    private ArrayList<FiltersView.DateData> localTipDates = new ArrayList<>();
    private int messagesSectionPosition = -1;
    boolean globalSearchCollapsed = true;
    boolean phoneCollapsed = true;

    public final class AnonymousClass3 extends DialogCell {
        @Override
        public final boolean isForumCell() {
            return false;
        }
    }

    public final class AnonymousClass5 extends LinearLayoutManager {
        public final int $r8$classId;

        public AnonymousClass5(int i, int i2, boolean z) {
            super(i, z);
            this.$r8$classId = i2;
        }

        @Override
        public boolean canScrollVertically() {
            switch (this.$r8$classId) {
                case 2:
                    return false;
                default:
                    return super.canScrollVertically();
            }
        }

        @Override
        public boolean supportsPredictiveItemAnimations() {
            switch (this.$r8$classId) {
                case 0:
                    return false;
                case 1:
                    return false;
                default:
                    return super.supportsPredictiveItemAnimations();
            }
        }
    }

    public class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private boolean drawChecked;
        private boolean forceDarkTheme;
        private final Context mContext;
        private Theme.ResourcesProvider resourcesProvider;
        private boolean showPremiumBlock;

        public CategoryAdapterRecycler(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
            this.drawChecked = z;
            this.mContext = context;
            this.currentAccount = i;
            this.showPremiumBlock = z2;
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public int getItemCount() {
            return MediaDataController.getInstance(this.currentAccount).hints.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
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
            } else if (chat != null) {
                monoForumTitle = chat.monoforum ? ForumUtilities.getMonoForumTitle(chat, this.currentAccount, false) : chat.title;
            } else {
                monoForumTitle = "";
            }
            hintDialogCell.setDialog(j, monoForumTitle);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HintDialogCell hintDialogCell = new HintDialogCell(this.mContext, this.drawChecked, this.resourcesProvider);
            if (this.showPremiumBlock && !hintDialogCell.showPremiumBlocked) {
                hintDialogCell.showPremiumBlocked = true;
                NotificationCenter.getInstance(hintDialogCell.currentAccount).listen(hintDialogCell, NotificationCenter.userIsPremiumBlockedUpadted, new DialogCell$$ExternalSyntheticLambda6(hintDialogCell, 9));
            }
            hintDialogCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
            return new RecyclerListView.Holder(hintDialogCell);
        }

        public void setIndex(int i) {
            notifyDataSetChanged();
        }
    }

    public final class DialogSearchResult {
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

    public final class EmptyLayout extends LinearLayout {
        public final TextView textView;

        public EmptyLayout(Context context, Theme.ResourcesProvider resourcesProvider, DialogsSearchAdapter$$ExternalSyntheticLambda5 dialogsSearchAdapter$$ExternalSyntheticLambda5) {
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
            textView2.setTextColor(Theme.getColor(i, resourcesProvider));
            textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 0, 0, 0, 14));
            TextView textView3 = new TextView(context);
            textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
            int i2 = Theme.key_featuredStickers_addButton;
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            int iMultAlpha = Theme.multAlpha(0.15f, Theme.getColor(i2, resourcesProvider));
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(6, 6, 6, 6, 0, iMultAlpha, iMultAlpha));
            textView3.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(dialogsSearchAdapter$$ExternalSyntheticLambda5, 3));
            addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 38));
        }
    }

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

    public interface OnRecentSearchLoaded {
        void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray);
    }

    public final class RecentSearchObject {
        public int date;
        public long did;
        public TLObject object;
    }

    public DialogsSearchAdapter(Context context, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.itemAnimator = defaultItemAnimator;
        this.dialogsActivity = dialogsActivity;
        this.resourcesProvider = resourcesProvider;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper() {
            @Override
            public final boolean filter(TLObject tLObject) {
                return DialogsSearchAdapter.this.filter(tLObject);
            }
        };
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new MentionsAdapter.AnonymousClass3(this, 1));
        this.searchAdapterHelper.setAllowGlobalResults(z);
        this.mContext = context;
        this.needMessagesSearch = i;
        this.dialogsType = i2;
        this.selfUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        loadRecentSearch();
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
    }

    public static int lambda$loadRecentSearch$6(RecentSearchObject recentSearchObject, RecentSearchObject recentSearchObject2) {
        int i = recentSearchObject.date;
        int i2 = recentSearchObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public static void lambda$loadRecentSearch$8(int i, int i2, OnRecentSearchLoaded onRecentSearchLoaded) {
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(i).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
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
                            longSparseArray.put(recentSearchObject, recentSearchObject.did);
                        }
                    }
                } else if (!DialogObject.isUserDialog(jLongValue)) {
                    long j = -jLongValue;
                    if (!arrayList2.contains(Long.valueOf(j))) {
                        arrayList2.add(Long.valueOf(j));
                        RecentSearchObject recentSearchObject2 = new RecentSearchObject();
                        recentSearchObject2.did = jLongValue;
                        recentSearchObject2.date = sQLiteCursorQueryFinalized.intValue(1);
                        arrayList4.add(recentSearchObject2);
                        longSparseArray.put(recentSearchObject2, recentSearchObject2.did);
                    }
                } else if (i2 != 2 && !arrayList.contains(Long.valueOf(jLongValue))) {
                    arrayList.add(Long.valueOf(jLongValue));
                    RecentSearchObject recentSearchObject3 = new RecentSearchObject();
                    recentSearchObject3.did = jLongValue;
                    recentSearchObject3.date = sQLiteCursorQueryFinalized.intValue(1);
                    arrayList4.add(recentSearchObject3);
                    longSparseArray.put(recentSearchObject3, recentSearchObject3.did);
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
            Collections.sort(arrayList4, new Theme$$ExternalSyntheticLambda5(26));
            AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(onRecentSearchLoaded, arrayList4, longSparseArray, 18));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean wordStartsWith(String str, String str2) {
        if (str2 != null && str != null) {
            String[] strArrSplit = str.toLowerCase().split(" ");
            for (int i = 0; i < strArrSplit.length; i++) {
                String str3 = strArrSplit[i];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(strArrSplit[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public void clearRecentHashtags() {
        this.searchAdapterHelper.clearRecentHashtags();
        this.searchResultHashtags.clear();
        notifyDataSetChanged();
    }

    public void clearRecentSearch() {
        StringBuilder sb;
        if (this.searchWas) {
            sb = null;
            while (this.filtered2RecentSearchObjects.size() > 0) {
                RecentSearchObject recentSearchObjectRemove = this.filtered2RecentSearchObjects.remove(0);
                this.recentSearchObjects.remove(recentSearchObjectRemove);
                this.filteredRecentSearchObjects.remove(recentSearchObjectRemove);
                this.recentSearchObjectsById.remove(recentSearchObjectRemove.did);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(recentSearchObjectRemove.did);
                } else {
                    sb.append(", ");
                    sb.append(recentSearchObjectRemove.did);
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
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(2, this, sb));
    }

    public void clickedSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
        tL_messages_clickSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_clickSponsoredMessage, null);
    }

    public final boolean filter(Object obj) {
        if (this.dialogsType != 14) {
            return true;
        }
        if (obj instanceof TLRPC.User) {
            return ((TLRPC.User) obj).bot ? this.dialogsActivity.allowBots : this.dialogsActivity.allowUsers;
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

    public void filterRecent(String str) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate;
        String userName;
        String str2;
        this.filteredRecentQuery = str;
        this.filtered2RecentSearchObjects.clear();
        if (TextUtils.isEmpty(str)) {
            this.filteredRecentSearchObjects.clear();
            int size = this.recentSearchObjects.size();
            for (int i = 0; i < size; i++) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
                if ((dialogsSearchAdapterDelegate2 == null || dialogsSearchAdapterDelegate2.getSearchForumDialogId() != this.recentSearchObjects.get(i).did) && filter(this.recentSearchObjects.get(i).object)) {
                    this.filteredRecentSearchObjects.add(this.recentSearchObjects.get(i));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.recentSearchObjects.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecentSearchObject recentSearchObject = this.recentSearchObjects.get(i2);
            if (recentSearchObject != null && recentSearchObject.object != null && (((dialogsSearchAdapterDelegate = this.delegate) == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() != recentSearchObject.did) && filter(this.recentSearchObjects.get(i2).object))) {
                TLObject tLObject = recentSearchObject.object;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    userName = chat.monoforum ? ForumUtilities.getMonoForumTitle(chat, this.currentAccount, false) : chat.title;
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
        }
    }

    public int getCurrentItemCount() {
        return this.currentItemCount;
    }

    public RecyclerListView getInnerListView() {
        return this.innerListView;
    }

    public Object getItem(int i) {
        int size;
        int i2;
        TLRPC.Chat chat;
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
            ArrayList<RecentSearchObject> arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > HasHints && (i2 = (i - 1) - (HasHints == true ? 1 : 0)) < arrayList.size()) {
                TLObject tLObject = arrayList.get(i2).object;
                if (!(tLObject instanceof TLRPC.User)) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
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
        ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        ArrayList<Object> phoneSearch = this.searchAdapterHelper.getPhoneSearch();
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
        int size6 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : this.sponsoredPeers.size() + ((size5 <= 3 || !this.globalSearchCollapsed) ? size5 : 3) + 1;
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

    @Override
    public int getItemCount() {
        int i = 3;
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = !this.publicPosts.isEmpty() ? this.publicPosts.size() + 1 : 0;
        if (!this.searchResultHashtags.isEmpty()) {
            return this.searchResultHashtags.size() + 1 + size;
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
        int size5 = this.sponsoredPeers.size() + size4;
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

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemViewType(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsSearchAdapter.getItemViewType(int):int");
    }

    public String getLastSearchString() {
        return this.lastMessagesSearchString;
    }

    public int getRecentItemsCount() {
        ArrayList<RecentSearchObject> arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        return (hasHints() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public int getRecentResultsCount() {
        ArrayList<RecentSearchObject> arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final int globalSearchPosition() {
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        int size = this.publicPosts.isEmpty() ? 0 : this.publicPosts.size() + 1;
        if (!this.searchResultHashtags.isEmpty()) {
            return this.searchResultHashtags.size() + 1 + size;
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

    public final boolean hasHints() {
        if (this.searchWas || MediaDataController.getInstance(this.currentAccount).hints.isEmpty()) {
            return false;
        }
        return this.dialogsType != 14 || this.dialogsActivity.allowUsers;
    }

    public boolean hasRecentSearch() {
        int i = this.dialogsType;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15 || getRecentItemsCount() <= 0) ? false : true;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 4 || itemViewType == 10) ? false : true;
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
            ArrayList<RecentSearchObject> arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > HasHints && (i - 1) - (HasHints == true ? 1 : 0) < arrayList.size()) {
                return false;
            }
            i -= getRecentItemsCount();
        }
        ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        int size = this.searchResult.size();
        int size2 = localServerSearch.size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.size();
        int size5 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : this.sponsoredPeers.size() + ((size4 <= 3 || !this.globalSearchCollapsed) ? size4 : 3) + 1;
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

    public boolean isHashtagSearch() {
        return !this.searchResultHashtags.isEmpty();
    }

    public boolean isMessagesSearchEndReached() {
        return (this.delegate.getSearchForumDialogId() == 0 || this.localMessagesSearchEndReached) && this.messagesSearchEndReached;
    }

    public boolean isRecentSearchDisplayed() {
        return this.needMessagesSearch != 2 && hasRecentSearch();
    }

    public boolean isSearchWas() {
        return this.searchWas;
    }

    public boolean isSearching() {
        return this.waitingResponseCount > 0;
    }

    public final void lambda$clearRecentSearch$10(StringBuilder sb) {
        try {
            sb.insert(0, "DELETE FROM search_recent WHERE ");
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast(sb.toString()).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$loadRecentSearch$5(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.recentSearchObjects = arrayList;
        this.recentSearchObjectsById = longSparseArray;
        for (int i = 0; i < this.recentSearchObjects.size(); i++) {
            RecentSearchObject recentSearchObject = this.recentSearchObjects.get(i);
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

    public final void lambda$onBindViewHolder$26(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public final void lambda$onBindViewHolder$27(View view) {
        openPublicPosts();
    }

    public final void lambda$onBindViewHolder$28(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public final void lambda$onBindViewHolder$29(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public final void lambda$onBindViewHolder$30(GraySectionCell graySectionCell) {
        boolean z = this.phoneCollapsed;
        this.phoneCollapsed = !z;
        graySectionCell.setRightText(LocaleController.getString(!z ? R.string.ShowMore : R.string.ShowLess));
        notifyDataSetChanged();
    }

    public final void lambda$onBindViewHolder$32(View view) {
        this.showMoreAnimation = false;
        this.showMoreHeader = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void lambda$onBindViewHolder$33(ArrayList arrayList, int i, GraySectionCell graySectionCell) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastShowMoreUpdate < 300) {
            return;
        }
        this.lastShowMoreUpdate = jElapsedRealtime;
        int size = this.sponsoredPeers.size();
        int size2 = arrayList.size();
        int i2 = (arrayList.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : size2 + size;
        int iMin = Math.min(3, size2) + size;
        boolean z = getItemCount() > ((this.globalSearchCollapsed ? iMin : i2) + i) + 1;
        DefaultItemAnimator defaultItemAnimator = this.itemAnimator;
        if (defaultItemAnimator != null) {
            defaultItemAnimator.setAddDuration(z ? 45L : 200L);
            this.itemAnimator.setRemoveDuration(z ? 80L : 200L);
            this.itemAnimator.setRemoveDelay(z ? 270L : 0L);
        }
        this.globalSearchCollapsed = !this.globalSearchCollapsed;
        graySectionCell.setRightTextMargin(16);
        String string = LocaleController.getString(this.globalSearchCollapsed ? R.string.ShowMore : R.string.ShowLess);
        boolean z2 = this.globalSearchCollapsed;
        GraySectionCell.AnonymousClass1 anonymousClass1 = graySectionCell.rightTextView;
        anonymousClass1.setText(string, true, z2);
        anonymousClass1.setVisibility(0);
        this.showMoreHeader = null;
        View view = (View) graySectionCell.getParent();
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
        int i5 = i + iMin;
        int i6 = i5 + 1;
        int iMax = Math.max(0, size2 - 3);
        if (this.globalSearchCollapsed) {
            notifyItemRangeRemoved(i6, iMax);
            if (z) {
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(this, i5, 6), 350L);
            } else {
                lambda$onBindViewHolder$31(i5);
            }
        } else {
            lambda$onBindViewHolder$31(i5);
            notifyItemRangeInserted(i6, iMax);
        }
        Runnable runnable = this.cancelShowMoreAnimation;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if (!z) {
            this.showMoreAnimation = false;
            return;
        }
        this.showMoreAnimation = true;
        ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda8 = new ChatActionCell$$ExternalSyntheticLambda8(1, this, view);
        this.cancelShowMoreAnimation = chatActionCell$$ExternalSyntheticLambda8;
        AndroidUtilities.runOnUIThread(chatActionCell$$ExternalSyntheticLambda8, 400L);
    }

    public final void lambda$onBindViewHolder$34(boolean z, GraySectionCell graySectionCell, Filter filter) {
        if (z) {
            return;
        }
        this.currentMessagesFilter = filter;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(filter.strFromResId));
        spannableStringBuilder.append((CharSequence) "v");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
        this.filterArrowsIcon = coloredImageSpan;
        spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        graySectionCell.setRightText(spannableStringBuilder);
        graySectionCell.setRightTextMargin(6);
        this.searchResultMessages.clear();
        this.forceLoadingMessages = true;
        notifyDataSetChanged();
        loadMoreSearchMessages();
    }

    public final void lambda$onBindViewHolder$35(GraySectionCell graySectionCell) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.dialogsActivity, graySectionCell);
        for (Filter filter : Filter.values()) {
            boolean z = filter.flags == this.currentMessagesFilter.flags;
            itemOptionsMakeOptions.addChecked(z, LocaleController.getString(filter.strResId), new Theme$$ExternalSyntheticLambda14(this, z, graySectionCell, filter, 2));
        }
        itemOptionsMakeOptions.setGravity(5).setOnTopOfScrim().setDrawScrim(false).setDimAlpha(0).show();
    }

    public final void lambda$onCreateViewHolder$23(View view, int i) {
        if (view instanceof HintDialogCell) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            if (hintDialogCell.premiumBlocked) {
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

    public final boolean lambda$onCreateViewHolder$24(View view, int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null) {
            return true;
        }
        dialogsSearchAdapterDelegate.needRemoveHint(((Long) view.getTag()).longValue());
        return true;
    }

    public final void lambda$onCreateViewHolder$25() {
        this.currentMessagesFilter = Filter.All;
        this.searchResultMessages.clear();
        int i = this.messagesSectionPosition;
        if (i >= 0 && i < getItemCount()) {
            lambda$onBindViewHolder$31(this.messagesSectionPosition);
        }
        loadMoreSearchMessages();
    }

    public final void lambda$putRecentSearch$9(long j) {
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

    public final void lambda$removeRecentSearch$11(long j) {
        try {
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$searchDialogs$16(TLObject tLObject) {
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

    public final void lambda$searchDialogs$17(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(3, this, tLObject));
    }

    public final void lambda$searchDialogs$18(int i, String str, String str2) {
        int i2;
        this.searchRunnable2 = null;
        if (i != this.lastSearchId) {
            return;
        }
        if (this.needMessagesSearch == 2 || (i2 = this.dialogsType) == 6 || i2 == 5 || this.delegate.getSearchForumDialogId() != 0) {
            this.waitingResponseCount -= 2;
        } else {
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int i3 = this.dialogsType;
            boolean z = i3 != 4;
            boolean z2 = (i3 == 4 || i3 == 11) ? false : true;
            boolean z3 = i3 == 2 || i3 == 1;
            boolean z4 = i3 == 0;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            searchAdapterHelper.queryServerSearch(str, true, z, true, z2, z3, 0L, z4, 0, i, dialogsSearchAdapterDelegate != null ? dialogsSearchAdapterDelegate.getSearchForumDialogId() : 0L);
        }
        if (this.needMessagesSearch == 0 || this.dialogsType == 15) {
            this.waitingResponseCount--;
            return;
        }
        searchTopics(str2);
        searchMessagesInternal(i, str2);
        searchForumMessagesInternal(i, str2);
    }

    public final void lambda$searchDialogs$19(String str, int i, String str2) {
        this.searchRunnable = null;
        searchDialogsInternal(str, i);
        if (this.dialogsType == 15) {
            this.waitingResponseCount -= 2;
            return;
        }
        DialogsSearchAdapter$$ExternalSyntheticLambda18 dialogsSearchAdapter$$ExternalSyntheticLambda18 = new DialogsSearchAdapter$$ExternalSyntheticLambda18(this, i, str, str2);
        this.searchRunnable2 = dialogsSearchAdapter$$ExternalSyntheticLambda18;
        AndroidUtilities.runOnUIThread(dialogsSearchAdapter$$ExternalSyntheticLambda18);
    }

    public final void lambda$searchDialogs$20(int i, TLObject tLObject, String str) {
        if (i == this.lastSearchId && (tLObject instanceof TLRPC.messages_Messages)) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            this.publicPostsTotalCount = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
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

    public final void lambda$searchDialogs$21(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8(this, i, tLObject, str, 4));
    }

    public final void lambda$searchDialogs$22(int i, String str) {
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
        this.searchHashtagRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_searchPosts, new VoIPService$$ExternalSyntheticLambda99(this, i, str, 2));
    }

    public final void lambda$searchDialogsInternal$12() {
        FilteredSearchView.Delegate delegate = this.filtersDelegate;
        if (delegate != null) {
            delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
        }
    }

    public final void lambda$searchDialogsInternal$13(String str, int i, String str2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<CharSequence> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
        new ArrayList();
        MessagesStorage.getInstance(this.currentAccount).localSearch(this.dialogsType, str, arrayList, arrayList2, arrayList3, this.filterDialogIds, -1);
        updateSearchResults(i, arrayList, arrayList2, arrayList3);
        FiltersView.fillTipDates(str, this.localTipDates);
        this.localTipArchive = false;
        if (str.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str2))) {
            this.localTipArchive = true;
        }
        AndroidUtilities.runOnUIThread(new DialogsSearchAdapter$$ExternalSyntheticLambda5(this, 1));
    }

    public final void lambda$searchForumMessagesInternal$0(int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, ArrayList arrayList) {
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

    public final void lambda$searchForumMessagesInternal$1(String str, int i, int i2, TLRPC.TL_messages_search tL_messages_search, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat, chat.id);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user, user.id);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda128(this, i, i2, tL_error, str, tLObject, tL_messages_search, arrayList, 2));
    }

    public final void lambda$searchMessagesInternal$2(int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, ArrayList arrayList) {
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
                                    MessageObject messageObject2 = this.searchForumResultMessages.get(i5);
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
                    emptyLayout.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.lastMessagesSearchString));
                }
                notifyDataSetChanged();
            }
        }
        this.reqId = 0;
    }

    public final void lambda$searchMessagesInternal$3(HashSet hashSet, Runnable runnable) {
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

    public final void lambda$searchMessagesInternal$4(String str, int i, int i2, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray.put(chat, chat.id);
            }
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray2.put(user, user.id);
            }
            for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i5), longSparseArray2, longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        HashSet hashSet = new HashSet();
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
        MediaDataController$$ExternalSyntheticLambda128 mediaDataController$$ExternalSyntheticLambda128 = new MediaDataController$$ExternalSyntheticLambda128(this, i, i2, tL_error, str, tLObject, tL_messages_searchGlobal, arrayList, 1);
        if (hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(mediaDataController$$ExternalSyntheticLambda128);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new RemoteUtils$$ExternalSyntheticLambda2(this, hashSet, mediaDataController$$ExternalSyntheticLambda128, 17));
        }
    }

    public final void lambda$updateSearchResults$14(long j, Object obj, int i) {
        if (i != -1) {
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = j;
            if (i != 0) {
                tL_dialog.folder_id = i;
            }
            if (obj instanceof TLRPC.Chat) {
                tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj) ? 1 : 0;
            }
            MessagesController.getInstance(this.currentAccount).dialogs_dict.put(tL_dialog, j);
            MessagesController.getInstance(this.currentAccount).getAllDialogs().add(tL_dialog);
            MessagesController.getInstance(this.currentAccount).sortDialogs(null);
        }
    }

    public final void lambda$updateSearchResults$15(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
            int i4 = this.dialogsType;
            if (i4 != 2 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 1 && i4 != 11 && i4 != 15 && !(obj instanceof TLRPC.EncryptedChat)) {
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                boolean z = dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() == j;
                for (int i5 = 0; !z && i5 < size; i5++) {
                    RecentSearchObject recentSearchObject = this.filtered2RecentSearchObjects.get(i5);
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

    public void loadMoreSearchMessages() {
        if ((this.reqForumId == 0 || this.reqId == 0) && this.lastMessagesSearchId == this.lastSearchId) {
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate == null || dialogsSearchAdapterDelegate.getSearchForumDialogId() == 0 || this.localMessagesSearchEndReached) {
                searchMessagesInternal(this.lastMessagesSearchId, this.lastMessagesSearchString);
            } else {
                searchForumMessagesInternal(this.lastMessagesSearchId, this.lastMessagesSearchString);
            }
        }
    }

    public void loadRecentSearch() {
        int i = this.dialogsType;
        if (i == 15) {
            return;
        }
        loadRecentSearch(this.currentAccount, i, new DialogsSearchAdapter$$ExternalSyntheticLambda2(this));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.Chat chat;
        String publicUsername;
        ArrayList<TLRPC.TL_username> arrayList;
        String publicUsername2;
        boolean z2;
        boolean z3;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z4;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CheckBox2 checkBox2;
        boolean z5;
        CharSequence string;
        CharSequence charSequence5;
        int i2;
        int i3;
        CharSequence charSequenceConcat;
        CharSequence charSequenceConcat2;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        Object obj;
        boolean zIsSelected;
        boolean z6;
        String lastFoundUsername;
        String monoForumTitle;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        int i4;
        String strSubstring;
        int size;
        int i5;
        String str;
        int size2;
        int i6;
        TLRPC.TL_username tL_username;
        CharSequence charSequence10;
        TLRPC.TL_username tL_username2;
        int iIndexOfIgnoreCase;
        SpannableStringBuilder spannableStringBuilder;
        int recentItemsCount;
        String string2;
        SpannableStringBuilder spannableStringBuilder2;
        Runnable botBiometry$$ExternalSyntheticLambda8;
        int size3 = i;
        final int i7 = 2;
        final int i8 = 3;
        boolean z7 = false;
        z7 = false;
        final int i9 = 1;
        switch (viewHolder.getItemViewType()) {
            case 0:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                profileSearchCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                long dialogId = profileSearchCell.getDialogId();
                boolean zIsGlobalSearch = isGlobalSearch(size3);
                Object item = getItem(size3);
                boolean z8 = item instanceof TLRPC.TL_sponsoredPeer;
                if (z8) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) item;
                    seenSponsoredPeer(tL_sponsoredPeer2);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer2.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            arrayList = user.usernames;
                            publicUsername2 = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                            z = z8;
                            publicUsername = publicUsername2;
                            chat = null;
                        } else {
                            z = z8;
                            chat = null;
                            publicUsername = null;
                            arrayList = null;
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                        if (chat2 != null) {
                            arrayList = chat2.usernames;
                            chat = chat2;
                            z = z8;
                            publicUsername = DialogObject.getPublicUsername(chat2, this.currentMessagesQuery);
                            user = null;
                        } else {
                            chat = chat2;
                            z = z8;
                            user = null;
                            publicUsername = null;
                            arrayList = null;
                        }
                    }
                    encryptedChat = null;
                } else if (item instanceof TLRPC.User) {
                    user = (TLRPC.User) item;
                    arrayList = user.usernames;
                    publicUsername2 = DialogObject.getPublicUsername(user, this.currentMessagesQuery);
                    z = z8;
                    publicUsername = publicUsername2;
                    chat = null;
                    encryptedChat = null;
                } else if (item instanceof TLRPC.Chat) {
                    TLRPC.Chat chat3 = (TLRPC.Chat) item;
                    z = z8;
                    TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat3.id));
                    if (chat4 == null) {
                        chat4 = chat3;
                    }
                    arrayList = chat4.usernames;
                    publicUsername = DialogObject.getPublicUsername(chat4, this.currentMessagesQuery);
                    encryptedChat = null;
                    chat = chat4;
                    user = null;
                } else {
                    z = z8;
                    if (item instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat2 = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) item).id));
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
                    size3 -= this.publicPosts.size() + 1;
                }
                if (isRecentSearchDisplayed()) {
                    if (size3 < getRecentItemsCount()) {
                        profileSearchCell.useSeparator = size3 != getRecentItemsCount() + (-1);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    size3 -= getRecentItemsCount();
                } else {
                    z2 = false;
                }
                if (!this.searchTopics.isEmpty()) {
                    size3 -= this.searchTopics.size() + 1;
                }
                ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
                ArrayList<Object> phoneSearch = this.searchAdapterHelper.getPhoneSearch();
                int size4 = this.searchResult.size();
                int size5 = this.searchAdapterHelper.getLocalServerSearch().size();
                if (size4 + size5 > 0) {
                    if (getRecentItemsCount() <= 0) {
                        z3 = zIsGlobalSearch;
                        if (!this.searchTopics.isEmpty() || !this.publicPosts.isEmpty()) {
                        }
                    } else {
                        z3 = zIsGlobalSearch;
                    }
                    size3--;
                } else {
                    z3 = zIsGlobalSearch;
                }
                int size6 = phoneSearch.size();
                if (size6 > 3 && this.phoneCollapsed) {
                    size6 = 3;
                }
                int i10 = (size6 <= 0 || !(phoneSearch.get(size6 + (-1)) instanceof String)) ? size6 : size6 - 2;
                int size7 = globalSearch.size();
                int i11 = i10;
                if (size7 > 3 && this.globalSearchCollapsed) {
                    size7 = 3;
                }
                int size8 = (globalSearch.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : this.sponsoredPeers.size() + size7 + 1;
                if (!z2) {
                    profileSearchCell.useSeparator = (size3 == (getItemCount() - getRecentItemsCount()) + (-1) || size3 == ((size4 + i11) + size5) + (-1) || size3 == (((size4 + size8) + size6) + size5) + (-1)) ? false : true;
                }
                if (size3 >= 0 && size3 < this.searchResult.size() && user == null) {
                    charSequence = this.searchResultNames.get(size3);
                    String publicUsername3 = UserObject.getPublicUsername(user);
                    if (charSequence == null || user == null || publicUsername3 == null || !charSequence.toString().startsWith("@".concat(publicUsername3))) {
                        charSequence2 = charSequence;
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        dialogId = dialogId;
                        z4 = z2;
                        charSequence3 = charSequence;
                        charSequence4 = charSequence2;
                    } else {
                        if (z2) {
                            lastFoundUsername = this.filteredRecentQuery;
                        } else {
                            lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        }
                        if (TextUtils.isEmpty(lastFoundUsername)) {
                            dialogId = dialogId;
                            z4 = z2;
                            charSequence3 = charSequence;
                            charSequence4 = charSequence2;
                        } else {
                            if (user != null) {
                                monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                            } else if (chat != null) {
                                monoForumTitle = null;
                            } else if (chat.monoforum) {
                                monoForumTitle = ForumUtilities.getMonoForumTitle(chat, this.currentAccount, false);
                            } else {
                                monoForumTitle = chat.title;
                            }
                            if (monoForumTitle != null) {
                                iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(monoForumTitle, lastFoundUsername);
                                charSequence6 = charSequence;
                                if (iIndexOfIgnoreCase != -1) {
                                    spannableStringBuilder = new SpannableStringBuilder(monoForumTitle);
                                    spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, lastFoundUsername.length() + iIndexOfIgnoreCase, 33);
                                }
                                if (arrayList != null) {
                                    i4 = 1;
                                    if (arrayList.size() > 1) {
                                        if (lastFoundUsername.startsWith("@")) {
                                            charSequence7 = spannableStringBuilder;
                                            strSubstring = lastFoundUsername.substring(1);
                                        } else {
                                            charSequence7 = spannableStringBuilder;
                                            strSubstring = lastFoundUsername;
                                        }
                                        size = arrayList.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size) {
                                                TLRPC.TL_username tL_username3 = arrayList.get(i5);
                                                i5 += i4;
                                                z4 = z2;
                                                tL_username2 = tL_username3;
                                                if (!!tL_username2.active && tL_username2.username.startsWith(strSubstring)) {
                                                    str = tL_username2.username;
                                                } else {
                                                    z2 = z4;
                                                    i4 = 1;
                                                }
                                            } else {
                                                z4 = z2;
                                                str = null;
                                            }
                                        }
                                        if (str == null) {
                                            size2 = arrayList.size();
                                            i6 = 0;
                                            while (true) {
                                                if (i6 < size2) {
                                                    TLRPC.TL_username tL_username4 = arrayList.get(i6);
                                                    i6++;
                                                    tL_username = tL_username4;
                                                    charSequence10 = charSequence7;
                                                    if (!tL_username.active && tL_username.username.contains(strSubstring)) {
                                                        charSequence7 = charSequence7;
                                                        str = tL_username.username;
                                                        charSequence8 = charSequence10;
                                                    } else {
                                                        charSequence7 = charSequence7;
                                                        charSequence7 = charSequence10;
                                                    }
                                                } else {
                                                    charSequence7 = charSequence7;
                                                    charSequence8 = charSequence7;
                                                }
                                            }
                                        } else {
                                            charSequence8 = charSequence7;
                                        }
                                        if (str != null) {
                                            publicUsername = str;
                                        }
                                    } else {
                                        charSequence7 = spannableStringBuilder;
                                        charSequence7 = spannableStringBuilder;
                                        charSequence8 = charSequence7;
                                        z4 = z2;
                                    }
                                } else {
                                    charSequence7 = spannableStringBuilder;
                                    charSequence7 = spannableStringBuilder;
                                    charSequence8 = charSequence7;
                                    z4 = z2;
                                }
                                if (publicUsername == null && (user == null || z3)) {
                                    if (lastFoundUsername.startsWith("@")) {
                                        lastFoundUsername = lastFoundUsername.substring(1);
                                    }
                                    try {
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        spannableStringBuilder3.append((CharSequence) "@");
                                        spannableStringBuilder3.append((CharSequence) publicUsername);
                                        int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                                        charSequence9 = spannableStringBuilder3;
                                        if (iIndexOfIgnoreCase2 != -1) {
                                            int length = lastFoundUsername.length();
                                            if (iIndexOfIgnoreCase2 == 0) {
                                                length++;
                                            } else {
                                                iIndexOfIgnoreCase2++;
                                            }
                                            spannableStringBuilder3.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase2, length + iIndexOfIgnoreCase2, 33);
                                            charSequence9 = spannableStringBuilder3;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        charSequence9 = publicUsername;
                                    }
                                } else {
                                    charSequence9 = charSequence6;
                                }
                                charSequence4 = charSequence8;
                                charSequence3 = charSequence9;
                            } else {
                                charSequence6 = charSequence;
                            }
                            charSequence7 = charSequence2;
                            if (arrayList != null) {
                                i4 = 1;
                                if (arrayList.size() > 1) {
                                    if (lastFoundUsername.startsWith("@")) {
                                        charSequence7 = spannableStringBuilder;
                                        strSubstring = lastFoundUsername.substring(1);
                                    } else {
                                        charSequence7 = spannableStringBuilder;
                                        strSubstring = lastFoundUsername;
                                    }
                                    size = arrayList.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size) {
                                            TLRPC.TL_username tL_username5 = arrayList.get(i5);
                                            i5 += i4;
                                            z4 = z2;
                                            tL_username2 = tL_username5;
                                            if (!tL_username2.active) {
                                                str = tL_username2.username;
                                            }
                                            z2 = z4;
                                            i4 = 1;
                                        } else {
                                            z4 = z2;
                                            str = null;
                                        }
                                    }
                                    if (str == null) {
                                        size2 = arrayList.size();
                                        i6 = 0;
                                        while (true) {
                                            if (i6 < size2) {
                                                TLRPC.TL_username tL_username6 = arrayList.get(i6);
                                                i6++;
                                                tL_username = tL_username6;
                                                charSequence10 = charSequence7;
                                                if (tL_username.active) {
                                                    charSequence7 = charSequence7;
                                                } else {
                                                    charSequence7 = charSequence7;
                                                    str = tL_username.username;
                                                    charSequence8 = charSequence10;
                                                }
                                                charSequence7 = charSequence10;
                                            } else {
                                                charSequence7 = charSequence7;
                                                charSequence8 = charSequence7;
                                            }
                                        }
                                    } else {
                                        charSequence8 = charSequence7;
                                    }
                                    if (str != null) {
                                        publicUsername = str;
                                    }
                                } else {
                                    charSequence7 = spannableStringBuilder;
                                    charSequence7 = spannableStringBuilder;
                                    charSequence8 = charSequence7;
                                    z4 = z2;
                                }
                            } else {
                                charSequence7 = spannableStringBuilder;
                                charSequence7 = spannableStringBuilder;
                                charSequence8 = charSequence7;
                                z4 = z2;
                            }
                            if (publicUsername == null) {
                                charSequence9 = charSequence6;
                            } else {
                                charSequence9 = charSequence6;
                            }
                            charSequence4 = charSequence8;
                            charSequence3 = charSequence9;
                        }
                    }
                    checkBox2 = profileSearchCell.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.setChecked(false, false);
                    }
                    if (user == null && user.id == this.selfUserId && this.dialogsType != 16) {
                        charSequence5 = null;
                        z5 = true;
                        string = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        z5 = false;
                        charSequence5 = charSequence3;
                        string = charSequence4;
                    }
                    CharSequence charSequence11 = string;
                    if (chat == null && chat.participants_count != 0) {
                        String pluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                        if (!(charSequence5 instanceof SpannableStringBuilder)) {
                            if (TextUtils.isEmpty(charSequence5)) {
                                charSequence5 = pluralStringSpaced;
                            } else {
                                charSequenceConcat2 = TextUtils.concat(charSequence5, ", ", pluralStringSpaced);
                                i3 = 2;
                            }
                            DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                            profileSearchCell.allowBotOpenButton = z4;
                            profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda6;
                            profileSearchCell.setOnSponsoredOptionsClick(new GiftSheet$$ExternalSyntheticLambda8(this, 1));
                            if (z) {
                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                            } else {
                                tL_sponsoredPeer = null;
                            }
                            profileSearchCell.setAd(tL_sponsoredPeer);
                            if (user != null) {
                                obj = user;
                            } else {
                                obj = chat;
                            }
                            profileSearchCell.setData(obj, encryptedChat, charSequence11, charSequenceConcat2, true, z5);
                            zIsSelected = this.delegate.isSelected(profileSearchCell.getDialogId());
                            if (dialogId == profileSearchCell.getDialogId()) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (checkBox2 == null) {
                                checkBox2.setChecked(zIsSelected, z6);
                                break;
                            }
                        } else {
                            ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced);
                        }
                    } else {
                        if (user == null && user.bot && (i2 = user.bot_active_users) != 0) {
                            String pluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i2);
                            if (charSequence5 instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced2);
                            } else if (TextUtils.isEmpty(charSequence5)) {
                                i3 = 2;
                                charSequenceConcat = pluralStringSpaced2;
                            } else {
                                i3 = 2;
                                charSequenceConcat = TextUtils.concat(charSequence5, ", ", pluralStringSpaced2);
                            }
                        }
                        charSequenceConcat2 = charSequenceConcat;
                        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda7 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                        profileSearchCell.allowBotOpenButton = z4;
                        profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda7;
                        profileSearchCell.setOnSponsoredOptionsClick(new GiftSheet$$ExternalSyntheticLambda8(this, 1));
                        if (z) {
                            tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                        } else {
                            tL_sponsoredPeer = null;
                        }
                        profileSearchCell.setAd(tL_sponsoredPeer);
                        if (user != null) {
                            obj = user;
                        } else {
                            obj = chat;
                        }
                        profileSearchCell.setData(obj, encryptedChat, charSequence11, charSequenceConcat2, true, z5);
                        zIsSelected = this.delegate.isSelected(profileSearchCell.getDialogId());
                        if (dialogId == profileSearchCell.getDialogId()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (checkBox2 == null) {
                            checkBox2.setChecked(zIsSelected, z6);
                            break;
                        }
                    }
                    i3 = 2;
                    charSequenceConcat = charSequence5;
                    charSequenceConcat2 = charSequenceConcat;
                    DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda8 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                    profileSearchCell.allowBotOpenButton = z4;
                    profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda8;
                    profileSearchCell.setOnSponsoredOptionsClick(new GiftSheet$$ExternalSyntheticLambda8(this, 1));
                    if (z) {
                        tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                    } else {
                        tL_sponsoredPeer = null;
                    }
                    profileSearchCell.setAd(tL_sponsoredPeer);
                    if (user != null) {
                        obj = user;
                    } else {
                        obj = chat;
                    }
                    profileSearchCell.setData(obj, encryptedChat, charSequence11, charSequenceConcat2, true, z5);
                    zIsSelected = this.delegate.isSelected(profileSearchCell.getDialogId());
                    if (dialogId == profileSearchCell.getDialogId()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (checkBox2 == null) {
                        checkBox2.setChecked(zIsSelected, z6);
                        break;
                    }
                } else {
                    charSequence = null;
                }
                charSequence2 = null;
                if (charSequence != null) {
                    dialogId = dialogId;
                    z4 = z2;
                    charSequence3 = charSequence;
                    charSequence4 = charSequence2;
                } else {
                    if (z2) {
                        lastFoundUsername = this.filteredRecentQuery;
                    } else {
                        lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                    }
                    if (TextUtils.isEmpty(lastFoundUsername)) {
                        if (user != null) {
                            monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (chat != null) {
                            monoForumTitle = null;
                        } else if (chat.monoforum) {
                            monoForumTitle = ForumUtilities.getMonoForumTitle(chat, this.currentAccount, false);
                        } else {
                            monoForumTitle = chat.title;
                        }
                        if (monoForumTitle != null) {
                            iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(monoForumTitle, lastFoundUsername);
                            charSequence6 = charSequence;
                            if (iIndexOfIgnoreCase != -1) {
                                spannableStringBuilder = new SpannableStringBuilder(monoForumTitle);
                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4), iIndexOfIgnoreCase, lastFoundUsername.length() + iIndexOfIgnoreCase, 33);
                            }
                            if (arrayList != null) {
                                i4 = 1;
                                if (arrayList.size() > 1) {
                                    if (lastFoundUsername.startsWith("@")) {
                                        charSequence7 = spannableStringBuilder;
                                        strSubstring = lastFoundUsername.substring(1);
                                    } else {
                                        charSequence7 = spannableStringBuilder;
                                        strSubstring = lastFoundUsername;
                                    }
                                    size = arrayList.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size) {
                                            TLRPC.TL_username tL_username7 = arrayList.get(i5);
                                            i5 += i4;
                                            z4 = z2;
                                            tL_username2 = tL_username7;
                                            if (!tL_username2.active) {
                                                str = tL_username2.username;
                                            }
                                            z2 = z4;
                                            i4 = 1;
                                        } else {
                                            z4 = z2;
                                            str = null;
                                        }
                                    }
                                    if (str == null) {
                                        size2 = arrayList.size();
                                        i6 = 0;
                                        while (true) {
                                            if (i6 < size2) {
                                                TLRPC.TL_username tL_username8 = arrayList.get(i6);
                                                i6++;
                                                tL_username = tL_username8;
                                                charSequence10 = charSequence7;
                                                if (tL_username.active) {
                                                    charSequence7 = charSequence7;
                                                } else {
                                                    charSequence7 = charSequence7;
                                                    str = tL_username.username;
                                                    charSequence8 = charSequence10;
                                                }
                                                charSequence7 = charSequence10;
                                            } else {
                                                charSequence7 = charSequence7;
                                                charSequence8 = charSequence7;
                                            }
                                        }
                                    } else {
                                        charSequence8 = charSequence7;
                                    }
                                    if (str != null) {
                                        publicUsername = str;
                                    }
                                } else {
                                    charSequence7 = spannableStringBuilder;
                                    charSequence7 = spannableStringBuilder;
                                    charSequence8 = charSequence7;
                                    z4 = z2;
                                }
                            } else {
                                charSequence7 = spannableStringBuilder;
                                charSequence7 = spannableStringBuilder;
                                charSequence8 = charSequence7;
                                z4 = z2;
                            }
                            if (publicUsername == null) {
                                charSequence9 = charSequence6;
                            } else {
                                charSequence9 = charSequence6;
                            }
                            charSequence4 = charSequence8;
                            charSequence3 = charSequence9;
                        } else {
                            charSequence6 = charSequence;
                        }
                        charSequence7 = charSequence2;
                        if (arrayList != null) {
                            i4 = 1;
                            if (arrayList.size() > 1) {
                                if (lastFoundUsername.startsWith("@")) {
                                    charSequence7 = spannableStringBuilder;
                                    strSubstring = lastFoundUsername.substring(1);
                                } else {
                                    charSequence7 = spannableStringBuilder;
                                    strSubstring = lastFoundUsername;
                                }
                                size = arrayList.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size) {
                                        TLRPC.TL_username tL_username9 = arrayList.get(i5);
                                        i5 += i4;
                                        z4 = z2;
                                        tL_username2 = tL_username9;
                                        if (!tL_username2.active) {
                                            str = tL_username2.username;
                                        }
                                        z2 = z4;
                                        i4 = 1;
                                    } else {
                                        z4 = z2;
                                        str = null;
                                    }
                                }
                                if (str == null) {
                                    size2 = arrayList.size();
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < size2) {
                                            TLRPC.TL_username tL_username10 = arrayList.get(i6);
                                            i6++;
                                            tL_username = tL_username10;
                                            charSequence10 = charSequence7;
                                            if (tL_username.active) {
                                                charSequence7 = charSequence7;
                                            } else {
                                                charSequence7 = charSequence7;
                                                str = tL_username.username;
                                                charSequence8 = charSequence10;
                                            }
                                            charSequence7 = charSequence10;
                                        } else {
                                            charSequence7 = charSequence7;
                                            charSequence8 = charSequence7;
                                        }
                                    }
                                } else {
                                    charSequence8 = charSequence7;
                                }
                                if (str != null) {
                                    publicUsername = str;
                                }
                            } else {
                                charSequence7 = spannableStringBuilder;
                                charSequence7 = spannableStringBuilder;
                                charSequence8 = charSequence7;
                                z4 = z2;
                            }
                        } else {
                            charSequence7 = spannableStringBuilder;
                            charSequence7 = spannableStringBuilder;
                            charSequence8 = charSequence7;
                            z4 = z2;
                        }
                        if (publicUsername == null) {
                            charSequence9 = charSequence6;
                        } else {
                            charSequence9 = charSequence6;
                        }
                        charSequence4 = charSequence8;
                        charSequence3 = charSequence9;
                    } else {
                        dialogId = dialogId;
                        z4 = z2;
                        charSequence3 = charSequence;
                        charSequence4 = charSequence2;
                    }
                }
                checkBox2 = profileSearchCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.setChecked(false, false);
                }
                if (user == null) {
                    z5 = false;
                    charSequence5 = charSequence3;
                    string = charSequence4;
                } else {
                    z5 = false;
                    charSequence5 = charSequence3;
                    string = charSequence4;
                }
                CharSequence charSequence12 = string;
                if (chat == null) {
                    if (user == null) {
                        i3 = 2;
                        charSequenceConcat = charSequence5;
                    } else {
                        i3 = 2;
                        charSequenceConcat = charSequence5;
                    }
                    charSequenceConcat2 = charSequenceConcat;
                } else {
                    if (user == null) {
                        i3 = 2;
                        charSequenceConcat = charSequence5;
                    } else {
                        i3 = 2;
                        charSequenceConcat = charSequence5;
                    }
                    charSequenceConcat2 = charSequenceConcat;
                }
                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda9 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                profileSearchCell.allowBotOpenButton = z4;
                profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda9;
                profileSearchCell.setOnSponsoredOptionsClick(new GiftSheet$$ExternalSyntheticLambda8(this, 1));
                if (z) {
                    tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
                } else {
                    tL_sponsoredPeer = null;
                }
                profileSearchCell.setAd(tL_sponsoredPeer);
                if (user != null) {
                    obj = user;
                } else {
                    obj = chat;
                }
                profileSearchCell.setData(obj, encryptedChat, charSequence12, charSequenceConcat2, true, z5);
                zIsSelected = this.delegate.isSelected(profileSearchCell.getDialogId());
                if (dialogId == profileSearchCell.getDialogId()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (checkBox2 == null) {
                    checkBox2.setChecked(zIsSelected, z6);
                    break;
                }
                break;
            case 1:
                final GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (!this.searchResultHashtags.isEmpty()) {
                    String string3 = LocaleController.getString(R.string.Hashtags);
                    String string4 = LocaleController.getString(R.string.ClearButton);
                    final int i12 = z7 ? 1 : 0;
                    graySectionCell.setText(string3, string4, new View.OnClickListener(this) {
                        public final DialogsSearchAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    this.f$0.lambda$onBindViewHolder$26(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$onBindViewHolder$27(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$onBindViewHolder$28(view);
                                    break;
                                default:
                                    this.f$0.lambda$onBindViewHolder$29(view);
                                    break;
                            }
                        }
                    });
                } else {
                    if (this.publicPosts.isEmpty()) {
                        recentItemsCount = size3;
                    } else if (size3 == 0) {
                        graySectionCell.setText(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) {
                            public final DialogsSearchAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i9) {
                                    case 0:
                                        this.f$0.lambda$onBindViewHolder$26(view);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onBindViewHolder$27(view);
                                        break;
                                    case 2:
                                        this.f$0.lambda$onBindViewHolder$28(view);
                                        break;
                                    default:
                                        this.f$0.lambda$onBindViewHolder$29(view);
                                        break;
                                }
                            }
                        });
                    } else {
                        recentItemsCount = size3 - (this.publicPosts.size() + 1);
                    }
                    ArrayList<TLObject> globalSearch2 = this.searchAdapterHelper.getGlobalSearch();
                    if (isRecentSearchDisplayed() || !this.searchTopics.isEmpty() || !this.searchContacts.isEmpty() || !this.publicPosts.isEmpty()) {
                        ?? HasHints = hasHints();
                        if (recentItemsCount < HasHints) {
                            graySectionCell.setText(LocaleController.getString(R.string.ChatHints));
                        } else if (recentItemsCount == HasHints && isRecentSearchDisplayed()) {
                            if (!this.searchWas) {
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i7) {
                                            case 0:
                                                this.f$0.lambda$onBindViewHolder$26(view);
                                                break;
                                            case 1:
                                                this.f$0.lambda$onBindViewHolder$27(view);
                                                break;
                                            case 2:
                                                this.f$0.lambda$onBindViewHolder$28(view);
                                                break;
                                            default:
                                                this.f$0.lambda$onBindViewHolder$29(view);
                                                break;
                                        }
                                    }
                                });
                            } else {
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i8) {
                                            case 0:
                                                this.f$0.lambda$onBindViewHolder$26(view);
                                                break;
                                            case 1:
                                                this.f$0.lambda$onBindViewHolder$27(view);
                                                break;
                                            case 2:
                                                this.f$0.lambda$onBindViewHolder$28(view);
                                                break;
                                            default:
                                                this.f$0.lambda$onBindViewHolder$29(view);
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (recentItemsCount == getRecentItemsCount() + (this.searchTopics.isEmpty() ? 0 : this.searchTopics.size() + 1) + (this.searchContacts.isEmpty() ? 0 : this.searchContacts.size() + 1) && !this.searchResult.isEmpty()) {
                            graySectionCell.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                        } else {
                            recentItemsCount -= getRecentItemsCount();
                        }
                    }
                    int size9 = this.searchResult.size();
                    int size10 = this.searchAdapterHelper.getLocalServerSearch().size();
                    int size11 = this.searchAdapterHelper.getPhoneSearch().size();
                    if (size11 > 3 && this.phoneCollapsed) {
                        size11 = 3;
                    }
                    int size12 = globalSearch2.size();
                    if (size12 > 3 && this.globalSearchCollapsed) {
                        size12 = 3;
                    }
                    int size13 = (globalSearch2.isEmpty() && this.sponsoredPeers.isEmpty()) ? 0 : this.sponsoredPeers.size() + size12 + 1;
                    int size14 = this.searchForumResultMessages.isEmpty() ? 0 : this.searchForumResultMessages.size() + 1;
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
                        spannableStringBuilder2 = null;
                        botBiometry$$ExternalSyntheticLambda8 = null;
                    } else {
                        int i13 = recentItemsCount - (size9 + size10);
                        if (i13 < 0 || i13 >= size11) {
                            int i14 = i13 - size11;
                            if (i14 >= 0 && i14 < size13) {
                                string2 = LocaleController.getString(R.string.GlobalSearch);
                                if (this.searchAdapterHelper.getGlobalSearch().size() > 3) {
                                    z7 = this.globalSearchCollapsed;
                                    botBiometry$$ExternalSyntheticLambda8 = new BotBiometry$$ExternalSyntheticLambda8((Object) this, (ArrayList) globalSearch2, size3, (Object) graySectionCell, 5);
                                    spannableStringBuilder2 = null;
                                }
                            } else if (this.delegate == null || size14 <= 0 || i14 - size13 > 1) {
                                this.messagesSectionPosition = i14;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(this.currentMessagesFilter.strFromResId));
                                spannableStringBuilder4.append((CharSequence) "v");
                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
                                this.filterArrowsIcon = coloredImageSpan;
                                spannableStringBuilder4.setSpan(coloredImageSpan, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                Runnable runnable = new Runnable(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                this.f$0.lambda$onBindViewHolder$30(graySectionCell);
                                                break;
                                            default:
                                                this.f$0.lambda$onBindViewHolder$35(graySectionCell);
                                                break;
                                        }
                                    }
                                };
                                string2 = LocaleController.getString(R.string.SearchMessages);
                                botBiometry$$ExternalSyntheticLambda8 = runnable;
                                spannableStringBuilder2 = spannableStringBuilder4;
                            } else {
                                TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.delegate.getSearchForumDialogId()));
                                string2 = LocaleController.formatString(R.string.SearchMessagesIn, chat5 == null ? "null" : chat5.monoforum ? ForumUtilities.getMonoForumTitle(chat5, this.currentAccount, false) : chat5.title);
                            }
                            spannableStringBuilder2 = null;
                            botBiometry$$ExternalSyntheticLambda8 = null;
                        } else {
                            string2 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (this.searchAdapterHelper.getPhoneSearch().size() > 3) {
                                boolean z9 = this.phoneCollapsed;
                                final int i15 = z7 ? 1 : 0;
                                Runnable runnable2 = new Runnable(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                this.f$0.lambda$onBindViewHolder$30(graySectionCell);
                                                break;
                                            default:
                                                this.f$0.lambda$onBindViewHolder$35(graySectionCell);
                                                break;
                                        }
                                    }
                                };
                                z7 = z9;
                                botBiometry$$ExternalSyntheticLambda8 = runnable2;
                                spannableStringBuilder2 = null;
                            } else {
                                spannableStringBuilder2 = null;
                                botBiometry$$ExternalSyntheticLambda8 = null;
                            }
                        }
                    }
                    if (botBiometry$$ExternalSyntheticLambda8 == null) {
                        graySectionCell.setText(string2);
                    } else if (spannableStringBuilder2 == null) {
                        graySectionCell.setText(string2, LocaleController.getString(z7 ? R.string.ShowMore : R.string.ShowLess), new TextCheckCell2$$ExternalSyntheticLambda0(2, botBiometry$$ExternalSyntheticLambda8));
                        graySectionCell.setRightTextMargin(16);
                    } else {
                        graySectionCell.setText(string2, spannableStringBuilder2, new TextCheckCell2$$ExternalSyntheticLambda0(i9, botBiometry$$ExternalSyntheticLambda8));
                        graySectionCell.setRightTextMargin(6);
                    }
                }
                break;
            case 2:
            case 9:
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                dialogCell.useSeparator = size3 != getItemCount() - 1;
                MessageObject messageObject = (MessageObject) getItem(size3);
                dialogCell.useFromUserAsAvatar = this.searchForumResultMessages.contains(messageObject);
                if (messageObject != null) {
                    dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                } else {
                    dialogCell.setDialog(0L, null, 0, false, false);
                }
                break;
            case 3:
                ((TopicSearchCell) viewHolder.itemView).setTopic((TLRPC.TL_forumTopic) getItem(size3));
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = (HashtagSearchCell) viewHolder.itemView;
                hashtagSearchCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                hashtagSearchCell.setText(this.searchResultHashtags.get(size3 - 1));
                hashtagSearchCell.setNeedDivider(size3 != this.searchResultHashtags.size());
                break;
            case 6:
                ((CategoryAdapterRecycler) ((RecyclerListView) viewHolder.itemView).getAdapter()).setIndex(size3 / 2);
                break;
            case 7:
                String str2 = (String) getItem(size3);
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
                textCell.setText(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str2)), false);
                break;
            case 8:
                ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) viewHolder.itemView;
                ContactsController.Contact contact = (ContactsController.Contact) getItem(size3);
                profileSearchCell2.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), contact.shortPhones.get(0), PhoneFormat.getInstance()), false, false);
                break;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View anonymousClass3;
        int i2 = 0;
        switch (i) {
            case 0:
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(this.mContext, null);
                profileSearchCell.showPremiumBlocked = this.dialogsType == 3;
                anonymousClass3 = profileSearchCell;
                break;
            case 1:
                anonymousClass3 = new GraySectionCell(this.mContext, 16, null);
                break;
            case 2:
            case 9:
                anonymousClass3 = new AnonymousClass3(null, this.mContext, true, UserConfig.selectedAccount, null);
                break;
            case 3:
                anonymousClass3 = new TopicSearchCell(this.mContext);
                break;
            case 4:
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setViewType(1);
                flickerLoadingView.setIsSingleCell(true);
                anonymousClass3 = flickerLoadingView;
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = new HashtagSearchCell(this.mContext);
                hashtagSearchCell.setGravity(16);
                hashtagSearchCell.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                hashtagSearchCell.setTextSize(1, 17.0f);
                hashtagSearchCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                anonymousClass3 = hashtagSearchCell;
                break;
            case 6:
                LiveCommentsView.AnonymousClass4 anonymousClass4 = new LiveCommentsView.AnonymousClass4(this.mContext, true ? 1 : 0);
                anonymousClass4.setSelectorDrawableColor(Theme.getColor(null, Theme.key_listSelector, false));
                anonymousClass4.setTag(9);
                anonymousClass4.lambda$onCellEnter$52(null);
                anonymousClass4.setLayoutAnimation(null);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(true ? 1 : 0, i2, false ? 1 : 0);
                anonymousClass5.setOrientation(0);
                anonymousClass4.setLayoutManager(anonymousClass5);
                anonymousClass4.setAdapter(new CategoryAdapterRecycler(this.currentAccount, this.mContext, this.resourcesProvider, false, this.dialogsType == 3));
                anonymousClass4.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, true ? 1 : 0));
                anonymousClass4.setOnItemLongClickListener(new DialogsSearchAdapter$$ExternalSyntheticLambda2(this));
                this.innerListView = anonymousClass4;
                anonymousClass3 = anonymousClass4;
                break;
            case 7:
            default:
                anonymousClass3 = new TextCell(16, this.mContext, null, false, false);
                break;
            case 8:
                anonymousClass3 = new ProfileSearchCell(this.mContext, null);
                break;
            case 10:
                EmptyLayout emptyLayout = new EmptyLayout(this.mContext, this.resourcesProvider, new DialogsSearchAdapter$$ExternalSyntheticLambda5(this, 0));
                this.messagesEmptyLayout = emptyLayout;
                emptyLayout.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.lastMessagesSearchString));
                anonymousClass3 = emptyLayout;
                break;
        }
        if (i == 5) {
            anonymousClass3.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(86.0f)));
        } else {
            anonymousClass3.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        return new RecyclerListView.Holder(anonymousClass3);
    }

    public abstract void openBotApp(TLRPC.User user);

    public abstract void openPublicPosts();

    public abstract void openSponsoredOptions(ProfileSearchCell profileSearchCell, TLRPC.TL_sponsoredPeer tL_sponsoredPeer);

    public void putRecentSearch(long j, TLObject tLObject) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            recentSearchObject = new RecentSearchObject();
            this.recentSearchObjectsById.put(recentSearchObject, j);
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
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new DialogsSearchAdapter$$ExternalSyntheticLambda1(this, j, 0));
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

    public void removeRecentSearch(long j) {
        RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjectsById.get(j);
        if (recentSearchObject == null) {
            return;
        }
        this.recentSearchObjectsById.remove(j);
        this.recentSearchObjects.remove(recentSearchObject);
        this.filtered2RecentSearchObjects.remove(recentSearchObject);
        this.filteredRecentSearchObjects.remove(recentSearchObject);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new DialogsSearchAdapter$$ExternalSyntheticLambda1(this, j, 1));
    }

    public void resetFilter() {
        this.currentMessagesFilter = Filter.All;
    }

    public void searchDialogs(String str, int i, boolean z) {
        String str2;
        if (str != null && str.equals(this.lastSearchText) && (i == this.folderId || TextUtils.isEmpty(str))) {
            return;
        }
        this.lastSearchText = str;
        this.folderId = i;
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
        String strTrim = str != null ? str.trim() : null;
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
                this.sponsoredReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getSponsoredPeers, new RichMediaUploader$$ExternalSyntheticLambda0(this, 4));
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
                searchMessagesInternal(0, null);
                searchForumMessagesInternal(0, null);
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
                ArrayList<SearchAdapterHelper.HashtagObject> hashtags = this.searchAdapterHelper.getHashtags();
                for (int i3 = 0; i3 < hashtags.size(); i3++) {
                    this.searchResultHashtags.add(hashtags.get(i3).hashtag);
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
        int i4 = this.lastSearchId + 1;
        this.lastSearchId = i4;
        this.waitingResponseCount = 3;
        this.globalSearchCollapsed = true;
        this.phoneCollapsed = true;
        notifyDataSetChanged();
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate4 = this.delegate;
        if (dialogsSearchAdapterDelegate4 != null) {
            dialogsSearchAdapterDelegate4.searchStateChanged(true, false);
        }
        if (!z || strTrim == null) {
            str2 = null;
        } else {
            String strTrim2 = strTrim.trim();
            if (strTrim2.length() <= 1 || !(strTrim2.charAt(0) == '#' || strTrim2.charAt(0) == '$')) {
                str2 = null;
            } else {
                int iIndexOf = strTrim2.indexOf(64);
                String strSubstring = strTrim2.substring(1);
                if (iIndexOf >= 0) {
                    strTrim2.substring(iIndexOf + 1);
                }
                str2 = strSubstring;
            }
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        DialogsSearchAdapter$$ExternalSyntheticLambda18 dialogsSearchAdapter$$ExternalSyntheticLambda18 = new DialogsSearchAdapter$$ExternalSyntheticLambda18(this, strTrim, i4, str, 0);
        this.searchRunnable = dialogsSearchAdapter$$ExternalSyntheticLambda18;
        dispatchQueue.postRunnable(dialogsSearchAdapter$$ExternalSyntheticLambda18, 300L);
        if (str2 != null) {
            this.waitingResponseCount++;
            RichTextCell$2$$ExternalSyntheticLambda1 richTextCell$2$$ExternalSyntheticLambda1 = new RichTextCell$2$$ExternalSyntheticLambda1(this, i4, str2, 6);
            this.searchHashtagRunnable = richTextCell$2$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(richTextCell$2$$ExternalSyntheticLambda1, 300L);
        }
    }

    public final void searchDialogsInternal(String str, int i) {
        if (this.needMessagesSearch == 2) {
            return;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() != 0) {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new DialogsSearchAdapter$$ExternalSyntheticLambda18(this, lowerCase, i, str, 1));
            return;
        }
        this.lastSearchId = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        new ArrayList();
        updateSearchResults(this.lastSearchId, arrayList, arrayList2, arrayList3);
    }

    public final void searchForumMessagesInternal(int i, String str) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() != 0 && this.needMessagesSearch != 0 && (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str))) {
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
            if (this.dialogsType != 15) {
                long searchForumDialogId = this.delegate.getSearchForumDialogId();
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.limit = 20;
                tL_messages_search.q = str;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchForumDialogId);
                if (str.equals(this.lastMessagesSearchString) && !this.searchForumResultMessages.isEmpty()) {
                    tL_messages_search.add_offset = this.searchForumResultMessages.size();
                }
                this.lastMessagesSearchString = str;
                int i2 = this.lastForumReqId + 1;
                this.lastForumReqId = i2;
                this.reqForumId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new FileLoadOperation$$ExternalSyntheticLambda2(this, str, i2, i, tL_messages_search, 1), 2);
            }
        }
    }

    public final void searchMessagesInternal(int i, String str) {
        if (this.needMessagesSearch != 0 && (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str))) {
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
            if (this.dialogsType != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i2 = this.currentMessagesFilter.flags;
                tL_messages_searchGlobal.broadcasts_only = (i2 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i2 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i2 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.folderId;
                if (!str.equals(this.lastMessagesSearchString)) {
                    this.forceLoadingMessages = false;
                }
                if (str.equals(this.lastMessagesSearchString) && this.lastMessagesSearchFilterFlags == this.currentMessagesFilter.flags && !this.searchResultMessages.isEmpty() && this.lastMessagesSearchId == this.lastSearchId) {
                    MessageObject messageObject = (MessageObject) zzin.m(1, this.searchResultMessages);
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
                int i3 = this.lastReqId + 1;
                this.lastReqId = i3;
                this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new FileLoadOperation$$ExternalSyntheticLambda2(this, str, i3, i, tL_messages_searchGlobal, 2), 2);
                return;
            }
            int i4 = this.waitingResponseCount - 1;
            this.waitingResponseCount = i4;
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate != null) {
                dialogsSearchAdapterDelegate.searchStateChanged(i4 > 0, true);
                this.delegate.runResultsEnterAnimation();
            }
        }
    }

    public final void searchTopics(String str) {
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

    public void seenSponsoredPeer(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        if (tL_sponsoredPeer == null) {
            return;
        }
        Iterator<byte[]> it = this.seenSponsoredPeers.iterator();
        while (it.hasNext()) {
            if (Arrays.equals(it.next(), tL_sponsoredPeer.random_id)) {
                return;
            }
        }
        this.seenSponsoredPeers.add(tL_sponsoredPeer.random_id);
        TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
        tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_viewSponsoredMessage, null);
    }

    public void setDelegate(DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate) {
        this.delegate = dialogsSearchAdapterDelegate;
    }

    public void setFilterDialogIds(ArrayList<Long> arrayList) {
        this.filterDialogIds = arrayList;
    }

    public void setFiltersDelegate(FilteredSearchView.Delegate delegate, boolean z) {
        this.filtersDelegate = delegate;
        if (delegate == null || !z) {
            return;
        }
        delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
    }

    public final void updateSearchResults(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(this, i, arrayList, arrayList2, arrayList3, 8));
    }

    public static void loadRecentSearch(int i, int i2, OnRecentSearchLoaded onRecentSearchLoaded) {
        MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new SurfaceViewRenderer$$ExternalSyntheticLambda0(i, i2, onRecentSearchLoaded));
    }
}
