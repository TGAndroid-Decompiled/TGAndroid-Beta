package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class pw extends FragmentContextView {
    public final int J0;
    public final fy K0;

    public pw(fy fyVar, Context context, fy fyVar2, int i10) {
        super(context, fyVar2, true);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = fyVar;
                super(context, fyVar2, false);
                return;
            default:
                this.K0 = fyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.J0) {
            case 0:
                fy fyVar = this.K0;
                org.telegram.ui.Components.fs fsVar = fyVar.F1;
                FrameLayout frameLayout = fyVar.C1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fsVar.i(frameLayout, z10, true);
                return;
            default:
                fy fyVar2 = this.K0;
                org.telegram.ui.Components.fs fsVar2 = fyVar2.F1;
                FrameLayout frameLayout2 = fyVar2.E1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
