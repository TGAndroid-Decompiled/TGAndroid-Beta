package org.telegram.ui;

import android.os.SystemClock;
import android.widget.TextView;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda17;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class BoostsActivity$$ExternalSyntheticLambda7 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public BoostsActivity$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                BoostsActivity boostsActivity = (BoostsActivity) this.f$0;
                boostsActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(boostsActivity, (CountDownLatch) this.f$1, tLObject, (BoostsActivity$$ExternalSyntheticLambda4) this.f$2, 13));
                break;
            case 1:
                BoostsActivity boostsActivity2 = (BoostsActivity) this.f$0;
                boostsActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(boostsActivity2, (CountDownLatch) this.f$1, tLObject, (BoostsActivity$$ExternalSyntheticLambda4) this.f$2, 14));
                break;
            case 2:
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(businessLinksController, tLObject, (TL_account.TL_businessChatLink) this.f$1, (ChatActivityEnterView$$ExternalSyntheticLambda4) this.f$2, 15));
                break;
            case 3:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                chatbotSheet.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(chatbotSheet, (TL_account.TL_connectedBot) this.f$1, (TL_account.TL_businessBotRecipients) this.f$2, 25));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218((QuickRepliesController) this.f$0, tLObject, (ArrayList) this.f$1, (TLRPC.TL_messages_sendQuickReplyMessages) this.f$2, tL_error, 5));
                break;
            case 5:
                ChangeUsernameActivity changeUsernameActivity = (ChangeUsernameActivity) this.f$0;
                changeUsernameActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(changeUsernameActivity, (String) this.f$1, tL_error, tLObject, (TL_account.checkUsername) this.f$2, 7));
                break;
            case 6:
                final ChangeUsernameActivity changeUsernameActivity2 = (ChangeUsernameActivity) this.f$0;
                changeUsernameActivity2.getClass();
                final AlertDialog alertDialog = (AlertDialog) this.f$1;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(changeUsernameActivity2, alertDialog, (TLRPC.User) tLObject, 7));
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    final int i = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    AlertDialog alertDialog2 = alertDialog;
                                    ChangeUsernameActivity changeUsernameActivity3 = changeUsernameActivity2;
                                    changeUsernameActivity3.getClass();
                                    try {
                                        alertDialog2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    changeUsernameActivity3.finishFragment();
                                    break;
                                default:
                                    AlertDialog alertDialog3 = alertDialog;
                                    ChangeUsernameActivity changeUsernameActivity4 = changeUsernameActivity2;
                                    changeUsernameActivity4.getClass();
                                    try {
                                        alertDialog3.dismiss();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                    changeUsernameActivity4.shakeIfOff();
                                    break;
                            }
                        }
                    });
                } else if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) || "USERNAME_INVALID".equals(tL_error.text)) {
                    final int i2 = 1;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    AlertDialog alertDialog2 = alertDialog;
                                    ChangeUsernameActivity changeUsernameActivity3 = changeUsernameActivity2;
                                    changeUsernameActivity3.getClass();
                                    try {
                                        alertDialog2.dismiss();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    changeUsernameActivity3.finishFragment();
                                    break;
                                default:
                                    AlertDialog alertDialog3 = alertDialog;
                                    ChangeUsernameActivity changeUsernameActivity4 = changeUsernameActivity2;
                                    changeUsernameActivity4.getClass();
                                    try {
                                        alertDialog3.dismiss();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                    changeUsernameActivity4.shakeIfOff();
                                    break;
                            }
                        }
                    });
                } else {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(changeUsernameActivity2, alertDialog, tL_error, (TL_account.updateUsername) this.f$2, 21));
                }
                break;
            case 7:
                ChannelBoostLayout channelBoostLayout = (ChannelBoostLayout) this.f$0;
                channelBoostLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(channelBoostLayout, (CountDownLatch) this.f$1, tLObject, (ChannelBoostLayout$$ExternalSyntheticLambda2) this.f$2, 23));
                break;
            case 8:
                ChannelBoostLayout channelBoostLayout2 = (ChannelBoostLayout) this.f$0;
                channelBoostLayout2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(channelBoostLayout2, (CountDownLatch) this.f$1, tLObject, (ChannelBoostLayout$$ExternalSyntheticLambda2) this.f$2, 22));
                break;
            case 9:
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$0;
                channelCreateActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(channelCreateActivity, (String) this.f$1, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) this.f$2, 10));
                break;
            case 10:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(chatActivity, (ChatActivity.AnonymousClass127) this.f$1, tLObject, (ChatActivity$$ExternalSyntheticLambda155) this.f$2, 24));
                break;
            case 11:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                chatActivity2.getClass();
                AndroidUtilities.cancelRunOnUIThread((ChatActivity$$ExternalSyntheticLambda271) this.f$1);
                chatActivity2.selectedObject.messageOwner.voiceTranscriptionRated = true;
                chatActivity2.getMessagesStorage().updateMessageVoiceTranscriptionOpen(chatActivity2.selectedObject.getDialogId(), chatActivity2.selectedObject.getId(), chatActivity2.selectedObject.messageOwner);
                ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5 = new ChatActivity$$ExternalSyntheticLambda5(chatActivity2, 18);
                long[] jArr = (long[]) this.f$2;
                AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda5, jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 12:
                ChatActivity chatActivity3 = (ChatActivity) this.f$0;
                chatActivity3.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda337((AlertDialog[]) this.f$1, 1));
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(chatActivity3, tL_error, (TLRPC.TL_messages_editMessage) this.f$2, 20));
                } else {
                    chatActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 13:
                ChatEditTypeActivity chatEditTypeActivity = (ChatEditTypeActivity) this.f$0;
                chatEditTypeActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(chatEditTypeActivity, (String) this.f$1, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) this.f$2, 12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(this.f$0, this.f$1, tLObject, this.f$2, 8));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(this.f$0, this.f$1, tLObject, this.f$2, 9));
                break;
            case 16:
                FolderBottomSheet folderBottomSheet = (FolderBottomSheet) this.f$0;
                folderBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(folderBottomSheet, (BaseFragment) this.f$1, (ArrayList) this.f$2, 9));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13(tL_error, (ButtonWithCounterView) this.f$0, (BottomSheet) this.f$1, (Runnable) this.f$2, 16));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(tL_error, (Utilities.Callback) this.f$0, tLObject, (MessagesController) this.f$1, (Utilities.Callback) this.f$2, 16));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(tL_error, (SendMessagesHelper$$ExternalSyntheticLambda17) this.f$0, tLObject, (MessagesController) this.f$1, (FileRefController$$ExternalSyntheticLambda21) this.f$2, 17));
                break;
            case 20:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(23, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) this.f$0, tL_error));
                } else if (tLObject != null) {
                    ((MessagesController) this.f$1).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21) this.f$2, 21));
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(tLObject, (MessagesController) this.f$0, (GiftSheet$$ExternalSyntheticLambda23) this.f$1, (BoostDialogs$$ExternalSyntheticLambda13) this.f$2, tL_error, 18));
                break;
            case 22:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.f$0;
                userSelectorBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(userSelectorBottomSheet, tLObject, (TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tL_error, 19));
                break;
            case 23:
                StickersAlert stickersAlert = (StickersAlert) this.f$0;
                stickersAlert.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(stickersAlert, (String) this.f$1, tL_error, tLObject, (TextView) this.f$2, 20));
                break;
            case 24:
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = (SuggestBirthdayActionLayout) this.f$0;
                suggestBirthdayActionLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(suggestBirthdayActionLayout, tLObject, (TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tL_error, 21));
                break;
            case 25:
                ContentPreviewViewer contentPreviewViewer = (ContentPreviewViewer) this.f$0;
                contentPreviewViewer.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(contentPreviewViewer, tL_error, tLObject, (ArrayList) this.f$1, (TLRPC.TL_messages_getMyStickers) this.f$2, 23));
                break;
            case 26:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(dialogsActivity, tLObject, (TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tL_error, 24));
                break;
            case 27:
                DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$0;
                dialogsActivity2.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda120(dialogsActivity2, (TLRPC.TL_attachMenuBot) this.f$1, (LaunchActivity) this.f$2, 1));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5((FiltersSetupActivity.ListAdapter) this.f$0, (AlertDialog) this.f$1, (MessagesController.DialogFilter) this.f$2, 22));
                break;
            default:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) this.f$0;
                sendGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda218(sendGiftSheet, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.f$1, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.f$2, 25));
                break;
        }
    }
}
