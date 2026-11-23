package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class dl0 implements kl0 {
    public final ml0 f47009a;

    public dl0(ml0 ml0Var) {
        this.f47009a = ml0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f47009a.f49902b0 = password;
    }

    @Override
    public final void b() {
        this.f47009a.f49915g0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ml0 ml0Var = this.f47009a;
        kl0 kl0Var = ml0Var.U;
        if (kl0Var != null) {
            kl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ml0Var.T0) {
            ml0Var.removeSelfFromStack();
        }
        if (ml0Var.U != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
