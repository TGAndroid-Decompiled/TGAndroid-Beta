package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class al0 implements hl0 {
    public final jl0 f45101a;

    public al0(jl0 jl0Var) {
        this.f45101a = jl0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f45101a.f48386b0 = password;
    }

    @Override
    public final void b() {
        this.f45101a.f48399g0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jl0 jl0Var = this.f45101a;
        hl0 hl0Var = jl0Var.U;
        if (hl0Var != null) {
            hl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jl0Var.T0) {
            jl0Var.removeSelfFromStack();
        }
        if (jl0Var.U != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
