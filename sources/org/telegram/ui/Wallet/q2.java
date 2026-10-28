package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class q2 extends TwoStepVerificationActivity {
    public final ag.b1 f37151d0;

    public q2(ag.b1 b1Var) {
        this.f37151d0 = b1Var;
    }

    @Override
    public final void onFragmentDestroy() {
        ag.b1 b1Var = this.f37151d0;
        if (((Runnable) b1Var.d) != null && !b1Var.f1256c) {
            b1Var.b();
        }
        super.onFragmentDestroy();
    }
}
