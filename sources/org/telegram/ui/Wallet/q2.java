package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ta0;
public final class q2 extends TwoStepVerificationActivity {
    public final ta0 f35067d0;

    public q2(ta0 ta0Var) {
        this.f35067d0 = ta0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        ta0 ta0Var = this.f35067d0;
        if (((Runnable) ta0Var.d) != null && !ta0Var.f41982c) {
            ta0Var.b();
        }
        super.onFragmentDestroy();
    }
}
