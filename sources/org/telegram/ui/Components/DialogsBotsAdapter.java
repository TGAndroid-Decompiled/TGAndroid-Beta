package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
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
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public class DialogsBotsAdapter extends UniversalAdapter {
    private int allCount;
    private final Context context;
    private final int currentAccount;
    public boolean expandedMyBots;
    public boolean expandedSearchBots;
    private boolean first;
    private final int folderId;
    private boolean hasMore;
    private final CharSequence infoText;
    public boolean loadingBots;
    public boolean loadingMessages;
    private int nextRate;
    private final Utilities.Callback openBotCallback;
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

    public DialogsBotsAdapter(RecyclerListView recyclerListView, final Context context, int i, int i2, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, true, null, resourcesProvider);
        this.searchMine = new ArrayList();
        this.searchGlobal = new ArrayList();
        this.searchMessages = new ArrayList();
        this.searchMessagesRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.searchMessages(false);
            }
        };
        this.first = true;
        this.openBotCallback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.openBot((TLRPC.User) obj);
            }
        };
        this.fillItems = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
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
                this.f$0.update(true);
            }
        });
        this.infoText = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.m2258$r8$lambda$5ginHUpWaAKzzFssKEgml0kyyU(this.f$0, resourcesProvider, context);
            }
        }), true);
        update(false);
        MediaDataController.getInstance(i).loadHints(true);
    }

    public static void m2258$r8$lambda$5ginHUpWaAKzzFssKEgml0kyyU(DialogsBotsAdapter dialogsBotsAdapter, Theme.ResourcesProvider resourcesProvider, final Context context) {
        dialogsBotsAdapter.getClass();
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.AppsTabInfoText), resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.$r8$lambda$EOGIk9CaGT_CDhBN5lcgeWcIuVc(alertDialogArr);
            }
        }));
        Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(spannableStringBuilderReplaceTags);
        while (matcher.find()) {
            final String strGroup = matcher.group(1);
            spannableStringBuilderReplaceTags.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    AlertDialog alertDialog = alertDialogArr[0];
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    Browser.openUrl(context, "https://t.me/" + strGroup);
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, matcher.start(), matcher.end(), 33);
        }
        alertDialogArr[0] = new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.AppsTabInfoTitle)).setMessage(spannableStringBuilderReplaceTags).setPositiveButton(LocaleController.getString(R.string.AppsTabInfoButton), null).show();
    }

    public static void $r8$lambda$EOGIk9CaGT_CDhBN5lcgeWcIuVc(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        HashSet hashSet = new HashSet();
        int i = 0;
        if (!TextUtils.isEmpty(this.query)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.searchMine);
            arrayList2.addAll(this.searchGlobal);
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() <= 5 || this.searchMessages.isEmpty() || this.showOnlyPopular) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchApps)));
                } else {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchApps), LocaleController.getString(this.expandedSearchBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.toggleExpandedSearchBots(view);
                        }
                    }));
                }
                int size = arrayList2.size();
                if (!this.expandedSearchBots && !this.searchMessages.isEmpty() && !this.showOnlyPopular) {
                    size = Math.min(5, size);
                }
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(UItem.asProfileCell((TLObject) arrayList2.get(i2)).withOpenButton(this.openBotCallback));
                }
            }
            if (this.searchMessages.isEmpty() || this.showOnlyPopular) {
                return;
            }
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
            ArrayList arrayList3 = this.searchMessages;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj = arrayList3.get(i);
                i++;
                arrayList.add(UItem.asSearchMessage((MessageObject) obj));
            }
            if (this.hasMore) {
                arrayList.add(UItem.asFlicker(1));
                return;
            }
            return;
        }
        ArrayList<TLRPC.TL_topPeer> arrayList4 = MediaDataController.getInstance(this.currentAccount).webapps;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList4.get(i3).peer)));
                if (user != null && user.bot) {
                    arrayList5.add(user);
                }
            }
        }
        this.topPeersStart = arrayList.size();
        if (!arrayList5.isEmpty() && !this.showOnlyPopular) {
            if (arrayList5.size() > 5) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(this.expandedMyBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.toggleExpandedMyBots(view);
                    }
                }));
            } else {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine)));
            }
            for (int i4 = 0; i4 < arrayList5.size() && (i4 < 5 || this.expandedMyBots); i4++) {
                TLRPC.User user2 = (TLRPC.User) arrayList5.get(i4);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    arrayList.add(UItem.asProfileCell(user2).accent().withOpenButton(this.openBotCallback));
                }
            }
        }
        hashSet.clear();
        this.topPeersEnd = arrayList.size();
        if (!this.popular.bots.isEmpty()) {
            if (!this.showOnlyPopular) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsPopular)));
            }
            int i5 = 0;
            while (i < this.popular.bots.size()) {
                TLRPC.User user3 = (TLRPC.User) this.popular.bots.get(i);
                if (!hashSet.contains(Long.valueOf(user3.id))) {
                    hashSet.add(Long.valueOf(user3.id));
                    arrayList.add(UItem.asProfileCell(user3).accent().red().withOpenButton(this.openBotCallback));
                    i5 = 1;
                }
                i++;
            }
            PopularBots popularBots = this.popular;
            if (popularBots.loading || !popularBots.endReached) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            i = i5;
        } else {
            PopularBots popularBots2 = this.popular;
            if (popularBots2.loading || !popularBots2.endReached) {
                if (!this.showOnlyPopular) {
                    arrayList.add(UItem.asFlicker(30));
                }
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
        }
        if (i != 0) {
            arrayList.add(UItem.asShadow(this.infoText));
        }
    }

    public void toggleExpandedMyBots(View view) {
        this.expandedMyBots = !this.expandedMyBots;
        update(true);
    }

    public void toggleExpandedSearchBots(View view) {
        this.expandedSearchBots = !this.expandedSearchBots;
        update(true);
    }

    public Object getTopPeerObject(int i) {
        if (i < this.topPeersStart || i >= this.topPeersEnd) {
            return Boolean.FALSE;
        }
        return getObject(i);
    }

    public Object getObject(int i) {
        UItem item = getItem(i);
        if (item != null) {
            return item.object;
        }
        return null;
    }

    public void searchMessages(final boolean z) {
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
        if (z && !this.searchMessages.isEmpty()) {
            ArrayList arrayList = this.searchMessages;
            MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
            tL_messages_searchGlobal.offset_rate = this.nextRate;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            if (messageObject.messageOwner.peer_id == null) {
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            }
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.$r8$lambda$7wt9kuMQ2TKAcwy_UJrRUoKtXpg(this.f$0, i, tL_messages_searchGlobal, z);
            }
        }, z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingBots = true;
        final TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 30;
        tL_contacts_search.bots = true;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_contacts_search, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                DialogsBotsAdapter.m2259$r8$lambda$EB7zYrWozrF5aIZNKyretPsmmk(this.f$0, tL_contacts_search, (TLRPC.TL_contacts_found) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$7wt9kuMQ2TKAcwy_UJrRUoKtXpg(final DialogsBotsAdapter dialogsBotsAdapter, final int i, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final boolean z) {
        if (i == dialogsBotsAdapter.searchBotsId && TextUtils.equals(tL_messages_searchGlobal.q, dialogsBotsAdapter.query)) {
            ConnectionsManager.getInstance(dialogsBotsAdapter.currentAccount).sendRequest(tL_messages_searchGlobal, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    DialogsBotsAdapter.$r8$lambda$RpXDJlDr1SRWWFQnh7uxZAiNDFM(this.f$0, i, tL_messages_searchGlobal, z, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$RpXDJlDr1SRWWFQnh7uxZAiNDFM(final DialogsBotsAdapter dialogsBotsAdapter, final int i, final TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        dialogsBotsAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsBotsAdapter.$r8$lambda$nn_RaUyt4aCckM7bONze6rF0zB4(this.f$0, i, tL_messages_searchGlobal, z, tLObject);
            }
        });
    }

    public static void $r8$lambda$nn_RaUyt4aCckM7bONze6rF0zB4(DialogsBotsAdapter dialogsBotsAdapter, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject) {
        if (i == dialogsBotsAdapter.searchBotsId && TextUtils.equals(tL_messages_searchGlobal.q, dialogsBotsAdapter.query)) {
            dialogsBotsAdapter.loadingMessages = false;
            if (!z) {
                dialogsBotsAdapter.searchMessages.clear();
            }
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesStorage.getInstance(dialogsBotsAdapter.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                MessagesController.getInstance(dialogsBotsAdapter.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(dialogsBotsAdapter.currentAccount).putChats(messages_messages.chats, false);
                ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.Message message = arrayList.get(i2);
                    i2++;
                    MessageObject messageObject = new MessageObject(dialogsBotsAdapter.currentAccount, message, false, true);
                    messageObject.setQuery(dialogsBotsAdapter.query);
                    dialogsBotsAdapter.searchMessages.add(messageObject);
                }
                dialogsBotsAdapter.hasMore = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                dialogsBotsAdapter.allCount = Math.max(dialogsBotsAdapter.searchMessages.size(), messages_messages.count);
                dialogsBotsAdapter.nextRate = messages_messages.next_rate;
            }
            dialogsBotsAdapter.update(true);
        }
    }

    public static void m2259$r8$lambda$EB7zYrWozrF5aIZNKyretPsmmk(DialogsBotsAdapter dialogsBotsAdapter, TLRPC.TL_contacts_search tL_contacts_search, TLRPC.TL_contacts_found tL_contacts_found, TLRPC.TL_error tL_error) {
        TLRPC.User user;
        TLRPC.User user2;
        dialogsBotsAdapter.getClass();
        if (!TextUtils.equals(tL_contacts_search.q, dialogsBotsAdapter.query) || TextUtils.isEmpty(dialogsBotsAdapter.query)) {
            return;
        }
        dialogsBotsAdapter.loadingBots = false;
        if (tL_contacts_found != null) {
            MessagesStorage.getInstance(dialogsBotsAdapter.currentAccount).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
            MessagesController.getInstance(dialogsBotsAdapter.currentAccount).putUsers(tL_contacts_found.users, false);
            MessagesController.getInstance(dialogsBotsAdapter.currentAccount).putChats(tL_contacts_found.chats, false);
        } else {
            tL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        dialogsBotsAdapter.searchMine.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList = tL_contacts_found.my_results;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Peer peer = arrayList.get(i);
                i++;
                TLRPC.Peer peer2 = peer;
                if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(dialogsBotsAdapter.currentAccount).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    dialogsBotsAdapter.searchMine.add(user2);
                }
            }
        }
        dialogsBotsAdapter.searchGlobal.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.results;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                TLRPC.Peer peer3 = arrayList2.get(i2);
                i2++;
                TLRPC.Peer peer4 = peer3;
                if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(dialogsBotsAdapter.currentAccount).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
                    hashSet.add(Long.valueOf(user.id));
                    dialogsBotsAdapter.searchGlobal.add(user);
                }
            }
        }
        RecyclerListView recyclerListView = dialogsBotsAdapter.listView;
        if (recyclerListView != null) {
            recyclerListView.scrollToPosition(0);
        }
        dialogsBotsAdapter.update(true);
    }

    public void search(String str) {
        if (TextUtils.equals(str, this.query)) {
            return;
        }
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.searchMessagesRunnable);
        if (TextUtils.isEmpty(this.query)) {
            this.searchMessages.clear();
            update(true);
            this.searchBotsId++;
            this.loadingMessages = false;
            this.loadingBots = false;
            this.hasMore = false;
            this.nextRate = 0;
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.scrollToPosition(0);
                return;
            }
            return;
        }
        this.searchMessages.clear();
        AndroidUtilities.runOnUIThread(this.searchMessagesRunnable, 1000L);
        this.loadingMessages = true;
        this.loadingBots = true;
        update(true);
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

    public void checkBottom() {
        if (!TextUtils.isEmpty(this.query)) {
            if (this.hasMore && !this.loadingMessages && seesLoading()) {
                searchMore();
            }
        } else if (this.first || seesLoading()) {
            this.popular.load();
        }
        this.first = false;
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

        private void loadCache(final Runnable runnable) {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    DialogsBotsAdapter.PopularBots.m2261$r8$lambda$1g_w1JOQo39YjABdFsnZYrDw(this.f$0, messagesStorage, runnable);
                }
            });
        }

        public static void m2261$r8$lambda$1g_w1JOQo39YjABdFsnZYrDw(final PopularBots popularBots, MessagesStorage messagesStorage, final Runnable runnable) throws Throwable {
            SQLiteCursor sQLiteCursor;
            String str;
            final String str2;
            SQLiteCursor sQLiteCursorQueryFinalized;
            TLRPC.User user;
            popularBots.getClass();
            final ArrayList arrayList = new ArrayList();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            final long jMax = 0;
            try {
                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                String strStringValue = null;
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        try {
                            try {
                                arrayList2.add(Long.valueOf(sQLiteCursorQueryFinalized.longValue(0)));
                                jMax = Math.max(jMax, sQLiteCursorQueryFinalized.longValue(1));
                                strStringValue = sQLiteCursorQueryFinalized.stringValue(2);
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                str = strStringValue;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursorQueryFinalized = sQLiteCursor;
                                        String str3 = str;
                                        sQLiteCursorQueryFinalized.dispose();
                                        str2 = str3;
                                    } else {
                                        str2 = str;
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            DialogsBotsAdapter.PopularBots.$r8$lambda$srO7M2dZvxzuuh6UPxCGdo6aAKs(this.f$0, arrayList, jMax, str2, runnable);
                                        }
                                    });
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strStringValue;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList2);
                if (users != null) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Long l = arrayList2.get(i);
                        i++;
                        long jLongValue = l.longValue();
                        int size2 = users.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size2) {
                                str = strStringValue;
                                user = null;
                                break;
                            }
                            TLRPC.User user2 = users.get(i2);
                            i2++;
                            user = user2;
                            if (user != null) {
                                str = strStringValue;
                                try {
                                    if (user.id == jLongValue) {
                                        break;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    sQLiteCursor = sQLiteCursorQueryFinalized;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursorQueryFinalized = sQLiteCursor;
                                        String str4 = str;
                                        sQLiteCursorQueryFinalized.dispose();
                                        str2 = str4;
                                    } else {
                                        str2 = str;
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            DialogsBotsAdapter.PopularBots.$r8$lambda$srO7M2dZvxzuuh6UPxCGdo6aAKs(this.f$0, arrayList, jMax, str2, runnable);
                                        }
                                    });
                                }
                            } else {
                                str = strStringValue;
                            }
                            strStringValue = str;
                        }
                        if (user != null) {
                            arrayList.add(user);
                        }
                        strStringValue = str;
                    }
                }
                str = strStringValue;
            } catch (Exception e4) {
                e = e4;
                sQLiteCursor = null;
                str = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = null;
            }
            String str5 = str;
            sQLiteCursorQueryFinalized.dispose();
            str2 = str5;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.$r8$lambda$srO7M2dZvxzuuh6UPxCGdo6aAKs(this.f$0, arrayList, jMax, str2, runnable);
                }
            });
        }

        public static void $r8$lambda$srO7M2dZvxzuuh6UPxCGdo6aAKs(PopularBots popularBots, ArrayList arrayList, long j, String str, Runnable runnable) {
            MessagesController.getInstance(popularBots.currentAccount).putUsers(arrayList, true);
            popularBots.bots.addAll(arrayList);
            popularBots.cacheTime = j;
            popularBots.lastOffset = str;
            popularBots.endReached = TextUtils.isEmpty(str);
            popularBots.cacheLoaded = true;
            runnable.run();
        }

        private void saveCache() {
            if (this.savingCache) {
                return;
            }
            this.savingCache = true;
            final long j = this.cacheTime;
            String str = this.lastOffset;
            if (str == null) {
                str = "";
            }
            final String str2 = str;
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.bots.size(); i++) {
                arrayList.add(Long.valueOf(((TLRPC.User) this.bots.get(i)).id));
            }
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.$r8$lambda$SwEB9oqpKO9yUCF3uRywt8qVNYw(this.f$0, messagesStorage, arrayList, j, str2);
                }
            });
        }

        public static void $r8$lambda$SwEB9oqpKO9yUCF3uRywt8qVNYw(final PopularBots popularBots, MessagesStorage messagesStorage, ArrayList arrayList, long j, String str) {
            popularBots.getClass();
            SQLiteDatabase database = messagesStorage.getDatabase();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
            try {
                try {
                    database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                    sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                    for (int i = 0; i < arrayList.size(); i++) {
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindLong(1, ((Long) arrayList.get(i)).longValue());
                        sQLitePreparedStatementExecuteFast.bindLong(2, j);
                        sQLitePreparedStatementExecuteFast.bindString(3, str);
                        sQLitePreparedStatementExecuteFast.bindInteger(4, i);
                        sQLitePreparedStatementExecuteFast.step();
                    }
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.savingCache = false;
                    }
                });
            } catch (Throwable th) {
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
                throw th;
            }
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
                        DialogsBotsAdapter.PopularBots.$r8$lambda$LLGPKQkKc6NgyqrZSSbd_cMly94(this.f$0);
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
                    DialogsBotsAdapter.PopularBots.$r8$lambda$X8vqXv7Tzd_WQsE1Q_03bWXWXm0(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$LLGPKQkKc6NgyqrZSSbd_cMly94(PopularBots popularBots) {
            popularBots.loading = false;
            popularBots.whenUpdated.run();
            if (popularBots.bots.isEmpty() || System.currentTimeMillis() - popularBots.cacheTime > 3600000) {
                popularBots.bots.clear();
                popularBots.endReached = false;
                popularBots.lastOffset = null;
                popularBots.load();
            }
        }

        public static void $r8$lambda$X8vqXv7Tzd_WQsE1Q_03bWXWXm0(final PopularBots popularBots, final TLObject tLObject, TLRPC.TL_error tL_error) {
            popularBots.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    DialogsBotsAdapter.PopularBots.$r8$lambda$9Fzuxw3I4u4I53mmU59pI9JuS8k(this.f$0, tLObject);
                }
            });
        }

        public static void $r8$lambda$9Fzuxw3I4u4I53mmU59pI9JuS8k(PopularBots popularBots, TLObject tLObject) {
            popularBots.getClass();
            if (tLObject instanceof TL_bots.popularAppBots) {
                TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                MessagesController.getInstance(popularBots.currentAccount).putUsers(popularappbots.users, false);
                MessagesStorage.getInstance(popularBots.currentAccount).putUsersAndChats(popularappbots.users, null, false, true);
                popularBots.bots.addAll(popularappbots.users);
                String str = popularappbots.next_offset;
                popularBots.lastOffset = str;
                popularBots.endReached = str == null;
                popularBots.cacheTime = System.currentTimeMillis();
                popularBots.saveCache();
                popularBots.loading = false;
                popularBots.whenUpdated.run();
                return;
            }
            popularBots.lastOffset = null;
            popularBots.endReached = true;
            popularBots.loading = false;
            popularBots.whenUpdated.run();
        }
    }

    public void openBot(TLRPC.User user) {
        MessagesController.getInstance(this.currentAccount).openApp(user, 0);
    }
}
