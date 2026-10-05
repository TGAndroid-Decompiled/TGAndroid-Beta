package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ej extends FragmentContextView {
    public final FrameLayout Q0;
    public final jj R0;

    public ej(jj jjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, d6Var);
        this.R0 = jjVar;
        this.Q0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        ns nsVar = this.R0.f27869x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nsVar.i(this.Q0, z10, true);
    }
}
