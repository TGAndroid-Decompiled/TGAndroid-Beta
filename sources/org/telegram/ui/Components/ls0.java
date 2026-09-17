package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ls0 extends FragmentContextView {
    public final zu0 N0;

    public ls0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, zu0 zu0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, o2Var, zu0Var2, false, f6Var);
        this.N0 = zu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        zu0 zu0Var = this.N0;
        ks ksVar = zu0Var.P0;
        FrameLayout frameLayout = zu0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ksVar.i(frameLayout, z10, true);
    }
}
