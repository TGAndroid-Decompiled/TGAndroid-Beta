package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class fj extends FragmentContextView {
    public final FrameLayout R0;
    public final kj S0;

    public fj(kj kjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, e6Var);
        this.S0 = kjVar;
        this.R0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        bt btVar = this.S0.f28048x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        btVar.i(this.R0, z10, true);
    }
}
