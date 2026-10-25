package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class aj extends FragmentContextView {
    public final FrameLayout X0;
    public final fj Y0;

    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, FrameLayout frameLayout2) {
        super(context, r2Var, frameLayout, false, u6Var);
        this.Y0 = fjVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        ws wsVar = this.Y0.f28209x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wsVar.i(this.X0, z10, true);
    }
}
