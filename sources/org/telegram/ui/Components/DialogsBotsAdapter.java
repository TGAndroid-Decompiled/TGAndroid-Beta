package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.DialogsBotsAdapter;

public class DialogsBotsAdapter extends UniversalAdapter {
    private int allCount;
    private final Context context;
    private final int currentAccount;
    public boolean expandedMyBots;
    public boolean expandedSearchBots;
    private boolean first;
    private final int folderId;
    private boolean hasMore;
    public boolean loadingBots;
    public boolean loadingMessages;
    private int nextRate;
    private final PopularBots popular;
    public String query;
    private final Theme.ResourcesProvider resourcesProvider;
    private int searchBotsId;
    public final ArrayList searchGlobal;
    public final ArrayList searchMessages;
    private Runnable searchMessagesRunnable;
    public final ArrayList searchMine;
    private final boolean showOnlyPopular;
    private int topPeersEnd;
    private int topPeersStart;

    public static class PopularBots {
        private boolean cacheLoaded;
        private long cacheTime;
        private final int currentAccount;
        private boolean endReached;
        private String lastOffset;
        public boolean loading;
        private final Runnable whenUpdated;
        public final ArrayList bots = new ArrayList();
        private boolean savingCache = false;

        public PopularBots(int i, Runnable runnable) {
            this.currentAccount = i;
            this.whenUpdated = runnable;
        }

        public void lambda$load$4() {
            this.loading = false;
            this.whenUpdated.run();
            if (System.currentTimeMillis() - this.cacheTime > 3600000) {
                this.bots.clear();
                this.lastOffset = null;
                load();
            }
        }

        public void lambda$load$5(TLObject tLObject) {
            if (tLObject instanceof TL_bots.popularAppBots) {
                TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(popularappbots.users, false);
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(popularappbots.users, null, false, true);
                this.bots.addAll(popularappbots.users);
                String str = popularappbots.next_offset;
                this.lastOffset = str;
                this.endReached = str == null;
                this.cacheTime = System.currentTimeMillis();
                saveCache();
            } else {
                this.lastOffset = null;
                this.endReached = true;
            }
            this.loading = false;
            this.whenUpdated.run();
        }

        public void lambda$load$6(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.this.lambda$load$5(tLObject);
                }
            });
        }

        public void lambda$loadCache$0(ArrayList arrayList, long j, String str, Runnable runnable) {
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
            this.bots.addAll(arrayList);
            this.cacheTime = j;
            this.lastOffset = str;
            this.cacheLoaded = true;
            runnable.run();
        }

        public void lambda$loadCache$1(MessagesStorage messagesStorage, final Runnable runnable) {
            String str;
            final ArrayList arrayList = new ArrayList();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            final long j = 0;
            SQLiteCursor sQLiteCursor = null;
            final String str2 = null;
            sQLiteCursor = null;
            try {
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            arrayList2.add(Long.valueOf(queryFinalized.longValue(0)));
                            j = Math.max(j, queryFinalized.longValue(1));
                            str2 = queryFinalized.stringValue(2);
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            sQLiteCursor = queryFinalized;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    DialogsBotsAdapter.PopularBots.this.lambda$loadCache$0(arrayList, j, str2, runnable);
                                }
                            });
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    arrayList.addAll(messagesStorage.getUsers(arrayList2));
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsBotsAdapter.PopularBots.this.lambda$loadCache$0(arrayList, j, str2, runnable);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public void lambda$saveCache$2() {
            this.savingCache = false;
        }

        public void lambda$saveCache$3(org.telegram.messenger.MessagesStorage r5, java.util.ArrayList r6, long r7, java.lang.String r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.DialogsBotsAdapter.PopularBots.lambda$saveCache$3(org.telegram.messenger.MessagesStorage, java.util.ArrayList, long, java.lang.String):void");
        }

        private void loadCache(final Runnable runnable) {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.this.lambda$loadCache$1(messagesStorage, runnable);
                }
            });
        }

        private void saveCache() {
            if (this.savingCache) {
                return;
            }
            this.savingCache = true;
            final long j = this.cacheTime;
            final String str = this.lastOffset;
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.bots.size(); i++) {
                arrayList.add(Long.valueOf(((TLRPC.User) this.bots.get(i)).id));
            }
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.this.lambda$saveCache$3(messagesStorage, arrayList, j, str);
                }
            });
        }

        public void load() {
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            if (!this.cacheLoaded) {
                loadCache(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsBotsAdapter.PopularBots.this.lambda$load$4();
                    }
                });
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.lastOffset;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpopularappbots, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    DialogsBotsAdapter.PopularBots.this.lambda$load$6(tLObject, tL_error);
                }
            });
        }
    }

    public DialogsBotsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, null, resourcesProvider);
        this.searchMine = new ArrayList();
        this.searchGlobal = new ArrayList();
        this.searchMessages = new ArrayList();
        this.searchMessagesRunnable = new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$new$6();
            }
        };
        this.first = true;
        this.fillItems = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                DialogsBotsAdapter.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        };
        this.context = context;
        this.currentAccount = i;
        this.folderId = i2;
        this.resourcesProvider = resourcesProvider;
        this.showOnlyPopular = z;
        this.popular = new PopularBots(i, new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$new$0();
            }
        });
        update(false);
        MediaDataController.getInstance(i).loadHints(true);
    }

    public void lambda$new$0() {
        update(true);
    }

    public void lambda$new$6() {
        searchMessages(false);
    }

    public void lambda$searchMessages$1(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject) {
        if (i == this.searchBotsId && TextUtils.equals(tL_messages_searchGlobal.q, this.query)) {
            this.loadingMessages = false;
            if (!z) {
                this.searchMessages.clear();
            }
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                Iterator<TLRPC.Message> it = messages_messages.messages.iterator();
                while (it.hasNext()) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, it.next(), false, true);
                    messageObject.setQuery(this.query);
                    this.searchMessages.add(messageObject);
                }
                this.hasMore = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                this.allCount = Math.max(this.searchMessages.size(), messages_messages.count);
                this.nextRate = messages_messages.next_rate;
            }
            update(true);
        }
    }

    public void lambda$searchMessages$2(final int i, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$searchMessages$1(i, tL_messages_searchGlobal, z, tLObject);
            }
        });
    }

    public void lambda$searchMessages$3(final int i, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final boolean z) {
        if (i == this.searchBotsId && TextUtils.equals(tL_messages_searchGlobal.q, this.query)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    DialogsBotsAdapter.this.lambda$searchMessages$2(i, tL_messages_searchGlobal, z, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$searchMessages$4(TLRPC.TL_contacts_search tL_contacts_search, TLObject tLObject) {
        TLRPC.TL_contacts_found tL_contacts_found;
        TLRPC.User user;
        TLRPC.User user2;
        if (!TextUtils.equals(tL_contacts_search.q, this.query) || TextUtils.isEmpty(this.query)) {
            return;
        }
        this.loadingBots = false;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_found.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_found.chats, false);
        } else {
            tL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        this.searchMine.clear();
        if (tL_contacts_found != null) {
            Iterator<TLRPC.Peer> it = tL_contacts_found.my_results.iterator();
            while (it.hasNext()) {
                TLRPC.Peer next = it.next();
                if ((next instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    this.searchMine.add(user2);
                }
            }
        }
        this.searchGlobal.clear();
        if (tL_contacts_found != null) {
            Iterator<TLRPC.Peer> it2 = tL_contacts_found.results.iterator();
            while (it2.hasNext()) {
                TLRPC.Peer next2 = it2.next();
                if ((next2 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(next2.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    this.searchGlobal.add(user);
                }
            }
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.scrollToPosition(0);
        }
        update(true);
    }

    public void lambda$searchMessages$5(final TLRPC.TL_contacts_search tL_contacts_search, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$searchMessages$4(tL_contacts_search, tLObject);
            }
        });
    }

    private void searchMessages(final boolean z) {
        TLRPC.InputPeer tL_inputPeerEmpty;
        this.loadingMessages = true;
        final int i = this.searchBotsId + 1;
        this.searchBotsId = i;
        final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i2 = this.folderId;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.query;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        if (!z || this.searchMessages.isEmpty()) {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_inputPeerEmpty = new TLRPC.TL_inputPeerEmpty();
        } else {
            ArrayList arrayList = this.searchMessages;
            MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
            tL_messages_searchGlobal.offset_rate = this.nextRate;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_inputPeerEmpty = messageObject.messageOwner.peer_id == null ? new TLRPC.TL_inputPeerEmpty() : MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
        }
        tL_messages_searchGlobal.offset_peer = tL_inputPeerEmpty;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.this.lambda$searchMessages$3(i, tL_messages_searchGlobal, z);
            }
        }, z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingBots = true;
        final TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 30;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                DialogsBotsAdapter.this.lambda$searchMessages$5(tL_contacts_search, tLObject, tL_error);
            }
        });
    }

    public void toggleExpandedMyBots(View view) {
        this.expandedMyBots = !this.expandedMyBots;
        update(true);
    }

    public void toggleExpandedSearchBots(View view) {
        this.expandedSearchBots = !this.expandedSearchBots;
        update(true);
    }

    public void checkBottom() {
        if (TextUtils.isEmpty(this.query)) {
            if (this.first || seesLoading()) {
                this.popular.load();
            }
        } else if (this.hasMore && !this.loadingMessages && seesLoading()) {
            searchMore();
        }
        this.first = false;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        UItem asFlicker;
        HashSet hashSet = new HashSet();
        int i = 0;
        if (TextUtils.isEmpty(this.query)) {
            ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(this.currentAccount).webapps;
            ArrayList arrayList3 = new ArrayList();
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList2.get(i2).peer)));
                    if (user != null && user.bot) {
                        arrayList3.add(user);
                    }
                }
            }
            this.topPeersStart = arrayList.size();
            if (!arrayList3.isEmpty() && !this.showOnlyPopular) {
                arrayList.add(arrayList3.size() > 5 ? UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(this.expandedMyBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DialogsBotsAdapter.this.toggleExpandedMyBots(view);
                    }
                }) : UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine)));
                for (int i3 = 0; i3 < arrayList3.size() && (i3 < 5 || this.expandedMyBots); i3++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList3.get(i3);
                    if (!hashSet.contains(Long.valueOf(user2.id))) {
                        hashSet.add(Long.valueOf(user2.id));
                        arrayList.add(UItem.asProfileCell(user2).accent());
                    }
                }
            }
            this.topPeersEnd = arrayList.size();
            if (!this.popular.bots.isEmpty()) {
                if (!this.showOnlyPopular) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsPopular)));
                }
                while (i < this.popular.bots.size()) {
                    TLRPC.User user3 = (TLRPC.User) this.popular.bots.get(i);
                    if (!hashSet.contains(Long.valueOf(user3.id))) {
                        hashSet.add(Long.valueOf(user3.id));
                        arrayList.add(UItem.asProfileCell(user3).accent());
                    }
                    i++;
                }
                if (!this.popular.loading) {
                    return;
                }
            } else {
                if (!this.popular.loading) {
                    return;
                }
                if (!this.showOnlyPopular) {
                    arrayList.add(UItem.asFlicker(30));
                }
                arrayList.add(UItem.asFlicker(29));
            }
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            asFlicker = UItem.asFlicker(29);
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(this.searchMine);
            arrayList4.addAll(this.searchGlobal);
            if (!arrayList4.isEmpty()) {
                arrayList.add((arrayList4.size() <= 5 || this.searchMessages.isEmpty() || this.showOnlyPopular) ? UItem.asGraySection(LocaleController.getString(R.string.SearchApps)) : UItem.asGraySection(LocaleController.getString(R.string.SearchApps), LocaleController.getString(this.expandedSearchBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DialogsBotsAdapter.this.toggleExpandedSearchBots(view);
                    }
                }));
                int size = arrayList4.size();
                if (!this.expandedSearchBots && !this.searchMessages.isEmpty() && !this.showOnlyPopular) {
                    size = Math.min(5, size);
                }
                while (i < size) {
                    arrayList.add(UItem.asProfileCell((TLObject) arrayList4.get(i)));
                    i++;
                }
            }
            if (this.searchMessages.isEmpty() || this.showOnlyPopular) {
                return;
            }
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
            Iterator it = this.searchMessages.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asSearchMessage((MessageObject) it.next()));
            }
            if (!this.hasMore) {
                return;
            } else {
                asFlicker = UItem.asFlicker(1);
            }
        }
        arrayList.add(asFlicker);
    }

    public Object getObject(int i) {
        UItem item = getItem(i);
        if (item != null) {
            return item.object;
        }
        return null;
    }

    public Object getTopPeerObject(int i) {
        return (i < this.topPeersStart || i >= this.topPeersEnd) ? Boolean.FALSE : getObject(i);
    }

    public void search(String str) {
        if (TextUtils.equals(str, this.query)) {
            return;
        }
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.searchMessagesRunnable);
        if (!TextUtils.isEmpty(this.query)) {
            this.searchMessages.clear();
            AndroidUtilities.runOnUIThread(this.searchMessagesRunnable, 1000L);
            this.loadingMessages = true;
            this.loadingBots = true;
            update(true);
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.scrollToPosition(0);
                return;
            }
            return;
        }
        this.searchMessages.clear();
        update(true);
        this.searchBotsId++;
        this.loadingMessages = false;
        this.loadingBots = false;
        this.hasMore = false;
        this.nextRate = 0;
        RecyclerListView recyclerListView2 = this.listView;
        if (recyclerListView2 != null) {
            recyclerListView2.scrollToPosition(0);
        }
    }

    public void searchMore() {
        if (!this.hasMore || this.loadingMessages || TextUtils.isEmpty(this.query)) {
            return;
        }
        searchMessages(true);
    }

    public boolean seesLoading() {
        if (this.listView == null) {
            return false;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }
}
