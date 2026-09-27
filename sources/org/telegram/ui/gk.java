package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class gk extends FragmentContextView {
    public final int Q0;
    public final xn R0;

    public gk(xn xnVar, Context context, xn xnVar2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, xnVar2, null, true, e6Var);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = xnVar;
                super(context, xnVar2, null, false, e6Var);
                return;
            default:
                this.R0 = xnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                xn xnVar = this.R0;
                org.telegram.ui.Components.dh dhVar = xnVar.M0;
                FrameLayout frameLayout = xnVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dhVar.i(frameLayout, z10, true);
                return;
            default:
                xn xnVar2 = this.R0;
                org.telegram.ui.Components.dh dhVar2 = xnVar2.M0;
                FrameLayout frameLayout2 = xnVar2.Y1;
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
