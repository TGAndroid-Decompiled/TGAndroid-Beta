package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ks0 extends FragmentContextView {
    public final zu0 K0;

    public ks0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, zu0 zu0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, p2Var, zu0Var2, false, g6Var);
        this.K0 = zu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        zu0 zu0Var = this.K0;
        ls lsVar = zu0Var.M0;
        FrameLayout frameLayout = zu0Var.N0;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        lsVar.i(frameLayout, z4, true);
    }
}
