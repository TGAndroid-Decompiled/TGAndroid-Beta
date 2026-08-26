package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.AlertsCreator;

public final class PaymentFormActivity$$ExternalSyntheticLambda36 implements Runnable {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public PaymentFormActivity$$ExternalSyntheticLambda36(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PaymentFormActivity paymentFormActivity = this.f$0;
                boolean z = false;
                paymentFormActivity.loadingPasswordInfo = false;
                if (this.f$1 == null) {
                    TL_account.Password password = (TL_account.Password) this.f$2;
                    paymentFormActivity.currentPassword = password;
                    if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                        AlertsCreator.showUpdateAppAlert(paymentFormActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = paymentFormActivity.paymentForm;
                        if (paymentForm != null && paymentFormActivity.currentPassword.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            paymentFormActivity.updateSavePaymentField();
                        }
                        TwoStepVerificationActivity.initPasswordNewAlgo(paymentFormActivity.currentPassword);
                        PaymentFormActivity paymentFormActivity2 = paymentFormActivity.passwordFragment;
                        if (paymentFormActivity2 != null) {
                            TL_account.Password password2 = paymentFormActivity.currentPassword;
                            if (password2 == null || !password2.has_password) {
                                paymentFormActivity2.currentPassword = password2;
                                if (password2 != null && !TextUtils.isEmpty(password2.email_unconfirmed_pattern)) {
                                    z = true;
                                }
                                paymentFormActivity2.waitingForEmail = z;
                                paymentFormActivity2.updatePasswordFields();
                            } else if (paymentFormActivity2.getParentActivity() != null) {
                                paymentFormActivity2.goToNextStep();
                            }
                        }
                        if (!paymentFormActivity.currentPassword.has_password && paymentFormActivity.shortPollRunnable == null) {
                            PaymentFormActivity$$ExternalSyntheticLambda2 paymentFormActivity$$ExternalSyntheticLambda2 = new PaymentFormActivity$$ExternalSyntheticLambda2(paymentFormActivity, 3);
                            paymentFormActivity.shortPollRunnable = paymentFormActivity$$ExternalSyntheticLambda2;
                            AndroidUtilities.runOnUIThread(paymentFormActivity$$ExternalSyntheticLambda2, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                this.f$0.lambda$sendForm$54(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$sendSavedForm$50(this.f$2, this.f$1);
                break;
        }
    }
}
