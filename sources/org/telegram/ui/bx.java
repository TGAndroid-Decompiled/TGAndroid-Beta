package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class bx extends FragmentContextView {
    public final int R0;
    public final sy S0;

    public bx(sy syVar, Context context, sy syVar2, int i10) {
        super(context, syVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = syVar;
                super(context, syVar2, false);
                return;
            default:
                this.S0 = syVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                sy syVar = this.S0;
                org.telegram.ui.Components.bt btVar = syVar.J1;
                FrameLayout frameLayout = syVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                btVar.i(frameLayout, z10, true);
                return;
            default:
                sy syVar2 = this.S0;
                org.telegram.ui.Components.bt btVar2 = syVar2.J1;
                FrameLayout frameLayout2 = syVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                btVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
