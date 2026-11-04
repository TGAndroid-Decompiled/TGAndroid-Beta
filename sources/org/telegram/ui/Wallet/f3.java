package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class f3 extends TwoStepVerificationActivity {
    public final cg.u0 f42515e0;

    public f3(cg.u0 u0Var) {
        this.f42515e0 = u0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        cg.u0 u0Var = this.f42515e0;
        if (((Runnable) u0Var.d) != null && !u0Var.f4755c) {
            u0Var.a();
        }
        super.onFragmentDestroy();
    }
}
