package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ek extends FragmentContextView {
    public final int P0;
    public final xn Q0;

    public ek(xn xnVar, Context context, xn xnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, xnVar2, null, true, d6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = xnVar;
                super(context, xnVar2, null, false, d6Var);
                return;
            default:
                this.Q0 = xnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                xn xnVar = this.Q0;
                org.telegram.ui.Components.ch chVar = xnVar.M0;
                FrameLayout frameLayout = xnVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                xn xnVar2 = this.Q0;
                org.telegram.ui.Components.ch chVar2 = xnVar2.M0;
                FrameLayout frameLayout2 = xnVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                chVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
