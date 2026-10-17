package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class nw extends FragmentContextView {
    public final int R0;
    public final ey S0;

    public nw(ey eyVar, Context context, ey eyVar2, int i10) {
        super(context, eyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = eyVar;
                super(context, eyVar2, false);
                return;
            default:
                this.S0 = eyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                ey eyVar = this.S0;
                org.telegram.ui.Components.us usVar = eyVar.J1;
                FrameLayout frameLayout = eyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                usVar.i(frameLayout, z10, true);
                return;
            default:
                ey eyVar2 = this.S0;
                org.telegram.ui.Components.us usVar2 = eyVar2.J1;
                FrameLayout frameLayout2 = eyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                usVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
