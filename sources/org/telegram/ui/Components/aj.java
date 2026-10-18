package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class aj extends FragmentContextView {
    public final FrameLayout R0;
    public final fj S0;

    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, d6Var);
        this.S0 = fjVar;
        this.R0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        us usVar = this.S0.f26264x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(this.R0, z10, true);
    }
}
