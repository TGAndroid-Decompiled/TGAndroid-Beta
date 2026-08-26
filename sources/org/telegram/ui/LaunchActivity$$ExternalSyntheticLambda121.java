package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stars.MessageSuggestionOfferSheet;

public final class LaunchActivity$$ExternalSyntheticLambda121 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public LaunchActivity$$ExternalSyntheticLambda121(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        String str;
        SQLiteCursor sQLiteCursor4;
        MessageObject messageObject;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i;
        long j;
        TLRPC.EncryptedChat encryptedChatM;
        UndoView undoView;
        DialogsActivity dialogsActivity;
        DialogsActivity dialogsActivity2;
        int i2;
        DialogsActivity.ViewPage[] viewPageArr;
        String str2 = "SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC";
        int i3 = 5;
        int i4 = 0;
        long j2 = this.f$2;
        Object obj = this.f$3;
        Object obj2 = this.f$0;
        Object obj3 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                TLObject tLObject = (TLObject) obj2;
                LinkManager$$ExternalSyntheticLambda21 linkManager$$ExternalSyntheticLambda21 = (LinkManager$$ExternalSyntheticLambda21) obj;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    linkManager$$ExternalSyntheticLambda21.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController messagesController = (MessagesController) obj3;
                messagesController.putUsers(tL_stories_peerStories.users, false);
                messagesController.getStoriesController().putStories(j2, tL_stories_peerStories.stories);
                linkManager$$ExternalSyntheticLambda21.run();
                return;
            case 1:
                ((ChatMessagesMetadataController) obj2).lambda$loadStoriesForMessages$1((MessageObject) obj3, j2, (TL_stories.StoryItem) obj);
                return;
            case 2:
                ((MediaDataController) obj2).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj3, j2, (ArrayList) obj);
                return;
            case 3:
                ((MediaDataController) obj2).lambda$loadMusic$141(j2, (ArrayList) obj3, (ArrayList) obj);
                return;
            case 4:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j2, (Runnable) obj);
                return;
            case 5:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j2);
                return;
            case 6:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j2, (String) obj2, (Runnable) obj);
                return;
            case 7:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j2, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                return;
            case 8:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj2, (TLRPC.TL_messages_invitedUsers) obj, j2);
                return;
            case 9:
                ((MessagesController) obj3).lambda$reloadMessages$73(j2, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 10:
                ((MessagesStorage) obj2).lambda$deleteUserChatHistory$85((ArrayList) obj3, j2, (ArrayList) obj);
                return;
            case 11:
                ((MessagesStorage) obj2).lambda$updateMessagePollResults$101(j2, (TLRPC.Poll) obj3, (TLRPC.PollResults) obj);
                return;
            case 12:
                ((MessagesStorage) obj2).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj3, (TLRPC.TL_messageReactions) obj, j2);
                return;
            case 13:
                ((MessagesStorage) obj2).lambda$getUserSync$258((TLRPC.User[]) obj3, j2, (CountDownLatch) obj);
                return;
            case 14:
                ((MessagesStorage) obj2).lambda$containsLocalDialog$179(j2, (Boolean[]) obj3, (CountDownLatch) obj);
                return;
            case 15:
                ((MessagesStorage) obj2).lambda$getChannelPtsSync$257(j2, (Integer[]) obj3, (CountDownLatch) obj);
                return;
            case 16:
                ((MessagesStorage) obj2).lambda$getChatSync$259((TLRPC.Chat[]) obj3, j2, (CountDownLatch) obj);
                return;
            case 17:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj3, (TLRPC.InputPeer) obj, j2);
                return;
            case 18:
                ((MessagesStorage) obj2).lambda$getEncryptedChat$177(j2, (ArrayList) obj3, (CountDownLatch) obj);
                return;
            case 19:
                ((SavedMessagesController) obj2).lambda$updateDialogsLastMessage$9((MessagesStorage) obj3, (ArrayList) obj, j2);
                return;
            case 20:
                ((SavedMessagesController) obj2).lambda$loadCache$7((MessagesStorage) obj3, j2, (Runnable) obj);
                return;
            case 21:
                ((CameraController) obj2).lambda$finishRecordingVideo$15((File) obj3, (Bitmap) obj, j2);
                return;
            case 22:
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj2;
                quickRepliesController.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (sQLiteCursorQueryFinalized.next()) {
                        try {
                            try {
                                QuickRepliesController.QuickReply quickReply = new QuickRepliesController.QuickReply();
                                quickReply.id = sQLiteCursorQueryFinalized.intValue(i4);
                                quickReply.name = sQLiteCursorQueryFinalized.stringValue(1);
                                quickReply.order = sQLiteCursorQueryFinalized.intValue(2);
                                quickReply.messagesCount = sQLiteCursorQueryFinalized.intValue(3);
                                arrayList2.add(quickReply);
                                i4 = 0;
                            } catch (Exception e) {
                                e = e;
                                quickRepliesController = quickRepliesController;
                                arrayList = arrayList2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                        }
                    }
                    char c = 0;
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<Long> arrayList5 = new ArrayList<>();
                    ArrayList arrayList6 = new ArrayList();
                    int i5 = 0;
                    while (i5 < arrayList2.size()) {
                        try {
                            try {
                                QuickRepliesController.QuickReply quickReply2 = (QuickRepliesController.QuickReply) arrayList2.get(i5);
                                arrayList = arrayList2;
                                try {
                                    sQLiteCursor3 = sQLiteCursorQueryFinalized;
                                    try {
                                        try {
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Integer.valueOf(quickReply2.id);
                                            sQLiteCursorQueryFinalized = database.queryFinalized(str2, objArr);
                                            try {
                                                if (sQLiteCursorQueryFinalized.next()) {
                                                    str = str2;
                                                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                                                    if (nativeByteBufferByteBufferValue2 != null) {
                                                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                                        messageTLdeserialize.send_state = sQLiteCursorQueryFinalized.intValue(1);
                                                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                                                        nativeByteBufferByteBufferValue2.reuse();
                                                        messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(2);
                                                        messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(3);
                                                        messageTLdeserialize.flags |= 1073741824;
                                                        messageTLdeserialize.quick_reply_shortcut_id = sQLiteCursorQueryFinalized.intValue(4);
                                                        messageTLdeserialize.ttl = sQLiteCursorQueryFinalized.intValue(5);
                                                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList5, arrayList6, null);
                                                        quickRepliesController = quickRepliesController;
                                                        try {
                                                            MessageObject messageObject2 = new MessageObject(quickRepliesController.currentAccount, messageTLdeserialize, false, true);
                                                            quickReply2.topMessage = messageObject2;
                                                            quickReply2.topMessageId = messageTLdeserialize.id;
                                                            messageObject2.generateThumbs(false);
                                                            quickReply2.topMessage.applyQuickReply(quickReply2.name, quickReply2.id);
                                                            break;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            sQLiteCursor = sQLiteCursorQueryFinalized;
                                                            try {
                                                                FileLog.e(e);
                                                                if (sQLiteCursor != null) {
                                                                    sQLiteCursor2 = sQLiteCursor;
                                                                    sQLiteCursor2.dispose();
                                                                }
                                                                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController, arrayList3, arrayList4, arrayList, (Runnable) obj, 3));
                                                                return;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                if (sQLiteCursor != null) {
                                                                    sQLiteCursor.dispose();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                    sQLiteCursorQueryFinalized.dispose();
                                                    i5++;
                                                    str2 = str;
                                                    arrayList2 = arrayList;
                                                    database = database;
                                                    quickRepliesController = quickRepliesController;
                                                    c = 0;
                                                } else {
                                                    str = str2;
                                                }
                                                sQLiteCursorQueryFinalized.dispose();
                                                i5++;
                                                str2 = str;
                                                arrayList2 = arrayList;
                                                database = database;
                                                quickRepliesController = quickRepliesController;
                                                c = 0;
                                            } catch (Exception e3) {
                                                e = e3;
                                                quickRepliesController = quickRepliesController;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sQLiteCursor = sQLiteCursor3;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        quickRepliesController = quickRepliesController;
                                        sQLiteCursor = sQLiteCursor3;
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor2 = sQLiteCursor;
                                            sQLiteCursor2.dispose();
                                        }
                                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController, arrayList3, arrayList4, arrayList, (Runnable) obj, 3));
                                        return;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    sQLiteCursor3 = sQLiteCursorQueryFinalized;
                                    sQLiteCursor = sQLiteCursor3;
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor2 = sQLiteCursor;
                                        sQLiteCursor2.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController, arrayList3, arrayList4, arrayList, (Runnable) obj, 3));
                                    return;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor3 = sQLiteCursorQueryFinalized;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            arrayList = arrayList2;
                        }
                    }
                    quickRepliesController = quickRepliesController;
                    arrayList = arrayList2;
                    sQLiteCursor3 = sQLiteCursorQueryFinalized;
                    try {
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList6), arrayList4);
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList5, arrayList3);
                        }
                        sQLiteCursor2 = sQLiteCursor3;
                    } catch (Exception e7) {
                        e = e7;
                        sQLiteCursor = sQLiteCursor3;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor2 = sQLiteCursor;
                        }
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController, arrayList3, arrayList4, arrayList, (Runnable) obj, 3));
                        return;
                    }
                    break;
                } catch (Exception e8) {
                    e = e8;
                    quickRepliesController = quickRepliesController;
                    arrayList = arrayList2;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController, arrayList3, arrayList4, arrayList, (Runnable) obj, 3));
                return;
            case 23:
                MessagesStorage messagesStorage2 = (MessagesStorage) obj3;
                QuickRepliesController.QuickReply quickReply3 = (QuickRepliesController.QuickReply) obj;
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) obj2;
                quickRepliesController2.getClass();
                try {
                    ArrayList<Long> arrayList7 = new ArrayList<>();
                    ArrayList arrayList8 = new ArrayList();
                    SQLiteCursor sQLiteCursorQueryFinalized2 = messagesStorage2.getDatabase().queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", Integer.valueOf(quickReply3.id));
                    try {
                        if (!sQLiteCursorQueryFinalized2.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0)) == null) {
                            messageObject = null;
                        } else {
                            TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            messageTLdeserialize2.send_state = sQLiteCursorQueryFinalized2.intValue(1);
                            messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j2);
                            nativeByteBufferByteBufferValue.reuse();
                            messageTLdeserialize2.id = sQLiteCursorQueryFinalized2.intValue(2);
                            messageTLdeserialize2.date = sQLiteCursorQueryFinalized2.intValue(3);
                            messageTLdeserialize2.flags |= 1073741824;
                            messageTLdeserialize2.quick_reply_shortcut_id = sQLiteCursorQueryFinalized2.intValue(4);
                            messageTLdeserialize2.ttl = sQLiteCursorQueryFinalized2.intValue(5);
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList7, arrayList8, null);
                            messageObject = new MessageObject(quickRepliesController2.currentAccount, messageTLdeserialize2, false, true);
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                        ArrayList<TLRPC.Chat> arrayList10 = new ArrayList<>();
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList8), arrayList10);
                        }
                        if (!arrayList7.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList7, arrayList9);
                        }
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(quickRepliesController2, arrayList9, arrayList10, quickReply3, messageObject, 4));
                        sQLiteCursorQueryFinalized2.dispose();
                        return;
                    } catch (Exception e9) {
                        e = e9;
                        sQLiteCursor4 = sQLiteCursorQueryFinalized2;
                        try {
                            FileLog.e(e);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLiteCursor4 = sQLiteCursorQueryFinalized2;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor4 = null;
                } catch (Throwable th8) {
                    th = th8;
                    sQLiteCursor4 = null;
                }
                break;
            case 24:
                Browser.openUrl((Context) obj2, Uri.parse((String) obj3), j2 == 0, true, (Browser.Progress) obj);
                return;
            case 25:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj2;
                Context context = chatAttachAlert.getContext();
                ChatActivity chatActivity = (ChatActivity) obj3;
                MessageSuggestionParams messageSuggestionParamsEmpty = chatActivity.messageSuggestionParams;
                if (messageSuggestionParamsEmpty == null) {
                    messageSuggestionParamsEmpty = MessageSuggestionParams.empty();
                }
                new MessageSuggestionOfferSheet(context, chatAttachAlert.currentAccount, this.f$2, messageSuggestionParamsEmpty, chatActivity, (Theme.ResourcesProvider) obj, 0, new ArticleViewer$$ExternalSyntheticLambda21(22, chatAttachAlert, chatActivity)).show();
                return;
            case 26:
                TopicsTabsView topicsTabsView = (TopicsTabsView) obj2;
                topicsTabsView.getClass();
                ((ItemOptions) obj3).dismiss();
                TLRPC.User user = MessagesController.getInstance(topicsTabsView.currentAccount).getUser(Long.valueOf(j2));
                if (user != null) {
                    LaunchActivity$$ExternalSyntheticLambda112 launchActivity$$ExternalSyntheticLambda112 = new LaunchActivity$$ExternalSyntheticLambda112(topicsTabsView, j2, i3);
                    ChatActivity chatActivity2 = topicsTabsView.fragment;
                    AlertsCreator.createClearDaysDialogAlert(chatActivity2, -1, user, (TLRPC.Chat) obj, true, launchActivity$$ExternalSyntheticLambda112, chatActivity2.getResourceProvider());
                    return;
                }
                return;
            case 27:
                TopicsTabsView topicsTabsView2 = (TopicsTabsView) obj2;
                topicsTabsView2.excludeTopics.removeAll((HashSet) obj3);
                topicsTabsView2.updateTabs$1();
                ArrayList arrayList11 = (ArrayList) obj;
                int size = arrayList11.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj4 = arrayList11.get(i6);
                    i6++;
                    long jIntValue = ((Integer) obj4).intValue();
                    if (j2 == jIntValue) {
                        topicsTabsView2.selectTopic(jIntValue, false);
                        return;
                    }
                }
                return;
            case 28:
                DialogsActivity dialogsActivity3 = (DialogsActivity) obj2;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj3;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                int iMin = Integer.MAX_VALUE;
                if (dialogFilter != null) {
                    if (dialogsActivity3.isDialogPinned(dialog)) {
                        int size2 = dialogFilter.pinnedDialogs.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            iMin = Math.min(iMin, dialogFilter.pinnedDialogs.valueAt(i7));
                        }
                        i = iMin - dialogsActivity3.canPinCount;
                    }
                    j = this.f$2;
                    if (DialogObject.isEncryptedDialog(j)) {
                        encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(dialogsActivity3.getMessagesController(), j);
                    } else {
                        encryptedChatM = null;
                    }
                    undoView = dialogsActivity3.getUndoView();
                    if (undoView == null) {
                        return;
                    }
                    if (dialogsActivity3.isDialogPinned(dialog)) {
                        dialogsActivity = dialogsActivity3;
                        dialogsActivity.pinDialog(j, false, dialogFilter, i, true);
                        undoView.showWithAction(0L, 79, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
                    } else {
                        dialogsActivity = dialogsActivity3;
                        dialogsActivity.pinDialog(j, true, dialogFilter, i, true);
                        undoView.showWithAction(0L, 78, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
                        if (dialogFilter != null) {
                            if (encryptedChatM != null) {
                                if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChatM.user_id))) {
                                    dialogFilter.alwaysShow.add(Long.valueOf(encryptedChatM.user_id));
                                }
                            } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(j));
                            }
                        }
                    }
                    if (dialogFilter != null) {
                        DialogsActivity dialogsActivity4 = dialogsActivity;
                        FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, dialogsActivity4, null);
                        dialogsActivity2 = dialogsActivity4;
                    } else {
                        dialogsActivity2 = dialogsActivity;
                    }
                    dialogsActivity2.getMessagesController().reorderPinnedDialogs(dialogsActivity2.folderId, null, 0L);
                    dialogsActivity2.updateCounters(true);
                    if (dialogsActivity2.viewPages != null) {
                        i2 = 0;
                        while (true) {
                            viewPageArr = dialogsActivity2.viewPages;
                            if (i2 < viewPageArr.length) {
                                viewPageArr[i2].dialogsAdapter.isReordering = false;
                                i2++;
                            }
                        }
                    }
                    dialogsActivity2.updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                    return;
                }
                dialogsActivity3.getClass();
                i = Integer.MAX_VALUE;
                j = this.f$2;
                if (DialogObject.isEncryptedDialog(j)) {
                    encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(dialogsActivity3.getMessagesController(), j);
                } else {
                    encryptedChatM = null;
                }
                undoView = dialogsActivity3.getUndoView();
                if (undoView == null) {
                    return;
                }
                if (dialogsActivity3.isDialogPinned(dialog)) {
                    dialogsActivity = dialogsActivity3;
                    dialogsActivity.pinDialog(j, true, dialogFilter, i, true);
                    undoView.showWithAction(0L, 78, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
                    if (dialogFilter != null) {
                        if (encryptedChatM != null) {
                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChatM.user_id))) {
                                dialogFilter.alwaysShow.add(Long.valueOf(encryptedChatM.user_id));
                            }
                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j))) {
                            dialogFilter.alwaysShow.add(Long.valueOf(j));
                        }
                    }
                } else {
                    dialogsActivity = dialogsActivity3;
                    dialogsActivity.pinDialog(j, false, dialogFilter, i, true);
                    undoView.showWithAction(0L, 79, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
                }
                if (dialogFilter != null) {
                    DialogsActivity dialogsActivity5 = dialogsActivity;
                    FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, dialogsActivity5, null);
                    dialogsActivity2 = dialogsActivity5;
                } else {
                    dialogsActivity2 = dialogsActivity;
                }
                dialogsActivity2.getMessagesController().reorderPinnedDialogs(dialogsActivity2.folderId, null, 0L);
                dialogsActivity2.updateCounters(true);
                if (dialogsActivity2.viewPages != null) {
                    i2 = 0;
                    while (true) {
                        viewPageArr = dialogsActivity2.viewPages;
                        if (i2 < viewPageArr.length) {
                            viewPageArr[i2].dialogsAdapter.isReordering = false;
                            i2++;
                        }
                    }
                }
                dialogsActivity2.updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK, true);
                return;
            default:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj3;
                GroupCallActivity groupCallActivity = (GroupCallActivity) obj2;
                ChatObject.Call call = groupCallActivity.call;
                if (call == null || groupCallActivity.delayedGroupCallUpdated) {
                    return;
                }
                call.addInvitedUser(j2);
                groupCallActivity.applyCallParticipantUpdates(true);
                GroupVoipInviteAlert groupVoipInviteAlert = groupCallActivity.groupVoipInviteAlert;
                if (groupVoipInviteAlert != null) {
                    groupVoipInviteAlert.lambda$showGiftOfferSheet$15();
                }
                try {
                    alertDialogArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                alertDialogArr[0] = null;
                groupCallActivity.getUndoView().showWithAction(0L, 34, (TLRPC.User) obj, groupCallActivity.currentChat, (Runnable) null, (Runnable) null);
                return;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda121(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    public LaunchActivity$$ExternalSyntheticLambda121(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = j;
    }

    public LaunchActivity$$ExternalSyntheticLambda121(MessagesController messagesController, long j, Serializable serializable, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = messagesController;
        this.f$2 = j;
        this.f$0 = serializable;
        this.f$3 = obj;
    }

    public LaunchActivity$$ExternalSyntheticLambda121(MessagesController messagesController, Object obj, TLObject tLObject, long j, int i) {
        this.$r8$classId = i;
        this.f$1 = messagesController;
        this.f$0 = obj;
        this.f$3 = tLObject;
        this.f$2 = j;
    }

    public LaunchActivity$$ExternalSyntheticLambda121(MessagesController messagesController, TLObject tLObject, long j, Runnable runnable) {
        this.$r8$classId = 4;
        this.f$1 = messagesController;
        this.f$0 = tLObject;
        this.f$2 = j;
        this.f$3 = runnable;
    }
}
