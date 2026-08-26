package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.EditTextSettingsCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileBuffer;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PhotoViewer$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        long peerDialogId;
        TLRPC.Chat chat;
        long j;
        String string;
        TLRPC.InputPeer inputPeer;
        PaymentFormActivity.PaymentFormCallback paymentFormCallback;
        PaymentFormActivity.PaymentFormCallback paymentFormCallback2;
        ChatActivity.AnonymousClass39 anonymousClass39;
        String forcedFirstName = "";
        int i = 28;
        String string2 = null;
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                MaskPaintView maskPaintView = (MaskPaintView) this.f$1;
                maskPaintView.renderView.shutdown();
                maskPaintView.queue.postRunnable(new ChatActivity$$ExternalSyntheticLambda470(i));
                photoViewer.containerView.removeView(photoViewer.maskPaintView);
                break;
            case 1:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (tL_error != null) {
                    passportActivity.showEditDoneProgress$2(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        passportActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    } else {
                        AlertsCreator.showUpdateAppAlert(passportActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    }
                } else {
                    passportActivity.ignoreOnFailure = true;
                    passportActivity.callCallback(true);
                    passportActivity.finishFragment();
                }
                break;
            case 2:
                PassportActivity.PhoneConfirmationView.this.lastError = ((TLRPC.TL_error) this.f$1).text;
                break;
            case 3:
                ((PaymentFormActivity) this.f$0).setDonePressed(false);
                ((View) this.f$1).callOnClick();
                break;
            case 4:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.showEditDoneProgress$3(true, false);
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$1;
                if (tL_error2 != null) {
                    if (tL_error2.text.startsWith("CODE_INVALID")) {
                        PaymentFormActivity.shakeView(paymentFormActivity.codeFieldCell);
                        EditTextSettingsCell editTextSettingsCell = paymentFormActivity.codeFieldCell;
                        editTextSettingsCell.textView.setText("");
                        editTextSettingsCell.needDivider = false;
                        editTextSettingsCell.setWillNotDraw(true);
                    } else if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                        paymentFormActivity.showAlertWithText$1(LocaleController.getString(R.string.AppName), tL_error2.text);
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                        paymentFormActivity.showAlertWithText$1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    }
                    break;
                } else if (paymentFormActivity.getParentActivity() != null) {
                    PaymentFormActivity$$ExternalSyntheticLambda2 paymentFormActivity$$ExternalSyntheticLambda2 = paymentFormActivity.shortPollRunnable;
                    if (paymentFormActivity$$ExternalSyntheticLambda2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(paymentFormActivity$$ExternalSyntheticLambda2);
                        paymentFormActivity.shortPollRunnable = null;
                    }
                    paymentFormActivity.goToNextStep();
                    break;
                }
                break;
            case 5:
                ((PaymentFormActivity) this.f$0).lambda$sendForm$53((TLRPC.TL_payments_validatedRequestedInfo) this.f$1);
                break;
            case 6:
                PaymentFormActivity paymentFormActivity2 = (PaymentFormActivity) this.f$0;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f$1;
                Context parentActivity = paymentFormActivity2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.instance;
                }
                if (parentActivity != null) {
                    paymentFormActivity2.paymentStatusSent = true;
                    paymentFormActivity2.invoiceStatus = 1;
                    TLRPC.InputInvoice inputInvoice = paymentFormActivity2.invoiceInput;
                    boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z && (paymentFormCallback2 = paymentFormActivity2.paymentFormCallback) != null) {
                        paymentFormCallback2.onInvoiceStatusChanged(1);
                    }
                    paymentFormActivity2.goToNextStep();
                    if (z && (paymentFormCallback = paymentFormActivity2.paymentFormCallback) != null) {
                        paymentFormCallback.onInvoiceStatusChanged(paymentFormActivity2.invoiceStatus);
                    }
                    TLRPC.InputInvoice inputInvoice2 = paymentFormActivity2.invoiceInput;
                    if (inputInvoice2 instanceof TLRPC.TL_inputInvoiceStars) {
                        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice2).purpose;
                        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                            if (inputUser != null) {
                                peerDialogId = inputUser.user_id;
                            } else {
                                peerDialogId = 0;
                            }
                        } else if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
                            peerDialogId = 0;
                        } else {
                            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                        }
                    } else {
                        peerDialogId = 0;
                    }
                    if (peerDialogId > 0) {
                        forcedFirstName = UserObject.getForcedFirstName(paymentFormActivity2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                    } else if (peerDialogId < 0 && (chat = paymentFormActivity2.getMessagesController().getChat(Long.valueOf(-peerDialogId))) != null) {
                        forcedFirstName = chat.title;
                    }
                    TLRPC.InputInvoice inputInvoice3 = paymentFormActivity2.invoiceInput;
                    if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose2 = ((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose;
                        if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                            j = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose2).stars;
                        } else if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
                            j = ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose2).stars;
                        } else if (inputStorePaymentPurpose2 instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
                            j = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose2).stars;
                        } else {
                            j = 0;
                        }
                    } else {
                        j = 0;
                    }
                    int i3 = z ? (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z) {
                        string2 = LocaleController.getString(z3 ? R.string.StarsGiveawaySentPopup : z2 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    }
                    String str = string2;
                    if (!z) {
                        string = LocaleController.formatString(R.string.PaymentInfoHint, paymentFormActivity2.totalPrice[0], paymentFormActivity2.currentItemName);
                    } else if (z3) {
                        string = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) j);
                    } else {
                        string = LocaleController.formatPluralStringComma(z2 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) j, forcedFirstName);
                    }
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string);
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
                        Bulletin bulletinCreateSimpleBulletin = (peerDialogId == 0 || str == null || z3) ? str != null ? bulletinFactoryOf.createSimpleBulletin(str, spannableStringBuilderReplaceTags, i3) : bulletinFactoryOf.createSimpleBulletinWithIconSize(i3, 36, spannableStringBuilderReplaceTags) : bulletinFactoryOf.createSimpleBulletin(i3, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new PaymentFormActivity$$ExternalSyntheticLambda66(peerDialogId, i2));
                        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                        bulletinCreateSimpleBulletin.duration = 5000;
                        if (messageArr[0] != null) {
                            PassportActivity$$ExternalSyntheticLambda55 passportActivity$$ExternalSyntheticLambda55 = new PassportActivity$$ExternalSyntheticLambda55(paymentFormActivity2, bulletinCreateSimpleBulletin, z2, messageArr, 3);
                            Bulletin.Layout layout = bulletinCreateSimpleBulletin.layout;
                            if (layout != null) {
                                layout.setOnClickListener(passportActivity$$ExternalSyntheticLambda55);
                            }
                        }
                        bulletinCreateSimpleBulletin.show(z3);
                        break;
                    }
                }
                break;
            case 7:
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) this.f$0;
                if (animatedFileDrawable != null) {
                    AnimatedFileBuffer animatedFileBuffer = animatedFileDrawable.renderingBuffer;
                    ArrayList arrayList = animatedFileDrawable.unusedBuffers;
                    if (animatedFileBuffer != null) {
                        arrayList.add(animatedFileBuffer);
                    }
                    AnimatedFileBuffer animatedFileBuffer2 = animatedFileDrawable.nextRenderingBuffer;
                    if (animatedFileBuffer2 != null) {
                        arrayList.add(animatedFileBuffer2);
                    }
                    AnimatedFileBuffer animatedFileBuffer3 = animatedFileDrawable.nextRenderingBuffer2;
                    if (animatedFileBuffer3 != null) {
                        arrayList.add(animatedFileBuffer3);
                    }
                    animatedFileDrawable.renderingBuffer = new AnimatedFileBuffer((Bitmap) this.f$1);
                    animatedFileDrawable.nextRenderingBuffer = null;
                    animatedFileDrawable.nextRenderingBuffer2 = null;
                    animatedFileDrawable.invalidateInternal();
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f$0;
                ContextThemeWrapper contextThemeWrapper = photoViewer2.activityContext;
                BaseFragment baseFragment = photoViewer2.parentFragment;
                RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = new RevenueSharingAdsInfoBottomSheet(contextThemeWrapper, false, (DarkThemeResourceProvider) this.f$1, null);
                if (baseFragment == null) {
                    revenueSharingAdsInfoBottomSheet.show();
                } else if (baseFragment.getParentActivity() != null) {
                    baseFragment.showDialog(revenueSharingAdsInfoBottomSheet);
                }
                break;
            case 9:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f$0;
                photoViewer3.getClass();
                PhotoViewer.AnonymousClass40 anonymousClass40 = (PhotoViewer.AnonymousClass40) this.f$1;
                if (anonymousClass40.getWindow() != null) {
                    anonymousClass40.setFocusable(true);
                    ChatActivity chatActivity = photoViewer3.parentChatActivity;
                    if (chatActivity != null && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                        anonymousClass39.hidePopup(false, false, true);
                        break;
                    }
                }
                break;
            case 10:
                ((PhotoViewer$$ExternalSyntheticLambda174) this.f$0).run((Bitmap) this.f$1);
                break;
            case 11:
                PhotoViewer.AnonymousClass10 anonymousClass10 = (PhotoViewer.AnonymousClass10) this.f$0;
                anonymousClass10.getClass();
                ((View) this.f$1).setOutlineProvider(null);
                PhotoViewer photoViewer4 = anonymousClass10.this$0;
                ImageView imageView = photoViewer4.textureImageView;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                PhotoViewer.FirstFrameView firstFrameView = photoViewer4.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setOutlineProvider(null);
                }
                break;
            case 12:
                PhotoViewer.AnonymousClass56 anonymousClass56 = (PhotoViewer.AnonymousClass56) this.f$0;
                anonymousClass56.getClass();
                VideoPlayer videoPlayer = (VideoPlayer) this.f$1;
                if (videoPlayer.getDuration() > 0 && videoPlayer.getCurrentPosition() >= videoPlayer.getDuration() - 590) {
                    PhotoViewer.this.containerView.invalidate();
                }
                break;
            case 13:
                PhotoViewer.AnonymousClass60 anonymousClass60 = (PhotoViewer.AnonymousClass60) this.f$0;
                MaskPaintView maskPaintView2 = (MaskPaintView) this.f$1;
                maskPaintView2.renderView.shutdown();
                maskPaintView2.queue.postRunnable(new ChatActivity$$ExternalSyntheticLambda470(i));
                try {
                    anonymousClass60.this$0.containerView.removeView(maskPaintView2);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 14:
                PhotoViewer photoViewer5 = ((PhotoViewer.AnonymousClass2) this.f$0).this$0;
                if (photoViewer5.currentBitmap != null) {
                    ImageView imageView2 = photoViewer5.textureImageView;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.textureImageView.setImageBitmap(photoViewer5.currentBitmap);
                    }
                    ((ImageReceiver) ((TextureViewContainer) this.f$1).imageReceiver).setImageBitmap(photoViewer5.currentBitmap);
                }
                break;
            case 15:
                PhotoViewer.this.transitionNotificationLocker.lock();
                ((AnimatorSet) this.f$1).start();
                break;
            case 16:
                PhotoViewer.this.disableShowCheck = false;
                PhotoViewer.PlaceProviderObject placeProviderObject = (PhotoViewer.PlaceProviderObject) this.f$1;
                if (!placeProviderObject.keepImageReceiverVisible) {
                    placeProviderObject.imageReceiver.setVisible(false, true);
                }
                break;
            case 17:
                PollItemMenu pollItemMenu = (PollItemMenu) this.f$0;
                pollItemMenu.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f$1).text, false));
                pollItemMenu.dismiss(true);
                break;
            case 18:
                PollItemMenu pollItemMenu2 = (PollItemMenu) this.f$0;
                SendMessagesHelper.getInstance(pollItemMenu2.messageObject.currentAccount).deletePollOption(pollItemMenu2.messageObject, (byte[]) this.f$1);
                pollItemMenu2.dismiss(true);
                break;
            case 19:
                PollItemMenu pollItemMenu3 = (PollItemMenu) this.f$0;
                pollItemMenu3.getClass();
                AndroidUtilities.addToClipboard((String) this.f$1);
                pollItemMenu3.dismiss(true);
                break;
            case 20:
                ((PrivacyControlActivity) this.f$0).lambda$didUploadPhoto$0((TLObject) this.f$1);
                break;
            case 21:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
                privacyControlActivity.getClass();
                boolean[] zArr = (boolean[]) this.f$1;
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.finished();
                }
                break;
            case 22:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f$0;
                privacySettingsActivity.currentPassword = (TL_account.Password) this.f$1;
                privacySettingsActivity.initPassword();
                break;
            case 23:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f$0;
                boolean z4 = !privacySettingsActivity2.newSuggest;
                privacySettingsActivity2.newSuggest = z4;
                ((TextCheckCell) this.f$1).setChecked(z4);
                break;
            case 24:
                ((PrivacyUsersActivity) this.f$0).getMessagesController().unblockPeer(((Long) this.f$1).longValue());
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                long j2 = profileActivity.selectedUser;
                if (j2 == 0) {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i4 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i4);
                    if (AndroidUtilities.isTablet()) {
                        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i4, Long.valueOf(-profileActivity.chatId));
                    } else {
                        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i4, new Object[0]);
                    }
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.chatId, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
                    profileActivity.playProfileAnimation = 0;
                    profileActivity.finishFragment();
                } else {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j2));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.chatId, user);
                    if (profileActivity.currentChat != null && user != null && BulletinFactory.canShowBulletin(profileActivity)) {
                        BulletinFactory.createRemoveFromChatBulletin(profileActivity, user, profileActivity.currentChat.title).show();
                    }
                    if (profileActivity.chatInfo.participants.participants.remove((TLRPC.ChatParticipant) this.f$1)) {
                        profileActivity.updateListAnimated(true, false);
                    }
                }
                break;
            case 26:
                Bulletin bulletin = Bulletin.visibleBulletin;
                ProfileActivity profileActivity2 = (ProfileActivity) this.f$0;
                if (bulletin != null) {
                    profileActivity2.getClass();
                    bulletin.hide();
                }
                Browser.openUrl(profileActivity2.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f$1).url);
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f$0;
                NotificationCenter notificationCenter2 = profileActivity3.getNotificationCenter();
                int i5 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity3, i5);
                profileActivity3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i5, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) this.f$1)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity3.presentFragment(new ChatActivity(bundle), true);
                break;
            case 28:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f$0;
                profileActivity4.currentChat = profileActivity4.getMessagesStorage().getChat(profileActivity4.chatId);
                ((CountDownLatch) this.f$1).countDown();
                break;
            default:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f$0;
                profileActivity5.getClass();
                profileActivity5.currentChannelParticipant = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f$1)).participant;
                break;
        }
    }
}
