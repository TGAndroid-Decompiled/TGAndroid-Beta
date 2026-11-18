package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class m3 extends TwoStepVerificationActivity {
    public final m.b3 f44514e0;

    public m3(m.b3 b3Var) {
        this.f44514e0 = b3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        m.b3 b3Var = this.f44514e0;
        if ((((Runnable) b3Var.f20026c) != null || ((Runnable) b3Var.d) != null) && !b3Var.f20025b) {
            b3Var.b();
        }
        super.onFragmentDestroy();
    }
}
