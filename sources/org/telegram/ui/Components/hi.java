package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class hi extends FragmentContextView {
    public final FrameLayout X0;
    public final mi Y0;

    public hi(mi miVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var, FrameLayout frameLayout2) {
        super(context, k2Var, frameLayout, false, p6Var);
        this.Y0 = miVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        zr zrVar = this.Y0.f28492y;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zrVar.i(this.X0, z10, true);
    }
}
