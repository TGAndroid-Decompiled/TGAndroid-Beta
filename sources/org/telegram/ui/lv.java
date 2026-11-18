package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class lv extends FragmentContextView {
    public final int Y0;
    public final cx Z0;

    public lv(cx cxVar, Context context, cx cxVar2, int i7) {
        super(context, cxVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = cxVar;
                super(context, cxVar2, false);
                return;
            default:
                this.Z0 = cxVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                cx cxVar = this.Z0;
                org.telegram.ui.Components.cs csVar = cxVar.L1;
                FrameLayout frameLayout = cxVar.I1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                csVar.j(frameLayout, z10, true);
                return;
            default:
                cx cxVar2 = this.Z0;
                org.telegram.ui.Components.cs csVar2 = cxVar2.L1;
                FrameLayout frameLayout2 = cxVar2.K1;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                csVar2.j(frameLayout2, z11, true);
                return;
        }
    }
}
