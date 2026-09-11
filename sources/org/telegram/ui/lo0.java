package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lo0 implements vo0 {
    public final xo0 f38422a;

    public lo0(xo0 xo0Var) {
        this.f38422a = xo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f38422a.f42806a0 = password;
    }

    @Override
    public final void b() {
        this.f38422a.f42820f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        xo0 xo0Var = this.f38422a;
        vo0 vo0Var = xo0Var.T;
        if (vo0Var != null) {
            vo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (xo0Var.S0) {
            xo0Var.removeSelfFromStack();
        }
        if (xo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
