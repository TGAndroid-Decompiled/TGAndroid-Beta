package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nk0 implements Runnable {
    public final int f49575a;
    public final kl0 f49576b;
    public final TLRPC.TL_error f49577c;
    public final TLObject d;

    public nk0(kl0 kl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49575a = i7;
        this.f49576b = kl0Var;
        this.f49577c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f49575a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f49577c;
        kl0 kl0Var = this.f49576b;
        switch (i7) {
            case 0:
                kl0Var.f48689f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kl0Var.f48678b0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.u0(kl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = kl0Var.D0;
                    if (paymentForm != null && kl0Var.f48678b0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        kl0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(kl0Var.f48678b0);
                    kl0 kl0Var2 = kl0Var.f48691g0;
                    if (kl0Var2 != null) {
                        kl0Var2.I0(kl0Var.f48678b0);
                    }
                    if (!kl0Var.f48678b0.has_password && kl0Var.f48686e0 == null) {
                        kk0 kk0Var = new kk0(kl0Var, 2);
                        kl0Var.f48686e0 = kk0Var;
                        org.telegram.messenger.g0.i3(kk0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                kl0.a0(kl0Var, tL_error, tLObject);
                return;
            default:
                kl0.c0(kl0Var, tL_error, tLObject);
                return;
        }
    }
}
