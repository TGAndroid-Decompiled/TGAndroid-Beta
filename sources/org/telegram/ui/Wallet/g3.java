package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aa0;
public final class g3 extends TwoStepVerificationActivity {
    public final aa0 f34545d0;

    public g3(aa0 aa0Var) {
        this.f34545d0 = aa0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        aa0 aa0Var = this.f34545d0;
        if (((Runnable) aa0Var.d) != null && !aa0Var.f35598c) {
            aa0Var.a();
        }
        super.onFragmentDestroy();
    }
}
