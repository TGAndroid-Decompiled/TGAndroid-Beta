package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cn0 implements Runnable {
    public final int f37180a;
    public final bo0 f37181b;
    public final TLRPC.TL_error f37182c;
    public final TLObject d;

    public cn0(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37180a = i10;
        this.f37181b = bo0Var;
        this.f37182c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37180a) {
            case 0:
                bo0 bo0Var = this.f37181b;
                bo0Var.f36839a0 = false;
                if (this.f37182c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    bo0Var.W = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(bo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = bo0Var.f36874y0;
                    if (paymentForm != null && bo0Var.W.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        bo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(bo0Var.W);
                    bo0 bo0Var2 = bo0Var.f36842b0;
                    if (bo0Var2 != null) {
                        bo0Var2.C0(bo0Var.W);
                    }
                    if (!bo0Var.W.has_password && bo0Var.Z == null) {
                        an0 an0Var = new an0(bo0Var, 3);
                        bo0Var.Z = an0Var;
                        AndroidUtilities.runOnUIThread(an0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                bo0.V(this.f37181b, this.f37182c, this.d);
                return;
            default:
                bo0.X(this.f37181b, this.f37182c, this.d);
                return;
        }
    }
}
