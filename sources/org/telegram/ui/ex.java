package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ex extends FragmentContextView {
    public final int R0;
    public final vy S0;

    public ex(vy vyVar, Context context, vy vyVar2, int i10) {
        super(context, vyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = vyVar;
                super(context, vyVar2, false);
                return;
            default:
                this.S0 = vyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                vy vyVar = this.S0;
                org.telegram.ui.Components.ct ctVar = vyVar.J1;
                FrameLayout frameLayout = vyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ctVar.i(frameLayout, z10, true);
                return;
            default:
                vy vyVar2 = this.S0;
                org.telegram.ui.Components.ct ctVar2 = vyVar2.J1;
                FrameLayout frameLayout2 = vyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ctVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
