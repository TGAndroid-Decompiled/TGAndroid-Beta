package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class kk0 implements Runnable {
    public final int f47181a;
    public final hl0 f47182b;
    public final TLRPC.TL_error f47183c;
    public final TLObject d;

    public kk0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f47181a = i7;
        this.f47182b = hl0Var;
        this.f47183c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f47181a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f47183c;
        hl0 hl0Var = this.f47182b;
        switch (i7) {
            case 0:
                hl0Var.f46399e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    hl0Var.f46388a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(hl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = hl0Var.C0;
                    if (paymentForm != null && hl0Var.f46388a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        hl0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(hl0Var.f46388a0);
                    hl0 hl0Var2 = hl0Var.f46402f0;
                    if (hl0Var2 != null) {
                        hl0Var2.I0(hl0Var.f46388a0);
                    }
                    if (!hl0Var.f46388a0.has_password && hl0Var.f46396d0 == null) {
                        ik0 ik0Var = new ik0(hl0Var, 2);
                        hl0Var.f46396d0 = ik0Var;
                        org.telegram.messenger.g0.i3(ik0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                hl0.a0(hl0Var, tL_error, tLObject);
                return;
            default:
                hl0.c0(hl0Var, tL_error, tLObject);
                return;
        }
    }
}
