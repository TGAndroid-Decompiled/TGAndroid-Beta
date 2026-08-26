package org.telegram.ui.Stars;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.LaunchActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda139 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;
    public final Object f$3;

    public StarGiftSheet$$ExternalSyntheticLambda139(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        SQLiteCursor sQLiteCursor;
        MessageObject messageObject;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList;
        Object obj;
        SQLiteCursor sQLiteCursor3;
        SQLiteDatabase sQLiteDatabase;
        int i = 0;
        long j = this.f$1;
        Object obj2 = this.f$0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) obj2).lambda$openSetAsTheme$16(j, (TL_stars.TL_starGiftUnique) obj4, (DialogsActivity) obj3);
                return;
            case 1:
                ((ChatMessagesMetadataController) obj2).lambda$loadStoriesForMessages$1((MessageObject) obj4, j, (TL_stories.StoryItem) obj3);
                return;
            case 2:
                ((MediaDataController) obj2).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj4, j, (ArrayList) obj3);
                return;
            case 3:
                ((MediaDataController) obj2).lambda$loadMusic$141(j, (ArrayList) obj4, (ArrayList) obj3);
                return;
            case 4:
                ((MessagesController) obj2).lambda$getGroupCall$62((TLObject) obj4, j, (Runnable) obj3);
                return;
            case 5:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj4, (TLRPC.TL_messages_peerDialogs) obj3, j);
                return;
            case 6:
                ((MessagesController) obj2).lambda$updateChannelUserName$291(j, (String) obj4, (Runnable) obj3);
                return;
            case 7:
                ((MessagesController) obj2).lambda$checkChatInviter$374(j, (ArrayList) obj4, (TLRPC.TL_channels_channelParticipant) obj3);
                return;
            case 8:
                ((MessagesController) obj2).lambda$addUserToChat$300((Utilities.Callback) obj4, (TLRPC.TL_messages_invitedUsers) obj3, j);
                return;
            case 9:
                ((MessagesController) obj2).lambda$reloadMessages$73(j, (ArrayList) obj4, (ArrayList) obj3);
                return;
            case 10:
                ((MessagesStorage) obj2).lambda$deleteUserChatHistory$85((ArrayList) obj4, j, (ArrayList) obj3);
                return;
            case 11:
                ((MessagesStorage) obj2).lambda$updateMessagePollResults$101(j, (TLRPC.Poll) obj4, (TLRPC.PollResults) obj3);
                return;
            case 12:
                ((MessagesStorage) obj2).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj4, (TLRPC.TL_messageReactions) obj3, j);
                return;
            case 13:
                ((MessagesStorage) obj2).lambda$getUserSync$258((TLRPC.User[]) obj4, j, (CountDownLatch) obj3);
                return;
            case 14:
                ((MessagesStorage) obj2).lambda$containsLocalDialog$179(j, (Boolean[]) obj4, (CountDownLatch) obj3);
                return;
            case 15:
                ((MessagesStorage) obj2).lambda$getChannelPtsSync$257(j, (Integer[]) obj4, (CountDownLatch) obj3);
                return;
            case 16:
                ((MessagesStorage) obj2).lambda$getChatSync$259((TLRPC.Chat[]) obj4, j, (CountDownLatch) obj3);
                return;
            case 17:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj4, (TLRPC.InputPeer) obj3, j);
                return;
            case 18:
                ((MessagesStorage) obj2).lambda$getEncryptedChat$177(j, (ArrayList) obj4, (CountDownLatch) obj3);
                return;
            case 19:
                ((SavedMessagesController) obj2).lambda$updateDialogsLastMessage$9((MessagesStorage) obj4, (ArrayList) obj3, j);
                return;
            case 20:
                ((SavedMessagesController) obj2).lambda$loadCache$7((MessagesStorage) obj4, j, (Runnable) obj3);
                return;
            case 21:
                ((CameraController) obj2).lambda$finishRecordingVideo$15((File) obj4, (Bitmap) obj3, j);
                return;
            case 22:
                MessagesStorage messagesStorage = (MessagesStorage) obj4;
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj3;
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj2;
                quickRepliesController.getClass();
                try {
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    ArrayList arrayList3 = new ArrayList();
                    SQLiteCursor sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(quickReply.id));
                    try {
                        if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            messageTLdeserialize.send_state = sQLiteCursorQueryFinalized.intValue(1);
                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j);
                            nativeByteBufferByteBufferValue.reuse();
                            messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(2);
                            messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(3);
                            messageTLdeserialize.flags |= 1073741824;
                            messageTLdeserialize.quick_reply_shortcut_id = sQLiteCursorQueryFinalized.intValue(4);
                            messageTLdeserialize.ttl = sQLiteCursorQueryFinalized.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, null);
                            messageObject = new MessageObject(quickRepliesController.currentAccount, messageTLdeserialize, false, true);
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                        if (!arrayList3.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList3), arrayList5);
                        }
                        if (!arrayList2.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList2, arrayList4);
                        }
                        AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController, arrayList4, arrayList5, quickReply, messageObject, 4));
                        sQLiteCursorQueryFinalized.dispose();
                        return;
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
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                break;
            case 23:
                MessagesStorage messagesStorage2 = (MessagesStorage) obj4;
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) obj2;
                quickRepliesController2.getClass();
                ArrayList arrayList6 = new ArrayList();
                ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage2.getDatabase();
                    SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursorQueryFinalized2.next()) {
                        try {
                            try {
                                try {
                                    QuickRepliesController.QuickReply quickReply2 = new QuickRepliesController.QuickReply();
                                    quickReply2.id = sQLiteCursorQueryFinalized2.intValue(i);
                                    quickReply2.name = sQLiteCursorQueryFinalized2.stringValue(1);
                                    quickReply2.order = sQLiteCursorQueryFinalized2.intValue(2);
                                    quickReply2.messagesCount = sQLiteCursorQueryFinalized2.intValue(3);
                                    arrayList6.add(quickReply2);
                                    i = 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    arrayList = arrayList6;
                                    sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                    obj = obj3;
                                    FileLog.e(e);
                                    if (sQLiteCursor3 != null) {
                                        sQLiteCursor3.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                                    return;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                arrayList = arrayList6;
                                obj = obj3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor2 = sQLiteCursorQueryFinalized2;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    }
                    char c = 0;
                    sQLiteCursorQueryFinalized2.dispose();
                    ArrayList<Long> arrayList9 = new ArrayList<>();
                    ArrayList arrayList10 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList6.size()) {
                        try {
                            QuickRepliesController.QuickReply quickReply3 = (QuickRepliesController.QuickReply) arrayList6.get(i2);
                            arrayList = arrayList6;
                            try {
                                sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                try {
                                    try {
                                        Object[] objArr = new Object[1];
                                        objArr[c] = Integer.valueOf(quickReply3.id);
                                        sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr);
                                        if (sQLiteCursorQueryFinalized2.next()) {
                                            sQLiteDatabase = database;
                                            NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                            if (nativeByteBufferByteBufferValue2 != null) {
                                                TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                                obj = obj3;
                                                try {
                                                    messageTLdeserialize2.send_state = sQLiteCursorQueryFinalized2.intValue(1);
                                                    messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue2, j);
                                                    nativeByteBufferByteBufferValue2.reuse();
                                                    messageTLdeserialize2.id = sQLiteCursorQueryFinalized2.intValue(2);
                                                    messageTLdeserialize2.date = sQLiteCursorQueryFinalized2.intValue(3);
                                                    messageTLdeserialize2.flags |= 1073741824;
                                                    messageTLdeserialize2.quick_reply_shortcut_id = sQLiteCursorQueryFinalized2.intValue(4);
                                                    messageTLdeserialize2.ttl = sQLiteCursorQueryFinalized2.intValue(5);
                                                    MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList9, arrayList10, null);
                                                    sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                                    try {
                                                        MessageObject messageObject2 = new MessageObject(quickRepliesController2.currentAccount, messageTLdeserialize2, false, true);
                                                        quickReply3.topMessage = messageObject2;
                                                        quickReply3.topMessageId = messageTLdeserialize2.id;
                                                        messageObject2.generateThumbs(false);
                                                        quickReply3.topMessage.applyQuickReply(quickReply3.name, quickReply3.id);
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        FileLog.e(e);
                                                        if (sQLiteCursor3 != null) {
                                                            sQLiteCursor3.dispose();
                                                        }
                                                        AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                                                        return;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                                    FileLog.e(e);
                                                    if (sQLiteCursor3 != null) {
                                                        sQLiteCursor3.dispose();
                                                    }
                                                    AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                                                    return;
                                                }
                                            }
                                            sQLiteCursor3.dispose();
                                            i2++;
                                            arrayList6 = arrayList;
                                            database = sQLiteDatabase;
                                            sQLiteCursorQueryFinalized2 = sQLiteCursor3;
                                            obj3 = obj;
                                            c = 0;
                                        } else {
                                            sQLiteDatabase = database;
                                        }
                                        sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                        obj = obj3;
                                        sQLiteCursor3.dispose();
                                        i2++;
                                        arrayList6 = arrayList;
                                        database = sQLiteDatabase;
                                        sQLiteCursorQueryFinalized2 = sQLiteCursor3;
                                        obj3 = obj;
                                        c = 0;
                                    } catch (Exception e7) {
                                        e = e7;
                                        obj = obj3;
                                        FileLog.e(e);
                                        if (sQLiteCursor3 != null) {
                                            sQLiteCursor3.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteCursor2 = sQLiteCursor3;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e8) {
                                e = e8;
                                sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                                obj = obj3;
                                FileLog.e(e);
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                                return;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                            sQLiteCursor2 = sQLiteCursor3;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    }
                    arrayList = arrayList6;
                    sQLiteCursor3 = sQLiteCursorQueryFinalized2;
                    obj = obj3;
                    if (!arrayList10.isEmpty()) {
                        messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList10), arrayList8);
                    }
                    if (!arrayList9.isEmpty()) {
                        messagesStorage2.getUsersInternal(arrayList9, arrayList7);
                    }
                    break;
                } catch (Exception e9) {
                    e = e9;
                    arrayList = arrayList6;
                    obj = obj3;
                    sQLiteCursor3 = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor2 = null;
                }
                sQLiteCursor3.dispose();
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16(quickRepliesController2, arrayList7, arrayList8, arrayList, (Runnable) obj, 3));
                return;
            case 24:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.getClass();
                if (((StarsController) obj4).balanceLoaded) {
                    starGiftSheet.doTransfer(j, (Utilities.Callback) obj3);
                    return;
                } else {
                    starGiftSheet.getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
                    return;
                }
            case 25:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj2;
                starGiftSheet2.getClass();
                ((boolean[]) obj4)[0] = true;
                starGiftSheet2.button.setLoading(false);
                starGiftSheet2.doTransfer(j, (Utilities.Callback) obj3);
                return;
            case 26:
                ((StarsController) obj4).sendPaidReaction((MessageObject) obj3, ((StarReactionsOverlay) obj2).chatActivity, this.f$1, true, true, null);
                return;
            case 27:
                BulletinFactory bulletinFactoryOf = BulletinFactory.of((ChatActivity) obj2);
                TLRPC.Document document = ((TL_stars.StarGift) obj4).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                SpannableStringBuilder spannableStringBuilderReplaceTags = (SpannableStringBuilder) obj3;
                if (spannableStringBuilderReplaceTags == null) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j, new Object[0]));
                }
                bulletinFactoryOf.createEmojiBulletin(document, string, spannableStringBuilderReplaceTags).show(true);
                return;
            case 28:
                StarsController starsController = (StarsController) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                if (starsController.balanceLoaded) {
                    starsController.getResellingGiftForm((TL_stars.StarGift) obj3, this.f$1, null, true, callback);
                    return;
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback.run(null);
                    return;
                }
            default:
                ((StarsController) obj2).showStarsTopupInternal((LaunchActivity) obj4, j, (String) obj3);
                return;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda139(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
        this.f$3 = obj3;
    }

    public StarGiftSheet$$ExternalSyntheticLambda139(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = j;
    }
}
