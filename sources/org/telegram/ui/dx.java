package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class dx extends FragmentContextView {
    public final int P0;
    public final uy Q0;

    public dx(uy uyVar, Context context, uy uyVar2, int i10) {
        super(context, uyVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = uyVar;
                super(context, uyVar2, false);
                return;
            default:
                this.Q0 = uyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                uy uyVar = this.Q0;
                org.telegram.ui.Components.ks ksVar = uyVar.J1;
                FrameLayout frameLayout = uyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ksVar.i(frameLayout, z10, true);
                return;
            default:
                uy uyVar2 = this.Q0;
                org.telegram.ui.Components.ks ksVar2 = uyVar2.J1;
                FrameLayout frameLayout2 = uyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ksVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
