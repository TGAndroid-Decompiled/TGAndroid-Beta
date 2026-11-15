package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bl0 implements il0 {
    public final kl0 f45778a;

    public bl0(kl0 kl0Var) {
        this.f45778a = kl0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f45778a.f48678b0 = password;
    }

    @Override
    public final void b() {
        this.f45778a.f48691g0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        kl0 kl0Var = this.f45778a;
        il0 il0Var = kl0Var.U;
        if (il0Var != null) {
            il0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (kl0Var.T0) {
            kl0Var.removeSelfFromStack();
        }
        if (kl0Var.U != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
