package org.telegram.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class LinkManager$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public LinkManager$$ExternalSyntheticLambda20(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$2 = tLObject;
        this.f$3 = obj;
        this.f$1 = tL_error;
        this.f$4 = tLObject2;
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda36() {
        long j;
        long j2;
        int i;
        int iLongValue;
        long jLongValue;
        ArrayList arrayList = (ArrayList) this.f$1;
        ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) this.f$2;
        ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.f$3;
        MessagesStorage messagesStorage = (MessagesStorage) this.f$0;
        int i2 = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                iLongValue = 0;
                jLongValue = 0;
                while (sQLiteCursorQueryFinalized.next()) {
                    try {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            TL_stars.StarGift starGiftTLdeserialize = TL_stars.StarGift.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                            if (starGiftTLdeserialize != null) {
                                arrayList.add(starGiftTLdeserialize);
                            }
                            nativeByteBufferByteBufferValue.reuse();
                            iLongValue = (int) sQLiteCursorQueryFinalized.longValue(1);
                            jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                        }
                    } catch (Exception e) {
                        e = e;
                        i2 = iLongValue;
                        j = jLongValue;
                        FileLog.e(e);
                        if (sQLiteCursorQueryFinalized != null) {
                            iLongValue = i2;
                            jLongValue = j;
                        } else {
                            j2 = j;
                            i = i2;
                        }
                        AndroidUtilities.runOnUIThread(new MessageSeenView$$ExternalSyntheticLambda1((StoriesViewPager$$ExternalSyntheticLambda0) this.f$4, arrayList, i, j2, arrayList3, arrayList2));
                    }
                }
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        if (peerDialogId > 0) {
                            arrayList4.add(Long.valueOf(peerDialogId));
                        } else if (peerDialogId < 0) {
                            arrayList5.add(Long.valueOf(-peerDialogId));
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    messagesStorage.getUsersInternal(arrayList4, arrayList3);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            j = 0;
        }
        sQLiteCursorQueryFinalized.dispose();
        i = iLongValue;
        j2 = jLongValue;
        AndroidUtilities.runOnUIThread(new MessageSeenView$$ExternalSyntheticLambda1((StoriesViewPager$$ExternalSyntheticLambda0) this.f$4, arrayList, i, j2, arrayList3, arrayList2));
    }

    @Override
    public final void run() {
        PaymentFormActivity paymentFormActivity;
        ChartData chartData;
        int i;
        PhotoViewer.PhotoViewerProvider photoViewerProvider;
        String str;
        PaymentFormActivity paymentFormActivity2 = null;
        PaymentFormActivity paymentFormActivity3 = null;
        savedStarGift = null;
        TL_stars.SavedStarGift savedStarGift = null;
        PaymentFormActivity paymentFormActivity4 = null;
        final int i2 = 1;
        final int i3 = 0;
        Object obj = this.f$4;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                LinkManager linkManager = (LinkManager) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                if (tL_error == null) {
                    LaunchActivity launchActivity = linkManager.activity;
                    if (!launchActivity.isFinishing()) {
                        TLObject tLObject = (TLObject) obj2;
                        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
                        int i4 = linkManager.currentAccount;
                        if (z) {
                            SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda3 = launchActivity.navigateToPremiumGiftCallback;
                            launchActivity.navigateToPremiumGiftCallback = null;
                            StarsController.getInstance(i4, false).openPaymentForm(new LinkManager$$ExternalSyntheticLambda18(linkManager, 1), null, (TLRPC.TL_inputInvoiceSlug) obj4, (TLRPC.TL_payments_paymentFormStars) tLObject, new LinkManager$$ExternalSyntheticLambda24(sendGiftSheet$$ExternalSyntheticLambda3, i3));
                        } else {
                            if (tLObject instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                                MessagesController.getInstance(i4).putUsers(paymentForm.users, false);
                                paymentFormActivity = new PaymentFormActivity(paymentForm, null, (String) obj, LaunchActivity.getSafeLastFragment());
                            } else {
                                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
                            }
                            if (paymentFormActivity != null) {
                                SendGiftSheet$$ExternalSyntheticLambda3 sendGiftSheet$$ExternalSyntheticLambda4 = launchActivity.navigateToPremiumGiftCallback;
                                if (sendGiftSheet$$ExternalSyntheticLambda4 != null) {
                                    launchActivity.navigateToPremiumGiftCallback = null;
                                    paymentFormActivity.paymentFormCallback = new LinkManager$$ExternalSyntheticLambda25(sendGiftSheet$$ExternalSyntheticLambda4, i3);
                                }
                                linkManager.presentFragment(paymentFormActivity, false);
                            }
                        }
                    }
                    break;
                } else {
                    linkManager.getClass();
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid, LinkManager.getBulletinFactory(), null);
                    } else {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.PaymentInvoiceLinkInvalid, LinkManager.getBulletinFactory(), null);
                    }
                }
                linkManager.done();
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                launchActivity2.getClass();
                DialogsActivity dialogsActivity = (DialogsActivity) obj3;
                BaseFragment baseFragment = (BaseFragment) obj2;
                if (dialogsActivity != null) {
                    if (baseFragment != null) {
                        baseFragment.dismissCurrentDialog();
                    }
                    while (true) {
                        ArrayList arrayList = launchActivity2.visibleDialogs;
                        if (i3 >= arrayList.size()) {
                            arrayList.clear();
                            launchActivity2.presentFragment(dialogsActivity);
                        } else {
                            if (((Dialog) arrayList.get(i3)).isShowing()) {
                                ((Dialog) arrayList.get(i3)).dismiss();
                            }
                            i3++;
                        }
                    }
                } else if (baseFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    long j = ((TLRPC.User) obj4).id;
                    chatActivity.openAttachMenu();
                    ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
                    if (anonymousClass78 != null) {
                        anonymousClass78.showBotLayout(j, (String) obj, true, false);
                    }
                }
                break;
            case 2:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                launchActivity3.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 == null) {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                    if (tL_error2 != null) {
                        if (!"URL_EXPIRED".equalsIgnoreCase(tL_error2.text)) {
                            OAuthSheet.getBulletinFactory().showForError(false, tL_error2);
                        } else {
                            OAuthSheet.getBulletinFactory().createSimpleBulletin(launchActivity3.getString(R.string.BotAuthLoggedInFailTitle), launchActivity3.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).show();
                        }
                    }
                } else {
                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                    if (tLObject2 instanceof TLRPC.TL_urlAuthResultRequest) {
                        OAuthSheet.handle(false, launchActivity3.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject2, null, null, null, false, null);
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        OAuthSheet.handle(false, launchActivity3.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject2, null, null, null, false, null);
                    } else if (tLObject2 instanceof TLRPC.TL_urlAuthResultDefault) {
                        AlertsCreator.showOpenUrlAlert(safeLastFragment, (String) obj, false, true);
                    }
                }
                break;
            case 3:
                ((LoginActivity) obj5).lambda$tryResetAccount$31((TLRPC.TL_error) obj3, (String) obj, (String) obj2, (String) obj4);
                break;
            case 4:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) obj5;
                loginActivityEmailCodeView.getClass();
                TLObject tLObject3 = (TLObject) obj2;
                boolean z2 = tLObject3 instanceof TLRPC.TL_auth_sentCode;
                LoginActivity loginActivity = LoginActivity.this;
                if (z2) {
                    loginActivity.fillNextCodeParams((Bundle) obj4, (TLRPC.TL_auth_sentCode) tLObject3, true);
                    break;
                } else {
                    TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                    if (tL_error3 != null && tL_error3.text != null) {
                        AlertsCreator.processError(((BaseFragment) loginActivity).currentAccount, tL_error3, loginActivity, (TLRPC.TL_auth_resendCode) obj, new Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail = (LoginActivity.LoginActivitySetupEmail) obj5;
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.needHideProgress(false, true);
                loginActivitySetupEmail.nextPressed = false;
                TLObject tLObject4 = (TLObject) obj2;
                if (!(tLObject4 instanceof TL_account.sentEmailCode)) {
                    TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                    String str2 = tL_error4.text;
                    if (str2 != null) {
                        if (str2.contains("EMAIL_INVALID")) {
                            loginActivitySetupEmail.onPasscodeError$4();
                        } else if (tL_error4.text.contains("EMAIL_NOT_ALLOWED")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error4.text.contains("PHONE_PASSWORD_FLOOD")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.text.contains("PHONE_NUMBER_FLOOD")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                        } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivity2.setPage(0, true, null, true);
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                            loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error4.code != -1000) {
                            AlertsCreator.processError(((BaseFragment) loginActivity2).currentAccount, tL_error4, loginActivity2, (TL_account.sendVerifyEmailCode) obj, loginActivitySetupEmail.requestPhone);
                        }
                    }
                } else {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject4;
                    Bundle bundle = (Bundle) obj4;
                    bundle.putString("emailPattern", sentemailcode.email_pattern);
                    bundle.putInt("length", sentemailcode.length);
                    loginActivity2.setPage(13, true, bundle, false);
                }
                break;
            case 6:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail2 = (LoginActivity.LoginActivitySetupEmail) obj5;
                loginActivitySetupEmail2.getClass();
                TLObject tLObject5 = (TLObject) obj2;
                boolean z3 = tLObject5 instanceof TL_account.TL_emailVerified;
                LoginActivity loginActivity3 = LoginActivity.this;
                if (z3 && loginActivity3.activityMode == 3) {
                    loginActivity3.finishFragment();
                    loginActivity3.emailChangeFinishCallback.run();
                } else if (!(tLObject5 instanceof TL_account.TL_emailVerifiedLogin)) {
                    TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                    if (tL_error5 != null) {
                        if (tL_error5.text.contains("EMAIL_NOT_ALLOWED")) {
                            loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                        } else if (tL_error5.text.contains("EMAIL_TOKEN_INVALID")) {
                            loginActivity3.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                        } else if (tL_error5.code != -1000) {
                            AlertsCreator.processError(((BaseFragment) loginActivity3).currentAccount, tL_error5, loginActivity3, (TL_account.verifyEmail) obj, new Object[0]);
                        }
                    }
                } else {
                    TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject5;
                    Bundle bundle2 = (Bundle) obj4;
                    bundle2.putString("email", tL_emailVerifiedLogin.email);
                    loginActivity3.fillNextCodeParams(bundle2, tL_emailVerifiedLogin.sent_code, true);
                }
                break;
            case 7:
                final LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj5;
                loginPayView.button.setLoading(false);
                TLObject tLObject6 = (TLObject) obj2;
                boolean z4 = tLObject6 instanceof TLRPC.PaymentForm;
                LoginActivity loginActivity4 = LoginActivity.this;
                if (!z4) {
                    TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                    if (tL_error6 == null) {
                        new BulletinFactory(loginActivity4.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(R.string.UnknownError));
                    } else if (!"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error6.text)) {
                        String str3 = tL_error6.text;
                        loginPayView.lastError = str3;
                        new BulletinFactory(loginActivity4.slideViewsContainer, null).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, str3));
                    } else {
                        AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(loginPayView, i2));
                    }
                } else {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject6;
                    loginActivity4.getMessagesController().putUsers(paymentForm2.users, false);
                    PaymentFormActivity paymentFormActivity5 = new PaymentFormActivity((TLRPC.TL_inputInvoicePremiumAuthCode) obj4, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, loginActivity4, true);
                    paymentFormActivity5.isCheckoutPreview = true;
                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj;
                    paymentFormActivity5.customResultReceiver = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (i3) {
                                case 0:
                                    final LoginActivity.LoginPayView loginPayView2 = loginPayView;
                                    loginPayView2.getClass();
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    final int i5 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i5) {
                                                case 0:
                                                    LoginActivity.LoginPayView loginPayView3 = loginPayView2;
                                                    loginPayView3.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str4 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j2 = paymentForm3.form_id;
                                                    if (!loginPayView3.polling) {
                                                        loginPayView3.polling = true;
                                                        loginPayView3.pollingPhoneNumber = str4;
                                                        loginPayView3.pollingPhoneCodeHash = str5;
                                                        loginPayView3.pollingFormId = j2;
                                                        loginPayView3.button.setLoading(true);
                                                        loginPayView3.poll$1();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LoginActivity.LoginPayView loginPayView4 = loginPayView2;
                                                    loginPayView4.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str6 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    if (!loginPayView4.polling) {
                                                        loginPayView4.polling = true;
                                                        loginPayView4.pollingPhoneNumber = str6;
                                                        loginPayView4.pollingPhoneCodeHash = str7;
                                                        loginPayView4.pollingFormId = j3;
                                                        loginPayView4.button.setLoading(true);
                                                        loginPayView4.poll$1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final LoginActivity.LoginPayView loginPayView3 = loginPayView;
                                    loginPayView3.getClass();
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    final int i6 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i6) {
                                                case 0:
                                                    LoginActivity.LoginPayView loginPayView4 = loginPayView3;
                                                    loginPayView4.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str4 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j2 = paymentForm4.form_id;
                                                    if (!loginPayView4.polling) {
                                                        loginPayView4.polling = true;
                                                        loginPayView4.pollingPhoneNumber = str4;
                                                        loginPayView4.pollingPhoneCodeHash = str5;
                                                        loginPayView4.pollingFormId = j2;
                                                        loginPayView4.button.setLoading(true);
                                                        loginPayView4.poll$1();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LoginActivity.LoginPayView loginPayView5 = loginPayView3;
                                                    loginPayView5.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode3;
                                                    String str6 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!loginPayView5.polling) {
                                                        loginPayView5.polling = true;
                                                        loginPayView5.pollingPhoneNumber = str6;
                                                        loginPayView5.pollingPhoneCodeHash = str7;
                                                        loginPayView5.pollingFormId = j3;
                                                        loginPayView5.button.setLoading(true);
                                                        loginPayView5.poll$1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    paymentFormActivity5.customAnyResultReceiver = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj6) {
                            switch (i2) {
                                case 0:
                                    final LoginActivity.LoginPayView loginPayView2 = loginPayView;
                                    loginPayView2.getClass();
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    final int i5 = 0;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i5) {
                                                case 0:
                                                    LoginActivity.LoginPayView loginPayView4 = loginPayView2;
                                                    loginPayView4.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str4 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j2 = paymentForm3.form_id;
                                                    if (!loginPayView4.polling) {
                                                        loginPayView4.polling = true;
                                                        loginPayView4.pollingPhoneNumber = str4;
                                                        loginPayView4.pollingPhoneCodeHash = str5;
                                                        loginPayView4.pollingFormId = j2;
                                                        loginPayView4.button.setLoading(true);
                                                        loginPayView4.poll$1();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LoginActivity.LoginPayView loginPayView5 = loginPayView2;
                                                    loginPayView5.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode2;
                                                    String str6 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j3 = paymentForm3.form_id;
                                                    if (!loginPayView5.polling) {
                                                        loginPayView5.polling = true;
                                                        loginPayView5.pollingPhoneNumber = str6;
                                                        loginPayView5.pollingPhoneCodeHash = str7;
                                                        loginPayView5.pollingFormId = j3;
                                                        loginPayView5.button.setLoading(true);
                                                        loginPayView5.poll$1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final LoginActivity.LoginPayView loginPayView3 = loginPayView;
                                    loginPayView3.getClass();
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    final int i6 = 1;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (i6) {
                                                case 0:
                                                    LoginActivity.LoginPayView loginPayView4 = loginPayView3;
                                                    loginPayView4.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str4 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str5 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j2 = paymentForm4.form_id;
                                                    if (!loginPayView4.polling) {
                                                        loginPayView4.polling = true;
                                                        loginPayView4.pollingPhoneNumber = str4;
                                                        loginPayView4.pollingPhoneCodeHash = str5;
                                                        loginPayView4.pollingFormId = j2;
                                                        loginPayView4.button.setLoading(true);
                                                        loginPayView4.poll$1();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LoginActivity.LoginPayView loginPayView5 = loginPayView3;
                                                    loginPayView5.getClass();
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode5 = tL_inputStorePaymentAuthCode3;
                                                    String str6 = tL_inputStorePaymentAuthCode5.phone_number;
                                                    String str7 = tL_inputStorePaymentAuthCode5.phone_code_hash;
                                                    long j3 = paymentForm4.form_id;
                                                    if (!loginPayView5.polling) {
                                                        loginPayView5.polling = true;
                                                        loginPayView5.pollingPhoneNumber = str6;
                                                        loginPayView5.pollingPhoneCodeHash = str7;
                                                        loginPayView5.pollingFormId = j3;
                                                        loginPayView5.button.setLoading(true);
                                                        loginPayView5.poll$1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    paymentFormActivity5.customErrorReceiver = new WebActionBar$$ExternalSyntheticLambda9(loginPayView, 8);
                    loginActivity4.presentFragment(paymentFormActivity5);
                }
                break;
            case 8:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) obj5;
                messageStatisticActivity.statsLoaded = true;
                if (((TLRPC.TL_error) obj3) == null && (chartData = (ChartData) obj2) != null) {
                    messageStatisticActivity.childDataCache.put((String) obj, chartData);
                    StatisticActivity.ChartViewData chartViewData = messageStatisticActivity.interactionsViewData;
                    chartViewData.childChartData = chartData;
                    chartViewData.activeZoom = ((TL_stats.TL_loadAsyncGraph) obj4).x;
                    messageStatisticActivity.updateRows$9();
                } else {
                    messageStatisticActivity.updateRows$9();
                }
                break;
            case 9:
                ((NewContactBottomSheet) obj5).lambda$done$22((TLRPC.TL_contacts_importedContacts) obj2, (TLRPC.TL_inputPhoneContact) obj4, (TLRPC.TL_error) obj3, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 10:
                PassportActivity passportActivity = PassportActivity.this;
                PhotoViewer.AnonymousClass14 anonymousClass14 = (PhotoViewer.AnonymousClass14) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                if (tL_error7 != null) {
                    AlertsCreator.processError(((BaseFragment) passportActivity).currentAccount, tL_error7, passportActivity, (TL_account.verifyEmail) obj, new Object[0]);
                    anonymousClass14.onError((String) null, (String) null);
                } else {
                    ((PassportActivity.AnonymousClass20) passportActivity.delegate).saveValue(passportActivity.currentType, (String) passportActivity.currentValues.get("email"), null, null, null, null, null, null, null, null, (PhotoViewer$$ExternalSyntheticLambda21) obj2, anonymousClass14);
                }
                break;
            case 11:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) obj5;
                phoneConfirmationView.nextPressed = false;
                PassportActivity passportActivity2 = PassportActivity.this;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                if (tL_error8 == null) {
                    passportActivity2.fillNextCodeParams((Bundle) obj4, (TLRPC.TL_auth_sentCode) ((TLObject) obj2), true);
                } else {
                    AlertDialog alertDialogProcessError = AlertsCreator.processError(((BaseFragment) passportActivity2).currentAccount, tL_error8, passportActivity2, (TLRPC.TL_auth_resendCode) obj, new Object[0]);
                    if (alertDialogProcessError != null && tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                        alertDialogProcessError.positiveButtonListener = new PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda2(phoneConfirmationView, 1);
                    }
                }
                passportActivity2.needHideProgress();
                break;
            case 12:
                ((PaymentFormActivity) obj5).lambda$checkPassword$73((TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj, (TL_account.getPassword) obj4);
                break;
            case 13:
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.animationEndRunnable = null;
                PhotoViewer.FrameLayoutDrawer frameLayoutDrawer = photoViewer.containerView;
                if (frameLayoutDrawer != null && photoViewer.windowView != null) {
                    frameLayoutDrawer.setLayerType(0, null);
                    photoViewer.animationInProgress = 0;
                    photoViewer.invalidateBlur$1();
                    photoViewer.transitionAnimationStartTime = 0L;
                    photoViewer.leftCropState = null;
                    photoViewer.leftCropTransform.hasTransform = false;
                    photoViewer.rightCropState = null;
                    photoViewer.rightCropTransform.hasTransform = false;
                    photoViewer.setImages();
                    photoViewer.setCropBitmap();
                    photoViewer.containerView.invalidate();
                    int i5 = 0;
                    while (true) {
                        ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj3;
                        if (i5 >= clippingImageViewArr.length) {
                            PhotoViewer.PlaceProviderObject placeProviderObject = photoViewer.showAfterAnimation;
                            if (placeProviderObject != null) {
                                placeProviderObject.imageReceiver.setVisible(true, true);
                            }
                            PhotoViewer.PlaceProviderObject placeProviderObject2 = photoViewer.hideAfterAnimation;
                            if (placeProviderObject2 != null && !placeProviderObject2.keepImageReceiverVisible) {
                                placeProviderObject2.imageReceiver.setVisible(false, true);
                            }
                            if (((ArrayList) obj2) != null && (i = photoViewer.sendPhotoType) != 3 && i != 1 && ((photoViewerProvider = photoViewer.placeProvider) == null || !photoViewerProvider.closeKeyboard())) {
                                photoViewer.makeFocusable$1();
                            }
                            VideoPlayer videoPlayer = photoViewer.videoPlayer;
                            if (videoPlayer != null && videoPlayer.isPlaying() && photoViewer.isCurrentVideo && !photoViewer.imagesArrLocals.isEmpty()) {
                                PhotoViewer.access$24400(photoViewer, photoViewer.videoPlayer.getCurrentPosition());
                                PhotoViewer.access$24200(photoViewer, true);
                            }
                            if (photoViewer.isEmbedVideo) {
                                PhotoViewer.access$32900(photoViewer, ((Integer) obj4).intValue());
                            }
                            PhotoViewer.PhotoViewerProvider photoViewerProvider2 = (PhotoViewer.PhotoViewerProvider) obj;
                            if (photoViewerProvider2 != null) {
                                photoViewerProvider2.onOpen();
                            }
                        } else {
                            clippingImageViewArr[i5].setVisibility(8);
                            i5++;
                        }
                        break;
                    }
                }
                break;
            case 14:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    privacyControlActivity.getClass();
                    boolean[] zArr = (boolean[]) obj2;
                    zArr[1] = true;
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj4;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = ((TL_account.setGlobalPrivacySettings) obj).settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i6 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i6;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j2 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j2 > 0) {
                            globalPrivacySettings.flags = i6 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j2;
                        } else {
                            globalPrivacySettings.flags = i6 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.finished();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                } else {
                    privacyControlActivity.showErrorAlert();
                }
                break;
            case 15:
                boolean z5 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                if (!z5) {
                    TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                    if (userFull != null) {
                        TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                    TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                    if (tL_error9 == null || (str = tL_error9.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(privacyControlActivity2), R.raw.error, 36);
                    } else if (privacyControlActivity2.getParentActivity() != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(privacyControlActivity2.getParentActivity(), 0, ((BaseFragment) privacyControlActivity2).resourceProvider);
                        String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        privacyControlActivity2.showDialog(alertDialog);
                    }
                } else {
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(privacyControlActivity2).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    bulletinCreateSimpleBulletinWithIconSize.duration = 5000;
                    bulletinCreateSimpleBulletinWithIconSize.show();
                }
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                profileActivity.getClass();
                ProfileActivity$$ExternalSyntheticLambda114 profileActivity$$ExternalSyntheticLambda114 = (ProfileActivity$$ExternalSyntheticLambda114) obj;
                if ((((TLRPC.ChannelParticipant) obj3) instanceof TLRPC.TL_channelParticipantAdmin) || (((TLRPC.ChatParticipant) obj2) instanceof TLRPC.TL_chatParticipantAdmin)) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(profileActivity.getParentActivity(), 0, profileActivity.resourcesProvider);
                    String string2 = LocaleController.getString(R.string.AppName);
                    AlertDialog alertDialog2 = builder2.alertDialog;
                    alertDialog2.title = string2;
                    TLRPC.User user = (TLRPC.User) obj4;
                    alertDialog2.message = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user.first_name, user.last_name));
                    builder2.setPositiveButton(LocaleController.getString(R.string.OK), new PhotoViewer$$ExternalSyntheticLambda115(profileActivity$$ExternalSyntheticLambda114, 28));
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(alertDialog2);
                } else {
                    profileActivity$$ExternalSyntheticLambda114.run(1);
                }
                break;
            case 17:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                profileActivity2.getClass();
                TLObject tLObject7 = (TLObject) obj2;
                if (!(tLObject7 instanceof TL_fragment.TL_collectibleInfo)) {
                    BulletinFactory.showError((TLRPC.TL_error) obj3);
                } else {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject7;
                    if (profileActivity2.userId != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.userId));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.chatId));
                    }
                    String str4 = "@" + ((TLRPC.TL_username) obj4).username;
                    String str5 = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) tL_collectibleInfo.purchase_date) * 1000));
                    String currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    Bulletin bulletinCreateImageBulletin = new BulletinFactory(((ProfileActivity.AnonymousClass38) obj).bulletinContainer2, profileActivity2.resourcesProvider).createImageBulletin(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str4, str5, currency, TextUtils.isEmpty(currency2) ? "" : zzij.m("(", currency2, ")"))), new PhotoViewer$$ExternalSyntheticLambda7(26, profileActivity2, tL_collectibleInfo)));
                    PhotoViewer$$ExternalSyntheticLambda52 photoViewer$$ExternalSyntheticLambda52 = new PhotoViewer$$ExternalSyntheticLambda52(5, profileActivity2, tL_collectibleInfo);
                    Bulletin.Layout layout = bulletinCreateImageBulletin.layout;
                    if (layout != null) {
                        layout.setOnClickListener(photoViewer$$ExternalSyntheticLambda52);
                    }
                    bulletinCreateImageBulletin.show(false);
                }
                break;
            case 18:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                profileActivity3.getClass();
                TLObject tLObject8 = (TLObject) obj2;
                if (!(tLObject8 instanceof TL_fragment.TL_collectibleInfo)) {
                    BulletinFactory.showError((TLRPC.TL_error) obj3);
                } else {
                    FragmentUsernameBottomSheet.open(profileActivity3.getParentActivity(), 1, (String) obj, (TLRPC.User) obj4, (TL_fragment.TL_collectibleInfo) tLObject8, profileActivity3.resourcesProvider);
                }
                break;
            case 19:
                ((ProfileActivity) obj5).lambda$editRow$141((TLObject) obj2, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj, (TLRPC.TL_error) obj3);
                break;
            case 20:
                ProfileActivity.SearchAdapter searchAdapter = (ProfileActivity.SearchAdapter) obj5;
                if (((String) obj).equals(searchAdapter.lastSearchString)) {
                    boolean z6 = searchAdapter.searchWas;
                    BaseFragment baseFragment2 = searchAdapter.fragment;
                    if (!z6 && (baseFragment2 instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) baseFragment2).emptyView.stickerView.getImageReceiver().startAnimation();
                            ((ProfileActivity) baseFragment2).emptyView.title.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    searchAdapter.searchWas = true;
                    searchAdapter.searchResults = (ArrayList) obj3;
                    searchAdapter.faqSearchResults = (ArrayList) obj2;
                    searchAdapter.resultNames = (ArrayList) obj4;
                    searchAdapter.notifyDataSetChanged();
                    if (baseFragment2 instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) baseFragment2).emptyView.stickerView.getImageReceiver().startAnimation();
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 21:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) obj5;
                selectAnimatedEmojiDialog.getClass();
                selectAnimatedEmojiDialog.onEmojiSelected((View) obj3, Long.valueOf(((AnimatedEmojiSpan) obj2).documentId), (TLRPC.Document) obj4, ((SelectAnimatedEmojiDialog.ImageViewEmoji) obj).starGift, null);
                break;
            case 22:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) obj5;
                selectChatUserSheet.getClass();
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) ((TLObject) obj2);
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                    twoStepVerificationActivity.currentPassword = password;
                    TwoStepVerificationActivity.initPasswordNewAlgo(password);
                    selectChatUserSheet.initTransfer((TLRPC.User) obj, twoStepVerificationActivity, twoStepVerificationActivity.getNewSrpPassword());
                }
                break;
            case 23:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) obj5;
                StarGiftSheet$$ExternalSyntheticLambda3 starGiftSheet$$ExternalSyntheticLambda3 = giftOfferSheet.closeParentSheet;
                if (starGiftSheet$$ExternalSyntheticLambda3 != null) {
                    starGiftSheet$$ExternalSyntheticLambda3.run();
                }
                ((Browser.Progress) obj2).end(false);
                ((AlertDialog) obj4).dismiss();
                giftOfferSheet.lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    if (((TLRPC.Updates) obj) == null) {
                        BulletinFactory.of(safeLastFragment2).showForError(false, (TLRPC.TL_error) obj3);
                    } else {
                        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(safeLastFragment2).createSimpleBulletin(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, giftOfferSheet.giftName, DialogObject.getShortName(giftOfferSheet.dialogId))), R.raw.forward);
                        bulletinCreateSimpleBulletin.ignoreDetach = true;
                        bulletinCreateSimpleBulletin.show();
                    }
                }
                break;
            case 24:
                StarsController starsController = (StarsController) obj5;
                OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                if (tL_error10 != null) {
                    oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.FALSE, tL_error10.text);
                    break;
                } else {
                    TLObject tLObject9 = (TLObject) obj2;
                    if (tLObject9 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject9;
                        paymentForm3.invoice.recurring = true;
                        MessagesController.getInstance(starsController.currentAccount).putUsers(paymentForm3.users, false);
                        paymentFormActivity2 = new PaymentFormActivity(paymentForm3, (TLRPC.TL_inputInvoiceStars) obj, null);
                    } else if (tLObject9 instanceof TLRPC.PaymentReceipt) {
                        paymentFormActivity2 = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject9);
                    }
                    if (paymentFormActivity2 == null) {
                        oAuthSheet$$ExternalSyntheticLambda18.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    } else {
                        paymentFormActivity2.paymentFormCallback = new StoriesViewPager$$ExternalSyntheticLambda0(oAuthSheet$$ExternalSyntheticLambda18, 11);
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        if (lastFragment != null) {
                            if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
                                lastFragment.presentFragment(paymentFormActivity2);
                            } else {
                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                bottomSheetParams.transitionFromLeft = true;
                                lastFragment.showAsSheet(paymentFormActivity2, bottomSheetParams);
                            }
                            break;
                        }
                    }
                }
                break;
            case 25:
                StarsController starsController2 = (StarsController) obj5;
                JoinGroupAlert$$ExternalSyntheticLambda3 joinGroupAlert$$ExternalSyntheticLambda3 = (JoinGroupAlert$$ExternalSyntheticLambda3) obj4;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                if (tL_error11 != null) {
                    joinGroupAlert$$ExternalSyntheticLambda3.run(Boolean.FALSE, tL_error11.text);
                    break;
                } else {
                    TLObject tLObject10 = (TLObject) obj2;
                    if (tLObject10 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm4 = (TLRPC.PaymentForm) tLObject10;
                        paymentForm4.invoice.recurring = true;
                        MessagesController.getInstance(starsController2.currentAccount).putUsers(paymentForm4.users, false);
                        paymentFormActivity4 = new PaymentFormActivity(paymentForm4, (TLRPC.TL_inputInvoiceStars) obj, null);
                    } else if (tLObject10 instanceof TLRPC.PaymentReceipt) {
                        paymentFormActivity4 = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject10);
                    }
                    if (paymentFormActivity4 == null) {
                        joinGroupAlert$$ExternalSyntheticLambda3.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    } else {
                        paymentFormActivity4.paymentFormCallback = new StoriesViewPager$$ExternalSyntheticLambda0(joinGroupAlert$$ExternalSyntheticLambda3, 12);
                        BaseFragment lastFragment2 = LaunchActivity.getLastFragment();
                        if (lastFragment2 != null) {
                            if (!AndroidUtilities.hasDialogOnTop(lastFragment2)) {
                                lastFragment2.presentFragment(paymentFormActivity4);
                            } else {
                                BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                                bottomSheetParams2.transitionFromLeft = true;
                                lastFragment2.showAsSheet(paymentFormActivity4, bottomSheetParams2);
                            }
                            break;
                        }
                    }
                }
                break;
            case 26:
                StarsController starsController3 = (StarsController) obj5;
                starsController3.getClass();
                ((boolean[]) obj3)[0] = true;
                starsController3.payAfterConfirmed((String) obj, (TLRPC.ChatInvite) obj2, new LinkManager$$ExternalSyntheticLambda1((Utilities.Callback2) obj4, 19));
                break;
            case 27:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda36();
                break;
            case 28:
                StarsController starsController4 = (StarsController) obj5;
                starsController4.getClass();
                ((AlertDialog) obj3).dismiss();
                TLObject tLObject11 = (TLObject) obj2;
                if (tLObject11 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject11;
                    int i7 = starsController4.currentAccount;
                    MessagesController.getInstance(i7).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i7).putChats(tL_payments_savedStarGifts.chats, false);
                    while (i3 < tL_payments_savedStarGifts.gifts.size()) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i3);
                        TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj4;
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        } else {
                            i3++;
                        }
                    }
                }
                ((Utilities.Callback) obj).run(savedStarGift);
                break;
            default:
                StarsController starsController5 = (StarsController) obj5;
                starsController5.getClass();
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj3;
                if (tL_error12 != null) {
                    callback2.run(Boolean.FALSE, tL_error12.text);
                    break;
                } else {
                    TLObject tLObject12 = (TLObject) obj2;
                    if (tLObject12 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm5 = (TLRPC.PaymentForm) tLObject12;
                        paymentForm5.invoice.recurring = true;
                        MessagesController.getInstance(starsController5.currentAccount).putUsers(paymentForm5.users, false);
                        paymentFormActivity3 = new PaymentFormActivity(paymentForm5, (TLRPC.TL_inputInvoiceStars) obj, null);
                    } else if (tLObject12 instanceof TLRPC.PaymentReceipt) {
                        paymentFormActivity3 = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject12);
                    }
                    if (paymentFormActivity3 == null) {
                        callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                        break;
                    } else {
                        paymentFormActivity3.paymentFormCallback = new StoriesViewPager$$ExternalSyntheticLambda0(callback2, 10);
                        BaseFragment lastFragment3 = LaunchActivity.getLastFragment();
                        if (lastFragment3 != null) {
                            if (!AndroidUtilities.hasDialogOnTop(lastFragment3)) {
                                lastFragment3.presentFragment(paymentFormActivity3);
                            } else {
                                BaseFragment.BottomSheetParams bottomSheetParams3 = new BaseFragment.BottomSheetParams();
                                bottomSheetParams3.transitionFromLeft = true;
                                lastFragment3.showAsSheet(paymentFormActivity3, bottomSheetParams3);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public LinkManager$$ExternalSyntheticLambda20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public LinkManager$$ExternalSyntheticLambda20(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$1 = tL_error;
    }

    public LinkManager$$ExternalSyntheticLambda20(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = str;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public LinkManager$$ExternalSyntheticLambda20(Object obj, TLRPC.TL_error tL_error, Object obj2, TLObject tLObject, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = tL_error;
        this.f$3 = obj2;
        this.f$2 = tLObject;
        this.f$4 = tLObject2;
    }

    public LinkManager$$ExternalSyntheticLambda20(BaseFragment baseFragment, TLRPC.TL_error tL_error, Object obj, String str, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = tL_error;
        this.f$2 = obj;
        this.f$4 = str;
        this.f$3 = tLObject;
    }

    public LinkManager$$ExternalSyntheticLambda20(ProfileActivity.SearchAdapter searchAdapter, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.$r8$classId = 20;
        this.f$0 = searchAdapter;
        this.f$4 = str;
        this.f$1 = arrayList;
        this.f$2 = arrayList2;
        this.f$3 = arrayList3;
    }

    public LinkManager$$ExternalSyntheticLambda20(ProfileActivity profileActivity, TLObject tLObject, String str, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.$r8$classId = 18;
        this.f$0 = profileActivity;
        this.f$2 = tLObject;
        this.f$4 = str;
        this.f$3 = user;
        this.f$1 = tL_error;
    }
}
