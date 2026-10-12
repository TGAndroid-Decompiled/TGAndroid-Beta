package org.telegram.ui.Wallet;

import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.jb0;
public final class r2 extends TwoStepVerificationActivity {
    public final jb0 f35312d0;

    public r2(jb0 jb0Var) {
        this.f35312d0 = jb0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        jb0 jb0Var = this.f35312d0;
        if (((Runnable) jb0Var.d) != null && !jb0Var.f39175c) {
            jb0Var.b();
        }
        super.onFragmentDestroy();
    }
}
