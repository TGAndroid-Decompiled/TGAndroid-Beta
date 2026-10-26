package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pn0 implements Runnable {
    public final int f42579a;
    public final po0 f42580b;
    public final TLRPC.TL_error f42581c;
    public final TLObject d;

    public pn0(po0 po0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42579a = i10;
        this.f42580b = po0Var;
        this.f42581c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42579a) {
            case 0:
                po0 po0Var = this.f42580b;
                po0Var.f42597e0 = false;
                if (this.f42581c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    po0Var.f42587a0 = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(po0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = po0Var.C0;
                    if (paymentForm != null && po0Var.f42587a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        po0Var.L0();
                    }
                    TwoStepVerificationActivity.n0(po0Var.f42587a0);
                    po0 po0Var2 = po0Var.f42600f0;
                    if (po0Var2 != null) {
                        po0Var2.D0(po0Var.f42587a0);
                    }
                    if (!po0Var.f42587a0.has_password && po0Var.f42595d0 == null) {
                        nn0 nn0Var = new nn0(po0Var, 3);
                        po0Var.f42595d0 = nn0Var;
                        AndroidUtilities.runOnUIThread(nn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                po0.W(this.f42580b, this.f42581c, this.d);
                return;
            default:
                po0.Y(this.f42580b, this.f42581c, this.d);
                return;
        }
    }
}
