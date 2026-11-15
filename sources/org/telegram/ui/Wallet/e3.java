package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
public final class e3 extends TwoStepVerificationActivity {
    public final bg.u0 f43790e0;

    public e3(bg.u0 u0Var) {
        this.f43790e0 = u0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        bg.u0 u0Var = this.f43790e0;
        if (((Runnable) u0Var.d) != null && !u0Var.f3341c) {
            u0Var.a();
        }
        super.onFragmentDestroy();
    }
}
