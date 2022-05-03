package org.telegram.ui.Adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.FilteredSearchView;

public class DialogsSearchAdapter extends RecyclerListView.SelectionAdapter {
    private int currentItemCount;
    private DialogsSearchAdapterDelegate delegate;
    private int dialogsType;
    private FilteredSearchView.Delegate filtersDelegate;
    private int folderId;
    private RecyclerListView innerListView;
    private int lastGlobalSearchId;
    private int lastLocalSearchId;
    private int lastMessagesSearchId;
    private String lastMessagesSearchString;
    private int lastReqId;
    private int lastSearchId;
    private String lastSearchText;
    private boolean localTipArchive;
    private Context mContext;
    private boolean messagesSearchEndReached;
    private int needMessagesSearch;
    private int nextSearchRate;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchRunnable;
    private Runnable searchRunnable2;
    private boolean searchWas;
    int waitingResponseCount;
    private ArrayList<Object> searchResult = new ArrayList<>();
    private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
    private ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private ArrayList<String> searchResultHashtags = new ArrayList<>();
    private int reqId = 0;
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList<RecentSearchObject> recentSearchObjects = new ArrayList<>();
    private LongSparseArray<RecentSearchObject> recentSearchObjectsById = new LongSparseArray<>();
    private ArrayList<FiltersView.DateData> localTipDates = new ArrayList<>();
    boolean globalSearchCollapsed = true;
    boolean phoneCollapsed = true;
    private long selfUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();

    public static class DialogSearchResult {
        public int date;
        public CharSequence name;
        public TLObject object;
    }

    public interface DialogsSearchAdapterDelegate {
        void didPressedOnSubDialog(long j);

        boolean isSelected(long j);

        void needClearList();

        void needRemoveHint(long j);

        void runResultsEnterAnimation();

        void searchStateChanged(boolean z, boolean z2);
    }

    public interface OnRecentSearchLoaded {
        void setRecentSearch(ArrayList<RecentSearchObject> arrayList, LongSparseArray<RecentSearchObject> longSparseArray);
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

    public boolean isSearching() {
        return this.waitingResponseCount > 0;
    }

    public static class CategoryAdapterRecycler extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private boolean drawChecked;
        private final Context mContext;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public CategoryAdapterRecycler(Context context, int i, boolean z) {
            this.drawChecked = z;
            this.mContext = context;
            this.currentAccount = i;
        }

        public void setIndex(int i) {
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            HintDialogCell hintDialogCell = new HintDialogCell(this.mContext, this.drawChecked);
            hintDialogCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
            return new RecyclerListView.Holder(hintDialogCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$Chat tLRPC$Chat;
            String str;
            HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
            TLRPC$TL_topPeer tLRPC$TL_topPeer = MediaDataController.getInstance(this.currentAccount).hints.get(i);
            new TLRPC$TL_dialog();
            TLRPC$Peer tLRPC$Peer = tLRPC$TL_topPeer.peer;
            long j = tLRPC$Peer.user_id;
            TLRPC$User tLRPC$User = null;
            if (j != 0) {
                tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$TL_topPeer.peer.user_id));
                tLRPC$Chat = null;
            } else {
                long j2 = tLRPC$Peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                    tLRPC$Chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$TL_topPeer.peer.channel_id));
                } else {
                    long j3 = tLRPC$Peer.chat_id;
                    if (j3 != 0) {
                        j = -j3;
                        tLRPC$Chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$TL_topPeer.peer.chat_id));
                    } else {
                        tLRPC$Chat = null;
                        j = 0;
                    }
                }
            }
            hintDialogCell.setTag(Long.valueOf(j));
            if (tLRPC$User != null) {
                str = UserObject.getFirstName(tLRPC$User);
            } else {
                str = tLRPC$Chat != null ? tLRPC$Chat.title : "";
            }
            hintDialogCell.setDialog(j, true, str);
        }

        @Override
        public int getItemCount() {
            return MediaDataController.getInstance(this.currentAccount).hints.size();
        }
    }

    public DialogsSearchAdapter(Context context, int i, int i2) {
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
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
                if (DialogsSearchAdapter.this.delegate != null) {
                    DialogsSearchAdapter.this.delegate.searchStateChanged(DialogsSearchAdapter.this.waitingResponseCount > 0, true);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
                if (DialogsSearchAdapter.this.delegate != null) {
                    DialogsSearchAdapter.this.delegate.runResultsEnterAnimation();
                }
            }

            @Override
            public void onSetHashtags(ArrayList<SearchAdapterHelper.HashtagObject> arrayList, HashMap<String, SearchAdapterHelper.HashtagObject> hashMap) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    DialogsSearchAdapter.this.searchResultHashtags.add(arrayList.get(i3).hashtag);
                }
                if (DialogsSearchAdapter.this.delegate != null) {
                    DialogsSearchAdapter.this.delegate.searchStateChanged(DialogsSearchAdapter.this.waitingResponseCount > 0, false);
                }
                DialogsSearchAdapter.this.notifyDataSetChanged();
            }

            @Override
            public boolean canApplySearchResults(int i3) {
                return i3 == DialogsSearchAdapter.this.lastSearchId;
            }
        });
        this.mContext = context;
        this.needMessagesSearch = i;
        this.dialogsType = i2;
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
        return this.messagesSearchEndReached;
    }

    public void loadMoreSearchMessages() {
        if (this.reqId == 0) {
            searchMessagesInternal(this.lastMessagesSearchString, this.lastMessagesSearchId);
        }
    }

    public String getLastSearchString() {
        return this.lastMessagesSearchString;
    }

    private void searchMessagesInternal(final String str, final int i) {
        if (this.needMessagesSearch == 0) {
            return;
        }
        if (!TextUtils.isEmpty(this.lastMessagesSearchString) || !TextUtils.isEmpty(str)) {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchResultMessages.clear();
                this.lastReqId = 0;
                this.lastMessagesSearchString = null;
                this.searchWas = false;
                notifyDataSetChanged();
                return;
            }
            final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal = new TLRPC$TL_messages_searchGlobal();
            tLRPC$TL_messages_searchGlobal.limit = 20;
            tLRPC$TL_messages_searchGlobal.q = str;
            tLRPC$TL_messages_searchGlobal.filter = new TLRPC$TL_inputMessagesFilterEmpty();
            tLRPC$TL_messages_searchGlobal.flags |= 1;
            tLRPC$TL_messages_searchGlobal.folder_id = this.folderId;
            if (!str.equals(this.lastMessagesSearchString) || this.searchResultMessages.isEmpty()) {
                tLRPC$TL_messages_searchGlobal.offset_rate = 0;
                tLRPC$TL_messages_searchGlobal.offset_id = 0;
                tLRPC$TL_messages_searchGlobal.offset_peer = new TLRPC$TL_inputPeerEmpty();
            } else {
                ArrayList<MessageObject> arrayList = this.searchResultMessages;
                MessageObject messageObject = arrayList.get(arrayList.size() - 1);
                tLRPC$TL_messages_searchGlobal.offset_id = messageObject.getId();
                tLRPC$TL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                tLRPC$TL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            }
            this.lastMessagesSearchString = str;
            final int i2 = this.lastReqId + 1;
            this.lastReqId = i2;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    DialogsSearchAdapter.this.lambda$searchMessagesInternal$1(str, i2, i, tLRPC$TL_messages_searchGlobal, tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
    }

    public void lambda$searchMessagesInternal$1(final String str, final int i, final int i2, final TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < tLRPC$messages_Messages.chats.size(); i3++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$messages_Messages.chats.get(i3);
                longSparseArray.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            for (int i4 = 0; i4 < tLRPC$messages_Messages.users.size(); i4++) {
                TLRPC$User tLRPC$User = tLRPC$messages_Messages.users.get(i4);
                longSparseArray2.put(tLRPC$User.id, tLRPC$User);
            }
            for (int i5 = 0; i5 < tLRPC$messages_Messages.messages.size(); i5++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$messages_Messages.messages.get(i5), (LongSparseArray<TLRPC$User>) longSparseArray2, (LongSparseArray<TLRPC$Chat>) longSparseArray, false, true);
                arrayList.add(messageObject);
                messageObject.setQuery(str);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$searchMessagesInternal$0(i, i2, tLRPC$TL_error, str, tLObject, tLRPC$TL_messages_searchGlobal, arrayList);
            }
        });
    }

    public void lambda$searchMessagesInternal$0(int i, int i2, TLRPC$TL_error tLRPC$TL_error, String str, TLObject tLObject, TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal, ArrayList arrayList) {
        if (i == this.lastReqId && (i2 <= 0 || i2 == this.lastSearchId)) {
            this.waitingResponseCount--;
            if (tLRPC$TL_error == null) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$messages_Messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tLRPC$messages_Messages.chats, false);
                if (tLRPC$TL_messages_searchGlobal.offset_id == 0) {
                    this.searchResultMessages.clear();
                }
                this.nextSearchRate = tLRPC$messages_Messages.next_rate;
                for (int i3 = 0; i3 < tLRPC$messages_Messages.messages.size(); i3++) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i3);
                    int i4 = MessagesController.getInstance(this.currentAccount).deletedHistory.get(MessageObject.getDialogId(tLRPC$Message));
                    if (i4 == 0 || tLRPC$Message.id > i4) {
                        this.searchResultMessages.add((MessageObject) arrayList.get(i3));
                        long dialogId = MessageObject.getDialogId(tLRPC$Message);
                        ConcurrentHashMap<Long, Integer> concurrentHashMap = tLRPC$Message.out ? MessagesController.getInstance(this.currentAccount).dialogs_read_outbox_max : MessagesController.getInstance(this.currentAccount).dialogs_read_inbox_max;
                        Integer num = concurrentHashMap.get(Long.valueOf(dialogId));
                        if (num == null) {
                            num = Integer.valueOf(MessagesStorage.getInstance(this.currentAccount).getDialogReadMax(tLRPC$Message.out, dialogId));
                            concurrentHashMap.put(Long.valueOf(dialogId), num);
                        }
                        tLRPC$Message.unread = num.intValue() < tLRPC$Message.id;
                    }
                }
                this.searchWas = true;
                this.messagesSearchEndReached = tLRPC$messages_Messages.messages.size() != 20;
                if (i2 > 0) {
                    this.lastMessagesSearchId = i2;
                    if (this.lastLocalSearchId != i2) {
                        this.searchResult.clear();
                    }
                    if (this.lastGlobalSearchId != i2) {
                        this.searchAdapterHelper.clear();
                    }
                }
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(this.waitingResponseCount > 0, true);
                    this.delegate.runResultsEnterAnimation();
                }
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                notifyDataSetChanged();
            }
        }
        this.reqId = 0;
    }

    public boolean hasRecentSearch() {
        int i = this.dialogsType;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 11 || (this.recentSearchObjects.isEmpty() && MediaDataController.getInstance(this.currentAccount).hints.isEmpty())) ? false : true;
    }

    public boolean isRecentSearchDisplayed() {
        int i;
        return (this.needMessagesSearch == 2 || this.searchWas || (this.recentSearchObjects.isEmpty() && MediaDataController.getInstance(this.currentAccount).hints.isEmpty()) || (i = this.dialogsType) == 2 || i == 4 || i == 5 || i == 6 || i == 11) ? false : true;
    }

    public void loadRecentSearch() {
        loadRecentSearch(this.currentAccount, this.dialogsType, new OnRecentSearchLoaded() {
            @Override
            public final void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
                DialogsSearchAdapter.this.lambda$loadRecentSearch$2(arrayList, longSparseArray);
            }
        });
    }

    public static void loadRecentSearch(final int i, final int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.lambda$loadRecentSearch$5(i, i2, onRecentSearchLoaded);
            }
        });
    }

    public static void lambda$loadRecentSearch$5(int i, int i2, final OnRecentSearchLoaded onRecentSearchLoaded) {
        boolean z;
        try {
            SQLiteCursor queryFinalized = MessagesStorage.getInstance(i).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            final LongSparseArray longSparseArray = new LongSparseArray();
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(0);
                if (DialogObject.isEncryptedDialog(longValue)) {
                    if (i2 == 0 || i2 == 3) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                        if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                            arrayList3.add(Integer.valueOf(encryptedChatId));
                            z = true;
                        }
                    }
                    z = false;
                } else if (DialogObject.isUserDialog(longValue)) {
                    if (i2 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                        arrayList.add(Long.valueOf(longValue));
                        z = true;
                    }
                    z = false;
                } else {
                    long j = -longValue;
                    if (!arrayList2.contains(Long.valueOf(j))) {
                        arrayList2.add(Long.valueOf(j));
                        z = true;
                    }
                    z = false;
                }
                if (z) {
                    RecentSearchObject recentSearchObject = new RecentSearchObject();
                    recentSearchObject.did = longValue;
                    recentSearchObject.date = queryFinalized.intValue(1);
                    arrayList4.add(recentSearchObject);
                    longSparseArray.put(recentSearchObject.did, recentSearchObject);
                }
            }
            queryFinalized.dispose();
            ArrayList<TLRPC$User> arrayList5 = new ArrayList<>();
            if (!arrayList3.isEmpty()) {
                ArrayList<TLRPC$EncryptedChat> arrayList6 = new ArrayList<>();
                MessagesStorage.getInstance(i).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                    RecentSearchObject recentSearchObject2 = (RecentSearchObject) longSparseArray.get(DialogObject.makeEncryptedDialogId(arrayList6.get(i3).id));
                    if (recentSearchObject2 != null) {
                        recentSearchObject2.object = arrayList6.get(i3);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList<TLRPC$Chat> arrayList7 = new ArrayList<>();
                MessagesStorage.getInstance(i).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                for (int i4 = 0; i4 < arrayList7.size(); i4++) {
                    TLRPC$Chat tLRPC$Chat = arrayList7.get(i4);
                    long j2 = -tLRPC$Chat.id;
                    if (tLRPC$Chat.migrated_to != null) {
                        RecentSearchObject recentSearchObject3 = (RecentSearchObject) longSparseArray.get(j2);
                        longSparseArray.remove(j2);
                        if (recentSearchObject3 != null) {
                            arrayList4.remove(recentSearchObject3);
                        }
                    } else {
                        RecentSearchObject recentSearchObject4 = (RecentSearchObject) longSparseArray.get(j2);
                        if (recentSearchObject4 != null) {
                            recentSearchObject4.object = tLRPC$Chat;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                MessagesStorage.getInstance(i).getUsersInternal(TextUtils.join(",", arrayList), arrayList5);
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    TLRPC$User tLRPC$User = arrayList5.get(i5);
                    RecentSearchObject recentSearchObject5 = (RecentSearchObject) longSparseArray.get(tLRPC$User.id);
                    if (recentSearchObject5 != null) {
                        recentSearchObject5.object = tLRPC$User;
                    }
                }
            }
            Collections.sort(arrayList4, DialogsSearchAdapter$$ExternalSyntheticLambda16.INSTANCE);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    DialogsSearchAdapter.OnRecentSearchLoaded.this.setRecentSearch(arrayList4, longSparseArray);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int lambda$loadRecentSearch$3(RecentSearchObject recentSearchObject, RecentSearchObject recentSearchObject2) {
        int i = recentSearchObject.date;
        int i2 = recentSearchObject2.date;
        if (i < i2) {
            return 1;
        }
        return i > i2 ? -1 : 0;
    }

    public void putRecentSearch(final long j, TLObject tLObject) {
        RecentSearchObject recentSearchObject = this.recentSearchObjectsById.get(j);
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
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$putRecentSearch$6(j);
            }
        });
    }

    public void lambda$putRecentSearch$6(long j) {
        try {
            SQLitePreparedStatement executeFast = MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void clearRecentSearch() {
        this.recentSearchObjectsById = new LongSparseArray<>();
        this.recentSearchObjects = new ArrayList<>();
        notifyDataSetChanged();
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$clearRecentSearch$7();
            }
        });
    }

    public void lambda$clearRecentSearch$7() {
        try {
            MessagesStorage.getInstance(this.currentAccount).getDatabase().executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeRecentSearch(final long j) {
        RecentSearchObject recentSearchObject = this.recentSearchObjectsById.get(j);
        if (recentSearchObject != null) {
            this.recentSearchObjectsById.remove(j);
            this.recentSearchObjects.remove(recentSearchObject);
            notifyDataSetChanged();
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DialogsSearchAdapter.this.lambda$removeRecentSearch$8(j);
                }
            });
        }
    }

    public void lambda$removeRecentSearch$8(long j) {
        try {
            SQLiteDatabase database = MessagesStorage.getInstance(this.currentAccount).getDatabase();
            database.executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public void lambda$loadRecentSearch$2(ArrayList<RecentSearchObject> arrayList, LongSparseArray<RecentSearchObject> longSparseArray) {
        this.recentSearchObjects = arrayList;
        this.recentSearchObjectsById = longSparseArray;
        for (int i = 0; i < this.recentSearchObjects.size(); i++) {
            RecentSearchObject recentSearchObject = this.recentSearchObjects.get(i);
            TLObject tLObject = recentSearchObject.object;
            if (tLObject instanceof TLRPC$User) {
                MessagesController.getInstance(this.currentAccount).putUser((TLRPC$User) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC$Chat) {
                MessagesController.getInstance(this.currentAccount).putChat((TLRPC$Chat) recentSearchObject.object, true);
            } else if (tLObject instanceof TLRPC$EncryptedChat) {
                MessagesController.getInstance(this.currentAccount).putEncryptedChat((TLRPC$EncryptedChat) recentSearchObject.object, true);
            }
        }
        notifyDataSetChanged();
    }

    private void searchDialogsInternal(final String str, final int i) {
        if (this.needMessagesSearch != 2) {
            final String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                this.lastSearchId = 0;
                updateSearchResults(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), this.lastSearchId);
                return;
            }
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DialogsSearchAdapter.this.lambda$searchDialogsInternal$10(lowerCase, i, str);
                }
            });
        }
    }

    public void lambda$searchDialogsInternal$10(String str, int i, String str2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList<CharSequence> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC$User> arrayList3 = new ArrayList<>();
        MessagesStorage.getInstance(this.currentAccount).localSearch(this.dialogsType, str, arrayList, arrayList2, arrayList3, -1);
        updateSearchResults(arrayList, arrayList2, arrayList3, i);
        FiltersView.fillTipDates(str, this.localTipDates);
        this.localTipArchive = false;
        if (str.length() >= 3 && (LocaleController.getString("ArchiveSearchFilter", R.string.ArchiveSearchFilter).toLowerCase().startsWith(str) || "archive".startsWith(str2))) {
            this.localTipArchive = true;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$searchDialogsInternal$9();
            }
        });
    }

    public void lambda$searchDialogsInternal$9() {
        FilteredSearchView.Delegate delegate = this.filtersDelegate;
        if (delegate != null) {
            delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
        }
    }

    private void updateSearchResults(final ArrayList<Object> arrayList, final ArrayList<CharSequence> arrayList2, final ArrayList<TLRPC$User> arrayList3, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$updateSearchResults$12(i, arrayList, arrayList3, arrayList2);
            }
        });
    }

    public void lambda$updateSearchResults$12(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        final long j;
        this.waitingResponseCount--;
        if (i == this.lastSearchId) {
            this.lastLocalSearchId = i;
            if (this.lastGlobalSearchId != i) {
                this.searchAdapterHelper.clear();
            }
            if (this.lastMessagesSearchId != i) {
                this.searchResultMessages.clear();
            }
            this.searchWas = true;
            boolean z = false;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                final Object obj = arrayList.get(i2);
                if (obj instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) obj;
                    MessagesController.getInstance(this.currentAccount).putUser(tLRPC$User, true);
                    j = tLRPC$User.id;
                } else if (obj instanceof TLRPC$Chat) {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) obj;
                    MessagesController.getInstance(this.currentAccount).putChat(tLRPC$Chat, true);
                    j = -tLRPC$Chat.id;
                } else {
                    if (obj instanceof TLRPC$EncryptedChat) {
                        MessagesController.getInstance(this.currentAccount).putEncryptedChat((TLRPC$EncryptedChat) obj, true);
                    }
                    j = 0;
                }
                if (j != 0 && MessagesController.getInstance(this.currentAccount).dialogs_dict.get(j) == null) {
                    MessagesStorage.getInstance(this.currentAccount).getDialogFolderId(j, new MessagesStorage.IntCallback() {
                        @Override
                        public final void run(int i3) {
                            DialogsSearchAdapter.this.lambda$updateSearchResults$11(j, obj, i3);
                        }
                    });
                }
            }
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
            this.searchResult = arrayList;
            this.searchResultNames = arrayList3;
            this.searchAdapterHelper.mergeResults(arrayList);
            notifyDataSetChanged();
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
            if (dialogsSearchAdapterDelegate != null) {
                if (this.waitingResponseCount > 0) {
                    z = true;
                }
                dialogsSearchAdapterDelegate.searchStateChanged(z, true);
                this.delegate.runResultsEnterAnimation();
            }
        }
    }

    public void lambda$updateSearchResults$11(long j, Object obj, int i) {
        if (i != -1) {
            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            tLRPC$TL_dialog.id = j;
            if (i != 0) {
                tLRPC$TL_dialog.folder_id = i;
            }
            if (obj instanceof TLRPC$Chat) {
                tLRPC$TL_dialog.flags = ChatObject.isChannel((TLRPC$Chat) obj) ? 1 : 0;
            }
            MessagesController.getInstance(this.currentAccount).dialogs_dict.put(j, tLRPC$TL_dialog);
            MessagesController.getInstance(this.currentAccount).getAllDialogs().add(tLRPC$TL_dialog);
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

    public void searchDialogs(final String str, int i) {
        if (str == null || !str.equals(this.lastSearchText) || (i != this.folderId && !TextUtils.isEmpty(str))) {
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
            final String trim = str != null ? str.trim() : null;
            if (TextUtils.isEmpty(trim)) {
                this.searchAdapterHelper.unloadRecentHashtags();
                this.searchResult.clear();
                this.searchResultNames.clear();
                this.searchResultHashtags.clear();
                this.searchAdapterHelper.mergeResults(null);
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                int i2 = this.dialogsType;
                searchAdapterHelper.queryServerSearch(null, true, true, i2 != 11, i2 != 11, i2 == 2 || i2 == 11, 0L, i2 == 0, 0, 0);
                this.searchWas = false;
                this.lastSearchId = 0;
                this.waitingResponseCount = 0;
                this.globalSearchCollapsed = true;
                this.phoneCollapsed = true;
                DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
                if (dialogsSearchAdapterDelegate != null) {
                    dialogsSearchAdapterDelegate.searchStateChanged(false, true);
                }
                searchMessagesInternal(null, 0);
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
            if (this.needMessagesSearch == 2 || !trim.startsWith("#") || trim.length() != 1) {
                this.searchResultHashtags.clear();
            } else {
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
                    DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate2 = this.delegate;
                    if (dialogsSearchAdapterDelegate2 != null) {
                        dialogsSearchAdapterDelegate2.searchStateChanged(false, false);
                    }
                }
            }
            final int i4 = this.lastSearchId + 1;
            this.lastSearchId = i4;
            this.waitingResponseCount = 3;
            this.globalSearchCollapsed = true;
            this.phoneCollapsed = true;
            notifyDataSetChanged();
            DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate3 = this.delegate;
            if (dialogsSearchAdapterDelegate3 != null) {
                dialogsSearchAdapterDelegate3.searchStateChanged(true, false);
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable dialogsSearchAdapter$$ExternalSyntheticLambda14 = new Runnable() {
                @Override
                public final void run() {
                    DialogsSearchAdapter.this.lambda$searchDialogs$14(trim, i4, str);
                }
            };
            this.searchRunnable = dialogsSearchAdapter$$ExternalSyntheticLambda14;
            dispatchQueue.postRunnable(dialogsSearchAdapter$$ExternalSyntheticLambda14, 300L);
        }
    }

    public void lambda$searchDialogs$14(final String str, final int i, final String str2) {
        this.searchRunnable = null;
        searchDialogsInternal(str, i);
        Runnable dialogsSearchAdapter$$ExternalSyntheticLambda10 = new Runnable() {
            @Override
            public final void run() {
                DialogsSearchAdapter.this.lambda$searchDialogs$13(i, str, str2);
            }
        };
        this.searchRunnable2 = dialogsSearchAdapter$$ExternalSyntheticLambda10;
        AndroidUtilities.runOnUIThread(dialogsSearchAdapter$$ExternalSyntheticLambda10);
    }

    public void lambda$searchDialogs$13(int i, String str, String str2) {
        this.searchRunnable2 = null;
        if (i == this.lastSearchId) {
            if (this.needMessagesSearch != 2) {
                SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
                int i2 = this.dialogsType;
                searchAdapterHelper.queryServerSearch(str, true, i2 != 4, true, (i2 == 4 || i2 == 11) ? false : true, i2 == 2 || i2 == 1, 0L, i2 == 0, 0, i);
            } else {
                this.waitingResponseCount -= 2;
            }
            if (this.needMessagesSearch == 0) {
                this.waitingResponseCount--;
            } else {
                searchMessagesInternal(str2, i);
            }
        }
    }

    @Override
    public int getItemCount() {
        int i = 0;
        int i2 = 3;
        if (this.waitingResponseCount == 3) {
            return 0;
        }
        if (isRecentSearchDisplayed()) {
            if (!this.recentSearchObjects.isEmpty()) {
                i = this.recentSearchObjects.size() + 1;
            }
            return i + (!MediaDataController.getInstance(this.currentAccount).hints.isEmpty() ? 1 : 0);
        } else if (!this.searchResultHashtags.isEmpty()) {
            return this.searchResultHashtags.size() + 1 + 0;
        } else {
            int size = this.searchResult.size() + 0;
            int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            if (size3 > 3 && this.globalSearchCollapsed) {
                size3 = 3;
            }
            int size4 = this.searchAdapterHelper.getPhoneSearch().size();
            if (size4 <= 3 || !this.phoneCollapsed) {
                i2 = size4;
            }
            int size5 = this.searchResultMessages.size();
            int i3 = size + size2;
            if (size3 != 0) {
                i3 += size3 + 1;
            }
            if (i2 != 0) {
                i3 += i2;
            }
            if (size5 != 0) {
                i3 += size5 + 1 + (!this.messagesSearchEndReached ? 1 : 0);
            }
            this.currentItemCount = i3;
            return i3;
        }
    }

    public Object getItem(int i) {
        int i2;
        Object obj;
        if (isRecentSearchDisplayed()) {
            int i3 = !MediaDataController.getInstance(this.currentAccount).hints.isEmpty() ? 1 : 0;
            if (i <= i3 || (i2 = (i - 1) - i3) >= this.recentSearchObjects.size()) {
                return null;
            }
            TLObject tLObject = this.recentSearchObjects.get(i2).object;
            if (tLObject instanceof TLRPC$User) {
                obj = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC$User) tLObject).id));
                if (obj == null) {
                    return tLObject;
                }
            } else if (!(tLObject instanceof TLRPC$Chat) || (obj = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(((TLRPC$Chat) tLObject).id))) == null) {
                return tLObject;
            }
            return obj;
        } else if (this.searchResultHashtags.isEmpty()) {
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            ArrayList<Object> phoneSearch = this.searchAdapterHelper.getPhoneSearch();
            int size = this.searchResult.size();
            int size2 = localServerSearch.size();
            int size3 = phoneSearch.size();
            if (size3 > 3 && this.phoneCollapsed) {
                size3 = 3;
            }
            int i4 = 0;
            int size4 = globalSearch.isEmpty() ? 0 : globalSearch.size() + 1;
            if (size4 > 4 && this.globalSearchCollapsed) {
                size4 = 4;
            }
            if (!this.searchResultMessages.isEmpty()) {
                i4 = this.searchResultMessages.size() + 1;
            }
            if (i >= 0 && i < size) {
                return this.searchResult.get(i);
            }
            int i5 = i - size;
            if (i5 >= 0 && i5 < size2) {
                return localServerSearch.get(i5);
            }
            int i6 = i5 - size2;
            if (i6 >= 0 && i6 < size3) {
                return phoneSearch.get(i6);
            }
            int i7 = i6 - size3;
            if (i7 > 0 && i7 < size4) {
                return globalSearch.get(i7 - 1);
            }
            int i8 = i7 - size4;
            if (i8 <= 0 || i8 >= i4) {
                return null;
            }
            return this.searchResultMessages.get(i8 - 1);
        } else if (i > 0) {
            return this.searchResultHashtags.get(i - 1);
        } else {
            return null;
        }
    }

    public boolean isGlobalSearch(int i) {
        int i2;
        if (isRecentSearchDisplayed() || !this.searchResultHashtags.isEmpty()) {
            return false;
        }
        ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
        ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
        int size = this.searchResult.size();
        int size2 = localServerSearch.size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.isEmpty() ? 0 : globalSearch.size() + 1;
        if (size4 > 4 && this.globalSearchCollapsed) {
            size4 = 4;
        }
        if (!this.searchResultMessages.isEmpty()) {
            this.searchResultMessages.size();
        }
        if (i >= 0 && i < size) {
            return false;
        }
        int i3 = i - size;
        if (i3 >= 0 && i3 < size2) {
            return false;
        }
        int i4 = i3 - size2;
        return (i4 <= 0 || i4 >= size3) && (i2 = i4 - size3) > 0 && i2 < size4;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 3) ? false : true;
    }

    public void lambda$onCreateViewHolder$15(View view, int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.didPressedOnSubDialog(((Long) view.getTag()).longValue());
        }
    }

    public boolean lambda$onCreateViewHolder$16(View view, int i) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate == null) {
            return true;
        }
        dialogsSearchAdapterDelegate.needRemoveHint(((Long) view.getTag()).longValue());
        return true;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerListView recyclerListView;
        DialogCell dialogCell;
        if (i == 0) {
            recyclerListView = new ProfileSearchCell(this.mContext);
        } else if (i != 1) {
            if (i == 2) {
                dialogCell = new DialogCell(null, this.mContext, false, true);
            } else if (i == 3) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setViewType(1);
                flickerLoadingView.setIsSingleCell(true);
                dialogCell = flickerLoadingView;
            } else if (i == 4) {
                recyclerListView = new HashtagSearchCell(this.mContext);
            } else if (i != 5) {
                recyclerListView = new TextCell(this.mContext, 16, false);
            } else {
                RecyclerListView recyclerListView2 = new RecyclerListView(this, this.mContext) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (!(getParent() == null || getParent().getParent() == null)) {
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
                recyclerListView2.setSelectorDrawableColor(Theme.getColor("listSelectorSDK21"));
                recyclerListView2.setTag(9);
                recyclerListView2.setItemAnimator(null);
                recyclerListView2.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, this.mContext) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView2.setLayoutManager(linearLayoutManager);
                recyclerListView2.setAdapter(new CategoryAdapterRecycler(this.mContext, this.currentAccount, false));
                recyclerListView2.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i2) {
                        DialogsSearchAdapter.this.lambda$onCreateViewHolder$15(view, i2);
                    }
                });
                recyclerListView2.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                    @Override
                    public final boolean onItemClick(View view, int i2) {
                        boolean lambda$onCreateViewHolder$16;
                        lambda$onCreateViewHolder$16 = DialogsSearchAdapter.this.lambda$onCreateViewHolder$16(view, i2);
                        return lambda$onCreateViewHolder$16;
                    }
                });
                this.innerListView = recyclerListView2;
                recyclerListView = recyclerListView2;
            }
            recyclerListView = dialogCell;
        } else {
            recyclerListView = new GraySectionCell(this.mContext);
        }
        if (i == 5) {
            recyclerListView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(86.0f)));
        } else {
            recyclerListView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        return new RecyclerListView.Holder(recyclerListView);
    }

    @Override
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsSearchAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public void lambda$onBindViewHolder$17(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public void lambda$onBindViewHolder$18(View view) {
        DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.delegate;
        if (dialogsSearchAdapterDelegate != null) {
            dialogsSearchAdapterDelegate.needClearList();
        }
    }

    public void lambda$onBindViewHolder$19() {
        this.phoneCollapsed = !this.phoneCollapsed;
        notifyDataSetChanged();
    }

    public void lambda$onBindViewHolder$20() {
        this.globalSearchCollapsed = !this.globalSearchCollapsed;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int i) {
        if (isRecentSearchDisplayed()) {
            int i2 = !MediaDataController.getInstance(this.currentAccount).hints.isEmpty() ? 1 : 0;
            if (i < i2) {
                return 5;
            }
            return i == i2 ? 1 : 0;
        }
        int i3 = 4;
        if (!this.searchResultHashtags.isEmpty()) {
            return i == 0 ? 1 : 4;
        }
        ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
        int size = this.searchResult.size();
        int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
        int size3 = this.searchAdapterHelper.getPhoneSearch().size();
        if (size3 > 3 && this.phoneCollapsed) {
            size3 = 3;
        }
        int size4 = globalSearch.isEmpty() ? 0 : globalSearch.size() + 1;
        if (size4 <= 4 || !this.globalSearchCollapsed) {
            i3 = size4;
        }
        int size5 = this.searchResultMessages.isEmpty() ? 0 : this.searchResultMessages.size() + 1;
        if (i >= 0 && i < size) {
            return 0;
        }
        int i4 = i - size;
        if (i4 >= 0 && i4 < size2) {
            return 0;
        }
        int i5 = i4 - size2;
        if (i5 < 0 || i5 >= size3) {
            int i6 = i5 - size3;
            if (i6 >= 0 && i6 < i3) {
                return i6 == 0 ? 1 : 0;
            }
            int i7 = i6 - i3;
            if (i7 < 0 || i7 >= size5) {
                return 3;
            }
            return i7 == 0 ? 1 : 2;
        }
        Object item = getItem(i5);
        if (item instanceof String) {
            return "section".equals((String) item) ? 1 : 6;
        }
        return 0;
    }

    public void setFiltersDelegate(FilteredSearchView.Delegate delegate, boolean z) {
        this.filtersDelegate = delegate;
        if (delegate != null && z) {
            delegate.updateFiltersView(false, null, this.localTipDates, this.localTipArchive);
        }
    }

    public int getCurrentItemCount() {
        return this.currentItemCount;
    }
}
