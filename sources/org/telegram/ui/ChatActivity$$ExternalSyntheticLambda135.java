package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.io.File;
import java.io.FileOutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda11;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda112;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.web.BotWebViewContainer;

public final class ChatActivity$$ExternalSyntheticLambda135 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public ChatActivity$$ExternalSyntheticLambda135(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
    }

    @Override
    public final void run() {
        PaymentFormActivity paymentFormActivity;
        PaymentFormActivity paymentFormActivity2;
        ?? r0;
        LiveCommentsView.LiveCommentView liveCommentView;
        ?? r2;
        LiveCommentsView.LiveCommentView liveCommentView2;
        LiveCommentsView.Message message;
        LiveCommentsView.LiveCommentView liveCommentView3;
        char c;
        StoryEntry storyEntryFromPhotoShoot;
        Object obj = this.f$6;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj7;
                chatActivity.getClass();
                ((ItemOptions) obj6).dontDismiss = true;
                MessageObject messageObject = (MessageObject) obj5;
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj4;
                String string = TextUtils.isEmpty(messageObject.caption) ? !TextUtils.isEmpty(messageObject.messageText) ? chatMessageCell.getMessageObject().messageText.toString() : (String) obj3 : chatMessageCell.getMessageObject().caption.toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                AndroidUtilities.createCalendarEvent(chatActivity.getParentActivity(), ((long) tL_messageEntityFormattedDate.date) * 1000, string.length() > 21 ? string.substring(0, 21) + "..." : string, string, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                ((ScrimOptions) obj).dismiss();
                break;
            case 1:
                ChatActivity chatActivity2 = (ChatActivity) obj7;
                chatActivity2.getClass();
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                boolean z = tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text);
                ChatActivity$$ExternalSyntheticLambda301 chatActivity$$ExternalSyntheticLambda301 = (ChatActivity$$ExternalSyntheticLambda301) obj2;
                TLObject tLObject = (TLObject) obj5;
                if (tLObject != null || (tL_error == null && (((TLObject) obj4) instanceof TLRPC.TL_boolTrue))) {
                    chatActivity$$ExternalSyntheticLambda301.run(tLObject, Boolean.valueOf(z));
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = (String) obj3;
                    ChatActivity.AnonymousClass127 anonymousClass127 = (ChatActivity.AnonymousClass127) obj;
                    anonymousClass127.onCancelListener = new ChatActivity$$ExternalSyntheticLambda26(chatActivity2, chatActivity2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new ChatActivity$$ExternalSyntheticLambda471(chatActivity2, anonymousClass127, chatActivity$$ExternalSyntheticLambda301, z, 0)), 9);
                    anonymousClass127.init();
                }
                break;
            case 2:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj7;
                chatMessageCellDelegate.getClass();
                ((AlertDialog) obj6).dismiss();
                TLObject tLObject2 = (TLObject) obj4;
                boolean z2 = tLObject2 instanceof TL_phone.groupCall;
                HashSet hashSet = (HashSet) obj3;
                ChatActivity chatActivity3 = ChatActivity.this;
                if (z2) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    chatActivity3.getMessagesController().putUsers(groupcall.users, false);
                    chatActivity3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        chatActivity3.showDialog(new CreateGroupCallSheet(chatActivity3.getParentActivity(), hashSet));
                    } else {
                        VoIPHelper.joinConference(chatActivity3.getParentActivity(), ((BaseFragment) chatActivity3).currentAccount, (TLRPC.TL_inputGroupCallInviteMessage) obj2, ((MessageObject) obj5).messageOwner.action.video, groupcall.call, null);
                    }
                } else {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                    if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        chatActivity3.showDialog(new CreateGroupCallSheet(chatActivity3.getParentActivity(), hashSet));
                    } else if (tL_error2 != null) {
                        BulletinFactory.of(chatActivity3).showForError(false, tL_error2);
                    }
                }
                break;
            case 3:
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13 = (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tL_error3 != null) {
                    boostViaGiftsBottomSheet$$ExternalSyntheticLambda13.run(tL_error3);
                } else {
                    TLObject tLObject3 = (TLObject) obj5;
                    if (tLObject3 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                        paymentForm.invoice.recurring = true;
                        ((MessagesController) obj4).putUsers(paymentForm.users, false);
                        paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (BaseFragment) obj2);
                    } else {
                        paymentFormActivity = tLObject3 instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject3) : null;
                    }
                    if (paymentFormActivity != null) {
                        paymentFormActivity.paymentFormCallback = new RateCallLayout$$ExternalSyntheticLambda1(12, (BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13) obj, boostViaGiftsBottomSheet$$ExternalSyntheticLambda13);
                        LaunchActivity.getLastFragment().showAsSheet(paymentFormActivity, new BaseFragment.BottomSheetParams());
                    } else {
                        boostViaGiftsBottomSheet$$ExternalSyntheticLambda13.run(null);
                    }
                }
                break;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                if (tL_error4 != null) {
                    callback.run(tL_error4);
                } else {
                    TLObject tLObject4 = (TLObject) obj5;
                    if (tLObject4 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject4;
                        paymentForm2.invoice.recurring = true;
                        ((MessagesController) obj4).putUsers(paymentForm2.users, false);
                        paymentFormActivity2 = new PaymentFormActivity(paymentForm2, (TLRPC.TL_inputInvoicePremiumGiftCode) obj3, (BaseFragment) obj2);
                    } else {
                        paymentFormActivity2 = tLObject4 instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject4) : null;
                    }
                    if (paymentFormActivity2 != null) {
                        paymentFormActivity2.paymentFormCallback = new RateCallLayout$$ExternalSyntheticLambda1(13, (Utilities.Callback) obj, callback);
                        LaunchActivity.getLastFragment().showAsSheet(paymentFormActivity2, new BaseFragment.BottomSheetParams());
                    } else {
                        callback.run(null);
                    }
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                launchActivity.getClass();
                ((AlertDialog) obj6).dismiss();
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj5;
                if (tL_error5 == null) {
                    LoginActivity loginActivity = new LoginActivity();
                    loginActivity.cancelDeletionPhone = (String) obj3;
                    loginActivity.cancelDeletionParams = (Bundle) obj4;
                    loginActivity.cancelDeletionCode = (TLRPC.TL_auth_sentCode) ((TLObject) obj2);
                    loginActivity.activityMode = 1;
                    launchActivity.presentFragment(loginActivity);
                } else {
                    AlertsCreator.processError(launchActivity.currentAccount, tL_error5, ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment(), (TL_account.sendConfirmPhoneCode) obj, new Object[0]);
                }
                break;
            case 6:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj7;
                loginPayView.getClass();
                LinkManager$$ExternalSyntheticLambda12 linkManager$$ExternalSyntheticLambda12 = (LinkManager$$ExternalSyntheticLambda12) obj;
                if (((BillingResult) obj6).zza == 0 && (r0 = (AbstractCollection) obj5) != 0 && !r0.isEmpty()) {
                    for (Purchase purchase : r0) {
                        if (purchase.getProducts().contains((String) obj3)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.zza;
                            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj4;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new ChatActivity$$ExternalSyntheticLambda206(loginPayView, tL_inputStorePaymentAuthCode, purchase, (TLRPC.TL_payments_canPurchaseStore) obj2, linkManager$$ExternalSyntheticLambda12, 9), 74);
                            break;
                        }
                    }
                }
                linkManager$$ExternalSyntheticLambda12.run();
                break;
            case 7:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) obj7;
                phoneView.nextPressed = false;
                LoginActivity loginActivity2 = LoginActivity.this;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj6;
                if (tL_error6 == null) {
                    TLObject tLObject5 = (TLObject) obj5;
                    Bundle bundle = (Bundle) obj4;
                    if (tLObject5 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                        TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject5).authorization;
                        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                            if (tL_help_termsOfService != null) {
                                loginActivity2.currentTermsOfService = tL_help_termsOfService;
                            }
                            loginActivity2.setPage(5, true, bundle, false);
                        } else {
                            loginActivity2.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization, false);
                        }
                    } else {
                        loginActivity2.fillNextCodeParams(bundle, (TLRPC.auth_SentCode) tLObject5, true);
                    }
                } else {
                    String str = tL_error6.text;
                    if (str != null) {
                        String str2 = (String) obj3;
                        if (str.contains("SESSION_PASSWORD_NEEDED")) {
                            ConnectionsManager.getInstance(((BaseFragment) loginActivity2).currentAccount).sendRequest(new TL_account.getPassword(), new ProfileActivity$$ExternalSyntheticLambda65(i, phoneView, str2), 10);
                        } else {
                            ChatActivity.AnonymousClass117 anonymousClass117 = (ChatActivity.AnonymousClass117) obj2;
                            if (tL_error6.text.contains("PHONE_NUMBER_INVALID")) {
                                LoginActivity.needShowInvalidAlert(loginActivity2, str2, anonymousClass117, false);
                            } else if (tL_error6.text.contains("PHONE_PASSWORD_FLOOD")) {
                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else if (tL_error6.text.contains("PHONE_NUMBER_FLOOD")) {
                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            } else if (tL_error6.text.contains("PHONE_NUMBER_BANNED")) {
                                LoginActivity.needShowInvalidAlert(loginActivity2, str2, anonymousClass117, true);
                            } else if (tL_error6.text.contains("PHONE_CODE_EMPTY") || tL_error6.text.contains("PHONE_CODE_INVALID")) {
                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                            } else if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                                loginActivity2.setPage(0, true, null, true);
                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else if (tL_error6.code != -1000) {
                                AlertsCreator.processError(((BaseFragment) loginActivity2).currentAccount, tL_error6, loginActivity2, (TLObject) obj, (String) anonymousClass117.this$0);
                            }
                        }
                    }
                }
                if (!loginActivity2.isRequestingFirebaseSms) {
                    loginActivity2.needHideProgress(false, true);
                }
                break;
            case 8:
                PassportActivity.AnonymousClass20 anonymousClass20 = PassportActivity.AnonymousClass20.this;
                TLObject tLObject6 = (TLObject) obj6;
                String str3 = (String) obj3;
                if (tLObject6 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject6;
                    HashMap map = new HashMap();
                    map.put("email", str3);
                    map.put("pattern", sentemailcode.email_pattern);
                    PassportActivity passportActivity = PassportActivity.this;
                    PassportActivity passportActivity2 = new PassportActivity(6, passportActivity.currentForm, passportActivity.currentPassword, (TLRPC.TL_secureRequiredType) obj5, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, map, (HashMap) null);
                    PassportActivity passportActivity3 = PassportActivity.this;
                    ((BaseFragment) passportActivity2).currentAccount = ((BaseFragment) passportActivity3).currentAccount;
                    passportActivity2.emailCodeLength = sentemailcode.length;
                    passportActivity2.saltedPassword = passportActivity3.saltedPassword;
                    passportActivity2.secureSecret = passportActivity3.secureSecret;
                    passportActivity2.delegate = (PassportActivity.PassportActivityDelegate) obj4;
                    passportActivity3.presentFragment(passportActivity2, true);
                } else {
                    TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                    PassportActivity.this.showAlertWithText(LocaleController.getString(R.string.PassportEmail), tL_error7.text);
                    PhotoViewer.AnonymousClass14 anonymousClass14 = (PhotoViewer.AnonymousClass14) obj;
                    if (anonymousClass14 != null) {
                        anonymousClass14.onError(tL_error7.text, str3);
                    }
                }
                break;
            case 9:
                StarsController starsController = (StarsController) obj7;
                starsController.getClass();
                ((boolean[]) obj6)[0] = true;
                starsController.payAfterConfirmed((String) obj3, (TLRPC.ChatInvite) obj5, new StarsController$$ExternalSyntheticLambda112((boolean[]) obj4, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 10:
                StarsController starsController2 = (StarsController) obj7;
                starsController2.getClass();
                TLObject tLObject7 = (TLObject) obj6;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                    starsController2.payAfterConfirmed((MessageObject) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) tLObject7, callback2);
                } else {
                    callback2.run(Boolean.FALSE);
                    TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                    zzks.m(R.string.UnknownErrorCode, new Object[]{tL_error8 != null ? tL_error8.text : "FAILED_GETTING_FORM"}, (BulletinFactory) obj2, R.raw.error);
                }
                break;
            case 11:
                StarsController starsController3 = (StarsController) obj7;
                List list = (List) obj6;
                JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3 = (JoinGroupAlert$$ExternalSyntheticLambda3) obj5;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda11(joinGroupAlert$$ExternalSyntheticLambda3, 1));
                } else {
                    ProductDetails productDetails = (ProductDetails) list.get(0);
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails == null) {
                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda11(joinGroupAlert$$ExternalSyntheticLambda3, 2));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                        tL_inputStorePaymentStarsGift.currency = oneTimePurchaseOfferDetails.zzc;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TL_stars.TL_starsGiftOption) obj3).currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(starsController3.currentAccount).sendRequest(tL_payments_canPurchaseStore, new UserInfoActivity$$ExternalSyntheticLambda1(productDetails, (BillingResult) obj2, joinGroupAlert$$ExternalSyntheticLambda3, (Activity) obj, tL_inputStorePaymentStarsGift, list, 4));
                    }
                }
                break;
            case 12:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) obj7;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                if (starsReactionsSheet.liveStories) {
                    LiveCommentsView.LiveCommentView[] liveCommentViewArr = (LiveCommentsView.LiveCommentView[]) obj6;
                    LiveCommentsView.LiveCommentView liveCommentView4 = liveCommentViewArr[0];
                    if (liveCommentView4 != null) {
                        liveCommentView3 = liveCommentView4;
                        r2 = 0;
                    } else {
                        PeerStoriesView.AnonymousClass10 anonymousClass10 = starsReactionsSheet.commentsView;
                        int i2 = starsReactionsSheet.sentMessageId;
                        int i3 = 0;
                        while (true) {
                            if (i3 < anonymousClass10.listView.getChildCount()) {
                                View childAt = anonymousClass10.listView.getChildAt(i3);
                                if ((childAt instanceof LiveCommentsView.LiveCommentView) && (message = (liveCommentView2 = (LiveCommentsView.LiveCommentView) childAt).message) != null && message.id == i2) {
                                    liveCommentView = liveCommentView2;
                                } else {
                                    i3++;
                                }
                            } else {
                                liveCommentView = null;
                            }
                        }
                        r2 = 0;
                        liveCommentViewArr[0] = liveCommentView;
                        liveCommentView3 = liveCommentView;
                    }
                    if (liveCommentView3 != 0) {
                        liveCommentView3.setDrawStar(r2);
                        liveCommentView3.getLocationInWindow(iArr);
                        ColoredImageSpan[] coloredImageSpanArr = liveCommentView3.starsViewCache;
                        if (coloredImageSpanArr[r2] == null) {
                            c = 0;
                        } else {
                            TextView textView = liveCommentView3.starsView;
                            if (textView.getLayout() == null) {
                                c = 0;
                            } else {
                                c = 0;
                                float x = textView.getX() + textView.getPaddingLeft() + coloredImageSpanArr[0].translateX;
                                float y = textView.getY() + textView.getPaddingTop();
                                ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
                                float f = y + coloredImageSpan.translateY;
                                rectF.set(x, f, coloredImageSpan.drawable.getBounds().width() + x, coloredImageSpanArr[0].drawable.getBounds().height() + f);
                            }
                        }
                        rectF.offset(iArr[c], iArr[1]);
                    }
                } else {
                    ((View) obj3).getLocationInWindow(iArr);
                    ReactionsLayoutInBubble reactionsLayoutInBubble = (ReactionsLayoutInBubble) obj2;
                    ReactionsLayoutInBubble.ReactionButton reactionButton = (ReactionsLayoutInBubble.ReactionButton) obj;
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + reactionsLayoutInBubble.x + reactionButton.x, ((reactionButton.height - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + reactionsLayoutInBubble.y + reactionButton.y, AndroidUtilities.dp(26.0f) + iArr[0] + reactionsLayoutInBubble.x + reactionButton.x, ((AndroidUtilities.dp(22.0f) + reactionButton.height) / 2.0f) + iArr[1] + reactionsLayoutInBubble.y + reactionButton.y);
                }
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj7;
                botWebViewContainer.getClass();
                int[] iArr2 = (int[]) obj6;
                File file = (File) obj5;
                if (iArr2[4] > 0) {
                    int i4 = iArr2[1];
                    int i5 = iArr2[2];
                    int photoSize = i4 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i4;
                    int photoSize2 = i5 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i5;
                    File fileMakeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "jpg");
                    AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap firstFrame = animatedFileDrawable.getFirstFrame();
                    animatedFileDrawable.recycle();
                    if (firstFrame != null) {
                        try {
                            firstFrame.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(fileMakeCacheFile));
                        } catch (Exception e) {
                            FileLog.e(e);
                            fileMakeCacheFile = null;
                        }
                    }
                    String absolutePath = fileMakeCacheFile == null ? null : fileMakeCacheFile.getAbsolutePath();
                    long j = iArr2[4];
                    storyEntryFromPhotoShoot = new StoryEntry();
                    storyEntryFromPhotoShoot.fromCamera = true;
                    storyEntryFromPhotoShoot.file = file;
                    storyEntryFromPhotoShoot.fileDeletable = true;
                    storyEntryFromPhotoShoot.orientation = 0;
                    storyEntryFromPhotoShoot.invert = 0;
                    storyEntryFromPhotoShoot.isVideo = true;
                    storyEntryFromPhotoShoot.duration = j;
                    storyEntryFromPhotoShoot.thumbPath = absolutePath;
                    storyEntryFromPhotoShoot.left = 0.0f;
                    storyEntryFromPhotoShoot.right = Math.min(1.0f, 59500.0f / j);
                    storyEntryFromPhotoShoot.width = i4;
                    storyEntryFromPhotoShoot.height = i5;
                    storyEntryFromPhotoShoot.setupMatrix();
                } else {
                    storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                AlertDialog alertDialog = (AlertDialog) obj4;
                if (storyEntryFromPhotoShoot.width <= 0 || storyEntryFromPhotoShoot.height <= 0) {
                    alertDialog.dismissUnless(500L);
                } else {
                    String str4 = (String) obj3;
                    if (str4 != null) {
                        storyEntryFromPhotoShoot.caption = str4;
                    }
                    String str5 = (String) obj2;
                    if (!TextUtils.isEmpty(str5) && UserConfig.getInstance(botWebViewContainer.currentAccount).isPremium()) {
                        if (storyEntryFromPhotoShoot.mediaEntities == null) {
                            storyEntryFromPhotoShoot.mediaEntities = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
                        mediaEntity.linkSettings = webPagePreview;
                        webPagePreview.url = str5;
                        String str6 = (String) obj;
                        if (str6 != null) {
                            webPagePreview.flags |= 2;
                            webPagePreview.name = str6;
                        }
                        storyEntryFromPhotoShoot.mediaEntities.add(mediaEntity);
                    }
                    StoryRecorder.getInstance(botWebViewContainer.parentActivity, UserConfig.selectedAccount).openRepost(null, storyEntryFromPhotoShoot);
                    alertDialog.dismissUnless(500L);
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda135(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = str;
        this.f$2 = tLObject;
        this.f$3 = obj3;
        this.f$5 = obj4;
        this.f$6 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda135(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 2;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = alertDialog;
        this.f$3 = tLObject;
        this.f$4 = hashSet;
        this.f$5 = tL_inputGroupCallInviteMessage;
        this.f$2 = messageObject;
        this.f$6 = tL_error;
    }

    public ChatActivity$$ExternalSyntheticLambda135(ChatActivity chatActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ChatActivity$$ExternalSyntheticLambda301 chatActivity$$ExternalSyntheticLambda301, String str, ChatActivity.AnonymousClass127 anonymousClass127) {
        this.$r8$classId = 1;
        this.f$0 = chatActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tLObject2;
        this.f$5 = chatActivity$$ExternalSyntheticLambda301;
        this.f$4 = str;
        this.f$6 = anonymousClass127;
    }

    public ChatActivity$$ExternalSyntheticLambda135(LaunchActivity launchActivity, AlertDialog alertDialog, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.$r8$classId = 5;
        this.f$0 = launchActivity;
        this.f$1 = alertDialog;
        this.f$2 = tL_error;
        this.f$4 = str;
        this.f$3 = bundle;
        this.f$5 = tLObject;
        this.f$6 = sendconfirmphonecode;
    }

    public ChatActivity$$ExternalSyntheticLambda135(LoginActivity.LoginPayView loginPayView, BillingResult billingResult, List list, String str, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, LinkManager$$ExternalSyntheticLambda12 linkManager$$ExternalSyntheticLambda12) {
        this.$r8$classId = 6;
        this.f$0 = loginPayView;
        this.f$1 = billingResult;
        this.f$2 = (AbstractCollection) list;
        this.f$4 = str;
        this.f$3 = tL_inputStorePaymentAuthCode;
        this.f$5 = tL_payments_canPurchaseStore;
        this.f$6 = linkManager$$ExternalSyntheticLambda12;
    }
}
