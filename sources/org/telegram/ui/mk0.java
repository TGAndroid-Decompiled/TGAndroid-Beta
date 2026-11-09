package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mk0 implements Runnable {
    public final int f47892a;
    public final jl0 f47893b;
    public final TLRPC.TL_error f47894c;
    public final TLObject d;

    public mk0(jl0 jl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f47892a = i7;
        this.f47893b = jl0Var;
        this.f47894c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7 = this.f47892a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f47894c;
        jl0 jl0Var = this.f47893b;
        switch (i7) {
            case 0:
                jl0Var.f47005e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    jl0Var.f46994a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(jl0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = jl0Var.C0;
                    if (paymentForm != null && jl0Var.f46994a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        jl0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(jl0Var.f46994a0);
                    jl0 jl0Var2 = jl0Var.f47008f0;
                    if (jl0Var2 != null) {
                        jl0Var2.I0(jl0Var.f46994a0);
                    }
                    if (!jl0Var.f46994a0.has_password && jl0Var.f47002d0 == null) {
                        kk0 kk0Var = new kk0(jl0Var, 2);
                        jl0Var.f47002d0 = kk0Var;
                        org.telegram.messenger.g0.i3(kk0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jl0.a0(jl0Var, tL_error, tLObject);
                return;
            default:
                jl0.c0(jl0Var, tL_error, tLObject);
                return;
        }
    }
}
