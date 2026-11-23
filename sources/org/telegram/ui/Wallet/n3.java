package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class n3 extends TwoStepVerificationActivity {
    public final m.b3 f44694e0;

    public n3(m.b3 b3Var) {
        this.f44694e0 = b3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        m.b3 b3Var = this.f44694e0;
        if ((((Runnable) b3Var.f20117c) != null || ((Runnable) b3Var.d) != null) && !b3Var.f20116b) {
            b3Var.b();
        }
        super.onFragmentDestroy();
    }
}
