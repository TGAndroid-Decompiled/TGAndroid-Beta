package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class yi extends FragmentContextView {
    public final FrameLayout X0;
    public final dj Y0;

    public yi(dj djVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout2) {
        super(context, o2Var, frameLayout, false, g6Var);
        this.Y0 = djVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        ss ssVar = this.Y0.f25758x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ssVar.i(this.X0, z10, true);
    }
}
