package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nk0 implements Runnable {
    public final int f48220a;
    public final kl0 f48221b;
    public final TLRPC.TL_error f48222c;
    public final TLObject d;

    public nk0(kl0 kl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f48220a = i7;
        this.f48221b = kl0Var;
        this.f48222c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f48220a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f48222c;
        kl0 kl0Var = this.f48221b;
        switch (i7) {
            case 0:
                kl0Var.f47337e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kl0Var.f47326a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.u4.u0(kl0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = kl0Var.C0;
                    if (paymentForm != null && kl0Var.f47326a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        kl0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(kl0Var.f47326a0);
                    kl0 kl0Var2 = kl0Var.f47340f0;
                    if (kl0Var2 != null) {
                        kl0Var2.I0(kl0Var.f47326a0);
                    }
                    if (!kl0Var.f47326a0.has_password && kl0Var.f47334d0 == null) {
                        lk0 lk0Var = new lk0(kl0Var, 2);
                        kl0Var.f47334d0 = lk0Var;
                        org.telegram.messenger.g0.i3(lk0Var, 5000L);
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
