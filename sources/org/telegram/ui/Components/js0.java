package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class js0 extends FragmentContextView {
    public final yu0 K0;

    public js0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, yu0 yu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, yu0Var2, false, f6Var);
        this.K0 = yu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        yu0 yu0Var = this.K0;
        js jsVar = yu0Var.M0;
        FrameLayout frameLayout = yu0Var.N0;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        jsVar.i(frameLayout, z4, true);
    }
}
