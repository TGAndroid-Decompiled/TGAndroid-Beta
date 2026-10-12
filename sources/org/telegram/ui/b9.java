package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class b9 extends FragmentContextView {
    public final int R0 = 1;
    public final org.telegram.ui.ActionBar.m2 S0;

    public b9(n9 n9Var, Context context, n9 n9Var2, z8 z8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n9Var2, z8Var, false, c6Var);
        this.S0 = n9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                n9 n9Var = (n9) this.S0;
                org.telegram.ui.Components.xs xsVar = n9Var.M;
                FrameLayout frameLayout = n9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xsVar.i(frameLayout, z10, true);
                return;
            default:
                lg1 lg1Var = (lg1) this.S0;
                org.telegram.ui.Components.xs xsVar2 = lg1Var.U0;
                FrameLayout frameLayout2 = lg1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xsVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public b9(lg1 lg1Var, Context context, lg1 lg1Var2) {
        super(context, lg1Var2, null, false, null);
        this.S0 = lg1Var;
    }
}
