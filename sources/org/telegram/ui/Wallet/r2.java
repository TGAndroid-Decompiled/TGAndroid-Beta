package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.hb0;
public final class r2 extends TwoStepVerificationActivity {
    public final hb0 f35533d0;

    public r2(hb0 hb0Var) {
        this.f35533d0 = hb0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        hb0 hb0Var = this.f35533d0;
        if (((Runnable) hb0Var.d) != null && !hb0Var.f38406c) {
            hb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
