package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ct0 extends FragmentContextView {
    public final qv0 Q0;

    public ct0(qv0 qv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, qv0 qv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, qv0Var2, false, d6Var);
        this.Q0 = qv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        qv0 qv0Var = this.Q0;
        ns nsVar = qv0Var.P0;
        FrameLayout frameLayout = qv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nsVar.i(frameLayout, z10, true);
    }
}
