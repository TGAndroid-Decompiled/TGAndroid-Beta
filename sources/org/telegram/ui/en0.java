package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class en0 implements Runnable {
    public final int f36574a;
    public final go0 f36575b;
    public final TLRPC.TL_error f36576c;
    public final TLObject d;

    public en0(go0 go0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36574a = i10;
        this.f36575b = go0Var;
        this.f36576c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36574a) {
            case 0:
                go0 go0Var = this.f36575b;
                go0Var.f37264e0 = false;
                if (this.f36576c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    go0Var.f37254a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(go0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = go0Var.C0;
                    if (paymentForm != null && go0Var.f37254a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        go0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(go0Var.f37254a0);
                    go0 go0Var2 = go0Var.f37267f0;
                    if (go0Var2 != null) {
                        go0Var2.C0(go0Var.f37254a0);
                    }
                    if (!go0Var.f37254a0.has_password && go0Var.f37262d0 == null) {
                        cn0 cn0Var = new cn0(go0Var, 3);
                        go0Var.f37262d0 = cn0Var;
                        AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                go0.V(this.f36575b, this.f36576c, this.d);
                return;
            default:
                go0.X(this.f36575b, this.f36576c, this.d);
                return;
        }
    }
}
