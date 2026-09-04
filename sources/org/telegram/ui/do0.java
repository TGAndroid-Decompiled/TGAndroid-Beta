package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class do0 implements vo0 {
    public final xo0 f35833a;

    public do0(xo0 xo0Var) {
        this.f35833a = xo0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        xo0 xo0Var = this.f35833a;
        xo0Var.I0 = tL_payments_validateRequestedInfo;
        xo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
