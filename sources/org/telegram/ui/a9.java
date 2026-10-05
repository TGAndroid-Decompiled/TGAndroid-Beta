package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class a9 extends FragmentContextView {
    public final int Q0 = 0;
    public final org.telegram.ui.ActionBar.n2 R0;

    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m9Var2, y8Var, false, d6Var);
        this.R0 = m9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                m9 m9Var = (m9) this.R0;
                org.telegram.ui.Components.ns nsVar = m9Var.L;
                FrameLayout frameLayout = m9Var.M;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nsVar.i(frameLayout, z10, true);
                return;
            default:
                wf1 wf1Var = (wf1) this.R0;
                org.telegram.ui.Components.ns nsVar2 = wf1Var.U0;
                FrameLayout frameLayout2 = wf1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nsVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public a9(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.R0 = wf1Var;
    }
}
