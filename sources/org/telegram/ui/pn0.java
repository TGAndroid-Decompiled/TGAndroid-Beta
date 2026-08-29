package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pn0 implements zn0 {
    public final bo0 f41438a;

    public pn0(bo0 bo0Var) {
        this.f41438a = bo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f41438a.W = password;
    }

    @Override
    public final void b() {
        this.f41438a.f36842b0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        bo0 bo0Var = this.f41438a;
        zn0 zn0Var = bo0Var.P;
        if (zn0Var != null) {
            zn0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (bo0Var.O0) {
            bo0Var.removeSelfFromStack();
        }
        if (bo0Var.P != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
