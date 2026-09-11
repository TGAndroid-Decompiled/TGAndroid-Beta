package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class js0 extends FragmentContextView {
    public final xu0 N0;

    public js0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, xu0 xu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, xu0Var2, false, f6Var);
        this.N0 = xu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        xu0 xu0Var = this.N0;
        js jsVar = xu0Var.P0;
        FrameLayout frameLayout = xu0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jsVar.i(frameLayout, z10, true);
    }
}
