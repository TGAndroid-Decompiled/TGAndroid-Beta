package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class mw extends FragmentContextView {
    public final int X0;
    public final ay Y0;

    public mw(ay ayVar, Context context, ay ayVar2, int i10) {
        super(context, ayVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = ayVar;
                super(context, ayVar2, false);
                return;
            default:
                this.Y0 = ayVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                ay ayVar = this.Y0;
                org.telegram.ui.Components.zr zrVar = ayVar.J1;
                FrameLayout frameLayout = ayVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zrVar.i(frameLayout, z10, true);
                return;
            default:
                ay ayVar2 = this.Y0;
                org.telegram.ui.Components.zr zrVar2 = ayVar2.J1;
                FrameLayout frameLayout2 = ayVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zrVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
