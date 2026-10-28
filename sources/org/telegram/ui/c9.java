package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class c9 extends FragmentContextView {
    public final int X0 = 1;
    public final org.telegram.ui.ActionBar.r2 Y0;

    public c9(o9 o9Var, Context context, o9 o9Var2, a9 a9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, o9Var2, a9Var, false, u6Var);
        this.Y0 = o9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                o9 o9Var = (o9) this.Y0;
                org.telegram.ui.Components.ws wsVar = o9Var.H;
                FrameLayout frameLayout = o9Var.I;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wsVar.i(frameLayout, z10, true);
                return;
            default:
                cf1 cf1Var = (cf1) this.Y0;
                org.telegram.ui.Components.ws wsVar2 = cf1Var.U0;
                FrameLayout frameLayout2 = cf1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wsVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public c9(cf1 cf1Var, Context context, cf1 cf1Var2) {
        super(context, cf1Var2, null, false, null);
        this.Y0 = cf1Var;
    }
}
