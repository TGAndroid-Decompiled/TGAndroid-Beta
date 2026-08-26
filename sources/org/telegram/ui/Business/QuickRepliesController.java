package org.telegram.ui.Business;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda139;
import org.telegram.ui.Stories.StealthModeAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class QuickRepliesController {
    public static volatile QuickRepliesController[] Instance = new QuickRepliesController[4];
    public static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    public boolean loaded;
    public boolean loading;
    public final ArrayList replies = new ArrayList();
    public final ArrayList localReplies = new ArrayList();
    public final ArrayList filtered = new ArrayList();

    public final class QuickReply {
        public int id;
        public boolean local;
        public final HashSet localIds = new HashSet();
        public int messagesCount;
        public String name;
        public int order;
        public MessageObject topMessage;
        public int topMessageId;

        public final int getMessagesCount() {
            return this.local ? this.localIds.size() : this.messagesCount;
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public QuickRepliesController(int i) {
        this.currentAccount = i;
    }

    public static QuickRepliesController getInstance(int i) {
        QuickRepliesController quickRepliesController;
        QuickRepliesController quickRepliesController2 = Instance[i];
        if (quickRepliesController2 != null) {
            return quickRepliesController2;
        }
        synchronized (lockObjects[i]) {
            try {
                quickRepliesController = Instance[i];
                if (quickRepliesController == null) {
                    QuickRepliesController[] quickRepliesControllerArr = Instance;
                    QuickRepliesController quickRepliesController3 = new QuickRepliesController(i);
                    quickRepliesControllerArr[i] = quickRepliesController3;
                    quickRepliesController = quickRepliesController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return quickRepliesController;
    }

    public static boolean isSpecial(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void deleteLocalReply(String str) {
        QuickReply quickReply;
        ArrayList arrayList = this.localReplies;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                quickReply = null;
                break;
            } else {
                Object obj = arrayList.get(i);
                i++;
                quickReply = (QuickReply) obj;
            }
        } while (!TextUtils.equals(str, quickReply.name));
        if (quickReply != null) {
            arrayList.remove(quickReply);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final QuickReply findReply(long j) {
        ArrayList arrayList = this.replies;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickReply quickReply = (QuickReply) obj;
            if (quickReply.id == j) {
                return quickReply;
            }
        }
        return null;
    }

    public final void load(boolean z, Runnable runnable) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        TLRPC.Message message;
        if (this.loading || this.loaded) {
            return;
        }
        int i = 1;
        this.loading = true;
        int i2 = this.currentAccount;
        if (z) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i2);
            messagesStorage.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(this, messagesStorage, UserConfig.getInstance(i2).getClientUserId(), runnable, 23));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j6 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.replies;
            if (i4 >= arrayList.size()) {
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplies, new RichMediaUploader$$ExternalSyntheticLambda0(this, 10));
                return;
            }
            QuickReply quickReply = (QuickReply) arrayList.get(i4);
            long jCalcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, quickReply.id);
            tL_messages_getQuickReplies.hash = jCalcHash;
            String str = quickReply.name;
            if (str == null) {
                j = j6;
            } else {
                String strSubstring = Utilities.MD5(str).substring(i3, 16);
                int length = strSubstring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j7 = 16;
                if (j7 >= j6) {
                    long j8 = (Long.MAX_VALUE / j7) << i;
                    j = j6;
                    j2 = j8 + ((long) ((((-1) - (j8 * j7)) ^ Long.MIN_VALUE) >= (j7 ^ Long.MIN_VALUE) ? 1 : 0));
                } else if (Long.MAX_VALUE < (j7 ^ Long.MIN_VALUE)) {
                    j = j6;
                    j2 = j;
                } else {
                    j2 = 1;
                    j = j6;
                }
                int i5 = (strSubstring.charAt(i3) != '+' || length <= i) ? 0 : 1;
                long j9 = j;
                while (i5 < length) {
                    int iDigit = Character.digit(strSubstring.charAt(i5), 16);
                    if (iDigit == -1) {
                        throw new NumberFormatException(strSubstring.toString());
                    }
                    if (j9 >= j && j9 <= j2) {
                        if (j9 == j2) {
                            if (j7 < j6) {
                                if (Long.MAX_VALUE < (j7 ^ Long.MIN_VALUE)) {
                                    j4 = -1;
                                } else {
                                    j3 = (-1) - j7;
                                }
                                if (iDigit <= ((int) j4)) {
                                }
                            } else {
                                long j10 = (-1) - (((Long.MAX_VALUE / j7) << 1) * j7);
                                j3 = j10 - ((j10 ^ Long.MIN_VALUE) >= (j7 ^ Long.MIN_VALUE) ? j7 : j);
                            }
                            j4 = j3;
                            if (iDigit <= ((int) j4)) {
                            }
                        } else {
                            i4 = i4;
                        }
                        j9 = (j9 * j7) + ((long) iDigit);
                        i5++;
                        i4 = i4;
                    }
                    throw new NumberFormatException("Too large for unsigned long: ".concat(strSubstring.toString()));
                }
                j6 = j9;
            }
            int i6 = i4;
            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, j6);
            tL_messages_getQuickReplies.hash = jCalcHash2;
            MessageObject messageObject = quickReply.topMessage;
            long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, messageObject == null ? j : messageObject.getId());
            tL_messages_getQuickReplies.hash = jCalcHash3;
            MessageObject messageObject2 = quickReply.topMessage;
            if (messageObject2 == null || (message = messageObject2.messageOwner) == null || (message.flags & 32768) == 0) {
                j5 = j;
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, j5);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(jCalcHash3, message.edit_date);
                j5 = j;
            }
            i4 = i6 + 1;
            j6 = j5;
            i = 1;
            i3 = 0;
        }
    }

    public final boolean processUpdate(final TLRPC.Update update, String str, int i) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            BotBiometry$$ExternalSyntheticLambda8 botBiometry$$ExternalSyntheticLambda8 = new BotBiometry$$ExternalSyntheticLambda8(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i);
            if (this.loaded) {
                botBiometry$$ExternalSyntheticLambda8.run();
                return true;
            }
            load(true, botBiometry$$ExternalSyntheticLambda8);
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i2 = 0;
            Runnable runnable = new Runnable(this) {
                public final QuickRepliesController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    QuickRepliesController.QuickReply quickReply;
                    switch (i2) {
                        case 0:
                            QuickRepliesController quickRepliesController = this.f$0;
                            quickRepliesController.getClass();
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            ArrayList arrayList2 = quickRepliesController.replies;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i3);
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= arrayList3.size()) {
                                        quickReply = null;
                                    } else if (((QuickRepliesController.QuickReply) arrayList3.get(i4)).id == tL_quickReply.shortcut_id) {
                                        quickReply = (QuickRepliesController.QuickReply) arrayList3.get(i4);
                                    } else {
                                        i4++;
                                    }
                                }
                                if (quickReply == null) {
                                    quickReply = new QuickRepliesController.QuickReply();
                                }
                                quickReply.id = tL_quickReply.shortcut_id;
                                quickReply.name = tL_quickReply.shortcut;
                                quickReply.messagesCount = tL_quickReply.count;
                                quickReply.order = i3;
                                quickReply.topMessageId = tL_quickReply.top_message;
                                MessageObject messageObject = quickReply.topMessage;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    quickReply.topMessage = null;
                                }
                                arrayList2.add(quickReply);
                                quickRepliesController.deleteLocalReply(quickReply.name);
                            }
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(quickRepliesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            QuickRepliesController quickRepliesController2 = this.f$0;
                            quickRepliesController2.getClass();
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController2.findReply(tL_quickReply2.shortcut_id);
                            int i5 = quickRepliesController2.currentAccount;
                            if (quickReplyFindReply != null) {
                                quickReplyFindReply.name = tL_quickReply2.shortcut;
                                quickReplyFindReply.messagesCount = tL_quickReply2.count;
                                quickReplyFindReply.topMessageId = tL_quickReply2.top_message;
                                MessageObject messageObject2 = quickReplyFindReply.topMessage;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    quickReplyFindReply.topMessage = null;
                                    long clientUserId = UserConfig.getInstance(i5).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i5);
                                    messagesStorage.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController2, messagesStorage, quickReplyFindReply, clientUserId, 22));
                                }
                                break;
                            } else {
                                QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                                quickReply2.id = tL_quickReply2.shortcut_id;
                                quickReply2.name = tL_quickReply2.shortcut;
                                quickReply2.messagesCount = tL_quickReply2.count;
                                quickReply2.topMessageId = tL_quickReply2.top_message;
                                int i6 = 0;
                                while (true) {
                                    ArrayList arrayList4 = quickRepliesController2.replies;
                                    if (i6 < arrayList4.size()) {
                                        ((QuickRepliesController.QuickReply) arrayList4.get(i6)).order = i6;
                                        i6++;
                                    } else {
                                        arrayList4.add(quickReply2);
                                        quickRepliesController2.deleteLocalReply(quickReply2.name);
                                    }
                                }
                            }
                            quickRepliesController2.saveToCache();
                            NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            QuickRepliesController quickRepliesController3 = this.f$0;
                            quickRepliesController3.getClass();
                            QuickRepliesController.QuickReply quickReplyFindReply2 = quickRepliesController3.findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (quickReplyFindReply2 != null) {
                                quickRepliesController3.replies.remove(quickReplyFindReply2);
                                quickRepliesController3.deleteLocalReply(quickReplyFindReply2.name);
                                int i7 = quickReplyFindReply2.id;
                                int i8 = quickRepliesController3.currentAccount;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i8);
                                messagesStorage2.getStorageQueue().postRunnable(new Theme$$ExternalSyntheticLambda19(messagesStorage2, i7, 7));
                                quickRepliesController3.saveToCache();
                                NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            QuickRepliesController quickRepliesController4 = this.f$0;
                            quickRepliesController4.getClass();
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            QuickRepliesController.QuickReply quickReplyFindReply3 = quickRepliesController4.findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (quickReplyFindReply3 != null) {
                                int size = quickReplyFindReply3.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
                                quickReplyFindReply3.messagesCount = size;
                                if (size <= 0) {
                                    quickRepliesController4.replies.remove(quickReplyFindReply3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = quickReplyFindReply3.topMessage;
                                boolean zContains = arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : quickReplyFindReply3.topMessageId));
                                int i9 = quickRepliesController4.currentAccount;
                                if (zContains || quickReplyFindReply3.topMessage == null) {
                                    quickReplyFindReply3.topMessage = null;
                                    long clientUserId2 = UserConfig.getInstance(i9).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i9);
                                    messagesStorage3.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController4, messagesStorage3, quickReplyFindReply3, clientUserId2, 22));
                                } else {
                                    quickRepliesController4.saveToCache();
                                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            };
            if (this.loaded) {
                runnable.run();
                return true;
            }
            load(true, runnable);
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i3 = 1;
            Runnable runnable2 = new Runnable(this) {
                public final QuickRepliesController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    QuickRepliesController.QuickReply quickReply;
                    switch (i3) {
                        case 0:
                            QuickRepliesController quickRepliesController = this.f$0;
                            quickRepliesController.getClass();
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            ArrayList arrayList2 = quickRepliesController.replies;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i4);
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= arrayList3.size()) {
                                        quickReply = null;
                                    } else if (((QuickRepliesController.QuickReply) arrayList3.get(i5)).id == tL_quickReply.shortcut_id) {
                                        quickReply = (QuickRepliesController.QuickReply) arrayList3.get(i5);
                                    } else {
                                        i5++;
                                    }
                                }
                                if (quickReply == null) {
                                    quickReply = new QuickRepliesController.QuickReply();
                                }
                                quickReply.id = tL_quickReply.shortcut_id;
                                quickReply.name = tL_quickReply.shortcut;
                                quickReply.messagesCount = tL_quickReply.count;
                                quickReply.order = i4;
                                quickReply.topMessageId = tL_quickReply.top_message;
                                MessageObject messageObject = quickReply.topMessage;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    quickReply.topMessage = null;
                                }
                                arrayList2.add(quickReply);
                                quickRepliesController.deleteLocalReply(quickReply.name);
                            }
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(quickRepliesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            QuickRepliesController quickRepliesController2 = this.f$0;
                            quickRepliesController2.getClass();
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController2.findReply(tL_quickReply2.shortcut_id);
                            int i6 = quickRepliesController2.currentAccount;
                            if (quickReplyFindReply != null) {
                                quickReplyFindReply.name = tL_quickReply2.shortcut;
                                quickReplyFindReply.messagesCount = tL_quickReply2.count;
                                quickReplyFindReply.topMessageId = tL_quickReply2.top_message;
                                MessageObject messageObject2 = quickReplyFindReply.topMessage;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    quickReplyFindReply.topMessage = null;
                                    long clientUserId = UserConfig.getInstance(i6).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i6);
                                    messagesStorage.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController2, messagesStorage, quickReplyFindReply, clientUserId, 22));
                                }
                                break;
                            } else {
                                QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                                quickReply2.id = tL_quickReply2.shortcut_id;
                                quickReply2.name = tL_quickReply2.shortcut;
                                quickReply2.messagesCount = tL_quickReply2.count;
                                quickReply2.topMessageId = tL_quickReply2.top_message;
                                int i7 = 0;
                                while (true) {
                                    ArrayList arrayList4 = quickRepliesController2.replies;
                                    if (i7 < arrayList4.size()) {
                                        ((QuickRepliesController.QuickReply) arrayList4.get(i7)).order = i7;
                                        i7++;
                                    } else {
                                        arrayList4.add(quickReply2);
                                        quickRepliesController2.deleteLocalReply(quickReply2.name);
                                    }
                                }
                            }
                            quickRepliesController2.saveToCache();
                            NotificationCenter.getInstance(i6).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            QuickRepliesController quickRepliesController3 = this.f$0;
                            quickRepliesController3.getClass();
                            QuickRepliesController.QuickReply quickReplyFindReply2 = quickRepliesController3.findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (quickReplyFindReply2 != null) {
                                quickRepliesController3.replies.remove(quickReplyFindReply2);
                                quickRepliesController3.deleteLocalReply(quickReplyFindReply2.name);
                                int i8 = quickReplyFindReply2.id;
                                int i9 = quickRepliesController3.currentAccount;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i9);
                                messagesStorage2.getStorageQueue().postRunnable(new Theme$$ExternalSyntheticLambda19(messagesStorage2, i8, 7));
                                quickRepliesController3.saveToCache();
                                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            QuickRepliesController quickRepliesController4 = this.f$0;
                            quickRepliesController4.getClass();
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            QuickRepliesController.QuickReply quickReplyFindReply3 = quickRepliesController4.findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (quickReplyFindReply3 != null) {
                                int size = quickReplyFindReply3.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
                                quickReplyFindReply3.messagesCount = size;
                                if (size <= 0) {
                                    quickRepliesController4.replies.remove(quickReplyFindReply3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = quickReplyFindReply3.topMessage;
                                boolean zContains = arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : quickReplyFindReply3.topMessageId));
                                int i10 = quickRepliesController4.currentAccount;
                                if (zContains || quickReplyFindReply3.topMessage == null) {
                                    quickReplyFindReply3.topMessage = null;
                                    long clientUserId2 = UserConfig.getInstance(i10).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i10);
                                    messagesStorage3.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController4, messagesStorage3, quickReplyFindReply3, clientUserId2, 22));
                                } else {
                                    quickRepliesController4.saveToCache();
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            };
            if (this.loaded) {
                runnable2.run();
                return true;
            }
            load(true, runnable2);
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i4 = 2;
            Runnable runnable3 = new Runnable(this) {
                public final QuickRepliesController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    QuickRepliesController.QuickReply quickReply;
                    switch (i4) {
                        case 0:
                            QuickRepliesController quickRepliesController = this.f$0;
                            quickRepliesController.getClass();
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            ArrayList arrayList2 = quickRepliesController.replies;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList3.size()) {
                                        quickReply = null;
                                    } else if (((QuickRepliesController.QuickReply) arrayList3.get(i6)).id == tL_quickReply.shortcut_id) {
                                        quickReply = (QuickRepliesController.QuickReply) arrayList3.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (quickReply == null) {
                                    quickReply = new QuickRepliesController.QuickReply();
                                }
                                quickReply.id = tL_quickReply.shortcut_id;
                                quickReply.name = tL_quickReply.shortcut;
                                quickReply.messagesCount = tL_quickReply.count;
                                quickReply.order = i5;
                                quickReply.topMessageId = tL_quickReply.top_message;
                                MessageObject messageObject = quickReply.topMessage;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    quickReply.topMessage = null;
                                }
                                arrayList2.add(quickReply);
                                quickRepliesController.deleteLocalReply(quickReply.name);
                            }
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(quickRepliesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            QuickRepliesController quickRepliesController2 = this.f$0;
                            quickRepliesController2.getClass();
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController2.findReply(tL_quickReply2.shortcut_id);
                            int i7 = quickRepliesController2.currentAccount;
                            if (quickReplyFindReply != null) {
                                quickReplyFindReply.name = tL_quickReply2.shortcut;
                                quickReplyFindReply.messagesCount = tL_quickReply2.count;
                                quickReplyFindReply.topMessageId = tL_quickReply2.top_message;
                                MessageObject messageObject2 = quickReplyFindReply.topMessage;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    quickReplyFindReply.topMessage = null;
                                    long clientUserId = UserConfig.getInstance(i7).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i7);
                                    messagesStorage.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController2, messagesStorage, quickReplyFindReply, clientUserId, 22));
                                }
                                break;
                            } else {
                                QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                                quickReply2.id = tL_quickReply2.shortcut_id;
                                quickReply2.name = tL_quickReply2.shortcut;
                                quickReply2.messagesCount = tL_quickReply2.count;
                                quickReply2.topMessageId = tL_quickReply2.top_message;
                                int i8 = 0;
                                while (true) {
                                    ArrayList arrayList4 = quickRepliesController2.replies;
                                    if (i8 < arrayList4.size()) {
                                        ((QuickRepliesController.QuickReply) arrayList4.get(i8)).order = i8;
                                        i8++;
                                    } else {
                                        arrayList4.add(quickReply2);
                                        quickRepliesController2.deleteLocalReply(quickReply2.name);
                                    }
                                }
                            }
                            quickRepliesController2.saveToCache();
                            NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            QuickRepliesController quickRepliesController3 = this.f$0;
                            quickRepliesController3.getClass();
                            QuickRepliesController.QuickReply quickReplyFindReply2 = quickRepliesController3.findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (quickReplyFindReply2 != null) {
                                quickRepliesController3.replies.remove(quickReplyFindReply2);
                                quickRepliesController3.deleteLocalReply(quickReplyFindReply2.name);
                                int i9 = quickReplyFindReply2.id;
                                int i10 = quickRepliesController3.currentAccount;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i10);
                                messagesStorage2.getStorageQueue().postRunnable(new Theme$$ExternalSyntheticLambda19(messagesStorage2, i9, 7));
                                quickRepliesController3.saveToCache();
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                            break;
                        default:
                            QuickRepliesController quickRepliesController4 = this.f$0;
                            quickRepliesController4.getClass();
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            QuickRepliesController.QuickReply quickReplyFindReply3 = quickRepliesController4.findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (quickReplyFindReply3 != null) {
                                int size = quickReplyFindReply3.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
                                quickReplyFindReply3.messagesCount = size;
                                if (size <= 0) {
                                    quickRepliesController4.replies.remove(quickReplyFindReply3);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = quickReplyFindReply3.topMessage;
                                boolean zContains = arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : quickReplyFindReply3.topMessageId));
                                int i11 = quickRepliesController4.currentAccount;
                                if (zContains || quickReplyFindReply3.topMessage == null) {
                                    quickReplyFindReply3.topMessage = null;
                                    long clientUserId2 = UserConfig.getInstance(i11).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i11);
                                    messagesStorage3.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController4, messagesStorage3, quickReplyFindReply3, clientUserId2, 22));
                                } else {
                                    quickRepliesController4.saveToCache();
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                }
                            }
                            break;
                    }
                }
            };
            if (this.loaded) {
                runnable3.run();
                return true;
            }
            load(true, runnable3);
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i5 = 3;
        Runnable runnable4 = new Runnable(this) {
            public final QuickRepliesController f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                QuickRepliesController.QuickReply quickReply;
                switch (i5) {
                    case 0:
                        QuickRepliesController quickRepliesController = this.f$0;
                        quickRepliesController.getClass();
                        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        ArrayList arrayList2 = quickRepliesController.replies;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList2.clear();
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i6);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= arrayList3.size()) {
                                    quickReply = null;
                                } else if (((QuickRepliesController.QuickReply) arrayList3.get(i7)).id == tL_quickReply.shortcut_id) {
                                    quickReply = (QuickRepliesController.QuickReply) arrayList3.get(i7);
                                } else {
                                    i7++;
                                }
                            }
                            if (quickReply == null) {
                                quickReply = new QuickRepliesController.QuickReply();
                            }
                            quickReply.id = tL_quickReply.shortcut_id;
                            quickReply.name = tL_quickReply.shortcut;
                            quickReply.messagesCount = tL_quickReply.count;
                            quickReply.order = i6;
                            quickReply.topMessageId = tL_quickReply.top_message;
                            MessageObject messageObject = quickReply.topMessage;
                            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                quickReply.topMessage = null;
                            }
                            arrayList2.add(quickReply);
                            quickRepliesController.deleteLocalReply(quickReply.name);
                        }
                        quickRepliesController.saveToCache();
                        NotificationCenter.getInstance(quickRepliesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 1:
                        QuickRepliesController quickRepliesController2 = this.f$0;
                        quickRepliesController2.getClass();
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController2.findReply(tL_quickReply2.shortcut_id);
                        int i8 = quickRepliesController2.currentAccount;
                        if (quickReplyFindReply != null) {
                            quickReplyFindReply.name = tL_quickReply2.shortcut;
                            quickReplyFindReply.messagesCount = tL_quickReply2.count;
                            quickReplyFindReply.topMessageId = tL_quickReply2.top_message;
                            MessageObject messageObject2 = quickReplyFindReply.topMessage;
                            if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                quickReplyFindReply.topMessage = null;
                                long clientUserId = UserConfig.getInstance(i8).getClientUserId();
                                MessagesStorage messagesStorage = MessagesStorage.getInstance(i8);
                                messagesStorage.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController2, messagesStorage, quickReplyFindReply, clientUserId, 22));
                            }
                            break;
                        } else {
                            QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                            quickReply2.id = tL_quickReply2.shortcut_id;
                            quickReply2.name = tL_quickReply2.shortcut;
                            quickReply2.messagesCount = tL_quickReply2.count;
                            quickReply2.topMessageId = tL_quickReply2.top_message;
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList4 = quickRepliesController2.replies;
                                if (i9 < arrayList4.size()) {
                                    ((QuickRepliesController.QuickReply) arrayList4.get(i9)).order = i9;
                                    i9++;
                                } else {
                                    arrayList4.add(quickReply2);
                                    quickRepliesController2.deleteLocalReply(quickReply2.name);
                                }
                            }
                        }
                        quickRepliesController2.saveToCache();
                        NotificationCenter.getInstance(i8).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 2:
                        QuickRepliesController quickRepliesController3 = this.f$0;
                        quickRepliesController3.getClass();
                        QuickRepliesController.QuickReply quickReplyFindReply2 = quickRepliesController3.findReply(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (quickReplyFindReply2 != null) {
                            quickRepliesController3.replies.remove(quickReplyFindReply2);
                            quickRepliesController3.deleteLocalReply(quickReplyFindReply2.name);
                            int i10 = quickReplyFindReply2.id;
                            int i11 = quickRepliesController3.currentAccount;
                            MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i11);
                            messagesStorage2.getStorageQueue().postRunnable(new Theme$$ExternalSyntheticLambda19(messagesStorage2, i10, 7));
                            quickRepliesController3.saveToCache();
                            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                        break;
                    default:
                        QuickRepliesController quickRepliesController4 = this.f$0;
                        quickRepliesController4.getClass();
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        QuickRepliesController.QuickReply quickReplyFindReply3 = quickRepliesController4.findReply(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (quickReplyFindReply3 != null) {
                            int size = quickReplyFindReply3.messagesCount - tL_updateDeleteQuickReplyMessages.messages.size();
                            quickReplyFindReply3.messagesCount = size;
                            if (size <= 0) {
                                quickRepliesController4.replies.remove(quickReplyFindReply3);
                            }
                            ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                            MessageObject messageObject3 = quickReplyFindReply3.topMessage;
                            boolean zContains = arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : quickReplyFindReply3.topMessageId));
                            int i12 = quickRepliesController4.currentAccount;
                            if (zContains || quickReplyFindReply3.topMessage == null) {
                                quickReplyFindReply3.topMessage = null;
                                long clientUserId2 = UserConfig.getInstance(i12).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i12);
                                messagesStorage3.getStorageQueue().postRunnable(new StarGiftSheet$$ExternalSyntheticLambda139(quickRepliesController4, messagesStorage3, quickReplyFindReply3, clientUserId2, 22));
                            } else {
                                quickRepliesController4.saveToCache();
                                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            }
                        }
                        break;
                }
            }
        };
        if (this.loaded) {
            runnable4.run();
            return true;
        }
        load(true, runnable4);
        return true;
    }

    public final void renameReply(int i, String str) {
        QuickReply quickReplyFindReply = findReply(i);
        if (quickReplyFindReply == null) {
            return;
        }
        quickReplyFindReply.name = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.currentAccount;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new StealthModeAlert$$ExternalSyntheticLambda3(1));
        saveToCache();
        NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void saveToCache() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(12, this, messagesStorage));
    }

    public final QuickReply findReply(String str) {
        ArrayList arrayList = this.replies;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickReply quickReply = (QuickReply) obj;
            if (TextUtils.equals(str, quickReply.name)) {
                return quickReply;
            }
        }
        return null;
    }
}
