package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class mk extends FragmentContextView {
    public final int R0;
    public final eo S0;

    public mk(eo eoVar, Context context, eo eoVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, eoVar2, null, true, c6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = eoVar;
                super(context, eoVar2, null, false, c6Var);
                return;
            default:
                this.S0 = eoVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                eo eoVar = this.S0;
                org.telegram.ui.Components.hh hhVar = eoVar.M0;
                FrameLayout frameLayout = eoVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hhVar.i(frameLayout, z10, true);
                return;
            default:
                eo eoVar2 = this.S0;
                org.telegram.ui.Components.hh hhVar2 = eoVar2.M0;
                FrameLayout frameLayout2 = eoVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
