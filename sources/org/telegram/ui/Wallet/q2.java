package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ib0;
public final class q2 extends TwoStepVerificationActivity {
    public final ib0 f35469d0;

    public q2(ib0 ib0Var) {
        this.f35469d0 = ib0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        ib0 ib0Var = this.f35469d0;
        if (((Runnable) ib0Var.d) != null && !ib0Var.f38647c) {
            ib0Var.b();
        }
        super.onFragmentDestroy();
    }
}
