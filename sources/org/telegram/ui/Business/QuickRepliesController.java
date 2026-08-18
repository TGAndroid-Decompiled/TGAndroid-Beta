package org.telegram.ui.Business;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

public class QuickRepliesController {
    private static volatile QuickRepliesController[] Instance = new QuickRepliesController[4];
    private static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    private boolean loaded;
    private boolean loading;
    public final ArrayList replies = new ArrayList();
    public final ArrayList localReplies = new ArrayList();
    private ArrayList filtered = new ArrayList();

    public static void lambda$deleteReplies$12() {
    }

    public static void lambda$renameReply$10() {
    }

    public static void lambda$reorder$8() {
    }

    public static boolean isSpecial(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static QuickRepliesController getInstance(int i) {
        QuickRepliesController quickRepliesController = Instance[i];
        if (quickRepliesController == null) {
            synchronized (lockObjects[i]) {
                try {
                    quickRepliesController = Instance[i];
                    if (quickRepliesController == null) {
                        QuickRepliesController[] quickRepliesControllerArr = Instance;
                        QuickRepliesController quickRepliesController2 = new QuickRepliesController(i);
                        quickRepliesControllerArr[i] = quickRepliesController2;
                        quickRepliesController = quickRepliesController2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return quickRepliesController;
    }

    private QuickRepliesController(int i) {
        this.currentAccount = i;
    }

    public class QuickReply {
        public int id;
        public boolean local;
        public HashSet localIds = new HashSet();
        public int messagesCount;
        public String name;
        public int order;
        public MessageObject topMessage;
        public int topMessageId;

        public QuickReply() {
        }

        public int getTopMessageId() {
            MessageObject messageObject = this.topMessage;
            return messageObject != null ? messageObject.getId() : this.topMessageId;
        }

        public int getMessagesCount() {
            return this.local ? this.localIds.size() : this.messagesCount;
        }

        public boolean isSpecial() {
            return QuickRepliesController.isSpecial(this.name);
        }
    }

    public boolean canAddNew() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.replies.size(); i3++) {
            i = (i != 0 || "hello".equalsIgnoreCase(((QuickReply) this.replies.get(i3)).name)) ? 1 : 0;
            i2 = (i2 != 0 || "away".equalsIgnoreCase(((QuickReply) this.replies.get(i3)).name)) ? 1 : 0;
            if (i != 0 && i2 != 0) {
                break;
            }
        }
        return (this.replies.size() + (i ^ 1)) + (i2 ^ 1) < MessagesController.getInstance(this.currentAccount).quickRepliesLimit;
    }

    public ArrayList getFilteredReplies() {
        this.filtered.clear();
        for (int i = 0; i < this.replies.size(); i++) {
            if (!((QuickReply) this.replies.get(i)).isSpecial()) {
                this.filtered.add((QuickReply) this.replies.get(i));
            }
        }
        return this.filtered;
    }

    public void load() {
        load(true, null);
    }

    private void load(boolean z) {
        load(z, null);
    }

    private void load(boolean z, final Runnable runnable) {
        long jM;
        TLRPC.Message message;
        if (this.loading || this.loaded) {
            return;
        }
        this.loading = true;
        if (z) {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$load$1(messagesStorage, clientUserId, runnable);
                }
            });
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        tL_messages_getQuickReplies.hash = 0L;
        for (int i = 0; i < this.replies.size(); i++) {
            QuickReply quickReply = (QuickReply) this.replies.get(i);
            long jCalcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, quickReply.id);
            tL_messages_getQuickReplies.hash = jCalcHash;
            String str = quickReply.name;
            if (str == null) {
                jM = 0;
            } else {
                String strSubstring = Utilities.MD5(str).substring(0, 16);
                jM = QuickRepliesController$$ExternalSyntheticBackport1.m(strSubstring, 0, strSubstring.length(), 16);
            }
            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, jM);
            tL_messages_getQuickReplies.hash = jCalcHash2;
            MessageObject messageObject = quickReply.topMessage;
            long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, messageObject == null ? 0L : messageObject.getId());
            tL_messages_getQuickReplies.hash = jCalcHash3;
            MessageObject messageObject2 = quickReply.topMessage;
            if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (message.flags & 32768) != 0) {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, message.edit_date);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, 0L);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getQuickReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$load$3(tLObject, tL_error);
            }
        });
    }

    public void lambda$load$1(MessagesStorage messagesStorage, long j, final Runnable runnable) throws Throwable {
        ?? r6;
        ?? r9;
        ?? ByteBufferValue;
        ?? r1 = 0;
        int i = 1;
        final ArrayList arrayList = new ArrayList();
        final ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            ?? QueryFinalized = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
            while (QueryFinalized.next()) {
                try {
                    QuickReply quickReply = new QuickReply();
                    quickReply.id = QueryFinalized.intValue(0);
                    quickReply.name = QueryFinalized.stringValue(1);
                    quickReply.order = QueryFinalized.intValue(2);
                    quickReply.messagesCount = QueryFinalized.intValue(3);
                    arrayList.add(quickReply);
                } catch (Exception e) {
                    e = e;
                    r6 = QueryFinalized;
                    try {
                        FileLog.e(e);
                        if (r6 != 0) {
                            r9 = r6;
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$load$0(arrayList2, arrayList3, arrayList, runnable);
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        if (r6 != 0) {
                            r6.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r6 = QueryFinalized;
                    if (r6 != 0) {
                        r6.dispose();
                    }
                    throw th;
                }
            }
            QueryFinalized.dispose();
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList arrayList5 = new ArrayList();
            int i2 = 0;
            QueryFinalized = QueryFinalized;
            while (i2 < arrayList.size()) {
                QuickReply quickReply2 = (QuickReply) arrayList.get(i2);
                Object[] objArr = new Object[i];
                objArr[r1] = Integer.valueOf(quickReply2.id);
                ?? QueryFinalized2 = database.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                if (QueryFinalized2.next() && (ByteBufferValue = QueryFinalized2.byteBufferValue(r1)) != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(ByteBufferValue, ByteBufferValue.readInt32(r1), r1);
                    TLdeserialize.send_state = QueryFinalized2.intValue(i);
                    TLdeserialize.readAttachPath(ByteBufferValue, j);
                    ByteBufferValue.reuse();
                    TLdeserialize.id = QueryFinalized2.intValue(2);
                    TLdeserialize.date = QueryFinalized2.intValue(3);
                    TLdeserialize.flags |= 1073741824;
                    TLdeserialize.quick_reply_shortcut_id = QueryFinalized2.intValue(4);
                    TLdeserialize.ttl = QueryFinalized2.intValue(5);
                    MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
                    quickReply2.topMessage = messageObject;
                    quickReply2.topMessageId = TLdeserialize.id;
                    messageObject.generateThumbs(false);
                    quickReply2.topMessage.applyQuickReply(quickReply2.name, quickReply2.id);
                }
                QueryFinalized2.dispose();
                i2++;
                r1 = 0;
                i = 1;
                QueryFinalized = QueryFinalized2;
            }
            if (!arrayList5.isEmpty()) {
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            r9 = QueryFinalized;
            if (!arrayList4.isEmpty()) {
                messagesStorage.getUsersInternal(arrayList4, arrayList2);
                r9 = QueryFinalized;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = 0;
        } catch (Throwable th3) {
            th = th3;
            r6 = 0;
        }
        r9.dispose();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$load$0(arrayList2, arrayList3, arrayList, runnable);
            }
        });
    }

    public void lambda$load$0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        this.loading = false;
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        this.replies.clear();
        this.replies.addAll(arrayList3);
        if (runnable != null) {
            runnable.run();
        } else {
            load(false);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$load$3(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$load$2(tLObject);
            }
        });
    }

    public void lambda$load$2(TLObject tLObject) {
        TLRPC.Message message;
        ArrayList arrayList = null;
        if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
            TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_quickReplies.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_quickReplies.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < tL_messages_quickReplies.quick_replies.size(); i++) {
                TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i);
                QuickReply quickReply = new QuickReply();
                quickReply.id = tL_quickReply.shortcut_id;
                quickReply.name = tL_quickReply.shortcut;
                quickReply.messagesCount = tL_quickReply.count;
                quickReply.topMessageId = tL_quickReply.top_message;
                quickReply.order = i;
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messages_quickReplies.messages.size()) {
                        message = null;
                        break;
                    }
                    message = tL_messages_quickReplies.messages.get(i2);
                    if (message.id == tL_quickReply.top_message) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (message != null) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, message, false, true);
                    quickReply.topMessage = messageObject;
                    messageObject.generateThumbs(false);
                    quickReply.topMessage.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                }
                arrayList2.add(quickReply);
            }
            arrayList = arrayList2;
        } else {
            boolean z = tLObject instanceof TLRPC.TL_messages_quickRepliesNotModified;
        }
        this.loading = false;
        if (arrayList != null) {
            this.replies.clear();
            this.replies.addAll(arrayList);
        }
        this.loaded = true;
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    private void ensureLoaded(Runnable runnable) {
        if (this.loaded) {
            runnable.run();
        } else {
            load(true, runnable);
        }
    }

    private void saveToCache() {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveToCache$4(messagesStorage);
            }
        });
    }

    public void lambda$saveToCache$4(MessagesStorage messagesStorage) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            database.executeFast("DELETE FROM business_replies").stepThis().dispose();
            sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
            for (int i = 0; i < this.replies.size(); i++) {
                QuickReply quickReply = (QuickReply) this.replies.get(i);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, quickReply.id);
                sQLitePreparedStatementExecuteFast.bindString(2, quickReply.name);
                sQLitePreparedStatementExecuteFast.bindInteger(3, quickReply.order);
                sQLitePreparedStatementExecuteFast.bindInteger(4, quickReply.messagesCount);
                sQLitePreparedStatementExecuteFast.step();
            }
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
        }
    }

    private void updateOrder() {
        for (int i = 0; i < this.replies.size(); i++) {
            ((QuickReply) this.replies.get(i)).order = i;
        }
    }

    private void addReply(final QuickReply quickReply) {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$addReply$5(messagesStorage, quickReply);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$addReply$5(MessagesStorage messagesStorage, QuickReply quickReply) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, quickReply.id);
                sQLitePreparedStatementExecuteFast.bindString(2, quickReply.name);
                sQLitePreparedStatementExecuteFast.bindInteger(3, quickReply.order);
                sQLitePreparedStatementExecuteFast.bindInteger(4, quickReply.messagesCount);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public QuickReply findReply(long j) {
        for (QuickReply quickReply : this.replies) {
            if (quickReply.id == j) {
                return quickReply;
            }
        }
        return null;
    }

    public QuickReply findReply(String str) {
        for (QuickReply quickReply : this.replies) {
            if (TextUtils.equals(str, quickReply.name)) {
                return quickReply;
            }
        }
        return null;
    }

    public QuickReply findLocalReply(String str) {
        for (QuickReply quickReply : this.localReplies) {
            if (TextUtils.equals(str, quickReply.name)) {
                return quickReply;
            }
        }
        return null;
    }

    public boolean isNameBusy(String str, int i) {
        QuickReply quickReplyFindReply = findReply(str);
        return (quickReplyFindReply == null || quickReplyFindReply.id == i) ? false : true;
    }

    public void reorder() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.replies.size(); i++) {
            arrayList.add(Integer.valueOf(((QuickReply) this.replies.get(i)).id));
        }
        Collections.sort(this.replies, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return QuickRepliesController.lambda$reorder$7((QuickRepliesController.QuickReply) obj, (QuickRepliesController.QuickReply) obj2);
            }
        });
        for (int i2 = 0; i2 < this.replies.size(); i2++) {
            if (((QuickReply) this.replies.get(i2)).id != ((Integer) arrayList.get(i2)).intValue()) {
                TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                for (int i3 = 0; i3 < this.replies.size(); i3++) {
                    tL_messages_reorderQuickReplies.order.add(Integer.valueOf(((QuickReply) this.replies.get(i3)).id));
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderQuickReplies, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        QuickRepliesController.lambda$reorder$9(tLObject, tL_error);
                    }
                });
                saveToCache();
                return;
            }
        }
    }

    public static int lambda$reorder$7(QuickReply quickReply, QuickReply quickReply2) {
        return quickReply.order - quickReply2.order;
    }

    public static void lambda$reorder$9(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$reorder$8();
            }
        });
    }

    public void renameReply(int i, String str) {
        QuickReply quickReplyFindReply = findReply(i);
        if (quickReplyFindReply == null) {
            return;
        }
        quickReplyFindReply.name = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editQuickReplyShortcut, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                QuickRepliesController.lambda$renameReply$11(tLObject, tL_error);
            }
        });
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$renameReply$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$renameReply$10();
            }
        });
    }

    public void deleteReplies(final ArrayList arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            if (findReply(((Integer) arrayList.get(i)).intValue()) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            QuickReply quickReplyFindReply = findReply(((Integer) arrayList.get(i2)).intValue());
            this.replies.remove(quickReplyFindReply);
            deleteLocalReply(quickReplyFindReply.name);
            TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
            tL_messages_deleteQuickReplyShortcut.shortcut_id = quickReplyFindReply.id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteQuickReplyShortcut, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    QuickRepliesController.lambda$deleteReplies$13(tLObject, tL_error);
                }
            });
            if ("hello".equals(quickReplyFindReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
                if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                    MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, true);
                }
            } else if ("away".equals(quickReplyFindReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                TLRPC.UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
                if (userFull2 != null) {
                    userFull2.flags2 &= -9;
                    userFull2.business_away_message = null;
                    MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull2, true);
                }
            }
        }
        saveToCache();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$deleteReplies$14(messagesStorage, arrayList);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$deleteReplies$13(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$deleteReplies$12();
            }
        });
    }

    public static void lambda$deleteReplies$14(MessagesStorage messagesStorage, ArrayList arrayList) {
        try {
            messagesStorage.getDatabase().executeFast(String.format("DELETE FROM quick_replies_messages WHERE topic_id IN (%s)", TextUtils.join(", ", arrayList))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void updateTopMessage(final QuickReply quickReply) {
        if (quickReply == null) {
            return;
        }
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$updateTopMessage$16(messagesStorage, quickReply, clientUserId);
            }
        });
    }

    public void lambda$updateTopMessage$16(MessagesStorage messagesStorage, final QuickReply quickReply, long j) throws Throwable {
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        MessageObject messageObject = null;
        sQLiteCursor = null;
        try {
            ArrayList<Long> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            SQLiteCursor sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(quickReply.id));
            try {
                if (sQLiteCursorQueryFinalized.next() && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    messageTLdeserialize.send_state = sQLiteCursorQueryFinalized.intValue(1);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j);
                    nativeByteBufferByteBufferValue.reuse();
                    messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(2);
                    messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(3);
                    messageTLdeserialize.flags |= 1073741824;
                    messageTLdeserialize.quick_reply_shortcut_id = sQLiteCursorQueryFinalized.intValue(4);
                    messageTLdeserialize.ttl = sQLiteCursorQueryFinalized.intValue(5);
                    MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList, arrayList2, null);
                    try {
                        messageObject = new MessageObject(this.currentAccount, messageTLdeserialize, false, true);
                    } catch (Exception e) {
                        e = e;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
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
                final MessageObject messageObject2 = messageObject;
                sQLiteCursorQueryFinalized.dispose();
                final ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                final ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
                if (!arrayList2.isEmpty()) {
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList4);
                }
                if (!arrayList.isEmpty()) {
                    messagesStorage.getUsersInternal(arrayList, arrayList3);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateTopMessage$15(arrayList3, arrayList4, quickReply, messageObject2);
                    }
                });
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void lambda$updateTopMessage$15(ArrayList arrayList, ArrayList arrayList2, QuickReply quickReply, MessageObject messageObject) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        quickReply.topMessage = messageObject;
        if (messageObject != null) {
            messageObject.applyQuickReply(quickReply.name, quickReply.id);
        }
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public boolean processUpdate(final TLRPC.Update update, final String str, final int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            final TLRPC.Message message = ((TL_update.TL_updateQuickReplyMessage) update).message;
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processUpdate$17(message, str, i);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processUpdate$18(update);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processUpdate$19(update);
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processUpdate$21(update);
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        ensureLoaded(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdate$22(update);
            }
        });
        return true;
    }

    public void lambda$processUpdate$17(TLRPC.Message message, String str, int i) {
        if ((message.flags & 1073741824) != 0) {
            QuickReply quickReplyFindReply = findReply(message.quick_reply_shortcut_id);
            if (quickReplyFindReply == null) {
                QuickReply quickReply = new QuickReply();
                quickReply.id = message.quick_reply_shortcut_id;
                quickReply.topMessageId = message.id;
                MessageObject messageObject = new MessageObject(this.currentAccount, message, false, true);
                quickReply.topMessage = messageObject;
                messageObject.generateThumbs(false);
                if (str != null) {
                    quickReply.name = str;
                    deleteLocalReply(str);
                }
                quickReply.topMessage.applyQuickReply(str, i);
                quickReply.messagesCount = 1;
                this.replies.add(quickReply);
                updateOrder();
                addReply(quickReply);
            } else {
                int i2 = quickReplyFindReply.topMessageId;
                int i3 = message.id;
                if (i2 == i3) {
                    quickReplyFindReply.topMessageId = i3;
                    MessageObject messageObject2 = new MessageObject(this.currentAccount, message, false, true);
                    quickReplyFindReply.topMessage = messageObject2;
                    messageObject2.generateThumbs(false);
                    saveToCache();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                } else if ((message.flags & 32768) == 0) {
                    quickReplyFindReply.messagesCount++;
                    saveToCache();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
            }
        }
        if (str == null && i == 0) {
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            arrayList.add(message);
            MessagesStorage.getInstance(this.currentAccount).putMessages(arrayList, true, true, false, DownloadController.getInstance(this.currentAccount).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            arrayList2.add(new MessageObject(this.currentAccount, message, true, true));
            MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(clientUserId, arrayList2, 5);
        }
    }

    public void lambda$processUpdate$18(TLRPC.Update update) {
        QuickReply quickReply;
        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
        ArrayList arrayList2 = new ArrayList(this.replies);
        this.replies.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    quickReply = null;
                    break;
                } else {
                    if (((QuickReply) arrayList2.get(i2)).id == tL_quickReply.shortcut_id) {
                        quickReply = (QuickReply) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (quickReply == null) {
                quickReply = new QuickReply();
            }
            quickReply.id = tL_quickReply.shortcut_id;
            quickReply.name = tL_quickReply.shortcut;
            quickReply.messagesCount = tL_quickReply.count;
            quickReply.order = i;
            quickReply.topMessageId = tL_quickReply.top_message;
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                quickReply.topMessage = null;
            }
            this.replies.add(quickReply);
            deleteLocalReply(quickReply.name);
        }
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$processUpdate$19(TLRPC.Update update) {
        TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
        QuickReply quickReplyFindReply = findReply(tL_quickReply.shortcut_id);
        if (quickReplyFindReply != null) {
            quickReplyFindReply.name = tL_quickReply.shortcut;
            quickReplyFindReply.messagesCount = tL_quickReply.count;
            quickReplyFindReply.topMessageId = tL_quickReply.top_message;
            MessageObject messageObject = quickReplyFindReply.topMessage;
            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                quickReplyFindReply.topMessage = null;
                updateTopMessage(quickReplyFindReply);
                return;
            }
        } else {
            QuickReply quickReply = new QuickReply();
            quickReply.id = tL_quickReply.shortcut_id;
            quickReply.name = tL_quickReply.shortcut;
            quickReply.messagesCount = tL_quickReply.count;
            quickReply.topMessageId = tL_quickReply.top_message;
            updateOrder();
            this.replies.add(quickReply);
            deleteLocalReply(quickReply.name);
        }
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$processUpdate$21(TLRPC.Update update) {
        QuickReply quickReplyFindReply = findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
        if (quickReplyFindReply != null) {
            this.replies.remove(quickReplyFindReply);
            deleteLocalReply(quickReplyFindReply.name);
            final int i = quickReplyFindReply.id;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.lambda$processUpdate$20(messagesStorage, i);
                }
            });
            saveToCache();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public static void lambda$processUpdate$20(MessagesStorage messagesStorage, int i) {
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i).stepThis().dispose();
            database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processUpdate$22(TLRPC.Update update) {
        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
        QuickReply quickReplyFindReply = findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
        if (quickReplyFindReply != null) {
            int size = quickReplyFindReply.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
            quickReplyFindReply.messagesCount = size;
            if (size <= 0) {
                this.replies.remove(quickReplyFindReply);
            }
            if (tL_updateDeleteQuickReplyMessages.messages.contains(Integer.valueOf(quickReplyFindReply.getTopMessageId())) || quickReplyFindReply.topMessage == null) {
                quickReplyFindReply.topMessage = null;
                updateTopMessage(quickReplyFindReply);
            } else {
                saveToCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
            }
        }
    }

    public void checkLocalMessages(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) it.next();
            if (messageObject.isSending() && findReply(messageObject.getQuickReplyId()) == null && messageObject.getQuickReplyName() != null && findReply(messageObject.getQuickReplyName()) == null) {
                QuickReply quickReplyFindLocalReply = findLocalReply(messageObject.getQuickReplyName());
                if (quickReplyFindLocalReply == null) {
                    quickReplyFindLocalReply = new QuickReply();
                    quickReplyFindLocalReply.local = true;
                    quickReplyFindLocalReply.name = messageObject.getQuickReplyName();
                    quickReplyFindLocalReply.id = -1;
                    quickReplyFindLocalReply.topMessage = messageObject;
                    quickReplyFindLocalReply.topMessageId = messageObject.getId();
                    this.localReplies.add(quickReplyFindLocalReply);
                }
                quickReplyFindLocalReply.localIds.add(Integer.valueOf(messageObject.getId()));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkLocalMessages$23();
                    }
                });
            }
        }
    }

    public void lambda$checkLocalMessages$23() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void deleteLocalReply(String str) {
        QuickReply quickReplyFindLocalReply = findLocalReply(str);
        if (quickReplyFindLocalReply != null) {
            this.localReplies.remove(quickReplyFindLocalReply);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public void deleteLocalMessages(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            deleteLocalMessage(((Integer) it.next()).intValue());
        }
    }

    public void deleteLocalMessage(int i) {
        for (int i2 = 0; i2 < this.localReplies.size(); i2++) {
            QuickReply quickReply = (QuickReply) this.localReplies.get(i2);
            if (quickReply.localIds.contains(Integer.valueOf(i))) {
                quickReply.localIds.remove(Integer.valueOf(i));
                if (quickReply.getMessagesCount() <= 0) {
                    this.localReplies.remove(quickReply);
                }
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            }
        }
    }

    public boolean hasReplies() {
        return !this.replies.isEmpty();
    }

    public void sendQuickReplyTo(long j, final QuickReply quickReply) {
        if (quickReply == null) {
            return;
        }
        final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_messages_sendQuickReplyMessages.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        tL_messages_sendQuickReplyMessages.shortcut_id = quickReply.id;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendQuickReplyTo$27(messagesStorage, quickReply, tL_messages_sendQuickReplyMessages);
            }
        });
    }

    public void lambda$sendQuickReplyTo$27(MessagesStorage messagesStorage, final QuickReply quickReply, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages) {
        final ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(quickReply.id));
                while (sQLiteCursorQueryFinalized.next()) {
                    arrayList.add(Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0)));
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$sendQuickReplyTo$26(arrayList, quickReply, tL_messages_sendQuickReplyMessages);
                    }
                });
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendQuickReplyTo$26(arrayList, quickReply, tL_messages_sendQuickReplyMessages);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void lambda$sendQuickReplyTo$26(final ArrayList arrayList, QuickReply quickReply, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages) {
        if (arrayList.isEmpty() || arrayList.size() < quickReply.getMessagesCount()) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = quickReply.id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$sendQuickReplyTo$25(arrayList, tL_messages_sendQuickReplyMessages, tLObject, tL_error);
                }
            });
        } else {
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
        }
    }

    public void lambda$sendQuickReplyTo$25(final ArrayList arrayList, final TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendQuickReplyTo$24(tLObject, arrayList, tL_messages_sendQuickReplyMessages, tL_error);
            }
        });
    }

    public void lambda$sendQuickReplyTo$24(TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.TL_messages_messages) tLObject).messages;
            arrayList.clear();
            Iterator<TLRPC.Message> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().id));
            }
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_sendQuickReplyMessages, null);
            return;
        }
        FileLog.e("received " + tLObject + " " + tL_error + " on getQuickReplyMessages when trying to send quick reply");
    }
}
