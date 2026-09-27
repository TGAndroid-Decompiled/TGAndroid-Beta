package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class b9 extends FragmentContextView {
    public final int Q0 = 0;
    public final org.telegram.ui.ActionBar.o2 R0;

    public b9(n9 n9Var, Context context, n9 n9Var2, z8 z8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n9Var2, z8Var, false, e6Var);
        this.R0 = n9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                n9 n9Var = (n9) this.R0;
                org.telegram.ui.Components.ms msVar = n9Var.L;
                FrameLayout frameLayout = n9Var.M;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                msVar.i(frameLayout, z10, true);
                return;
            default:
                wf1 wf1Var = (wf1) this.R0;
                org.telegram.ui.Components.ms msVar2 = wf1Var.U0;
                FrameLayout frameLayout2 = wf1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                msVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public b9(wf1 wf1Var, Context context, wf1 wf1Var2) {
        super(context, wf1Var2, null, false, null);
        this.R0 = wf1Var;
    }
}
