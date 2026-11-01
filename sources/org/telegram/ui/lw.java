package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class lw extends FragmentContextView {
    public final int X0;
    public final zx Y0;

    public lw(zx zxVar, Context context, zx zxVar2, int i10) {
        super(context, zxVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = zxVar;
                super(context, zxVar2, false);
                return;
            default:
                this.Y0 = zxVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                zx zxVar = this.Y0;
                org.telegram.ui.Components.zr zrVar = zxVar.J1;
                FrameLayout frameLayout = zxVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zrVar.i(frameLayout, z10, true);
                return;
            default:
                zx zxVar2 = this.Y0;
                org.telegram.ui.Components.zr zrVar2 = zxVar2.J1;
                FrameLayout frameLayout2 = zxVar2.I1;
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
