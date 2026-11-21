package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class br0 extends FragmentContextView {
    public final jt0 Y0;

    public br0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, jt0 jt0Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, jt0Var2, false, h6Var);
        this.Y0 = jt0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        jt0 jt0Var = this.Y0;
        es esVar = jt0Var.S0;
        FrameLayout frameLayout = jt0Var.T0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        esVar.j(frameLayout, z10, true);
    }
}
