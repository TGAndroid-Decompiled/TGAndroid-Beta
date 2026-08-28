package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class nw extends FragmentContextView {
    public final int J0;
    public final dy K0;

    public nw(dy dyVar, Context context, dy dyVar2, int i9) {
        super(context, dyVar2, true);
        this.J0 = i9;
        switch (i9) {
            case 1:
                this.K0 = dyVar;
                super(context, dyVar2, false);
                return;
            default:
                this.K0 = dyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        boolean z11;
        switch (this.J0) {
            case 0:
                dy dyVar = this.K0;
                org.telegram.ui.Components.bs bsVar = dyVar.F1;
                FrameLayout frameLayout = dyVar.C1;
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bsVar.i(frameLayout, z10, true);
                return;
            default:
                dy dyVar2 = this.K0;
                org.telegram.ui.Components.bs bsVar2 = dyVar2.F1;
                FrameLayout frameLayout2 = dyVar2.E1;
                if (i9 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
