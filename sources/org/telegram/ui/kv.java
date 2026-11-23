package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class kv extends FragmentContextView {
    public final int Y0;
    public final bx Z0;

    public kv(bx bxVar, Context context, bx bxVar2, int i7) {
        super(context, bxVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = bxVar;
                super(context, bxVar2, false);
                return;
            default:
                this.Z0 = bxVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                bx bxVar = this.Z0;
                org.telegram.ui.Components.bs bsVar = bxVar.L1;
                FrameLayout frameLayout = bxVar.I1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bsVar.j(frameLayout, z10, true);
                return;
            default:
                bx bxVar2 = this.Z0;
                org.telegram.ui.Components.bs bsVar2 = bxVar2.L1;
                FrameLayout frameLayout2 = bxVar2.K1;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bsVar2.j(frameLayout2, z11, true);
                return;
        }
    }
}
