package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginPayView$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginPayView f$0;
    public final TLRPC.TL_inputStorePaymentAuthCode f$1;
    public final TLRPC.PaymentForm f$2;

    public LoginActivity$LoginPayView$$ExternalSyntheticLambda12(LoginActivity.LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm, int i) {
        this.$r8$classId = i;
        this.f$0 = loginPayView;
        this.f$1 = tL_inputStorePaymentAuthCode;
        this.f$2 = paymentForm;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParams$3(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$setParams$5(this.f$1, this.f$2);
                break;
        }
    }
}
