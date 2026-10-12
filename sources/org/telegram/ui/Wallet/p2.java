package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.nb0;
public final class p2 extends TwoStepVerificationActivity {
    public final nb0 f33591d0;

    public p2(nb0 nb0Var) {
        this.f33591d0 = nb0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        nb0 nb0Var = this.f33591d0;
        if (((Runnable) nb0Var.d) != null && !nb0Var.f38638c) {
            nb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
