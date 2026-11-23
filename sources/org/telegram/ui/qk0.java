package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qk0 implements Runnable {
    public final int f51296a;
    public final ml0 f51297b;
    public final TLRPC.TL_error f51298c;
    public final TLObject d;

    public qk0(ml0 ml0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f51296a = i7;
        this.f51297b = ml0Var;
        this.f51298c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f51296a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f51298c;
        ml0 ml0Var = this.f51297b;
        switch (i7) {
            case 0:
                ml0Var.f49913f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ml0Var.f49902b0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.c5.u0(ml0Var.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = ml0Var.D0;
                    if (paymentForm != null && ml0Var.f49902b0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        ml0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(ml0Var.f49902b0);
                    ml0 ml0Var2 = ml0Var.f49915g0;
                    if (ml0Var2 != null) {
                        ml0Var2.I0(ml0Var.f49902b0);
                    }
                    if (!ml0Var.f49902b0.has_password && ml0Var.f49910e0 == null) {
                        nk0 nk0Var = new nk0(ml0Var, 2);
                        ml0Var.f49910e0 = nk0Var;
                        org.telegram.messenger.g0.h3(nk0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ml0.a0(ml0Var, tL_error, tLObject);
                return;
            default:
                ml0.c0(ml0Var, tL_error, tLObject);
                return;
        }
    }
}
