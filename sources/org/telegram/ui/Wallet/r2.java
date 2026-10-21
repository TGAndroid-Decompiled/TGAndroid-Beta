package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.na0;
public final class r2 extends TwoStepVerificationActivity {
    public final na0 f34800d0;

    public r2(na0 na0Var) {
        this.f34800d0 = na0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        na0 na0Var = this.f34800d0;
        if (((Runnable) na0Var.d) != null && !na0Var.f39489c) {
            na0Var.b();
        }
        super.onFragmentDestroy();
    }
}
