package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class kn0 implements Runnable {
    public final int f35774a;
    public final jo0 f35775b;
    public final TLRPC.TL_error f35776c;
    public final TLObject d;

    public kn0(jo0 jo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f35774a = i10;
        this.f35775b = jo0Var;
        this.f35776c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35774a) {
            case 0:
                jo0 jo0Var = this.f35775b;
                jo0Var.f35392b0 = false;
                if (this.f35776c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    jo0Var.X = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(jo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = jo0Var.f35425z0;
                    if (paymentForm != null && jo0Var.X.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        jo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(jo0Var.X);
                    jo0 jo0Var2 = jo0Var.f35395c0;
                    if (jo0Var2 != null) {
                        jo0Var2.C0(jo0Var.X);
                    }
                    if (!jo0Var.X.has_password && jo0Var.f35389a0 == null) {
                        in0 in0Var = new in0(jo0Var, 3);
                        jo0Var.f35389a0 = in0Var;
                        AndroidUtilities.runOnUIThread(in0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jo0.V(this.f35775b, this.f35776c, this.d);
                return;
            default:
                jo0.X(this.f35775b, this.f35776c, this.d);
                return;
        }
    }
}
