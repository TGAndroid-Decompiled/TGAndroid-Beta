package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class fk extends FragmentContextView {
    public final int K0;
    public final zn L0;

    public fk(zn znVar, Context context, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, znVar2, null, true, f6Var);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = znVar;
                super(context, znVar2, null, false, f6Var);
                return;
            default:
                this.L0 = znVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        switch (this.K0) {
            case 0:
                zn znVar = this.L0;
                org.telegram.ui.Components.sg sgVar = znVar.J0;
                FrameLayout frameLayout = znVar.X1;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sgVar.i(frameLayout, z4, true);
                return;
            default:
                zn znVar2 = this.L0;
                org.telegram.ui.Components.sg sgVar2 = znVar2.J0;
                FrameLayout frameLayout2 = znVar2.V1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sgVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
