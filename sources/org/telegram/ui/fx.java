package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class fx extends FragmentContextView {
    public final int N0;
    public final wy O0;

    public fx(wy wyVar, Context context, wy wyVar2, int i10) {
        super(context, wyVar2, true);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = wyVar;
                super(context, wyVar2, false);
                return;
            default:
                this.O0 = wyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.N0) {
            case 0:
                wy wyVar = this.O0;
                org.telegram.ui.Components.qs qsVar = wyVar.J1;
                FrameLayout frameLayout = wyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qsVar.i(frameLayout, z10, true);
                return;
            default:
                wy wyVar2 = this.O0;
                org.telegram.ui.Components.qs qsVar2 = wyVar2.J1;
                FrameLayout frameLayout2 = wyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
