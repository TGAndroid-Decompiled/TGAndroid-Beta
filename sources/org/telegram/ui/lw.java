package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class lw extends FragmentContextView {
    public final int R0;
    public final cy S0;

    public lw(cy cyVar, Context context, cy cyVar2, int i10) {
        super(context, cyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = cyVar;
                super(context, cyVar2, false);
                return;
            default:
                this.S0 = cyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                cy cyVar = this.S0;
                org.telegram.ui.Components.us usVar = cyVar.J1;
                FrameLayout frameLayout = cyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                usVar.i(frameLayout, z10, true);
                return;
            default:
                cy cyVar2 = this.S0;
                org.telegram.ui.Components.us usVar2 = cyVar2.J1;
                FrameLayout frameLayout2 = cyVar2.I1;
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
