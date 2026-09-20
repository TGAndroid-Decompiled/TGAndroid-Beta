package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class gk extends FragmentContextView {
    public final int P0;
    public final zn Q0;

    public gk(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, znVar2, null, true, f6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = znVar;
                super(context, znVar2, null, false, f6Var);
                return;
            default:
                this.Q0 = znVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                zn znVar = this.Q0;
                org.telegram.ui.Components.ch chVar = znVar.M0;
                FrameLayout frameLayout = znVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                zn znVar2 = this.Q0;
                org.telegram.ui.Components.ch chVar2 = znVar2.M0;
                FrameLayout frameLayout2 = znVar2.Y1;
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
