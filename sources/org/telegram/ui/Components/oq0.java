package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class oq0 extends FragmentContextView {
    public final xs0 X0;

    public oq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, xs0 xs0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, xs0Var2, false, f6Var);
        this.X0 = xs0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        xs0 xs0Var = this.X0;
        pr prVar = xs0Var.R0;
        FrameLayout frameLayout = xs0Var.S0;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        prVar.i(frameLayout, z9, true);
    }
}
