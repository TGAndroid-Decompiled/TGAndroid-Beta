package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class fx extends FragmentContextView {
    public final int P0;
    public final wy Q0;

    public fx(wy wyVar, Context context, wy wyVar2, int i10) {
        super(context, wyVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = wyVar;
                super(context, wyVar2, false);
                return;
            default:
                this.Q0 = wyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                wy wyVar = this.Q0;
                org.telegram.ui.Components.ks ksVar = wyVar.J1;
                FrameLayout frameLayout = wyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ksVar.i(frameLayout, z10, true);
                return;
            default:
                wy wyVar2 = this.Q0;
                org.telegram.ui.Components.ks ksVar2 = wyVar2.J1;
                FrameLayout frameLayout2 = wyVar2.I1;
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
