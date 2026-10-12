package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bo0 implements Runnable {
    public final int f34602a;
    public final cp0 f34603b;
    public final TLRPC.TL_error f34604c;
    public final TLObject d;

    public bo0(cp0 cp0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f34602a = i10;
        this.f34603b = cp0Var;
        this.f34604c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f34602a) {
            case 0:
                cp0 cp0Var = this.f34603b;
                cp0Var.f35006e0 = false;
                if (this.f34604c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    cp0Var.f34996a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(cp0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = cp0Var.C0;
                    if (paymentForm != null && cp0Var.f34996a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        cp0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(cp0Var.f34996a0);
                    cp0 cp0Var2 = cp0Var.f35009f0;
                    if (cp0Var2 != null) {
                        cp0Var2.C0(cp0Var.f34996a0);
                    }
                    if (!cp0Var.f34996a0.has_password && cp0Var.f35004d0 == null) {
                        zn0 zn0Var = new zn0(cp0Var, 3);
                        cp0Var.f35004d0 = zn0Var;
                        AndroidUtilities.runOnUIThread(zn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cp0.V(this.f34603b, this.f34604c, this.d);
                return;
            default:
                cp0.X(this.f34603b, this.f34604c, this.d);
                return;
        }
    }
}
