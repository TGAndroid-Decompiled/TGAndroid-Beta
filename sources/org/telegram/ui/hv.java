package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hv extends FragmentContextView {
    public final int X0;
    public final ww Y0;

    public hv(ww wwVar, Context context, ww wwVar2, int i7) {
        super(context, wwVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = wwVar;
                super(context, wwVar2, false);
                return;
            default:
                this.Y0 = wwVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                ww wwVar = this.Y0;
                org.telegram.ui.Components.pr prVar = wwVar.J1;
                FrameLayout frameLayout = wwVar.G1;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                prVar.i(frameLayout, z9, true);
                return;
            default:
                ww wwVar2 = this.Y0;
                org.telegram.ui.Components.pr prVar2 = wwVar2.J1;
                FrameLayout frameLayout2 = wwVar2.I1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
