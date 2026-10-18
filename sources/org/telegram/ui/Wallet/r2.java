package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.pa0;
public final class r2 extends TwoStepVerificationActivity {
    public final pa0 f34774d0;

    public r2(pa0 pa0Var) {
        this.f34774d0 = pa0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        pa0 pa0Var = this.f34774d0;
        if (((Runnable) pa0Var.d) != null && !pa0Var.f40008c) {
            pa0Var.b();
        }
        super.onFragmentDestroy();
    }
}
