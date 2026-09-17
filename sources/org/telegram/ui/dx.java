package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class dx extends FragmentContextView {
    public final int N0;
    public final uy O0;

    public dx(uy uyVar, Context context, uy uyVar2, int i10) {
        super(context, uyVar2, true);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = uyVar;
                super(context, uyVar2, false);
                return;
            default:
                this.O0 = uyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.N0) {
            case 0:
                uy uyVar = this.O0;
                org.telegram.ui.Components.js jsVar = uyVar.J1;
                FrameLayout frameLayout = uyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jsVar.i(frameLayout, z10, true);
                return;
            default:
                uy uyVar2 = this.O0;
                org.telegram.ui.Components.js jsVar2 = uyVar2.J1;
                FrameLayout frameLayout2 = uyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
