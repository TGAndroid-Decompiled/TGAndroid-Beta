package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class a9 extends FragmentContextView {
    public final int R0 = 1;
    public final org.telegram.ui.ActionBar.m2 S0;

    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m9Var2, y8Var, false, c6Var);
        this.S0 = m9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                m9 m9Var = (m9) this.S0;
                org.telegram.ui.Components.ct ctVar = m9Var.M;
                FrameLayout frameLayout = m9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ctVar.i(frameLayout, z10, true);
                return;
            default:
                hg1 hg1Var = (hg1) this.S0;
                org.telegram.ui.Components.ct ctVar2 = hg1Var.U0;
                FrameLayout frameLayout2 = hg1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ctVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public a9(hg1 hg1Var, Context context, hg1 hg1Var2) {
        super(context, hg1Var2, null, false, null);
        this.S0 = hg1Var;
    }
}
