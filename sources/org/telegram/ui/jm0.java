package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jm0 implements qm0 {
    public final sm0 f38550a;

    public jm0(sm0 sm0Var) {
        this.f38550a = sm0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f38550a.f41547a0 = password;
    }

    @Override
    public final void b() {
        this.f38550a.f41560f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        sm0 sm0Var = this.f38550a;
        qm0 qm0Var = sm0Var.T;
        if (qm0Var != null) {
            qm0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (sm0Var.S0) {
            sm0Var.removeSelfFromStack();
        }
        if (sm0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
