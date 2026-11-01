package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.z90;
public final class h3 extends TwoStepVerificationActivity {
    public final z90 f34620d0;

    public h3(z90 z90Var) {
        this.f34620d0 = z90Var;
    }

    @Override
    public final void onFragmentDestroy() {
        z90 z90Var = this.f34620d0;
        if (((Runnable) z90Var.d) != null && !z90Var.f43855c) {
            z90Var.a();
        }
        super.onFragmentDestroy();
    }
}
