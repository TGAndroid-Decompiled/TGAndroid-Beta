package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ho0 implements yo0 {
    public final ap0 f36620a;

    public ho0(ap0 ap0Var) {
        this.f36620a = ap0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ap0 ap0Var = this.f36620a;
        ap0Var.I0 = tL_payments_validateRequestedInfo;
        ap0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
