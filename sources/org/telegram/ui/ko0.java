package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ko0 implements uo0 {
    public final wo0 f35209a;

    public ko0(wo0 wo0Var) {
        this.f35209a = wo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f35209a.f39307a0 = password;
    }

    @Override
    public final void b() {
        this.f35209a.f39320f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        wo0 wo0Var = this.f35209a;
        uo0 uo0Var = wo0Var.T;
        if (uo0Var != null) {
            uo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (wo0Var.S0) {
            wo0Var.removeSelfFromStack();
        }
        if (wo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
