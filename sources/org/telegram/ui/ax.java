package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ax extends FragmentContextView {
    public final int K0;
    public final qy L0;

    public ax(qy qyVar, Context context, qy qyVar2, int i10) {
        super(context, qyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = qyVar;
                super(context, qyVar2, false);
                return;
            default:
                this.L0 = qyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        switch (this.K0) {
            case 0:
                qy qyVar = this.L0;
                org.telegram.ui.Components.is isVar = qyVar.G1;
                FrameLayout frameLayout = qyVar.D1;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                isVar.i(frameLayout, z4, true);
                return;
            default:
                qy qyVar2 = this.L0;
                org.telegram.ui.Components.is isVar2 = qyVar2.G1;
                FrameLayout frameLayout2 = qyVar2.F1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                isVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
