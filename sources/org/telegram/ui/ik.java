package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ik extends FragmentContextView {
    public final int R0;
    public final zn S0;

    public ik(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, znVar2, null, true, d6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = znVar;
                super(context, znVar2, null, false, d6Var);
                return;
            default:
                this.S0 = znVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                zn znVar = this.S0;
                org.telegram.ui.Components.fh fhVar = znVar.M0;
                FrameLayout frameLayout = znVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fhVar.i(frameLayout, z10, true);
                return;
            default:
                zn znVar2 = this.S0;
                org.telegram.ui.Components.fh fhVar2 = znVar2.M0;
                FrameLayout frameLayout2 = znVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
