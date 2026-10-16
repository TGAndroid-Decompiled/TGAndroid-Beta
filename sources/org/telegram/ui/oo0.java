package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oo0 implements yo0 {
    public final ap0 f38721a;

    public oo0(ap0 ap0Var) {
        this.f38721a = ap0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f38721a.f34008a0 = password;
    }

    @Override
    public final void b() {
        this.f38721a.f34021f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ap0 ap0Var = this.f38721a;
        yo0 yo0Var = ap0Var.T;
        if (yo0Var != null) {
            yo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ap0Var.S0) {
            ap0Var.removeSelfFromStack();
        }
        if (ap0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
