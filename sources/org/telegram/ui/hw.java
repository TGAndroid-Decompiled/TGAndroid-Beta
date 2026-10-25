package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hw extends FragmentContextView {
    public final int X0;
    public final cy Y0;

    public hw(cy cyVar, Context context, cy cyVar2, int i10) {
        super(context, cyVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = cyVar;
                super(context, cyVar2, false);
                return;
            default:
                this.Y0 = cyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                cy cyVar = this.Y0;
                org.telegram.ui.Components.ws wsVar = cyVar.J1;
                FrameLayout frameLayout = cyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wsVar.i(frameLayout, z10, true);
                return;
            default:
                cy cyVar2 = this.Y0;
                org.telegram.ui.Components.ws wsVar2 = cyVar2.J1;
                FrameLayout frameLayout2 = cyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
