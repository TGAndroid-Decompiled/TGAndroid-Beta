package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class al0 implements hl0 {
    public final jl0 f43718a;

    public al0(jl0 jl0Var) {
        this.f43718a = jl0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f43718a.f46994a0 = password;
    }

    @Override
    public final void b() {
        this.f43718a.f47008f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jl0 jl0Var = this.f43718a;
        hl0 hl0Var = jl0Var.T;
        if (hl0Var != null) {
            hl0Var.c(str, str2, z9, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jl0Var.S0) {
            jl0Var.removeSelfFromStack();
        }
        if (jl0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
