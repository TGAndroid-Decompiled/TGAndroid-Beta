package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class mk extends FragmentContextView {
    public final int R0;
    public final fo S0;

    public mk(fo foVar, Context context, fo foVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, foVar2, null, true, c6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = foVar;
                super(context, foVar2, null, false, c6Var);
                return;
            default:
                this.S0 = foVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                fo foVar = this.S0;
                org.telegram.ui.Components.dh dhVar = foVar.M0;
                FrameLayout frameLayout = foVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dhVar.i(frameLayout, z10, true);
                return;
            default:
                fo foVar2 = this.S0;
                org.telegram.ui.Components.dh dhVar2 = foVar2.M0;
                FrameLayout frameLayout2 = foVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
