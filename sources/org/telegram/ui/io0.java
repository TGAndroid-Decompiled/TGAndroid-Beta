package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class io0 implements so0 {
    public final uo0 f38768a;

    public io0(uo0 uo0Var) {
        this.f38768a = uo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f38768a.f42727a0 = password;
    }

    @Override
    public final void b() {
        this.f38768a.f42741f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        uo0 uo0Var = this.f38768a;
        so0 so0Var = uo0Var.T;
        if (so0Var != null) {
            so0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (uo0Var.S0) {
            uo0Var.removeSelfFromStack();
        }
        if (uo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
