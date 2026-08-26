package org.telegram.ui.Adapters;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoadOperation$$ExternalSyntheticLambda2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.HashtagsSearchAdapter;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.StoriesController;

public abstract class DialogsSearchAdapter extends RecyclerListView.SelectionAdapter {
    public ArticleViewer$$ExternalSyntheticLambda8 cancelShowMoreAnimation;
    public final int currentAccount;
    public int currentItemCount;
    public String currentMessagesQuery;
    public DialogsActivity.AnonymousClass48 delegate;
    public final DialogsActivity dialogsActivity;
    public final int dialogsType;
    public ArrayList filterDialogIds;
    public final ArrayList filtered2RecentSearchObjects;
    public String filteredRecentQuery;
    public final ArrayList filteredRecentSearchObjects;
    public FilteredSearchView.Delegate filtersDelegate;
    public int folderId;
    public boolean forceLoadingMessages;
    public boolean globalSearchCollapsed;
    public MessageSeenView.AnonymousClass1 innerListView;
    public final DefaultItemAnimator itemAnimator;
    public int lastForumReqId;
    public int lastGlobalSearchId;
    public int lastLocalSearchId;
    public int lastMessagesSearchFilterFlags;
    public int lastMessagesSearchId;
    public String lastMessagesSearchString;
    public int lastReqId;
    public int lastSearchId;
    public String lastSearchText;
    public long lastShowMoreUpdate;
    public boolean localMessagesSearchEndReached;
    public boolean localTipArchive;
    public final ArrayList localTipDates;
    public final Activity mContext;
    public EmptyLayout messagesEmptyLayout;
    public boolean messagesSearchEndReached;
    public int messagesSectionPosition;
    public final int needMessagesSearch;
    public int nextSearchRate;
    public boolean phoneCollapsed;
    public String publicPostsHashtag;
    public int publicPostsLastRate;
    public int publicPostsTotalCount;
    public ArrayList recentSearchObjects;
    public LongSparseArray recentSearchObjectsById;
    public final AnonymousClass1 searchAdapterHelper;
    public ChatActivity$$ExternalSyntheticLambda17 searchHashtagRunnable;
    public DialogsSearchAdapter$$ExternalSyntheticLambda23 searchRunnable;
    public DialogsSearchAdapter$$ExternalSyntheticLambda23 searchRunnable2;
    public boolean searchWas;
    public final long selfUserId;
    public View showMoreHeader;
    public String sponsoredQuery;
    public int sponsoredReqId;
    public int waitingResponseCount;
    public Filter currentMessagesFilter = Filter.All;
    public int searchHashtagRequest = -1;
    public ArrayList searchResult = new ArrayList();
    public final ArrayList publicPosts = new ArrayList();
    public final ArrayList searchContacts = new ArrayList();
    public final ArrayList searchTopics = new ArrayList();
    public ArrayList searchResultNames = new ArrayList();
    public final ArrayList searchForumResultMessages = new ArrayList();
    public final ArrayList searchResultMessages = new ArrayList();
    public final ArrayList searchResultHashtags = new ArrayList();
    public final ArrayList sponsoredPeers = new ArrayList();
    public final HashSet seenSponsoredPeers = new HashSet();
    public int reqId = 0;
    public int reqForumId = 0;
    public int localMessagesLoadingRow = -1;
    public boolean showMoreAnimation = false;

    public final class AnonymousClass3 extends DialogCell {
        public final int $r8$classId;

        public AnonymousClass3(DialogsActivity dialogsActivity, Context context, boolean z, int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            super(dialogsActivity, context, z, i, resourcesProvider);
            this.$r8$classId = i2;
        }

        @Override
        public final boolean isForumCell() {
            switch (this.$r8$classId) {
            }
            return false;
        }
    }

    public class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
        public final int currentAccount;
        public final boolean drawChecked;
        public final Context mContext;
        public final Theme.ResourcesProvider resourcesProvider;
        public final boolean showPremiumBlock;

        public CategoryAdapterRecycler(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
            this.drawChecked = z;
            this.mContext = context;
            this.currentAccount = i;
            this.showPremiumBlock = z2;
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public final int getItemCount() {
            return MediaDataController.getInstance(this.currentAccount).hints.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String monoForumTitle;
            HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
            int i2 = this.currentAccount;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i2).hints.get(i);
            new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            TLRPC.User user = null;
            if (j != 0) {
                user = MessagesController.getInstance(i2).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                chat = null;
            } else {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                    chat = MessagesController.getInstance(i2).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                } else {
                    long j3 = peer.chat_id;
                    if (j3 != 0) {
                        j = -j3;
                        chat = MessagesController.getInstance(i2).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
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
                monoForumTitle = chat.monoforum ? ForumUtilities.getMonoForumTitle(chat, i2, false) : chat.title;
            } else {
                monoForumTitle = "";
            }
            hintDialogCell.setDialog(j, monoForumTitle);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HintDialogCell hintDialogCell = new HintDialogCell(this.mContext, this.resourcesProvider, this.drawChecked);
            if (this.showPremiumBlock && !hintDialogCell.showPremiumBlocked) {
                hintDialogCell.showPremiumBlocked = true;
                NotificationCenter.getInstance(hintDialogCell.currentAccount).listen(hintDialogCell, NotificationCenter.userIsPremiumBlockedUpadted, new DialogCell$$ExternalSyntheticLambda6(hintDialogCell, 10));
            }
            hintDialogCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
            return new RecyclerListView.Holder(hintDialogCell);
        }
    }

    public final class DialogSearchResult {
        public int date;
        public CharSequence name;
        public TLObject object;
    }

    public final class EmptyLayout extends LinearLayout {
        public final TextView textView;

        public EmptyLayout(Activity activity, ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda3) {
            super(activity);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(activity);
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null));
            addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 27, 0, 0));
            TextView textView = new TextView(activity);
            textView.setTextSize(1, 17.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setTypeface(AndroidUtilities.bold());
            zzkg.m(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 0, 8, 0, 9));
            TextView textView2 = new TextView(activity);
            this.textView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(null, i, false));
            textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 0, 0, 0, 14));
            TextView textView3 = new TextView(activity);
            textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
            int i2 = Theme.key_featuredStickers_addButton;
            textView3.setTextColor(Theme.getColor(null, i2, false));
            int iMultAlpha = Theme.multAlpha(0.15f, Theme.getColor(null, i2, false));
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(6, 6, 6, 6, 0, iMultAlpha, iMultAlpha));
            textView3.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(articleViewer$$ExternalSyntheticLambda3, 4));
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

    public DialogsSearchAdapter(Activity activity, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z) {
        int i3 = UserConfig.selectedAccount;
        this.currentAccount = i3;
        this.recentSearchObjects = new ArrayList();
        this.filteredRecentSearchObjects = new ArrayList();
        this.filtered2RecentSearchObjects = new ArrayList();
        this.filteredRecentQuery = null;
        this.recentSearchObjectsById = new LongSparseArray();
        this.localTipDates = new ArrayList();
        this.messagesSectionPosition = -1;
        this.globalSearchCollapsed = true;
        this.phoneCollapsed = true;
        this.itemAnimator = defaultItemAnimator;
        this.dialogsActivity = dialogsActivity;
        final SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this;
        ?? r6 = new SearchAdapterHelper() {
            {
                super(false);
            }

            @Override
            public final boolean filter(TLObject tLObject) {
                return anonymousClass1.filter(tLObject);
            }
        };
        this.searchAdapterHelper = r6;
        r6.delegate = new Stripe.AnonymousClass1(anonymousClass1, 17);
        r6.allowGlobalResults = z;
        this.mContext = activity;
        this.needMessagesSearch = i;
        this.dialogsType = i2;
        this.selfUserId = UserConfig.getInstance(i3).getClientUserId();
        if (i2 != 15) {
            MessagesStorage.getInstance(i3).getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda26(i3, i2, new DialogsSearchAdapter$$ExternalSyntheticLambda4(this), 6));
        }
        MediaDataController.getInstance(i3).loadHints(true);
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

    public final void clearRecentSearch() {
        StringBuilder sb;
        boolean z = this.searchWas;
        ArrayList arrayList = this.filteredRecentSearchObjects;
        ArrayList arrayList2 = this.filtered2RecentSearchObjects;
        if (z) {
            sb = null;
            while (arrayList2.size() > 0) {
                RecentSearchObject recentSearchObject = (RecentSearchObject) arrayList2.remove(0);
                this.recentSearchObjects.remove(recentSearchObject);
                arrayList.remove(recentSearchObject);
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
            arrayList2.clear();
            arrayList.clear();
            this.recentSearchObjects.clear();
            this.recentSearchObjectsById.clear();
            sb = new StringBuilder("1");
        }
        String str = this.lastSearchText;
        filterRecent(str != null ? str.trim() : null);
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda8(4, (SearchViewPager.AnonymousClass1) this, sb));
    }

    public final boolean filter(Object obj) {
        if (this.dialogsType != 14) {
            return true;
        }
        boolean z = obj instanceof TLRPC.User;
        DialogsActivity dialogsActivity = this.dialogsActivity;
        if (z) {
            return ((TLRPC.User) obj).bot ? dialogsActivity.allowBots : dialogsActivity.allowUsers;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        if (ChatObject.isChannel(chat)) {
            return dialogsActivity.allowChannels;
        }
        if (ChatObject.isMegagroup(chat)) {
            return dialogsActivity.allowGroups || dialogsActivity.allowMegagroups;
        }
        return dialogsActivity.allowGroups || dialogsActivity.allowLegacyGroups;
    }

    public final void filterRecent(String str) {
        DialogsActivity.AnonymousClass48 anonymousClass48;
        String userName;
        String str2;
        this.filteredRecentQuery = str;
        ArrayList arrayList = this.filtered2RecentSearchObjects;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.filteredRecentSearchObjects;
            arrayList2.clear();
            int size = this.recentSearchObjects.size();
            for (int i = 0; i < size; i++) {
                DialogsActivity.AnonymousClass48 anonymousClass49 = this.delegate;
                if ((anonymousClass49 == null || anonymousClass49.getSearchForumDialogId() != ((RecentSearchObject) this.recentSearchObjects.get(i)).did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i)).object)) {
                    arrayList2.add((RecentSearchObject) this.recentSearchObjects.get(i));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.recentSearchObjects.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecentSearchObject recentSearchObject = (RecentSearchObject) this.recentSearchObjects.get(i2);
            if (recentSearchObject != null && recentSearchObject.object != null && (((anonymousClass48 = this.delegate) == null || anonymousClass48.getSearchForumDialogId() != recentSearchObject.did) && filter(((RecentSearchObject) this.recentSearchObjects.get(i2)).object))) {
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
                    arrayList.add(recentSearchObject);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final MessageSeenView.AnonymousClass1 getInnerListView() {
        return this.innerListView;
    }

    public final Object getItem(int i) {
        int size;
        int i2;
        TLRPC.Chat chat;
        int i3;
        ArrayList arrayList = this.publicPosts;
        if (!arrayList.isEmpty()) {
            if (i > 0 && (i3 = i - 1) < arrayList.size()) {
                return arrayList.get(i3);
            }
            i -= arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.searchResultHashtags;
        if (!arrayList2.isEmpty()) {
            if (i > 0) {
                return arrayList2.get(i - 1);
            }
            return null;
        }
        if (isRecentSearchDisplayed()) {
            ?? HasHints = hasHints();
            ArrayList arrayList3 = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i > HasHints && (i2 = (i - 1) - (HasHints == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((RecentSearchObject) arrayList3.get(i2)).object;
                boolean z = tLObject instanceof TLRPC.User;
                int i4 = this.currentAccount;
                if (!z) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i4).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i4).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i -= getRecentItemsCount();
        }
        ArrayList arrayList4 = this.searchTopics;
        if (!arrayList4.isEmpty()) {
            if (i > 0 && i <= arrayList4.size()) {
                return arrayList4.get(i - 1);
            }
            i -= arrayList4.size() + 1;
        }
        ArrayList arrayList5 = this.searchContacts;
        if (!arrayList5.isEmpty()) {
            if (i > 0 && i <= arrayList5.size()) {
                return arrayList5.get(i - 1);
            }
            i -= arrayList5.size() + 1;
        }
        AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
        ArrayList arrayList6 = anonymousClass1.globalSearch;
        ArrayList arrayList7 = anonymousClass1.localServerSearch;
        ArrayList arrayList8 = anonymousClass1.phonesSearch;
        int size2 = this.searchResult.size();
        int size3 = arrayList7.size();
        if (size2 + size3 > 0 && (getRecentItemsCount() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        int size4 = arrayList8.size();
        if (size4 > 3 && this.phoneCollapsed) {
            size4 = 3;
        }
        int size5 = arrayList6.size();
        int i5 = (size5 <= 3 || !this.globalSearchCollapsed) ? size5 : 3;
        boolean zIsEmpty = arrayList6.isEmpty();
        ArrayList arrayList9 = this.sponsoredPeers;
        int i6 = 0;
        int size6 = (zIsEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i5 + 1;
        if (i >= 0 && i < size2) {
            return this.searchResult.get(i);
        }
        int i7 = i - size2;
        if (i7 >= 0 && i7 < size3) {
            return arrayList7.get(i7);
        }
        int i8 = i7 - size3;
        if (i8 >= 0 && i8 < size4) {
            return arrayList8.get(i8);
        }
        int i9 = i8 - size4;
        if (i9 <= 0 || i9 >= size6) {
            size = i9 - size6;
        } else {
            int i10 = i9 - 1;
            if (i10 >= 0 && i10 < arrayList9.size()) {
                return arrayList9.get(i10);
            }
            size = i10 - arrayList9.size();
            if (size >= 0 && size < arrayList6.size()) {
                return arrayList6.get(size);
            }
        }
        ArrayList arrayList10 = this.searchForumResultMessages;
        int size7 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (size > 0 && size <= arrayList10.size()) {
            return arrayList10.get(size - 1);
        }
        if (!this.localMessagesSearchEndReached && !arrayList10.isEmpty()) {
            i6 = 1;
        }
        int i11 = size - (size7 + i6);
        ArrayList arrayList11 = this.searchResultMessages;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i11 <= 0 || i11 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i11 - 1);
    }

    @Override
    public final int getItemCount() {
        int i = 3;
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        ArrayList arrayList = this.publicPosts;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.searchResultHashtags;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        ArrayList arrayList3 = this.searchTopics;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.searchContacts;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.searchResult.size();
        AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
        int size3 = anonymousClass1.localServerSearch.size();
        int i2 = size + size2 + size3;
        int size4 = anonymousClass1.globalSearch.size();
        if (size4 > 3 && this.globalSearchCollapsed) {
            size4 = 3;
        }
        int size5 = this.sponsoredPeers.size() + size4;
        int size6 = anonymousClass1.phonesSearch.size();
        if (size6 > 3 && this.phoneCollapsed) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (getRecentItemsCount() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i2++;
        }
        if (size5 != 0) {
            i2 += size5 + 1;
        }
        if (size6 != 0) {
            i2 += size6;
        }
        ArrayList arrayList5 = this.searchForumResultMessages;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i2 += size7 + 1 + (!this.localMessagesSearchEndReached ? 1 : 0);
        }
        if (!this.localMessagesSearchEndReached) {
            this.localMessagesLoadingRow = i2;
        }
        ArrayList arrayList6 = this.searchResultMessages;
        int size8 = arrayList6.size();
        if ((this.currentMessagesFilter == Filter.All && !this.forceLoadingMessages) || !arrayList6.isEmpty()) {
            i = size8;
        } else if (!this.forceLoadingMessages) {
            i = 1;
        }
        int i3 = (arrayList5.isEmpty() || this.localMessagesSearchEndReached) ? i : 0;
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
    public final long getItemId(int i) {
        return i;
    }

    @Override
    public final int getItemViewType(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsSearchAdapter.getItemViewType(int):int");
    }

    public final int getRecentItemsCount() {
        ArrayList arrayList = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
        return (hasHints() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int globalSearchPosition() {
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        ArrayList arrayList = this.publicPosts;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.searchResultHashtags;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (isRecentSearchDisplayed()) {
            size += getRecentItemsCount();
            if (!this.searchWas) {
                return size;
            }
        }
        ArrayList arrayList3 = this.searchTopics;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.searchContacts;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.searchResult.size();
        int size3 = this.searchAdapterHelper.localServerSearch.size();
        int i = size + size2 + size3;
        if (size2 + size3 > 0) {
            return (getRecentItemsCount() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i : i + 1;
        }
        return i;
    }

    public final boolean hasHints() {
        if (this.searchWas || MediaDataController.getInstance(this.currentAccount).hints.isEmpty()) {
            return false;
        }
        return this.dialogsType != 14 || this.dialogsActivity.allowUsers;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mItemViewType;
        return (i == 1 || i == 4 || i == 10) ? false : true;
    }

    public final boolean isGlobalSearch(int i) {
        int size;
        int size2;
        int size3;
        int i2;
        boolean zIsEmpty;
        ArrayList arrayList;
        int size4;
        int size5;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList2;
        int size6;
        ArrayList arrayList3;
        if (this.searchWas && this.searchResultHashtags.isEmpty()) {
            ArrayList arrayList4 = this.publicPosts;
            if (!arrayList4.isEmpty()) {
                i -= arrayList4.size() + 1;
            }
            if (!isRecentSearchDisplayed()) {
                AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
                ArrayList arrayList5 = anonymousClass1.globalSearch;
                ArrayList arrayList6 = anonymousClass1.localServerSearch;
                size = this.searchResult.size();
                size2 = arrayList6.size();
                size3 = anonymousClass1.phonesSearch.size();
                if (size3 > 3) {
                    size3 = 3;
                }
                int size7 = arrayList5.size();
                if (size7 > 3) {
                }
                zIsEmpty = arrayList5.isEmpty();
                arrayList = this.sponsoredPeers;
                if (zIsEmpty) {
                    size4 = arrayList.size() + i2 + 1;
                } else {
                    size4 = arrayList.size() + i2 + 1;
                }
                size5 = this.searchContacts.size();
                if (size5 <= 0) {
                    if (size + size2 > 0) {
                        if (i >= 0) {
                            i5 = i4 - size3;
                            if (i5 <= 0) {
                            }
                            i6 = i5 - size4;
                            arrayList2 = this.searchForumResultMessages;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i6 > 0) {
                                arrayList3 = this.searchResultMessages;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.currentMessagesFilter == Filter.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    if (i >= 0) {
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i5 = i4 - size3;
                    if (i5 <= 0) {
                    }
                    i6 = i5 - size4;
                    arrayList2 = this.searchForumResultMessages;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i6 > 0) {
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.searchResultMessages;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.currentMessagesFilter == Filter.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                if (i >= 0) {
                }
                i -= size5 + 1;
                if (size + size2 > 0) {
                    if (i >= 0) {
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i5 = i4 - size3;
                    if (i5 <= 0) {
                    }
                    i6 = i5 - size4;
                    arrayList2 = this.searchForumResultMessages;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i6 > 0) {
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.searchResultMessages;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.currentMessagesFilter == Filter.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                if (i >= 0) {
                    i5 = i4 - size3;
                    if (i5 <= 0) {
                    }
                    i6 = i5 - size4;
                    arrayList2 = this.searchForumResultMessages;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i6 > 0) {
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.searchResultMessages;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.currentMessagesFilter == Filter.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                i5 = i4 - size3;
                if (i5 <= 0) {
                }
                i6 = i5 - size4;
                arrayList2 = this.searchForumResultMessages;
                if (arrayList2.isEmpty()) {
                    size6 = 0;
                } else {
                    size6 = arrayList2.size() + 1;
                }
                if (i6 > 0) {
                    arrayList3 = this.searchResultMessages;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.currentMessagesFilter == Filter.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
                arrayList3 = this.searchResultMessages;
                if (!arrayList3.isEmpty()) {
                    arrayList3.size();
                }
                if (this.currentMessagesFilter == Filter.All) {
                }
                arrayList3.isEmpty();
                return false;
            }
            ?? HasHints = hasHints();
            ArrayList arrayList7 = this.searchWas ? this.filtered2RecentSearchObjects : this.filteredRecentSearchObjects;
            if (i <= HasHints || (i - 1) - (HasHints == true ? 1 : 0) >= arrayList7.size()) {
                i -= getRecentItemsCount();
                AnonymousClass1 anonymousClass2 = this.searchAdapterHelper;
                ArrayList arrayList8 = anonymousClass2.globalSearch;
                ArrayList arrayList9 = anonymousClass2.localServerSearch;
                size = this.searchResult.size();
                size2 = arrayList9.size();
                size3 = anonymousClass2.phonesSearch.size();
                if (size3 > 3 && this.phoneCollapsed) {
                    size3 = 3;
                }
                int size8 = arrayList8.size();
                i2 = (size8 > 3 || !this.globalSearchCollapsed) ? size8 : 3;
                zIsEmpty = arrayList8.isEmpty();
                arrayList = this.sponsoredPeers;
                if (zIsEmpty || !arrayList.isEmpty()) {
                    size4 = arrayList.size() + i2 + 1;
                } else {
                    size4 = 0;
                }
                size5 = this.searchContacts.size();
                if (size5 <= 0) {
                    if (size + size2 > 0 || (getRecentItemsCount() <= 0 && this.searchTopics.isEmpty() && arrayList4.isEmpty())) {
                        if ((i >= 0 || i >= size) && (((i3 = i - size) < 0 || i3 >= size2) && ((i4 = i3 - size2) <= 0 || i4 >= size3))) {
                            i5 = i4 - size3;
                            if (i5 <= 0 && i5 < size4) {
                                return true;
                            }
                            i6 = i5 - size4;
                            arrayList2 = this.searchForumResultMessages;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i6 > 0 || i6 >= size6) {
                                arrayList3 = this.searchResultMessages;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.currentMessagesFilter == Filter.All || this.forceLoadingMessages) {
                                    arrayList3.isEmpty();
                                    return false;
                                }
                            }
                        }
                    } else if (i != 0) {
                        i--;
                        if (i >= 0) {
                            i5 = i4 - size3;
                            if (i5 <= 0) {
                            }
                            i6 = i5 - size4;
                            arrayList2 = this.searchForumResultMessages;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i6 > 0) {
                                arrayList3 = this.searchResultMessages;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.currentMessagesFilter == Filter.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                } else if (i >= 0 || i >= size5) {
                    i -= size5 + 1;
                    if (size + size2 > 0) {
                        if (i >= 0) {
                            i5 = i4 - size3;
                            if (i5 <= 0) {
                            }
                            i6 = i5 - size4;
                            arrayList2 = this.searchForumResultMessages;
                            if (arrayList2.isEmpty()) {
                                size6 = 0;
                            } else {
                                size6 = arrayList2.size() + 1;
                            }
                            if (i6 > 0) {
                                arrayList3 = this.searchResultMessages;
                                if (!arrayList3.isEmpty()) {
                                    arrayList3.size();
                                }
                                if (this.currentMessagesFilter == Filter.All) {
                                }
                                arrayList3.isEmpty();
                                return false;
                            }
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    if (i >= 0) {
                        i5 = i4 - size3;
                        if (i5 <= 0) {
                        }
                        i6 = i5 - size4;
                        arrayList2 = this.searchForumResultMessages;
                        if (arrayList2.isEmpty()) {
                            size6 = 0;
                        } else {
                            size6 = arrayList2.size() + 1;
                        }
                        if (i6 > 0) {
                            arrayList3 = this.searchResultMessages;
                            if (!arrayList3.isEmpty()) {
                                arrayList3.size();
                            }
                            if (this.currentMessagesFilter == Filter.All) {
                            }
                            arrayList3.isEmpty();
                            return false;
                        }
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    i5 = i4 - size3;
                    if (i5 <= 0) {
                    }
                    i6 = i5 - size4;
                    arrayList2 = this.searchForumResultMessages;
                    if (arrayList2.isEmpty()) {
                        size6 = 0;
                    } else {
                        size6 = arrayList2.size() + 1;
                    }
                    if (i6 > 0) {
                        arrayList3 = this.searchResultMessages;
                        if (!arrayList3.isEmpty()) {
                            arrayList3.size();
                        }
                        if (this.currentMessagesFilter == Filter.All) {
                        }
                        arrayList3.isEmpty();
                        return false;
                    }
                    arrayList3 = this.searchResultMessages;
                    if (!arrayList3.isEmpty()) {
                        arrayList3.size();
                    }
                    if (this.currentMessagesFilter == Filter.All) {
                    }
                    arrayList3.isEmpty();
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean isRecentSearchDisplayed() {
        int i;
        return (this.needMessagesSearch == 2 || (i = this.dialogsType) == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15 || getRecentItemsCount() <= 0) ? false : true;
    }

    public final void loadMoreSearchMessages() {
        if ((this.reqForumId == 0 || this.reqId == 0) && this.lastMessagesSearchId == this.lastSearchId) {
            DialogsActivity.AnonymousClass48 anonymousClass48 = this.delegate;
            if (anonymousClass48 == null || anonymousClass48.getSearchForumDialogId() == 0 || this.localMessagesSearchEndReached) {
                searchMessagesInternal(this.lastMessagesSearchId, this.lastMessagesSearchString);
            } else {
                searchForumMessagesInternal(this.lastMessagesSearchId, this.lastMessagesSearchString);
            }
        }
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        ArrayList<TLRPC.TL_username> arrayList2;
        String publicUsername;
        TLRPC.User user2;
        ArrayList<TLRPC.TL_username> arrayList3;
        String publicUsername2;
        boolean z2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Object obj;
        CharSequence charSequenceConcat;
        CharSequence charSequence3;
        boolean z3;
        boolean z4;
        CharSequence string;
        int i2;
        int i3;
        CharSequence charSequenceConcat2;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        Object obj2;
        boolean z5;
        String strSubstring;
        String monoForumTitle;
        int i4;
        String strSubstring2;
        int size;
        int i5;
        String str2;
        int size2;
        int i6;
        TLRPC.TL_username tL_username;
        TLRPC.TL_username tL_username2;
        int iIndexOfIgnoreCase;
        SpannableStringBuilder spannableStringBuilder;
        boolean z6;
        int recentItemsCount;
        int size3;
        String string2;
        final int i7;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z7;
        Runnable runnable;
        int i8;
        char c;
        String monoForumTitle2;
        int i9;
        int size4 = i;
        int i10 = viewHolder.mItemViewType;
        ArrayList arrayList4 = this.searchForumResultMessages;
        ArrayList arrayList5 = this.searchResultHashtags;
        ArrayList arrayList6 = this.sponsoredPeers;
        ArrayList arrayList7 = this.publicPosts;
        ArrayList arrayList8 = this.searchTopics;
        AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
        int i11 = this.currentAccount;
        boolean z8 = false;
        final int i12 = 1;
        View view = viewHolder.itemView;
        switch (i10) {
            case 0:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                profileSearchCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                long dialogId = profileSearchCell.getDialogId();
                boolean zIsGlobalSearch = isGlobalSearch(size4);
                Object item = getItem(size4);
                boolean z9 = item instanceof TLRPC.TL_sponsoredPeer;
                if (z9) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) item;
                    if (tL_sponsoredPeer2 == null) {
                        z = zIsGlobalSearch;
                    } else {
                        HashSet hashSet = this.seenSponsoredPeers;
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = zIsGlobalSearch;
                                if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                    zIsGlobalSearch = z;
                                }
                            } else {
                                z = zIsGlobalSearch;
                                hashSet.add(tL_sponsoredPeer2.random_id);
                                TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                                tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_viewSponsoredMessage, null);
                            }
                        }
                    }
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer2.peer);
                    if (peerDialogId >= 0) {
                        user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        if (user2 != null) {
                            arrayList3 = user2.usernames;
                            publicUsername2 = DialogObject.getPublicUsername(user2, this.currentMessagesQuery);
                            ArrayList<TLRPC.TL_username> arrayList9 = arrayList3;
                            user = user2;
                            arrayList = arrayList9;
                            str = publicUsername2;
                            chat = null;
                            encryptedChat = null;
                        } else {
                            user = user2;
                            arrayList = null;
                            chat = null;
                        }
                    } else {
                        chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                        if (chat2 != null) {
                            arrayList2 = chat2.usernames;
                            publicUsername = DialogObject.getPublicUsername(chat2, this.currentMessagesQuery);
                            str = publicUsername;
                            encryptedChat = null;
                            chat = chat2;
                            arrayList = arrayList2;
                            user = null;
                        } else {
                            chat = chat2;
                            arrayList = null;
                            user = null;
                        }
                    }
                    str = null;
                    encryptedChat = null;
                } else {
                    z = zIsGlobalSearch;
                    if (item instanceof TLRPC.User) {
                        user2 = (TLRPC.User) item;
                        arrayList3 = user2.usernames;
                        publicUsername2 = DialogObject.getPublicUsername(user2, this.currentMessagesQuery);
                        ArrayList<TLRPC.TL_username> arrayList10 = arrayList3;
                        user = user2;
                        arrayList = arrayList10;
                        str = publicUsername2;
                        chat = null;
                        encryptedChat = null;
                    } else if (item instanceof TLRPC.Chat) {
                        TLRPC.Chat chat3 = (TLRPC.Chat) item;
                        chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(chat3.id));
                        if (chat2 == null) {
                            chat2 = chat3;
                        }
                        arrayList2 = chat2.usernames;
                        publicUsername = DialogObject.getPublicUsername(chat2, this.currentMessagesQuery);
                        str = publicUsername;
                        encryptedChat = null;
                        chat = chat2;
                        arrayList = arrayList2;
                        user = null;
                    } else if (item instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat2 = MessagesController.getInstance(i11).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) item).id));
                        user = MessagesController.getInstance(i11).getUser(Long.valueOf(encryptedChat2.user_id));
                        encryptedChat = encryptedChat2;
                        arrayList = null;
                        chat = null;
                        str = null;
                    } else {
                        arrayList = null;
                        user = null;
                        chat = null;
                        str = null;
                        encryptedChat = null;
                    }
                }
                if (!arrayList7.isEmpty()) {
                    size4 -= arrayList7.size() + 1;
                }
                if (isRecentSearchDisplayed()) {
                    if (size4 < getRecentItemsCount()) {
                        profileSearchCell.useSeparator = size4 != getRecentItemsCount() + (-1);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    size4 -= getRecentItemsCount();
                    z2 = z6;
                } else {
                    z2 = false;
                }
                if (!arrayList8.isEmpty()) {
                    size4 -= arrayList8.size() + 1;
                }
                ArrayList arrayList11 = anonymousClass1.globalSearch;
                int i13 = size4;
                ArrayList arrayList12 = anonymousClass1.phonesSearch;
                int size5 = this.searchResult.size();
                int size6 = anonymousClass1.localServerSearch.size();
                int i14 = (size5 + size6 <= 0 || (getRecentItemsCount() <= 0 && arrayList8.isEmpty() && arrayList7.isEmpty())) ? i13 : i13 - 1;
                int size7 = arrayList12.size();
                if (size7 > 3 && this.phoneCollapsed) {
                    size7 = 3;
                }
                int i15 = (size7 <= 0 || !(arrayList12.get(size7 + (-1)) instanceof String)) ? size7 : size7 - 2;
                int size8 = arrayList11.size();
                int i16 = i15;
                if (size8 > 3 && this.globalSearchCollapsed) {
                    size8 = 3;
                }
                int size9 = (arrayList11.isEmpty() && arrayList6.isEmpty()) ? 0 : arrayList6.size() + size8 + 1;
                if (!z2) {
                    profileSearchCell.useSeparator = (i14 == (getItemCount() - getRecentItemsCount()) + (-1) || i14 == ((size5 + i16) + size6) + (-1) || i14 == (((size5 + size9) + size7) + size6) + (-1)) ? false : true;
                }
                if (i14 >= 0 && i14 < this.searchResult.size() && user == null) {
                    charSequence = (CharSequence) this.searchResultNames.get(i14);
                    String publicUsername3 = UserObject.getPublicUsername(user);
                    if (charSequence == null || user == null || publicUsername3 == null || !charSequence.toString().startsWith("@".concat(publicUsername3))) {
                        charSequence2 = charSequence;
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        charSequence = charSequence;
                        obj = item;
                        charSequenceConcat = charSequence;
                        charSequence3 = charSequence2;
                    } else {
                        if (z2) {
                            strSubstring = this.filteredRecentQuery;
                        } else {
                            strSubstring = anonymousClass1.lastFoundUsername;
                        }
                        if (TextUtils.isEmpty(strSubstring)) {
                            charSequence = charSequence;
                            obj = item;
                        } else {
                            if (user != null) {
                                monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                            } else if (chat != null) {
                                monoForumTitle = null;
                            } else if (chat.monoforum) {
                                monoForumTitle = ForumUtilities.getMonoForumTitle(chat, i11, false);
                            } else {
                                monoForumTitle = chat.title;
                            }
                            if (monoForumTitle != null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(monoForumTitle, strSubstring)) == -1) {
                                charSequence2 = charSequence2;
                            } else {
                                spannableStringBuilder = new SpannableStringBuilder(monoForumTitle);
                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, null), iIndexOfIgnoreCase, strSubstring.length() + iIndexOfIgnoreCase, 33);
                            }
                            if (arrayList != null) {
                                i4 = 1;
                                if (arrayList.size() > 1) {
                                    if (strSubstring.startsWith("@")) {
                                        charSequence2 = spannableStringBuilder;
                                        strSubstring2 = strSubstring.substring(1);
                                    } else {
                                        charSequence2 = spannableStringBuilder;
                                        strSubstring2 = strSubstring;
                                    }
                                    size = arrayList.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size) {
                                            TLRPC.TL_username tL_username3 = arrayList.get(i5);
                                            i5 += i4;
                                            tL_username2 = tL_username3;
                                            obj = item;
                                            if (!!tL_username2.active && tL_username2.username.startsWith(strSubstring2)) {
                                                str2 = tL_username2.username;
                                            } else {
                                                item = obj;
                                                i4 = 1;
                                            }
                                        } else {
                                            obj = item;
                                            str2 = null;
                                        }
                                    }
                                    if (str2 == null) {
                                        size2 = arrayList.size();
                                        i6 = 0;
                                        while (i6 < size2) {
                                            TLRPC.TL_username tL_username4 = arrayList.get(i6);
                                            i6++;
                                            tL_username = tL_username4;
                                            ArrayList<TLRPC.TL_username> arrayList13 = arrayList;
                                            if (!!tL_username.active && tL_username.username.contains(strSubstring2)) {
                                                str2 = tL_username.username;
                                            } else {
                                                arrayList = arrayList13;
                                            }
                                        }
                                    }
                                    if (str2 != null) {
                                        str = str2;
                                    }
                                } else {
                                    charSequence2 = spannableStringBuilder;
                                    charSequence2 = spannableStringBuilder;
                                    obj = item;
                                }
                            } else {
                                charSequence2 = spannableStringBuilder;
                                charSequence2 = spannableStringBuilder;
                                obj = item;
                            }
                            if (str == null && (user == null || z)) {
                                if (strSubstring.startsWith("@")) {
                                    strSubstring = strSubstring.substring(1);
                                }
                                try {
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                    spannableStringBuilder3.append((CharSequence) "@");
                                    spannableStringBuilder3.append((CharSequence) str);
                                    int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, strSubstring);
                                    if (iIndexOfIgnoreCase2 != -1) {
                                        int length = strSubstring.length();
                                        if (iIndexOfIgnoreCase2 == 0) {
                                            length++;
                                        } else {
                                            iIndexOfIgnoreCase2++;
                                        }
                                        try {
                                            spannableStringBuilder3.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, null), iIndexOfIgnoreCase2, length + iIndexOfIgnoreCase2, 33);
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            charSequenceConcat = str;
                                            charSequence3 = charSequence2;
                                        }
                                        break;
                                    }
                                    charSequenceConcat = spannableStringBuilder3;
                                    charSequence3 = charSequence2;
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                        }
                        charSequenceConcat = charSequence;
                        charSequence3 = charSequence2;
                    }
                    profileSearchCell.setChecked(false, false);
                    if (user != null) {
                        z3 = z9;
                        if (user.id != this.selfUserId && this.dialogsType != 16) {
                            charSequenceConcat = null;
                            z4 = true;
                            string = LocaleController.getString(R.string.SavedMessages);
                        }
                        CharSequence charSequence4 = string;
                        if (chat == null && chat.participants_count != 0) {
                            String pluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            if (!(charSequenceConcat instanceof SpannableStringBuilder)) {
                                if (TextUtils.isEmpty(charSequenceConcat)) {
                                    charSequenceConcat = pluralStringSpaced;
                                } else {
                                    charSequenceConcat2 = TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced);
                                    i3 = 2;
                                }
                                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                                profileSearchCell.allowBotOpenButton = z2;
                                profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda6;
                                profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                                if (z3) {
                                    tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                } else {
                                    tL_sponsoredPeer = null;
                                }
                                profileSearchCell.setAd(tL_sponsoredPeer);
                                if (user != null) {
                                    obj2 = user;
                                } else {
                                    obj2 = chat;
                                }
                                profileSearchCell.setData(obj2, encryptedChat, charSequence4, charSequenceConcat2, true, z4);
                                boolean zContains = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                                if (dialogId == profileSearchCell.getDialogId()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                profileSearchCell.setChecked(zContains, z5);
                            } else {
                                ((SpannableStringBuilder) charSequenceConcat).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced);
                            }
                        } else {
                            if (user == null && user.bot && (i2 = user.bot_active_users) != 0) {
                                String pluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i2);
                                if (charSequenceConcat instanceof SpannableStringBuilder) {
                                    ((SpannableStringBuilder) charSequenceConcat).append((CharSequence) ", ").append((CharSequence) pluralStringSpaced2);
                                } else if (TextUtils.isEmpty(charSequenceConcat)) {
                                    i3 = 2;
                                    charSequenceConcat = pluralStringSpaced2;
                                } else {
                                    i3 = 2;
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced2);
                                }
                            }
                            charSequenceConcat2 = charSequenceConcat;
                            DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda7 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                            profileSearchCell.allowBotOpenButton = z2;
                            profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda7;
                            profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                            if (z3) {
                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                            } else {
                                tL_sponsoredPeer = null;
                            }
                            profileSearchCell.setAd(tL_sponsoredPeer);
                            if (user != null) {
                                obj2 = user;
                            } else {
                                obj2 = chat;
                            }
                            profileSearchCell.setData(obj2, encryptedChat, charSequence4, charSequenceConcat2, true, z4);
                            boolean zContains2 = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                            if (dialogId == profileSearchCell.getDialogId()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            profileSearchCell.setChecked(zContains2, z5);
                        }
                        i3 = 2;
                        charSequenceConcat2 = charSequenceConcat;
                        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda8 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                        profileSearchCell.allowBotOpenButton = z2;
                        profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda8;
                        profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                        if (z3) {
                            tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                        } else {
                            tL_sponsoredPeer = null;
                        }
                        profileSearchCell.setAd(tL_sponsoredPeer);
                        if (user != null) {
                            obj2 = user;
                        } else {
                            obj2 = chat;
                        }
                        profileSearchCell.setData(obj2, encryptedChat, charSequence4, charSequenceConcat2, true, z4);
                        boolean zContains3 = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                        if (dialogId == profileSearchCell.getDialogId()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        profileSearchCell.setChecked(zContains3, z5);
                    } else {
                        z3 = z9;
                    }
                    z4 = false;
                    string = charSequence3;
                    CharSequence charSequence5 = string;
                    if (chat == null) {
                        if (user == null) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                        }
                        charSequenceConcat2 = charSequenceConcat;
                    } else {
                        if (user == null) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                        }
                        charSequenceConcat2 = charSequenceConcat;
                    }
                    DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda9 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                    profileSearchCell.allowBotOpenButton = z2;
                    profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda9;
                    profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                    if (z3) {
                        tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                    } else {
                        tL_sponsoredPeer = null;
                    }
                    profileSearchCell.setAd(tL_sponsoredPeer);
                    if (user != null) {
                        obj2 = user;
                    } else {
                        obj2 = chat;
                    }
                    profileSearchCell.setData(obj2, encryptedChat, charSequence5, charSequenceConcat2, true, z4);
                    boolean zContains4 = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                    if (dialogId == profileSearchCell.getDialogId()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    profileSearchCell.setChecked(zContains4, z5);
                } else {
                    charSequence = null;
                }
                charSequence2 = null;
                if (charSequence != null) {
                    charSequence = charSequence;
                    obj = item;
                    charSequenceConcat = charSequence;
                    charSequence3 = charSequence2;
                } else {
                    if (z2) {
                        strSubstring = this.filteredRecentQuery;
                    } else {
                        strSubstring = anonymousClass1.lastFoundUsername;
                    }
                    if (TextUtils.isEmpty(strSubstring)) {
                        if (user != null) {
                            monoForumTitle = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (chat != null) {
                            monoForumTitle = null;
                        } else if (chat.monoforum) {
                            monoForumTitle = ForumUtilities.getMonoForumTitle(chat, i11, false);
                        } else {
                            monoForumTitle = chat.title;
                        }
                        if (monoForumTitle != null) {
                            charSequence2 = charSequence2;
                        } else {
                            charSequence2 = charSequence2;
                        }
                        if (arrayList != null) {
                            i4 = 1;
                            if (arrayList.size() > 1) {
                                if (strSubstring.startsWith("@")) {
                                    charSequence2 = spannableStringBuilder;
                                    strSubstring2 = strSubstring.substring(1);
                                } else {
                                    charSequence2 = spannableStringBuilder;
                                    strSubstring2 = strSubstring;
                                }
                                size = arrayList.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size) {
                                        TLRPC.TL_username tL_username5 = arrayList.get(i5);
                                        i5 += i4;
                                        tL_username2 = tL_username5;
                                        obj = item;
                                        if (!tL_username2.active) {
                                            str2 = tL_username2.username;
                                        }
                                        item = obj;
                                        i4 = 1;
                                    } else {
                                        obj = item;
                                        str2 = null;
                                    }
                                }
                                if (str2 == null) {
                                    size2 = arrayList.size();
                                    i6 = 0;
                                    while (i6 < size2) {
                                        TLRPC.TL_username tL_username6 = arrayList.get(i6);
                                        i6++;
                                        tL_username = tL_username6;
                                        ArrayList<TLRPC.TL_username> arrayList14 = arrayList;
                                        if (!tL_username.active) {
                                            str2 = tL_username.username;
                                        }
                                        arrayList = arrayList14;
                                    }
                                }
                                if (str2 != null) {
                                    str = str2;
                                }
                            } else {
                                charSequence2 = spannableStringBuilder;
                                charSequence2 = spannableStringBuilder;
                                obj = item;
                            }
                        } else {
                            charSequence2 = spannableStringBuilder;
                            charSequence2 = spannableStringBuilder;
                            obj = item;
                        }
                        if (str == null) {
                        }
                    } else {
                        charSequence = charSequence;
                        obj = item;
                    }
                    charSequenceConcat = charSequence;
                    charSequence3 = charSequence2;
                }
                profileSearchCell.setChecked(false, false);
                if (user != null) {
                    z3 = z9;
                    if (user.id != this.selfUserId) {
                    }
                    CharSequence charSequence6 = string;
                    if (chat == null) {
                        if (user == null) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                        }
                        charSequenceConcat2 = charSequenceConcat;
                    } else {
                        if (user == null) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                        }
                        charSequenceConcat2 = charSequenceConcat;
                    }
                    DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda10 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                    profileSearchCell.allowBotOpenButton = z2;
                    profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda10;
                    profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                    if (z3) {
                        tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                    } else {
                        tL_sponsoredPeer = null;
                    }
                    profileSearchCell.setAd(tL_sponsoredPeer);
                    if (user != null) {
                        obj2 = user;
                    } else {
                        obj2 = chat;
                    }
                    profileSearchCell.setData(obj2, encryptedChat, charSequence6, charSequenceConcat2, true, z4);
                    boolean zContains5 = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                    if (dialogId == profileSearchCell.getDialogId()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    profileSearchCell.setChecked(zContains5, z5);
                } else {
                    z3 = z9;
                }
                z4 = false;
                string = charSequence3;
                CharSequence charSequence7 = string;
                if (chat == null) {
                    if (user == null) {
                        i3 = 2;
                    } else {
                        i3 = 2;
                    }
                    charSequenceConcat2 = charSequenceConcat;
                } else {
                    if (user == null) {
                        i3 = 2;
                    } else {
                        i3 = 2;
                    }
                    charSequenceConcat2 = charSequenceConcat;
                }
                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda11 = new DialogCell$$ExternalSyntheticLambda6(this, i3);
                profileSearchCell.allowBotOpenButton = z2;
                profileSearchCell.onOpenButtonClick = dialogCell$$ExternalSyntheticLambda11;
                profileSearchCell.setOnSponsoredOptionsClick(new CallLogActivity$$ExternalSyntheticLambda3(this, 1));
                if (z3) {
                    tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                } else {
                    tL_sponsoredPeer = null;
                }
                profileSearchCell.setAd(tL_sponsoredPeer);
                if (user != null) {
                    obj2 = user;
                } else {
                    obj2 = chat;
                }
                profileSearchCell.setData(obj2, encryptedChat, charSequence7, charSequenceConcat2, true, z4);
                boolean zContains6 = DialogsActivity.this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                if (dialogId == profileSearchCell.getDialogId()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                profileSearchCell.setChecked(zContains6, z5);
                break;
            case 1:
                final GraySectionCell graySectionCell = (GraySectionCell) view;
                if (!arrayList5.isEmpty()) {
                    String string3 = LocaleController.getString(R.string.Hashtags);
                    String string4 = LocaleController.getString(R.string.ClearButton);
                    final int i17 = z8 ? 1 : 0;
                    graySectionCell.setText(string3, string4, new View.OnClickListener(this) {
                        public final DialogsSearchAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    DialogsActivity.AnonymousClass48 anonymousClass48 = this.f$0.delegate;
                                    if (anonymousClass48 != null) {
                                        anonymousClass48.needClearList();
                                    }
                                    break;
                                case 1:
                                    DialogsActivity.AnonymousClass47 anonymousClass47 = ((SearchViewPager.AnonymousClass1) this.f$0).this$0;
                                    SearchViewPager.AnonymousClass1 anonymousClass2 = anonymousClass47.dialogsSearchAdapter;
                                    String str3 = anonymousClass2.publicPostsHashtag;
                                    ArrayList arrayList15 = anonymousClass2.publicPosts;
                                    int i18 = anonymousClass2.publicPostsLastRate;
                                    int i19 = anonymousClass2.publicPostsTotalCount;
                                    SearchViewPager.AnonymousClass16 anonymousClass16 = anonymousClass47.hashtagSearchAdapter;
                                    if (!TextUtils.equals(str3, anonymousClass16.hashtagQuery)) {
                                        StoriesController.SearchStoriesList searchStoriesList = anonymousClass16.list;
                                        if (searchStoriesList != null && searchStoriesList.reqId != 0) {
                                            ConnectionsManager.getInstance(searchStoriesList.currentAccount).cancelRequest(searchStoriesList.reqId, true);
                                            searchStoriesList.reqId = 0;
                                        }
                                        anonymousClass16.hasList = false;
                                        if (anonymousClass16.reqId >= 0) {
                                            ConnectionsManager.getInstance(((HashtagsSearchAdapter) anonymousClass16).currentAccount).cancelRequest(anonymousClass16.reqId, true);
                                            anonymousClass16.reqId = -1;
                                        }
                                        AndroidUtilities.cancelRunOnUIThread(anonymousClass16.searchRunnable);
                                        anonymousClass16.searchId++;
                                        anonymousClass16.loading = false;
                                        ArrayList arrayList16 = anonymousClass16.messages;
                                        arrayList16.clear();
                                        arrayList16.addAll(arrayList15);
                                        anonymousClass16.totalCount = i19;
                                        anonymousClass16.endReached = i19 > arrayList15.size();
                                        anonymousClass16.lastRate = i18;
                                        anonymousClass16.hashtagQuery = str3;
                                        anonymousClass16.update(true);
                                    }
                                    anonymousClass47.expandedPublicPosts = true;
                                    LinearLayoutManager linearLayoutManager = anonymousClass47.hashtagSearchLayoutManager;
                                    linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                                    anonymousClass47.updateTabs();
                                    ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass47.tabsView;
                                    if (anonymousClass3 != null && anonymousClass3.getCurrentTabId() != 1) {
                                        anonymousClass47.tabsView.scrollToTab(1, 1);
                                    }
                                    anonymousClass16.search(anonymousClass47.lastSearchString);
                                    break;
                                case 2:
                                    DialogsActivity.AnonymousClass48 anonymousClass49 = this.f$0.delegate;
                                    if (anonymousClass49 != null) {
                                        anonymousClass49.needClearList();
                                    }
                                    break;
                                default:
                                    DialogsActivity.AnonymousClass48 anonymousClass410 = this.f$0.delegate;
                                    if (anonymousClass410 != null) {
                                        anonymousClass410.needClearList();
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    if (arrayList7.isEmpty()) {
                        recentItemsCount = size4;
                    } else if (size4 == 0) {
                        graySectionCell.setText(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) {
                            public final DialogsSearchAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i12) {
                                    case 0:
                                        DialogsActivity.AnonymousClass48 anonymousClass48 = this.f$0.delegate;
                                        if (anonymousClass48 != null) {
                                            anonymousClass48.needClearList();
                                        }
                                        break;
                                    case 1:
                                        DialogsActivity.AnonymousClass47 anonymousClass47 = ((SearchViewPager.AnonymousClass1) this.f$0).this$0;
                                        SearchViewPager.AnonymousClass1 anonymousClass2 = anonymousClass47.dialogsSearchAdapter;
                                        String str3 = anonymousClass2.publicPostsHashtag;
                                        ArrayList arrayList15 = anonymousClass2.publicPosts;
                                        int i18 = anonymousClass2.publicPostsLastRate;
                                        int i19 = anonymousClass2.publicPostsTotalCount;
                                        SearchViewPager.AnonymousClass16 anonymousClass16 = anonymousClass47.hashtagSearchAdapter;
                                        if (!TextUtils.equals(str3, anonymousClass16.hashtagQuery)) {
                                            StoriesController.SearchStoriesList searchStoriesList = anonymousClass16.list;
                                            if (searchStoriesList != null && searchStoriesList.reqId != 0) {
                                                ConnectionsManager.getInstance(searchStoriesList.currentAccount).cancelRequest(searchStoriesList.reqId, true);
                                                searchStoriesList.reqId = 0;
                                            }
                                            anonymousClass16.hasList = false;
                                            if (anonymousClass16.reqId >= 0) {
                                                ConnectionsManager.getInstance(((HashtagsSearchAdapter) anonymousClass16).currentAccount).cancelRequest(anonymousClass16.reqId, true);
                                                anonymousClass16.reqId = -1;
                                            }
                                            AndroidUtilities.cancelRunOnUIThread(anonymousClass16.searchRunnable);
                                            anonymousClass16.searchId++;
                                            anonymousClass16.loading = false;
                                            ArrayList arrayList16 = anonymousClass16.messages;
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList15);
                                            anonymousClass16.totalCount = i19;
                                            anonymousClass16.endReached = i19 > arrayList15.size();
                                            anonymousClass16.lastRate = i18;
                                            anonymousClass16.hashtagQuery = str3;
                                            anonymousClass16.update(true);
                                        }
                                        anonymousClass47.expandedPublicPosts = true;
                                        LinearLayoutManager linearLayoutManager = anonymousClass47.hashtagSearchLayoutManager;
                                        linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                                        anonymousClass47.updateTabs();
                                        ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass47.tabsView;
                                        if (anonymousClass3 != null && anonymousClass3.getCurrentTabId() != 1) {
                                            anonymousClass47.tabsView.scrollToTab(1, 1);
                                        }
                                        anonymousClass16.search(anonymousClass47.lastSearchString);
                                        break;
                                    case 2:
                                        DialogsActivity.AnonymousClass48 anonymousClass49 = this.f$0.delegate;
                                        if (anonymousClass49 != null) {
                                            anonymousClass49.needClearList();
                                        }
                                        break;
                                    default:
                                        DialogsActivity.AnonymousClass48 anonymousClass410 = this.f$0.delegate;
                                        if (anonymousClass410 != null) {
                                            anonymousClass410.needClearList();
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        recentItemsCount = size4 - (arrayList7.size() + 1);
                    }
                    ArrayList arrayList15 = anonymousClass1.globalSearch;
                    boolean zIsRecentSearchDisplayed = isRecentSearchDisplayed();
                    ArrayList arrayList16 = this.searchContacts;
                    if (zIsRecentSearchDisplayed || !arrayList8.isEmpty() || !arrayList16.isEmpty() || !arrayList7.isEmpty()) {
                        ?? HasHints = hasHints();
                        if (recentItemsCount < HasHints) {
                            graySectionCell.setText(LocaleController.getString(R.string.ChatHints));
                        } else if (recentItemsCount == HasHints && isRecentSearchDisplayed()) {
                            if (!this.searchWas) {
                                final int i18 = 2;
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view2) {
                                        switch (i18) {
                                            case 0:
                                                DialogsActivity.AnonymousClass48 anonymousClass48 = this.f$0.delegate;
                                                if (anonymousClass48 != null) {
                                                    anonymousClass48.needClearList();
                                                }
                                                break;
                                            case 1:
                                                DialogsActivity.AnonymousClass47 anonymousClass47 = ((SearchViewPager.AnonymousClass1) this.f$0).this$0;
                                                SearchViewPager.AnonymousClass1 anonymousClass2 = anonymousClass47.dialogsSearchAdapter;
                                                String str3 = anonymousClass2.publicPostsHashtag;
                                                ArrayList arrayList17 = anonymousClass2.publicPosts;
                                                int i19 = anonymousClass2.publicPostsLastRate;
                                                int i110 = anonymousClass2.publicPostsTotalCount;
                                                SearchViewPager.AnonymousClass16 anonymousClass16 = anonymousClass47.hashtagSearchAdapter;
                                                if (!TextUtils.equals(str3, anonymousClass16.hashtagQuery)) {
                                                    StoriesController.SearchStoriesList searchStoriesList = anonymousClass16.list;
                                                    if (searchStoriesList != null && searchStoriesList.reqId != 0) {
                                                        ConnectionsManager.getInstance(searchStoriesList.currentAccount).cancelRequest(searchStoriesList.reqId, true);
                                                        searchStoriesList.reqId = 0;
                                                    }
                                                    anonymousClass16.hasList = false;
                                                    if (anonymousClass16.reqId >= 0) {
                                                        ConnectionsManager.getInstance(((HashtagsSearchAdapter) anonymousClass16).currentAccount).cancelRequest(anonymousClass16.reqId, true);
                                                        anonymousClass16.reqId = -1;
                                                    }
                                                    AndroidUtilities.cancelRunOnUIThread(anonymousClass16.searchRunnable);
                                                    anonymousClass16.searchId++;
                                                    anonymousClass16.loading = false;
                                                    ArrayList arrayList18 = anonymousClass16.messages;
                                                    arrayList18.clear();
                                                    arrayList18.addAll(arrayList17);
                                                    anonymousClass16.totalCount = i110;
                                                    anonymousClass16.endReached = i110 > arrayList17.size();
                                                    anonymousClass16.lastRate = i19;
                                                    anonymousClass16.hashtagQuery = str3;
                                                    anonymousClass16.update(true);
                                                }
                                                anonymousClass47.expandedPublicPosts = true;
                                                LinearLayoutManager linearLayoutManager = anonymousClass47.hashtagSearchLayoutManager;
                                                linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                                                anonymousClass47.updateTabs();
                                                ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass47.tabsView;
                                                if (anonymousClass3 != null && anonymousClass3.getCurrentTabId() != 1) {
                                                    anonymousClass47.tabsView.scrollToTab(1, 1);
                                                }
                                                anonymousClass16.search(anonymousClass47.lastSearchString);
                                                break;
                                            case 2:
                                                DialogsActivity.AnonymousClass48 anonymousClass49 = this.f$0.delegate;
                                                if (anonymousClass49 != null) {
                                                    anonymousClass49.needClearList();
                                                }
                                                break;
                                            default:
                                                DialogsActivity.AnonymousClass48 anonymousClass410 = this.f$0.delegate;
                                                if (anonymousClass410 != null) {
                                                    anonymousClass410.needClearList();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i19 = 3;
                                graySectionCell.setText(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view2) {
                                        switch (i19) {
                                            case 0:
                                                DialogsActivity.AnonymousClass48 anonymousClass48 = this.f$0.delegate;
                                                if (anonymousClass48 != null) {
                                                    anonymousClass48.needClearList();
                                                }
                                                break;
                                            case 1:
                                                DialogsActivity.AnonymousClass47 anonymousClass47 = ((SearchViewPager.AnonymousClass1) this.f$0).this$0;
                                                SearchViewPager.AnonymousClass1 anonymousClass2 = anonymousClass47.dialogsSearchAdapter;
                                                String str3 = anonymousClass2.publicPostsHashtag;
                                                ArrayList arrayList17 = anonymousClass2.publicPosts;
                                                int i110 = anonymousClass2.publicPostsLastRate;
                                                int i111 = anonymousClass2.publicPostsTotalCount;
                                                SearchViewPager.AnonymousClass16 anonymousClass16 = anonymousClass47.hashtagSearchAdapter;
                                                if (!TextUtils.equals(str3, anonymousClass16.hashtagQuery)) {
                                                    StoriesController.SearchStoriesList searchStoriesList = anonymousClass16.list;
                                                    if (searchStoriesList != null && searchStoriesList.reqId != 0) {
                                                        ConnectionsManager.getInstance(searchStoriesList.currentAccount).cancelRequest(searchStoriesList.reqId, true);
                                                        searchStoriesList.reqId = 0;
                                                    }
                                                    anonymousClass16.hasList = false;
                                                    if (anonymousClass16.reqId >= 0) {
                                                        ConnectionsManager.getInstance(((HashtagsSearchAdapter) anonymousClass16).currentAccount).cancelRequest(anonymousClass16.reqId, true);
                                                        anonymousClass16.reqId = -1;
                                                    }
                                                    AndroidUtilities.cancelRunOnUIThread(anonymousClass16.searchRunnable);
                                                    anonymousClass16.searchId++;
                                                    anonymousClass16.loading = false;
                                                    ArrayList arrayList18 = anonymousClass16.messages;
                                                    arrayList18.clear();
                                                    arrayList18.addAll(arrayList17);
                                                    anonymousClass16.totalCount = i111;
                                                    anonymousClass16.endReached = i111 > arrayList17.size();
                                                    anonymousClass16.lastRate = i110;
                                                    anonymousClass16.hashtagQuery = str3;
                                                    anonymousClass16.update(true);
                                                }
                                                anonymousClass47.expandedPublicPosts = true;
                                                LinearLayoutManager linearLayoutManager = anonymousClass47.hashtagSearchLayoutManager;
                                                linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                                                anonymousClass47.updateTabs();
                                                ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass47.tabsView;
                                                if (anonymousClass3 != null && anonymousClass3.getCurrentTabId() != 1) {
                                                    anonymousClass47.tabsView.scrollToTab(1, 1);
                                                }
                                                anonymousClass16.search(anonymousClass47.lastSearchString);
                                                break;
                                            case 2:
                                                DialogsActivity.AnonymousClass48 anonymousClass49 = this.f$0.delegate;
                                                if (anonymousClass49 != null) {
                                                    anonymousClass49.needClearList();
                                                }
                                                break;
                                            default:
                                                DialogsActivity.AnonymousClass48 anonymousClass410 = this.f$0.delegate;
                                                if (anonymousClass410 != null) {
                                                    anonymousClass410.needClearList();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (recentItemsCount == getRecentItemsCount() + (arrayList8.isEmpty() ? 0 : arrayList8.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.searchResult.isEmpty()) {
                            graySectionCell.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                        } else {
                            recentItemsCount -= getRecentItemsCount();
                        }
                    }
                    int size10 = this.searchResult.size();
                    int size11 = anonymousClass1.localServerSearch.size();
                    ArrayList arrayList17 = anonymousClass1.phonesSearch;
                    int size12 = arrayList17.size();
                    if (size12 > 3 && this.phoneCollapsed) {
                        size12 = 3;
                    }
                    int size13 = arrayList15.size();
                    int i20 = recentItemsCount;
                    if (size13 > 3 && this.globalSearchCollapsed) {
                        size13 = 3;
                    }
                    int size14 = (arrayList15.isEmpty() && arrayList6.isEmpty()) ? 0 : arrayList6.size() + size13 + 1;
                    int size15 = arrayList4.isEmpty() ? 0 : arrayList4.size() + 1;
                    ArrayList arrayList18 = this.searchResultMessages;
                    if (!arrayList18.isEmpty()) {
                        arrayList18.size();
                    }
                    if (this.currentMessagesFilter != Filter.All || this.forceLoadingMessages) {
                        arrayList18.isEmpty();
                    }
                    if (arrayList8.isEmpty()) {
                        size3 = i20;
                        string2 = null;
                    } else {
                        string2 = i20 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        size3 = i20 - (arrayList8.size() + 1);
                    }
                    if (!arrayList16.isEmpty()) {
                        if (size3 == 0) {
                            string2 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        size3 -= arrayList16.size() + 1;
                    }
                    if (string2 == null) {
                        int i21 = size3 - (size10 + size11);
                        if (i21 < 0 || i21 >= size12) {
                            int i22 = i21 - size12;
                            if (i22 >= 0 && i22 < size14) {
                                String string5 = LocaleController.getString(R.string.GlobalSearch);
                                if (anonymousClass1.globalSearch.size() > 3) {
                                    z7 = this.globalSearchCollapsed;
                                    ArticleViewer$$ExternalSyntheticLambda71 articleViewer$$ExternalSyntheticLambda71 = new ArticleViewer$$ExternalSyntheticLambda71(this, arrayList15, i, graySectionCell, 4);
                                    graySectionCell = graySectionCell;
                                    runnable = articleViewer$$ExternalSyntheticLambda71;
                                    string2 = string5;
                                    spannableStringBuilder2 = null;
                                    i7 = 1;
                                } else {
                                    string2 = string5;
                                }
                            } else if (this.delegate == null || size15 <= 0 || i22 - size14 > 1) {
                                this.messagesSectionPosition = i22;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(this.currentMessagesFilter.strFromResId));
                                spannableStringBuilder4.append((CharSequence) "v");
                                i7 = 1;
                                spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.arrows_select), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                Runnable runnable2 = new Runnable(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                DialogsSearchAdapter dialogsSearchAdapter = this.f$0;
                                                boolean z10 = dialogsSearchAdapter.phoneCollapsed;
                                                dialogsSearchAdapter.phoneCollapsed = !z10;
                                                graySectionCell.setRightText(LocaleController.getString(!z10 ? R.string.ShowMore : R.string.ShowLess));
                                                dialogsSearchAdapter.notifyDataSetChanged();
                                                break;
                                            default:
                                                DialogsSearchAdapter dialogsSearchAdapter2 = this.f$0;
                                                DialogsActivity dialogsActivity = dialogsSearchAdapter2.dialogsActivity;
                                                GraySectionCell graySectionCell2 = graySectionCell;
                                                ItemOptions itemOptions = new ItemOptions(dialogsActivity, graySectionCell2, false, true);
                                                for (DialogsSearchAdapter.Filter filter : DialogsSearchAdapter.Filter.values()) {
                                                    boolean z11 = filter.flags == dialogsSearchAdapter2.currentMessagesFilter.flags;
                                                    itemOptions.addChecked(new QrActivity$$ExternalSyntheticLambda15(dialogsSearchAdapter2, z11, graySectionCell2, filter, 3), LocaleController.getString(filter.strResId), z11);
                                                }
                                                itemOptions.setGravity(5);
                                                itemOptions.onTopOfScrim = true;
                                                itemOptions.drawScrim = false;
                                                itemOptions.dimAlpha = 0;
                                                itemOptions.show();
                                                break;
                                        }
                                    }
                                };
                                string2 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable2;
                                spannableStringBuilder2 = spannableStringBuilder4;
                                z7 = false;
                            } else {
                                TLRPC.Chat chat4 = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.delegate.getSearchForumDialogId()));
                                int i23 = R.string.SearchMessagesIn;
                                if (chat4 == null) {
                                    monoForumTitle2 = "null";
                                    i9 = 1;
                                    c = 0;
                                } else {
                                    if (chat4.monoforum) {
                                        c = 0;
                                        monoForumTitle2 = ForumUtilities.getMonoForumTitle(chat4, i11, false);
                                    } else {
                                        c = 0;
                                        monoForumTitle2 = chat4.title;
                                    }
                                    i9 = 1;
                                }
                                Object[] objArr = new Object[i9];
                                objArr[c] = monoForumTitle2;
                                string2 = LocaleController.formatString(i23, objArr);
                            }
                            spannableStringBuilder2 = null;
                            i7 = 1;
                        } else {
                            string2 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList17.size() > 3) {
                                final int i24 = 0;
                                z7 = this.phoneCollapsed;
                                runnable = new Runnable(this) {
                                    public final DialogsSearchAdapter f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i24) {
                                            case 0:
                                                DialogsSearchAdapter dialogsSearchAdapter = this.f$0;
                                                boolean z10 = dialogsSearchAdapter.phoneCollapsed;
                                                dialogsSearchAdapter.phoneCollapsed = !z10;
                                                graySectionCell.setRightText(LocaleController.getString(!z10 ? R.string.ShowMore : R.string.ShowLess));
                                                dialogsSearchAdapter.notifyDataSetChanged();
                                                break;
                                            default:
                                                DialogsSearchAdapter dialogsSearchAdapter2 = this.f$0;
                                                DialogsActivity dialogsActivity = dialogsSearchAdapter2.dialogsActivity;
                                                GraySectionCell graySectionCell2 = graySectionCell;
                                                ItemOptions itemOptions = new ItemOptions(dialogsActivity, graySectionCell2, false, true);
                                                for (DialogsSearchAdapter.Filter filter : DialogsSearchAdapter.Filter.values()) {
                                                    boolean z11 = filter.flags == dialogsSearchAdapter2.currentMessagesFilter.flags;
                                                    itemOptions.addChecked(new QrActivity$$ExternalSyntheticLambda15(dialogsSearchAdapter2, z11, graySectionCell2, filter, 3), LocaleController.getString(filter.strResId), z11);
                                                }
                                                itemOptions.setGravity(5);
                                                itemOptions.onTopOfScrim = true;
                                                itemOptions.drawScrim = false;
                                                itemOptions.dimAlpha = 0;
                                                itemOptions.show();
                                                break;
                                        }
                                    }
                                };
                                spannableStringBuilder2 = null;
                                i7 = 1;
                            }
                            spannableStringBuilder2 = null;
                            i7 = 1;
                        }
                        if (runnable == null) {
                            graySectionCell.setText(string2);
                        } else if (spannableStringBuilder2 != null) {
                            if (z7) {
                                i8 = R.string.ShowMore;
                            } else {
                                i8 = R.string.ShowLess;
                            }
                            graySectionCell.setText(string2, LocaleController.getString(i8), new ProfileActivity$$ExternalSyntheticLambda51(2, runnable));
                            graySectionCell.setRightTextMargin(16);
                        } else {
                            graySectionCell.setText(string2, spannableStringBuilder2, new ProfileActivity$$ExternalSyntheticLambda51(i7, runnable));
                            graySectionCell.setRightTextMargin(6);
                        }
                    } else {
                        i7 = 1;
                        spannableStringBuilder2 = null;
                    }
                    z7 = false;
                    runnable = null;
                    if (runnable == null) {
                        graySectionCell.setText(string2);
                    } else if (spannableStringBuilder2 != null) {
                        if (z7) {
                            i8 = R.string.ShowMore;
                        } else {
                            i8 = R.string.ShowLess;
                        }
                        graySectionCell.setText(string2, LocaleController.getString(i8), new ProfileActivity$$ExternalSyntheticLambda51(2, runnable));
                        graySectionCell.setRightTextMargin(16);
                    } else {
                        graySectionCell.setText(string2, spannableStringBuilder2, new ProfileActivity$$ExternalSyntheticLambda51(i7, runnable));
                        graySectionCell.setRightTextMargin(6);
                    }
                }
                break;
            case 2:
            case 9:
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                dialogCell.useSeparator = size4 != getItemCount() - 1;
                MessageObject messageObject = (MessageObject) getItem(size4);
                dialogCell.useFromUserAsAvatar = arrayList4.contains(messageObject);
                if (messageObject != null) {
                    dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                } else {
                    dialogCell.setDialog(0L, null, 0, false, false);
                }
                break;
            case 3:
                ((TopicSearchCell) view).setTopic((TLRPC.TL_forumTopic) getItem(size4));
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = (HashtagSearchCell) view;
                hashtagSearchCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                hashtagSearchCell.setText((CharSequence) arrayList5.get(size4 - 1));
                hashtagSearchCell.setNeedDivider(size4 != arrayList5.size());
                break;
            case 6:
                ((CategoryAdapterRecycler) ((RecyclerListView) view).getAdapter()).mObservable.notifyChanged();
                break;
            case 7:
                String str3 = (String) getItem(size4);
                TextCell textCell = (TextCell) view;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText2);
                textCell.setText(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, PhoneFormat.getInstance().format("+" + str3)), false);
                break;
            case 8:
                ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) view;
                ContactsController.Contact contact = (ContactsController.Contact) getItem(size4);
                profileSearchCell2.setData(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), contact.shortPhones.get(0), PhoneFormat.getInstance()), false, false);
                break;
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View anonymousClass3;
        int i2 = this.dialogsType;
        boolean z = false;
        Activity activity = this.mContext;
        Theme.ResourcesProvider resourcesProvider = null;
        switch (i) {
            case 0:
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(activity, null);
                profileSearchCell.showPremiumBlocked = i2 == 3;
                anonymousClass3 = profileSearchCell;
                break;
            case 1:
                anonymousClass3 = new GraySectionCell(activity, 16, null);
                break;
            case 2:
            case 9:
                anonymousClass3 = new AnonymousClass3(null, this.mContext, true, UserConfig.selectedAccount, null, 0);
                break;
            case 3:
                anonymousClass3 = new TopicSearchCell(activity);
                break;
            case 4:
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(activity, null);
                flickerLoadingView.setViewType(1);
                flickerLoadingView.setIsSingleCell(true);
                anonymousClass3 = flickerLoadingView;
                break;
            case 5:
                HashtagSearchCell hashtagSearchCell = new HashtagSearchCell(activity);
                hashtagSearchCell.setGravity(16);
                hashtagSearchCell.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                hashtagSearchCell.setTextSize(1, 17.0f);
                hashtagSearchCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                anonymousClass3 = hashtagSearchCell;
                break;
            case 6:
                MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(activity, 2, resourcesProvider);
                anonymousClass1.setSelectorDrawableColor(Theme.getColor(null, Theme.key_listSelector, false));
                anonymousClass1.setTag(9);
                anonymousClass1.setItemAnimator(null);
                anonymousClass1.setLayoutAnimation(null);
                PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(true ? 1 : 0, true ? 1 : 0, z);
                anonymousClass36.setOrientation(0);
                anonymousClass1.setLayoutManager(anonymousClass36);
                anonymousClass1.setAdapter(new CategoryAdapterRecycler(this.currentAccount, this.mContext, null, false, i2 == 3));
                anonymousClass1.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, true ? 1 : 0));
                anonymousClass1.setOnItemLongClickListener(new DialogsSearchAdapter$$ExternalSyntheticLambda4(this));
                this.innerListView = anonymousClass1;
                anonymousClass3 = anonymousClass1;
                break;
            case 7:
            default:
                anonymousClass3 = new TextCell(16, this.mContext, null, false, false);
                break;
            case 8:
                anonymousClass3 = new ProfileSearchCell(activity, null);
                break;
            case 10:
                EmptyLayout emptyLayout = new EmptyLayout(activity, new ArticleViewer$$ExternalSyntheticLambda3(this, true ? 1 : 0));
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

    public final void putRecentSearch(long j, TLObject tLObject) {
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
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new LinkManager$3$$ExternalSyntheticLambda0((SearchViewPager.AnonymousClass1) this, j, 8));
    }

    public final void removeAllAds() {
        int iGlobalSearchPosition;
        ArrayList arrayList = this.sponsoredPeers;
        if (!arrayList.isEmpty() && (iGlobalSearchPosition = globalSearchPosition()) < getItemCount()) {
            int size = arrayList.size();
            arrayList.clear();
            RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
            adapterDataObservable.notifyItemRangeRemoved(iGlobalSearchPosition + 1, size);
            int size2 = this.searchAdapterHelper.globalSearch.size();
            if (this.globalSearchCollapsed) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                adapterDataObservable.notifyItemRangeRemoved(iGlobalSearchPosition, 1);
            }
        }
    }

    public final void searchDialogs(int i, String str) {
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
        DialogsSearchAdapter$$ExternalSyntheticLambda23 dialogsSearchAdapter$$ExternalSyntheticLambda23 = this.searchRunnable2;
        if (dialogsSearchAdapter$$ExternalSyntheticLambda23 != null) {
            AndroidUtilities.cancelRunOnUIThread(dialogsSearchAdapter$$ExternalSyntheticLambda23);
            this.searchRunnable2 = null;
        }
        ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = this.searchHashtagRunnable;
        if (chatActivity$$ExternalSyntheticLambda17 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda17);
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
                this.sponsoredReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getSponsoredPeers, new CallLogActivity$$ExternalSyntheticLambda1((SearchViewPager.AnonymousClass1) this, 4));
            }
        }
        if (TextUtils.isEmpty(strTrim)) {
            this.filteredRecentQuery = null;
            this.searchAdapterHelper.hashtagsLoadedFromDb = false;
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchResultHashtags.clear();
            this.publicPostsTotalCount = 0;
            this.publicPostsLastRate = 0;
            this.publicPostsHashtag = null;
            this.publicPosts.clear();
            mergeResults(null, null);
            int i2 = this.dialogsType;
            if (i2 != 15) {
                AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
                boolean z = i2 != 11;
                boolean z2 = i2 != 11;
                boolean z3 = i2 == 2 || i2 == 11;
                boolean z4 = i2 == 0;
                DialogsActivity.AnonymousClass48 anonymousClass48 = this.delegate;
                anonymousClass1.queryServerSearch(null, true, true, z, z2, z3, 0L, z4, 0, 0, anonymousClass48 != null ? anonymousClass48.getSearchForumDialogId() : 0L, null);
            }
            this.searchWas = false;
            this.lastSearchId = 0;
            this.waitingResponseCount = 0;
            this.globalSearchCollapsed = true;
            this.phoneCollapsed = true;
            DialogsActivity.AnonymousClass48 anonymousClass49 = this.delegate;
            if (anonymousClass49 != null) {
                anonymousClass49.searchStateChanged(false, true);
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
                ((DialogsActivity$$ExternalSyntheticLambda10) delegate).updateFiltersView(false, null, this.localTipDates, false);
                return;
            }
            return;
        }
        mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
        this.publicPostsTotalCount = 0;
        this.publicPostsLastRate = 0;
        this.publicPostsHashtag = null;
        this.publicPosts.clear();
        if (this.needMessagesSearch != 2 && strTrim.startsWith("#") && strTrim.length() == 1) {
            this.messagesSearchEndReached = true;
            AnonymousClass1 anonymousClass2 = this.searchAdapterHelper;
            if (anonymousClass2.hashtagsLoadedFromDb) {
                this.searchResultMessages.clear();
                this.searchResultHashtags.clear();
                ArrayList arrayList = this.searchAdapterHelper.hashtags;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.searchResultHashtags.add(((SearchAdapterHelper.HashtagObject) arrayList.get(i3)).hashtag);
                }
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                this.waitingResponseCount = 0;
                notifyDataSetChanged();
                DialogsActivity.AnonymousClass48 anonymousClass410 = this.delegate;
                if (anonymousClass410 != null) {
                    anonymousClass410.searchStateChanged(false, false);
                }
            } else {
                MessagesStorage.getInstance(anonymousClass2.currentAccount).getStorageQueue().postRunnable(new SearchAdapterHelper$$ExternalSyntheticLambda4(anonymousClass2, 1));
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
        DialogsActivity.AnonymousClass48 anonymousClass411 = this.delegate;
        if (anonymousClass411 != null) {
            anonymousClass411.searchStateChanged(true, false);
        }
        if (strTrim != null) {
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
        } else {
            str2 = null;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        SearchViewPager.AnonymousClass1 anonymousClass3 = (SearchViewPager.AnonymousClass1) this;
        DialogsSearchAdapter$$ExternalSyntheticLambda23 dialogsSearchAdapter$$ExternalSyntheticLambda24 = new DialogsSearchAdapter$$ExternalSyntheticLambda23(anonymousClass3, strTrim, i4, str, 0);
        this.searchRunnable = dialogsSearchAdapter$$ExternalSyntheticLambda24;
        dispatchQueue.postRunnable(dialogsSearchAdapter$$ExternalSyntheticLambda24, 300L);
        if (str2 != null) {
            this.waitingResponseCount++;
            ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda18 = new ChatActivity$$ExternalSyntheticLambda17(anonymousClass3, i4, str2, 7);
            this.searchHashtagRunnable = chatActivity$$ExternalSyntheticLambda18;
            AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda18, 300L);
        }
    }

    public final void searchForumMessagesInternal(int i, String str) {
        DialogsActivity.AnonymousClass48 anonymousClass48 = this.delegate;
        if (anonymousClass48 == null || anonymousClass48.getSearchForumDialogId() == 0 || this.needMessagesSearch == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.lastMessagesSearchString) && TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = this.reqForumId;
        int i3 = this.currentAccount;
        if (i2 != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.reqForumId, true);
            this.reqForumId = 0;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.searchForumResultMessages;
        if (zIsEmpty) {
            this.filteredRecentQuery = null;
            this.searchResultMessages.clear();
            arrayList.clear();
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
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(i3).getInputPeer(searchForumDialogId);
        if (str.equals(this.lastMessagesSearchString) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.lastMessagesSearchString = str;
        int i4 = 1 + this.lastForumReqId;
        this.lastForumReqId = i4;
        this.reqForumId = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_search, new FileLoadOperation$$ExternalSyntheticLambda2(this, str, i4, i, tL_messages_search, 2), 2);
    }

    public final void searchMessagesInternal(int i, String str) {
        if (this.needMessagesSearch != 0 && (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str))) {
            int i2 = this.reqId;
            int i3 = this.currentAccount;
            if (i2 != 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.searchResultMessages;
            if (zIsEmpty || this.delegate.getSearchForumDialogId() != 0) {
                this.filteredRecentQuery = null;
                arrayList.clear();
                this.searchForumResultMessages.clear();
                this.lastReqId = 0;
                this.lastMessagesSearchString = null;
                this.lastMessagesSearchFilterFlags = 0;
                this.searchWas = false;
                notifyDataSetChanged();
                return;
            }
            filterRecent(str);
            mergeResults(this.searchResult, this.filtered2RecentSearchObjects);
            if (this.dialogsType != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i4 = this.currentMessagesFilter.flags;
                tL_messages_searchGlobal.broadcasts_only = (i4 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i4 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i4 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.folderId;
                if (!str.equals(this.lastMessagesSearchString)) {
                    this.forceLoadingMessages = false;
                }
                if (str.equals(this.lastMessagesSearchString) && this.lastMessagesSearchFilterFlags == this.currentMessagesFilter.flags && !arrayList.isEmpty() && this.lastMessagesSearchId == this.lastSearchId) {
                    MessageObject messageObject = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i3).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.lastMessagesSearchString = str;
                this.lastMessagesSearchFilterFlags = this.currentMessagesFilter.flags;
                int i5 = this.lastReqId + 1;
                this.lastReqId = i5;
                this.reqId = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchGlobal, new FileLoadOperation$$ExternalSyntheticLambda2(this, str, i5, i, tL_messages_searchGlobal, 1), 2);
                return;
            }
            int i6 = this.waitingResponseCount - 1;
            this.waitingResponseCount = i6;
            DialogsActivity.AnonymousClass48 anonymousClass48 = this.delegate;
            if (anonymousClass48 != null) {
                anonymousClass48.searchStateChanged(i6 > 0, true);
                this.delegate.runResultsEnterAnimation();
            }
        }
    }

    public final void searchTopics(String str) {
        ArrayList arrayList = this.searchTopics;
        arrayList.clear();
        DialogsActivity.AnonymousClass48 anonymousClass48 = this.delegate;
        if (anonymousClass48 == null || anonymousClass48.getSearchForumDialogId() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.delegate.getSearchForumDialogId());
            String strTrim = str.trim();
            for (int i = 0; i < topics.size(); i++) {
                if (topics.get(i) != null && topics.get(i).title.toLowerCase().contains(strTrim)) {
                    arrayList.add(topics.get(i));
                    topics.get(i).searchQuery = strTrim;
                }
            }
        }
        notifyDataSetChanged();
    }
}
