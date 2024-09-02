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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessAwayMessage;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessGreetingMessage;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_deleteQuickReplyShortcut;
import org.telegram.tgnet.TLRPC$TL_messages_editQuickReplyShortcut;
import org.telegram.tgnet.TLRPC$TL_messages_getQuickReplies;
import org.telegram.tgnet.TLRPC$TL_messages_getQuickReplyMessages;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_quickReplies;
import org.telegram.tgnet.TLRPC$TL_messages_quickRepliesNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_reorderQuickReplies;
import org.telegram.tgnet.TLRPC$TL_messages_sendQuickReplyMessages;
import org.telegram.tgnet.TLRPC$TL_quickReply;
import org.telegram.tgnet.TLRPC$TL_updateDeleteQuickReply;
import org.telegram.tgnet.TLRPC$TL_updateDeleteQuickReplyMessages;
import org.telegram.tgnet.TLRPC$TL_updateNewQuickReply;
import org.telegram.tgnet.TLRPC$TL_updateQuickReplies;
import org.telegram.tgnet.TLRPC$TL_updateQuickReplyMessage;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.Business.QuickRepliesController;

public class QuickRepliesController {
    private static volatile QuickRepliesController[] Instance = new QuickRepliesController[4];
    private static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    private boolean loaded;
    private boolean loading;
    public final ArrayList<QuickReply> replies = new ArrayList<>();
    public final ArrayList<QuickReply> localReplies = new ArrayList<>();
    private ArrayList<QuickReply> filtered = new ArrayList<>();

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
                quickRepliesController = Instance[i];
                if (quickRepliesController == null) {
                    QuickRepliesController[] quickRepliesControllerArr = Instance;
                    QuickRepliesController quickRepliesController2 = new QuickRepliesController(i);
                    quickRepliesControllerArr[i] = quickRepliesController2;
                    quickRepliesController = quickRepliesController2;
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
        public HashSet<Integer> localIds = new HashSet<>();
        public int messagesCount;
        public String name;
        public int order;
        public MessageObject topMessage;
        public int topMessageId;

        public QuickReply(QuickRepliesController quickRepliesController) {
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
            i = (i != 0 || "hello".equalsIgnoreCase(this.replies.get(i3).name)) ? 1 : 0;
            i2 = (i2 != 0 || "away".equalsIgnoreCase(this.replies.get(i3).name)) ? 1 : 0;
            if (i != 0 && i2 != 0) {
                break;
            }
        }
        return (this.replies.size() + (i ^ 1)) + (i2 ^ 1) < MessagesController.getInstance(this.currentAccount).quickRepliesLimit;
    }

    public ArrayList<QuickReply> getFilteredReplies() {
        this.filtered.clear();
        for (int i = 0; i < this.replies.size(); i++) {
            if (!this.replies.get(i).isSpecial()) {
                this.filtered.add(this.replies.get(i));
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
        TLRPC$Message tLRPC$Message;
        if (this.loading || this.loaded) {
            return;
        }
        this.loading = true;
        if (z) {
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$load$1(messagesStorage, clientUserId, runnable);
                }
            });
            return;
        }
        TLRPC$TL_messages_getQuickReplies tLRPC$TL_messages_getQuickReplies = new TLRPC$TL_messages_getQuickReplies();
        tLRPC$TL_messages_getQuickReplies.hash = 0L;
        for (int i = 0; i < this.replies.size(); i++) {
            QuickReply quickReply = this.replies.get(i);
            long calcHash = MediaDataController.calcHash(tLRPC$TL_messages_getQuickReplies.hash, quickReply.id);
            tLRPC$TL_messages_getQuickReplies.hash = calcHash;
            String str = quickReply.name;
            long calcHash2 = MediaDataController.calcHash(calcHash, str == null ? 0L : QuickRepliesController$$ExternalSyntheticBackport0.m(r6, 0, Utilities.MD5(str).substring(0, 16).length(), 16));
            tLRPC$TL_messages_getQuickReplies.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, quickReply.topMessage == null ? 0L : r6.getId());
            tLRPC$TL_messages_getQuickReplies.hash = calcHash3;
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null && (tLRPC$Message = messageObject.messageOwner) != null && (tLRPC$Message.flags & 32768) != 0) {
                tLRPC$TL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, tLRPC$Message.edit_date);
            } else {
                tLRPC$TL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, 0L);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getQuickReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                QuickRepliesController.this.lambda$load$3(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$load$1(org.telegram.messenger.MessagesStorage r19, long r20, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.QuickRepliesController.lambda$load$1(org.telegram.messenger.MessagesStorage, long, java.lang.Runnable):void");
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

    public void lambda$load$3(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.this.lambda$load$2(tLObject);
            }
        });
    }

    public void lambda$load$2(TLObject tLObject) {
        TLRPC$Message tLRPC$Message;
        ArrayList arrayList = null;
        if (tLObject instanceof TLRPC$TL_messages_quickReplies) {
            TLRPC$TL_messages_quickReplies tLRPC$TL_messages_quickReplies = (TLRPC$TL_messages_quickReplies) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_messages_quickReplies.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_messages_quickReplies.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_messages_quickReplies.users, tLRPC$TL_messages_quickReplies.chats, true, true);
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < tLRPC$TL_messages_quickReplies.quick_replies.size(); i++) {
                TLRPC$TL_quickReply tLRPC$TL_quickReply = tLRPC$TL_messages_quickReplies.quick_replies.get(i);
                QuickReply quickReply = new QuickReply(this);
                quickReply.id = tLRPC$TL_quickReply.shortcut_id;
                quickReply.name = tLRPC$TL_quickReply.shortcut;
                quickReply.messagesCount = tLRPC$TL_quickReply.count;
                quickReply.topMessageId = tLRPC$TL_quickReply.top_message;
                quickReply.order = i;
                int i2 = 0;
                while (true) {
                    if (i2 >= tLRPC$TL_messages_quickReplies.messages.size()) {
                        tLRPC$Message = null;
                        break;
                    }
                    tLRPC$Message = tLRPC$TL_messages_quickReplies.messages.get(i2);
                    if (tLRPC$Message.id == tLRPC$TL_quickReply.top_message) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (tLRPC$Message != null) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, true);
                    quickReply.topMessage = messageObject;
                    messageObject.generateThumbs(false);
                    quickReply.topMessage.applyQuickReply(tLRPC$TL_quickReply.shortcut, tLRPC$TL_quickReply.shortcut_id);
                }
                arrayList2.add(quickReply);
            }
            arrayList = arrayList2;
        } else {
            boolean z = tLObject instanceof TLRPC$TL_messages_quickRepliesNotModified;
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
                QuickRepliesController.this.lambda$saveToCache$4(messagesStorage);
            }
        });
    }

    public void lambda$saveToCache$4(MessagesStorage messagesStorage) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                for (int i = 0; i < this.replies.size(); i++) {
                    QuickReply quickReply = this.replies.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, quickReply.id);
                    sQLitePreparedStatement.bindString(2, quickReply.name);
                    sQLitePreparedStatement.bindInteger(3, quickReply.order);
                    sQLitePreparedStatement.bindInteger(4, quickReply.messagesCount);
                    sQLitePreparedStatement.step();
                }
                if (sQLitePreparedStatement == null) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void updateOrder() {
        for (int i = 0; i < this.replies.size(); i++) {
            this.replies.get(i).order = i;
        }
    }

    private void addReply(final QuickReply quickReply) {
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$addReply$5(MessagesStorage.this, quickReply);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$addReply$5(MessagesStorage messagesStorage, QuickReply quickReply) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, quickReply.id);
                sQLitePreparedStatement.bindString(2, quickReply.name);
                sQLitePreparedStatement.bindInteger(3, quickReply.order);
                sQLitePreparedStatement.bindInteger(4, quickReply.messagesCount);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public QuickReply findReply(long j) {
        Iterator<QuickReply> it = this.replies.iterator();
        while (it.hasNext()) {
            QuickReply next = it.next();
            if (next.id == j) {
                return next;
            }
        }
        return null;
    }

    public QuickReply findReply(String str) {
        Iterator<QuickReply> it = this.replies.iterator();
        while (it.hasNext()) {
            QuickReply next = it.next();
            if (TextUtils.equals(str, next.name)) {
                return next;
            }
        }
        return null;
    }

    public QuickReply findLocalReply(String str) {
        Iterator<QuickReply> it = this.localReplies.iterator();
        while (it.hasNext()) {
            QuickReply next = it.next();
            if (TextUtils.equals(str, next.name)) {
                return next;
            }
        }
        return null;
    }

    public boolean isNameBusy(String str, int i) {
        QuickReply findReply = findReply(str);
        return (findReply == null || findReply.id == i) ? false : true;
    }

    public void reorder() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.replies.size(); i++) {
            arrayList.add(Integer.valueOf(this.replies.get(i).id));
        }
        Collections.sort(this.replies, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$reorder$7;
                lambda$reorder$7 = QuickRepliesController.lambda$reorder$7((QuickRepliesController.QuickReply) obj, (QuickRepliesController.QuickReply) obj2);
                return lambda$reorder$7;
            }
        });
        int i2 = 0;
        while (true) {
            if (i2 >= this.replies.size()) {
                z = false;
                break;
            } else {
                if (this.replies.get(i2).id != ((Integer) arrayList.get(i2)).intValue()) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        if (z) {
            TLRPC$TL_messages_reorderQuickReplies tLRPC$TL_messages_reorderQuickReplies = new TLRPC$TL_messages_reorderQuickReplies();
            for (int i3 = 0; i3 < this.replies.size(); i3++) {
                tLRPC$TL_messages_reorderQuickReplies.order.add(Integer.valueOf(this.replies.get(i3).id));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_reorderQuickReplies, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    QuickRepliesController.lambda$reorder$9(tLObject, tLRPC$TL_error);
                }
            });
            saveToCache();
        }
    }

    public static int lambda$reorder$7(QuickReply quickReply, QuickReply quickReply2) {
        return quickReply.order - quickReply2.order;
    }

    public static void lambda$reorder$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$reorder$8();
            }
        });
    }

    public void renameReply(int i, String str) {
        QuickReply findReply = findReply(i);
        if (findReply == null) {
            return;
        }
        findReply.name = str;
        TLRPC$TL_messages_editQuickReplyShortcut tLRPC$TL_messages_editQuickReplyShortcut = new TLRPC$TL_messages_editQuickReplyShortcut();
        tLRPC$TL_messages_editQuickReplyShortcut.shortcut_id = i;
        tLRPC$TL_messages_editQuickReplyShortcut.shortcut = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_editQuickReplyShortcut, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                QuickRepliesController.lambda$renameReply$11(tLObject, tLRPC$TL_error);
            }
        });
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$renameReply$11(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.lambda$renameReply$10();
            }
        });
    }

    public void deleteReplies(final ArrayList<Integer> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            if (findReply(arrayList.get(i).intValue()) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            QuickReply findReply = findReply(arrayList.get(i2).intValue());
            this.replies.remove(findReply);
            deleteLocalReply(findReply.name);
            TLRPC$TL_messages_deleteQuickReplyShortcut tLRPC$TL_messages_deleteQuickReplyShortcut = new TLRPC$TL_messages_deleteQuickReplyShortcut();
            tLRPC$TL_messages_deleteQuickReplyShortcut.shortcut_id = findReply.id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_deleteQuickReplyShortcut, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    QuickRepliesController.lambda$deleteReplies$13(tLObject, tLRPC$TL_error);
                }
            });
            if ("hello".equals(findReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_updateBusinessGreetingMessage(), null);
                TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
                if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                    MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, true);
                }
            } else if ("away".equals(findReply.name)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_updateBusinessAwayMessage(), null);
                TLRPC$UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
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
                QuickRepliesController.lambda$deleteReplies$14(MessagesStorage.this, arrayList);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public static void lambda$deleteReplies$13(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
            public final void run() {
                QuickRepliesController.this.lambda$updateTopMessage$16(messagesStorage, quickReply, clientUserId);
            }
        });
    }

    public void lambda$updateTopMessage$16(MessagesStorage messagesStorage, final QuickReply quickReply, long j) {
        ArrayList<Long> arrayList;
        ArrayList arrayList2;
        SQLiteCursor queryFinalized;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        r0 = null;
        MessageObject messageObject = null;
        sQLiteCursor = null;
        try {
            try {
                arrayList = new ArrayList<>();
                arrayList2 = new ArrayList();
                queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(quickReply.id));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                TLdeserialize.send_state = queryFinalized.intValue(1);
                TLdeserialize.readAttachPath(byteBufferValue, j);
                byteBufferValue.reuse();
                TLdeserialize.id = queryFinalized.intValue(2);
                TLdeserialize.date = queryFinalized.intValue(3);
                TLdeserialize.flags |= 1073741824;
                TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                TLdeserialize.ttl = queryFinalized.intValue(5);
                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList, arrayList2, null);
                messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, true);
            }
            final MessageObject messageObject2 = messageObject;
            queryFinalized.dispose();
            final ArrayList<TLRPC$User> arrayList3 = new ArrayList<>();
            final ArrayList<TLRPC$Chat> arrayList4 = new ArrayList<>();
            if (!arrayList2.isEmpty()) {
                messagesStorage.getChatsInternal(TextUtils.join(",", arrayList2), arrayList4);
            }
            if (!arrayList.isEmpty()) {
                messagesStorage.getUsersInternal(arrayList, arrayList3);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$updateTopMessage$15(arrayList3, arrayList4, quickReply, messageObject2);
                }
            });
            queryFinalized.dispose();
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            FileLog.e(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
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

    public boolean processUpdate(final TLRPC$Update tLRPC$Update, final String str, final int i) {
        if (tLRPC$Update instanceof TLRPC$TL_updateQuickReplyMessage) {
            final TLRPC$Message tLRPC$Message = ((TLRPC$TL_updateQuickReplyMessage) tLRPC$Update).message;
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$processUpdate$17(tLRPC$Message, str, i);
                }
            });
            return true;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateQuickReplies) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$processUpdate$18(tLRPC$Update);
                }
            });
            return true;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewQuickReply) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$processUpdate$19(tLRPC$Update);
                }
            });
            return true;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteQuickReply) {
            ensureLoaded(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.this.lambda$processUpdate$21(tLRPC$Update);
                }
            });
            return true;
        }
        if (!(tLRPC$Update instanceof TLRPC$TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        ensureLoaded(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.this.lambda$processUpdate$22(tLRPC$Update);
            }
        });
        return true;
    }

    public void lambda$processUpdate$17(TLRPC$Message tLRPC$Message, String str, int i) {
        if ((tLRPC$Message.flags & 1073741824) != 0) {
            QuickReply findReply = findReply(tLRPC$Message.quick_reply_shortcut_id);
            if (findReply == null) {
                QuickReply quickReply = new QuickReply(this);
                quickReply.id = tLRPC$Message.quick_reply_shortcut_id;
                quickReply.topMessageId = tLRPC$Message.id;
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, true);
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
                int i2 = findReply.topMessageId;
                int i3 = tLRPC$Message.id;
                if (i2 == i3) {
                    findReply.topMessageId = i3;
                    MessageObject messageObject2 = new MessageObject(this.currentAccount, tLRPC$Message, false, true);
                    findReply.topMessage = messageObject2;
                    messageObject2.generateThumbs(false);
                    saveToCache();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                } else if ((tLRPC$Message.flags & 32768) == 0) {
                    findReply.messagesCount++;
                    saveToCache();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                }
            }
        }
        if (str == null && i == 0) {
            ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
            arrayList.add(tLRPC$Message);
            MessagesStorage.getInstance(this.currentAccount).putMessages(arrayList, true, true, false, DownloadController.getInstance(this.currentAccount).getAutodownloadMask(), 5, tLRPC$Message.quick_reply_shortcut_id);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            arrayList2.add(new MessageObject(this.currentAccount, tLRPC$Message, true, true));
            MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(clientUserId, arrayList2, 5);
        }
    }

    public void lambda$processUpdate$18(TLRPC$Update tLRPC$Update) {
        QuickReply quickReply;
        ArrayList<TLRPC$TL_quickReply> arrayList = ((TLRPC$TL_updateQuickReplies) tLRPC$Update).quick_replies;
        ArrayList arrayList2 = new ArrayList(this.replies);
        this.replies.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$TL_quickReply tLRPC$TL_quickReply = arrayList.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    quickReply = null;
                    break;
                } else {
                    if (((QuickReply) arrayList2.get(i2)).id == tLRPC$TL_quickReply.shortcut_id) {
                        quickReply = (QuickReply) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (quickReply == null) {
                quickReply = new QuickReply(this);
            }
            quickReply.id = tLRPC$TL_quickReply.shortcut_id;
            quickReply.name = tLRPC$TL_quickReply.shortcut;
            quickReply.messagesCount = tLRPC$TL_quickReply.count;
            quickReply.order = i;
            quickReply.topMessageId = tLRPC$TL_quickReply.top_message;
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null && messageObject.getId() != tLRPC$TL_quickReply.top_message) {
                quickReply.topMessage = null;
            }
            this.replies.add(quickReply);
            deleteLocalReply(quickReply.name);
        }
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$processUpdate$19(TLRPC$Update tLRPC$Update) {
        TLRPC$TL_quickReply tLRPC$TL_quickReply = ((TLRPC$TL_updateNewQuickReply) tLRPC$Update).quick_reply;
        QuickReply findReply = findReply(tLRPC$TL_quickReply.shortcut_id);
        if (findReply != null) {
            findReply.name = tLRPC$TL_quickReply.shortcut;
            findReply.messagesCount = tLRPC$TL_quickReply.count;
            findReply.topMessageId = tLRPC$TL_quickReply.top_message;
            MessageObject messageObject = findReply.topMessage;
            if (messageObject != null && messageObject.getId() != tLRPC$TL_quickReply.top_message) {
                findReply.topMessage = null;
                updateTopMessage(findReply);
                return;
            }
        } else {
            QuickReply quickReply = new QuickReply(this);
            quickReply.id = tLRPC$TL_quickReply.shortcut_id;
            quickReply.name = tLRPC$TL_quickReply.shortcut;
            quickReply.messagesCount = tLRPC$TL_quickReply.count;
            quickReply.topMessageId = tLRPC$TL_quickReply.top_message;
            updateOrder();
            this.replies.add(quickReply);
            deleteLocalReply(quickReply.name);
        }
        saveToCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$processUpdate$21(TLRPC$Update tLRPC$Update) {
        QuickReply findReply = findReply(((TLRPC$TL_updateDeleteQuickReply) tLRPC$Update).shortcut_id);
        if (findReply != null) {
            this.replies.remove(findReply);
            deleteLocalReply(findReply.name);
            final int i = findReply.id;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    QuickRepliesController.lambda$processUpdate$20(MessagesStorage.this, i);
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

    public void lambda$processUpdate$22(TLRPC$Update tLRPC$Update) {
        TLRPC$TL_updateDeleteQuickReplyMessages tLRPC$TL_updateDeleteQuickReplyMessages = (TLRPC$TL_updateDeleteQuickReplyMessages) tLRPC$Update;
        QuickReply findReply = findReply(tLRPC$TL_updateDeleteQuickReplyMessages.shortcut_id);
        if (findReply != null) {
            int size = findReply.messagesCount - tLRPC$TL_updateDeleteQuickReplyMessages.messages.size();
            findReply.messagesCount = size;
            if (size <= 0) {
                this.replies.remove(findReply);
            }
            if (tLRPC$TL_updateDeleteQuickReplyMessages.messages.contains(Integer.valueOf(findReply.getTopMessageId())) || findReply.topMessage == null) {
                findReply.topMessage = null;
                updateTopMessage(findReply);
            } else {
                saveToCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
            }
        }
    }

    public void checkLocalMessages(ArrayList<MessageObject> arrayList) {
        Iterator<MessageObject> it = arrayList.iterator();
        while (it.hasNext()) {
            MessageObject next = it.next();
            if (next.isSending() && findReply(next.getQuickReplyId()) == null && next.getQuickReplyName() != null && findReply(next.getQuickReplyName()) == null) {
                QuickReply findLocalReply = findLocalReply(next.getQuickReplyName());
                if (findLocalReply == null) {
                    findLocalReply = new QuickReply(this);
                    findLocalReply.local = true;
                    findLocalReply.name = next.getQuickReplyName();
                    findLocalReply.id = -1;
                    findLocalReply.topMessage = next;
                    findLocalReply.topMessageId = next.getId();
                    this.localReplies.add(findLocalReply);
                }
                findLocalReply.localIds.add(Integer.valueOf(next.getId()));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        QuickRepliesController.this.lambda$checkLocalMessages$23();
                    }
                });
            }
        }
    }

    public void lambda$checkLocalMessages$23() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void deleteLocalReply(String str) {
        QuickReply findLocalReply = findLocalReply(str);
        if (findLocalReply != null) {
            this.localReplies.remove(findLocalReply);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public void deleteLocalMessages(ArrayList<Integer> arrayList) {
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            deleteLocalMessage(it.next().intValue());
        }
    }

    public void deleteLocalMessage(int i) {
        for (int i2 = 0; i2 < this.localReplies.size(); i2++) {
            QuickReply quickReply = this.localReplies.get(i2);
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
        final TLRPC$TL_messages_sendQuickReplyMessages tLRPC$TL_messages_sendQuickReplyMessages = new TLRPC$TL_messages_sendQuickReplyMessages();
        TLRPC$InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tLRPC$TL_messages_sendQuickReplyMessages.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        tLRPC$TL_messages_sendQuickReplyMessages.shortcut_id = quickReply.id;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.this.lambda$sendQuickReplyTo$27(messagesStorage, quickReply, tLRPC$TL_messages_sendQuickReplyMessages);
            }
        });
    }

    public void lambda$sendQuickReplyTo$27(org.telegram.messenger.MessagesStorage r7, final org.telegram.ui.Business.QuickRepliesController.QuickReply r8, final org.telegram.tgnet.TLRPC$TL_messages_sendQuickReplyMessages r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Business.QuickRepliesController.lambda$sendQuickReplyTo$27(org.telegram.messenger.MessagesStorage, org.telegram.ui.Business.QuickRepliesController$QuickReply, org.telegram.tgnet.TLRPC$TL_messages_sendQuickReplyMessages):void");
    }

    public void lambda$sendQuickReplyTo$26(final ArrayList arrayList, QuickReply quickReply, final TLRPC$TL_messages_sendQuickReplyMessages tLRPC$TL_messages_sendQuickReplyMessages) {
        if (arrayList.isEmpty() || arrayList.size() < quickReply.getMessagesCount()) {
            final TLRPC$TL_messages_getQuickReplyMessages tLRPC$TL_messages_getQuickReplyMessages = new TLRPC$TL_messages_getQuickReplyMessages();
            tLRPC$TL_messages_getQuickReplyMessages.shortcut_id = quickReply.id;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getQuickReplyMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    QuickRepliesController.this.lambda$sendQuickReplyTo$25(arrayList, tLRPC$TL_messages_sendQuickReplyMessages, tLRPC$TL_messages_getQuickReplyMessages, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            tLRPC$TL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                tLRPC$TL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_sendQuickReplyMessages, null);
        }
    }

    public void lambda$sendQuickReplyTo$25(final ArrayList arrayList, final TLRPC$TL_messages_sendQuickReplyMessages tLRPC$TL_messages_sendQuickReplyMessages, final TLRPC$TL_messages_getQuickReplyMessages tLRPC$TL_messages_getQuickReplyMessages, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                QuickRepliesController.this.lambda$sendQuickReplyTo$24(tLObject, arrayList, tLRPC$TL_messages_sendQuickReplyMessages, tLRPC$TL_messages_getQuickReplyMessages, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendQuickReplyTo$24(TLObject tLObject, ArrayList arrayList, TLRPC$TL_messages_sendQuickReplyMessages tLRPC$TL_messages_sendQuickReplyMessages, TLRPC$TL_messages_getQuickReplyMessages tLRPC$TL_messages_getQuickReplyMessages, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_messages) {
            ArrayList<TLRPC$Message> arrayList2 = ((TLRPC$TL_messages_messages) tLObject).messages;
            arrayList.clear();
            Iterator<TLRPC$Message> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().id));
            }
            tLRPC$TL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                tLRPC$TL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getQuickReplyMessages, null);
            return;
        }
        FileLog.e("received " + tLObject + " " + tLRPC$TL_error + " on getQuickReplyMessages when trying to send quick reply");
    }
}
