package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ax extends FragmentContextView {
    public final int P0;
    public final ry Q0;

    public ax(ry ryVar, Context context, ry ryVar2, int i10) {
        super(context, ryVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = ryVar;
                super(context, ryVar2, false);
                return;
            default:
                this.Q0 = ryVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                ry ryVar = this.Q0;
                org.telegram.ui.Components.ls lsVar = ryVar.J1;
                FrameLayout frameLayout = ryVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lsVar.i(frameLayout, z10, true);
                return;
            default:
                ry ryVar2 = this.Q0;
                org.telegram.ui.Components.ls lsVar2 = ryVar2.J1;
                FrameLayout frameLayout2 = ryVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
