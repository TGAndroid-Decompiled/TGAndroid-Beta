package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class g3 extends TwoStepVerificationActivity {
    public final bg.v0 f42529d0;

    public g3(bg.v0 v0Var) {
        this.f42529d0 = v0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        bg.v0 v0Var = this.f42529d0;
        if (((Runnable) v0Var.d) != null && !v0Var.f3390c) {
            v0Var.a();
        }
        super.onFragmentDestroy();
    }
}
