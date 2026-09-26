package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class co0 implements mo0 {
    public final oo0 f32764a;

    public co0(oo0 oo0Var) {
        this.f32764a = oo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f32764a.f36278a0 = password;
    }

    @Override
    public final void b() {
        this.f32764a.f36291f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        oo0 oo0Var = this.f32764a;
        mo0 mo0Var = oo0Var.T;
        if (mo0Var != null) {
            mo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (oo0Var.S0) {
            oo0Var.removeSelfFromStack();
        }
        if (oo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
