package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gk0 implements Runnable {
    public final int f45676a;
    public final dl0 f45677b;
    public final TLRPC.TL_error f45678c;
    public final TLObject d;

    public gk0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.f45676a = i3;
        this.f45677b = dl0Var;
        this.f45678c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i3 = this.f45676a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f45678c;
        dl0 dl0Var = this.f45677b;
        switch (i3) {
            case 0:
                dl0Var.f44751f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    dl0Var.f44740b0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.w0(dl0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = dl0Var.D0;
                    if (paymentForm != null && dl0Var.f44740b0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        dl0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(dl0Var.f44740b0);
                    dl0 dl0Var2 = dl0Var.f44753g0;
                    if (dl0Var2 != null) {
                        dl0Var2.I0(dl0Var.f44740b0);
                    }
                    if (!dl0Var.f44740b0.has_password && dl0Var.f44748e0 == null) {
                        ek0 ek0Var = new ek0(dl0Var, 2);
                        dl0Var.f44748e0 = ek0Var;
                        org.telegram.messenger.g0.i3(ek0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                dl0.a0(dl0Var, tL_error, tLObject);
                return;
            default:
                dl0.c0(dl0Var, tL_error, tLObject);
                return;
        }
    }
}
