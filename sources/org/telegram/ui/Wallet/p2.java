package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ib0;
public final class p2 extends TwoStepVerificationActivity {
    public final ib0 f35351d0;

    public p2(ib0 ib0Var) {
        this.f35351d0 = ib0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        ib0 ib0Var = this.f35351d0;
        if (((Runnable) ib0Var.d) != null && !ib0Var.f38601c) {
            ib0Var.b();
        }
        super.onFragmentDestroy();
    }
}
