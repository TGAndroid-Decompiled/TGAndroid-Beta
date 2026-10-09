package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jo0 implements to0 {
    public final vo0 f39001a;

    public jo0(vo0 vo0Var) {
        this.f39001a = vo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f39001a.f42914a0 = password;
    }

    @Override
    public final void b() {
        this.f39001a.f42928f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        vo0 vo0Var = this.f39001a;
        to0 to0Var = vo0Var.T;
        if (to0Var != null) {
            to0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (vo0Var.S0) {
            vo0Var.removeSelfFromStack();
        }
        if (vo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
