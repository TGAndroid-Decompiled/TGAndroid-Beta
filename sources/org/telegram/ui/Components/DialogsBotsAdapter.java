package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
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
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda89;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ConnectionsManager$$ExternalSyntheticLambda12;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda7;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;

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
    private final Utilities.Callback<TLRPC.User> openBotCallback;
    private final PopularBots popular;
    public String query;
    private final Theme.ResourcesProvider resourcesProvider;
    private int searchBotsId;
    public final ArrayList<TLRPC.User> searchGlobal;
    public final ArrayList<MessageObject> searchMessages;
    private Runnable searchMessagesRunnable;
    public final ArrayList<TLRPC.User> searchMine;
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
        public final ArrayList<TLRPC.User> bots = new ArrayList<>();
        private boolean savingCache = false;

        public PopularBots(int i, Runnable runnable) {
            this.currentAccount = i;
            this.whenUpdated = runnable;
        }

        public void lambda$load$4() {
            this.loading = false;
            this.whenUpdated.run();
            if (this.bots.isEmpty() || System.currentTimeMillis() - this.cacheTime > 3600000) {
                this.bots.clear();
                this.endReached = false;
                this.lastOffset = null;
                load();
            }
        }

        public void lambda$load$5(TLObject tLObject) {
            if (!(tLObject instanceof TL_bots.popularAppBots)) {
                this.lastOffset = null;
                this.endReached = true;
                this.loading = false;
                this.whenUpdated.run();
                return;
            }
            TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(popularappbots.users, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(popularappbots.users, null, false, true);
            this.bots.addAll(popularappbots.users);
            String str = popularappbots.next_offset;
            this.lastOffset = str;
            this.endReached = str == null;
            this.cacheTime = System.currentTimeMillis();
            saveCache();
            this.loading = false;
            this.whenUpdated.run();
        }

        public void lambda$load$6(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda7(20, this, tLObject));
        }

        public void lambda$loadCache$0(ArrayList arrayList, long j, String str, Runnable runnable) {
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
            this.bots.addAll(arrayList);
            this.cacheTime = j;
            this.lastOffset = str;
            this.endReached = TextUtils.isEmpty(str);
            this.cacheLoaded = true;
            runnable.run();
        }

        public void lambda$loadCache$1(MessagesStorage messagesStorage, Runnable runnable) throws Throwable {
            SQLiteCursor sQLiteCursor;
            String str;
            String str2;
            SQLiteCursor sQLiteCursorQueryFinalized;
            TLRPC.User user;
            ArrayList arrayList = new ArrayList();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            long jMax = 0;
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
                                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(this, arrayList, jMax, str2, runnable, 5));
                                } catch (Throwable th) {
                                    th = th;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = strStringValue;
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
                                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(this, arrayList, jMax, str2, runnable, 5));
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
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda22(this, arrayList, jMax, str2, runnable, 5));
        }

        public void lambda$saveCache$2() {
            this.savingCache = false;
        }

        public void lambda$saveCache$3(MessagesStorage messagesStorage, ArrayList arrayList, long j, String str) {
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
                AndroidUtilities.runOnUIThread(new DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda1(this, 0));
            } catch (Throwable th) {
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
                throw th;
            }
        }

        private void loadCache(Runnable runnable) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new ImageUpdater$$ExternalSyntheticLambda1(this, messagesStorage, runnable, 20));
        }

        private void saveCache() {
            if (this.savingCache) {
                return;
            }
            this.savingCache = true;
            long j = this.cacheTime;
            String str = this.lastOffset;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            ArrayList arrayList = new ArrayList();
            int iM = 0;
            while (iM < this.bots.size()) {
                iM = MessagesController$$ExternalSyntheticOutline2.m(this.bots.get(iM).id, arrayList, iM, 1);
            }
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new PhotoViewer$$ExternalSyntheticLambda22((Object) this, (Object) messagesStorage, (Object) arrayList, j, str2, 4));
        }

        public void load() {
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            if (!this.cacheLoaded) {
                loadCache(new DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda1(this, 1));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.lastOffset;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpopularappbots, new UndoView$$ExternalSyntheticLambda0(this, 8));
        }
    }

    public DialogsBotsAdapter(RecyclerListView recyclerListView, Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(recyclerListView, context, i, 0, true, null, resourcesProvider);
        this.searchMine = new ArrayList<>();
        this.searchGlobal = new ArrayList<>();
        this.searchMessages = new ArrayList<>();
        final int i3 = 0;
        this.searchMessagesRunnable = new Runnable(this) {
            public final DialogsBotsAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$7();
                        break;
                    default:
                        this.f$0.lambda$new$0();
                        break;
                }
            }
        };
        this.first = true;
        this.openBotCallback = new PasscodeView$$ExternalSyntheticLambda8(this, 4);
        this.fillItems = new EmojiView$$ExternalSyntheticLambda18(this, 11);
        this.context = context;
        this.currentAccount = i;
        this.folderId = i2;
        this.resourcesProvider = resourcesProvider;
        this.showOnlyPopular = z;
        final int i4 = 1;
        this.popular = new PopularBots(i, new Runnable(this) {
            public final DialogsBotsAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$7();
                        break;
                    default:
                        this.f$0.lambda$new$0();
                        break;
                }
            }
        });
        this.infoText = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AppsTabInfo), new ImageUpdater$$ExternalSyntheticLambda1(this, resourcesProvider, context, 19)), true);
        update(false);
        MediaDataController.getInstance(i).loadHints(true);
    }

    public void lambda$new$0() {
        update(true);
    }

    public static void lambda$new$1(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void lambda$new$2(Theme.ResourcesProvider resourcesProvider, final Context context) {
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.AppsTabInfoText), resourcesProvider, new SharedMediaLayout$$ExternalSyntheticLambda1(alertDialogArr, 1)));
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
        alertDialogArr[0] = new AlertDialog.Builder(context, 0, resourcesProvider).setTitle(LocaleController.getString(R.string.AppsTabInfoTitle)).setMessage(spannableStringBuilderReplaceTags).setPositiveButton(LocaleController.getString(R.string.AppsTabInfoButton), null).show();
    }

    public void lambda$new$7() {
        searchMessages(false);
    }

    public void lambda$searchMessages$3(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject) {
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
                ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.Message message = arrayList.get(i2);
                    i2++;
                    MessageObject messageObject = new MessageObject(this.currentAccount, message, false, true);
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

    public void lambda$searchMessages$4(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Painting$$ExternalSyntheticLambda7(this, i, tL_messages_searchGlobal, z, tLObject, 2));
    }

    public void lambda$searchMessages$5(int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z) {
        if (i == this.searchBotsId && TextUtils.equals(tL_messages_searchGlobal.q, this.query)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new VoIPService$$ExternalSyntheticLambda89(this, i, tL_messages_searchGlobal, z, 1));
        }
    }

    public void lambda$searchMessages$6(TLRPC.TL_contacts_search tL_contacts_search, TLRPC.TL_contacts_found tL_contacts_found, TLRPC.TL_error tL_error) {
        TLRPC.User user;
        TLRPC.User user2;
        if (!TextUtils.equals(tL_contacts_search.q, this.query) || TextUtils.isEmpty(this.query)) {
            return;
        }
        this.loadingBots = false;
        if (tL_contacts_found != null) {
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_contacts_found.users, tL_contacts_found.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(tL_contacts_found.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_contacts_found.chats, false);
        } else {
            tL_contacts_found = null;
        }
        HashSet hashSet = new HashSet();
        this.searchMine.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList = tL_contacts_found.my_results;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Peer peer = arrayList.get(i);
                i++;
                TLRPC.Peer peer2 = peer;
                if ((peer2 instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peer2.user_id))) != null && user2.bot && !hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    this.searchMine.add(user2);
                }
            }
        }
        this.searchGlobal.clear();
        if (tL_contacts_found != null) {
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.results;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                TLRPC.Peer peer3 = arrayList2.get(i2);
                i2++;
                TLRPC.Peer peer4 = peer3;
                if ((peer4 instanceof TLRPC.TL_peerUser) && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peer4.user_id))) != null && user.bot && !hashSet.contains(Long.valueOf(user.id))) {
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

    private void searchMessages(boolean z) {
        this.loadingMessages = true;
        int i = this.searchBotsId + 1;
        this.searchBotsId = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
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
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            MessageObject messageObject = (MessageObject) zzin.m(1, this.searchMessages);
            tL_messages_searchGlobal.offset_rate = this.nextRate;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            if (messageObject.messageOwner.peer_id == null) {
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.messageOwner.peer_id);
            }
        }
        AndroidUtilities.runOnUIThread(new ConnectionsManager$$ExternalSyntheticLambda12(this, i, tL_messages_searchGlobal, z, 2), z ? 800L : 0L);
        if (z) {
            return;
        }
        this.loadingBots = true;
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.limit = 30;
        tL_contacts_search.bots = true;
        tL_contacts_search.q = this.query;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_contacts_search, new AiTonesController$$ExternalSyntheticLambda0(), new ScrimOptions$$ExternalSyntheticLambda2(3, this, tL_contacts_search));
    }

    public void toggleExpandedMyBots(View view) {
        this.expandedMyBots = !this.expandedMyBots;
        update(true);
    }

    public void toggleExpandedSearchBots(View view) {
        this.expandedSearchBots = !this.expandedSearchBots;
        update(true);
    }

    public boolean atTop() {
        if (this.listView == null) {
            return false;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAdapterPosition(this.listView.getChildAt(i)) == 0) {
                return true;
            }
        }
        return false;
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

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
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
                    final int i2 = 0;
                    arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchApps), LocaleController.getString(this.expandedSearchBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener(this) {
                        public final DialogsBotsAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    this.f$0.toggleExpandedSearchBots(view);
                                    break;
                                default:
                                    this.f$0.toggleExpandedMyBots(view);
                                    break;
                            }
                        }
                    }));
                }
                int size = arrayList2.size();
                if (!this.expandedSearchBots && !this.searchMessages.isEmpty() && !this.showOnlyPopular) {
                    size = Math.min(5, size);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(UItem.asProfileCell((TLObject) arrayList2.get(i3)).withOpenButton(this.openBotCallback));
                }
            }
            if (this.searchMessages.isEmpty() || this.showOnlyPopular) {
                return;
            }
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchMessages)));
            ArrayList<MessageObject> arrayList3 = this.searchMessages;
            int size2 = arrayList3.size();
            while (i < size2) {
                MessageObject messageObject = arrayList3.get(i);
                i++;
                arrayList.add(UItem.asSearchMessage(messageObject));
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
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList4.get(i4).peer)));
                if (user != null && user.bot) {
                    arrayList5.add(user);
                }
            }
        }
        this.topPeersStart = arrayList.size();
        if (!arrayList5.isEmpty() && !this.showOnlyPopular) {
            if (arrayList5.size() > 5) {
                final int i5 = 1;
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(this.expandedMyBots ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener(this) {
                    public final DialogsBotsAdapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                this.f$0.toggleExpandedSearchBots(view);
                                break;
                            default:
                                this.f$0.toggleExpandedMyBots(view);
                                break;
                        }
                    }
                }));
            } else {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsMine)));
            }
            for (int i6 = 0; i6 < arrayList5.size() && (i6 < 5 || this.expandedMyBots); i6++) {
                TLRPC.User user2 = (TLRPC.User) arrayList5.get(i6);
                if (!hashSet.contains(Long.valueOf(user2.id))) {
                    hashSet.add(Long.valueOf(user2.id));
                    arrayList.add(UItem.asProfileCell(user2).accent().withOpenButton(this.openBotCallback));
                }
            }
        }
        hashSet.clear();
        this.topPeersEnd = arrayList.size();
        if (this.popular.bots.isEmpty()) {
            PopularBots popularBots = this.popular;
            if (popularBots.loading || !popularBots.endReached) {
                if (!this.showOnlyPopular) {
                    arrayList.add(UItem.asFlicker(30));
                }
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
        } else {
            if (!this.showOnlyPopular) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchAppsPopular)));
            }
            int i7 = 0;
            while (i < this.popular.bots.size()) {
                TLRPC.User user3 = this.popular.bots.get(i);
                if (!hashSet.contains(Long.valueOf(user3.id))) {
                    hashSet.add(Long.valueOf(user3.id));
                    arrayList.add(UItem.asProfileCell(user3).accent().red().withOpenButton(this.openBotCallback));
                    i7 = 1;
                }
                i++;
            }
            PopularBots popularBots2 = this.popular;
            if (popularBots2.loading || !popularBots2.endReached) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            i = i7;
        }
        if (i != 0) {
            arrayList.add(UItem.asShadow(this.infoText));
        }
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

    public void hideKeyboard() {
    }

    public void openBot(TLRPC.User user) {
        MessagesController.getInstance(this.currentAccount).openApp(user, 0);
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
