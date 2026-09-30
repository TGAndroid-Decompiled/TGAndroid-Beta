package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nn0 implements Runnable {
    public final int f35923a;
    public final oo0 f35924b;
    public final TLRPC.TL_error f35925c;
    public final TLObject d;

    public nn0(oo0 oo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35923a = i10;
        this.f35924b = oo0Var;
        this.f35925c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35923a) {
            case 0:
                oo0 oo0Var = this.f35924b;
                oo0Var.f36290e0 = false;
                if (this.f35925c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    oo0Var.f36280a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(oo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = oo0Var.C0;
                    if (paymentForm != null && oo0Var.f36280a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        oo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(oo0Var.f36280a0);
                    oo0 oo0Var2 = oo0Var.f36293f0;
                    if (oo0Var2 != null) {
                        oo0Var2.C0(oo0Var.f36280a0);
                    }
                    if (!oo0Var.f36280a0.has_password && oo0Var.f36288d0 == null) {
                        ln0 ln0Var = new ln0(oo0Var, 3);
                        oo0Var.f36288d0 = ln0Var;
                        AndroidUtilities.runOnUIThread(ln0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oo0.V(this.f35924b, this.f35925c, this.d);
                return;
            default:
                oo0.X(this.f35924b, this.f35925c, this.d);
                return;
        }
    }
}
