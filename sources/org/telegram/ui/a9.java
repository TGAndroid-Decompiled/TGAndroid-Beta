package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class a9 extends FragmentContextView {
    public final int X0 = 0;
    public final org.telegram.ui.ActionBar.o2 Y0;

    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, m9Var2, y8Var, false, g6Var);
        this.Y0 = m9Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                m9 m9Var = (m9) this.Y0;
                org.telegram.ui.Components.ss ssVar = m9Var.M;
                FrameLayout frameLayout = m9Var.N;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ssVar.i(frameLayout, z10, true);
                return;
            default:
                xe1 xe1Var = (xe1) this.Y0;
                org.telegram.ui.Components.ss ssVar2 = xe1Var.U0;
                FrameLayout frameLayout2 = xe1Var.F0;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ssVar2.i(frameLayout2, z11, true);
                return;
        }
    }

    public a9(xe1 xe1Var, Context context, xe1 xe1Var2) {
        super(context, xe1Var2, null, false, null);
        this.Y0 = xe1Var;
    }
}
