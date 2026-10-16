package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mb0;
public final class q2 extends TwoStepVerificationActivity {
    public final mb0 f33365d0;

    public q2(mb0 mb0Var) {
        this.f33365d0 = mb0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        mb0 mb0Var = this.f33365d0;
        if (((Runnable) mb0Var.d) != null && !mb0Var.f37961c) {
            mb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
