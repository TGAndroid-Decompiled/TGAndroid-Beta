package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hn0 implements Runnable {
    public final int f37884a;
    public final io0 f37885b;
    public final TLRPC.TL_error f37886c;
    public final TLObject d;

    public hn0(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37884a = i10;
        this.f37885b = io0Var;
        this.f37886c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37884a) {
            case 0:
                io0 io0Var = this.f37885b;
                io0Var.f38298e0 = false;
                if (this.f37886c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    io0Var.f38288a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.x0(io0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = io0Var.C0;
                    if (paymentForm != null && io0Var.f38288a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        io0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(io0Var.f38288a0);
                    io0 io0Var2 = io0Var.f38301f0;
                    if (io0Var2 != null) {
                        io0Var2.C0(io0Var.f38288a0);
                    }
                    if (!io0Var.f38288a0.has_password && io0Var.f38296d0 == null) {
                        fn0 fn0Var = new fn0(io0Var, 3);
                        io0Var.f38296d0 = fn0Var;
                        AndroidUtilities.runOnUIThread(fn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                io0.V(this.f37885b, this.f37886c, this.d);
                return;
            default:
                io0.X(this.f37885b, this.f37886c, this.d);
                return;
        }
    }
}
