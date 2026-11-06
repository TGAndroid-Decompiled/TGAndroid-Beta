package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h3 extends TwoStepVerificationActivity {
    public final bg.v0 f42558d0;

    public h3(bg.v0 v0Var) {
        this.f42558d0 = v0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        bg.v0 v0Var = this.f42558d0;
        if (((Runnable) v0Var.d) != null && !v0Var.f3390c) {
            v0Var.a();
        }
        super.onFragmentDestroy();
    }
}
