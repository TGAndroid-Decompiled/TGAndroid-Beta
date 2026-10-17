package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class en0 implements Runnable {
    public final int f36570a;
    public final fo0 f36571b;
    public final TLRPC.TL_error f36572c;
    public final TLObject d;

    public en0(fo0 fo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36570a = i10;
        this.f36571b = fo0Var;
        this.f36572c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36570a) {
            case 0:
                fo0 fo0Var = this.f36571b;
                fo0Var.f36981e0 = false;
                if (this.f36572c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    fo0Var.f36971a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(fo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = fo0Var.C0;
                    if (paymentForm != null && fo0Var.f36971a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        fo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(fo0Var.f36971a0);
                    fo0 fo0Var2 = fo0Var.f36984f0;
                    if (fo0Var2 != null) {
                        fo0Var2.C0(fo0Var.f36971a0);
                    }
                    if (!fo0Var.f36971a0.has_password && fo0Var.f36979d0 == null) {
                        cn0 cn0Var = new cn0(fo0Var, 3);
                        fo0Var.f36979d0 = cn0Var;
                        AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fo0.V(this.f36571b, this.f36572c, this.d);
                return;
            default:
                fo0.X(this.f36571b, this.f36572c, this.d);
                return;
        }
    }
}
