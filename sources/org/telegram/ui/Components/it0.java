package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class it0 extends FragmentContextView {
    public final wv0 X0;

    public it0(wv0 wv0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, wv0 wv0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, wv0Var2, false, g6Var);
        this.X0 = wv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        wv0 wv0Var = this.X0;
        ss ssVar = wv0Var.P0;
        FrameLayout frameLayout = wv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ssVar.i(frameLayout, z10, true);
    }
}
