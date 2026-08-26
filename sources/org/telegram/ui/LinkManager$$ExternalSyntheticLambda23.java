package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.EditText;
import com.android.billingclient.api.ProductDetails;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class LinkManager$$ExternalSyntheticLambda23 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public LinkManager$$ExternalSyntheticLambda23(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleNewBot$20((BaseFragment) this.f$1, (TLRPC.User[]) this.f$2, (TLRPC.TL_requestPeerTypeCreateBot) this.f$3);
                break;
            case 1:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$98((Runnable) this.f$1, (TLObject) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 2:
                LaunchActivity.lambda$handleIntent$24((AlertDialog) this.f$0, (TLObject) this.f$1, (ActionIntroActivity) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 3:
                LoginActivity.lambda$onFieldError$11((OutlineTextContainerView) this.f$0, (OutlineTextContainerView) this.f$1, (EditText) this.f$2, (TextWatcher) this.f$3);
                break;
            case 4:
                ((LoginActivity.LoginActivityNewPasswordView) this.f$0).lambda$recoverPassword$9((String) this.f$1, (String) this.f$2, (TLRPC.TL_auth_recoverPassword) this.f$3);
                break;
            case 5:
                ((LoginActivity.LoginActivityRecoverView) this.f$0).lambda$onNextPressed$7((TLObject) this.f$1, (String) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 6:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$resendCode$10((TLRPC.TL_error) this.f$1, (Bundle) this.f$2, (TLObject) this.f$3);
                break;
            case 7:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$1((String) this.f$1, (String) this.f$2, (String) this.f$3);
                break;
            case 8:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$18((ProductDetails) this.f$1, (PollItemMenu$$ExternalSyntheticLambda15) this.f$2, (TLRPC.TL_inputStorePaymentAuthCode) this.f$3);
                break;
            case 9:
                ((LoginActivity.PhoneView) this.f$0).lambda$onNextPressed$20((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 10:
                ((PaymentFormActivity) this.f$0).lambda$sendData$65((INavigationLayout) this.f$1, (Activity) this.f$2, (TLRPC.Message) this.f$3);
                break;
            case 11:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$70((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, (TL_account.getTmpPassword) this.f$3);
                break;
            case 12:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$32((MediaController.PhotoEntry) this.f$1, (MediaController.PhotoEntry) this.f$2, (String) this.f$3);
                break;
            case 13:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$31((MediaController.PhotoEntry) this.f$1, (String) this.f$2, (Bitmap) this.f$3);
                break;
            case 14:
                ((PhotoViewer) this.f$0).lambda$switchToPip$96((Bitmap) this.f$1, (boolean[]) this.f$2, (PhotoViewer$$ExternalSyntheticLambda48) this.f$3);
                break;
            case 15:
                ((PostSuggestionsEditActivity) this.f$0).lambda$processDone$2((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TL_stars.updatePaidMessagesPrice) this.f$3);
                break;
            case 16:
                ((PrivacyControlActivity) this.f$0).lambda$applyCurrentPrivacySettings$14((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (boolean[]) this.f$3);
                break;
            case 17:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$4((AlertDialog) this.f$1, (TLObject) this.f$2, (TL_account.setAccountTTL) this.f$3);
                break;
            case 18:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$80((String[]) this.f$1, (String) this.f$2, (String) this.f$3);
                break;
            case 19:
                ((ProfileActivity) this.f$0).lambda$didUploadPhoto$111((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 20:
                ((ProfileActivity) this.f$0).lambda$createView$27((TLObject) this.f$1, (TLRPC.TL_error) this.f$2, (int[]) this.f$3);
                break;
            case 21:
                File file = (File) this.f$3;
                ProfileActivity.lambda$sendLogs$114((AlertDialog) this.f$0, (boolean[]) this.f$1, (Activity) this.f$2, file);
                break;
            case 22:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$69((TLObject) this.f$1, (TLRPC.TL_username) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
            case 23:
                ((SessionsActivity) this.f$0).lambda$createView$17((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (TLRPC.TL_webAuthorization) this.f$3);
                break;
            case 24:
                ((SessionsActivity) this.f$0).lambda$createView$15((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (TLRPC.TL_authorization) this.f$3);
                break;
            case 25:
                ((SettingsActivity) this.f$0).lambda$didUploadPhoto$22((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (String) this.f$3);
                break;
            case 26:
                ((StatisticActivity.ChartCell) this.f$0).lambda$onZoomed$0((ChartData) this.f$1, (String) this.f$2, (StatisticActivity.ZoomCancelable) this.f$3);
                break;
            case 27:
                ((StatisticActivity.ChartViewData) this.f$0).lambda$load$0((ChartData) this.f$1, (String) this.f$2, (Utilities.Callback0Return) this.f$3);
                break;
            case 28:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$30((byte[]) this.f$1, (TLObject) this.f$2, (byte[]) this.f$3);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$processNext$30((TLObject) this.f$1, (String) this.f$2, (TLRPC.TL_error) this.f$3);
                break;
        }
    }
}
