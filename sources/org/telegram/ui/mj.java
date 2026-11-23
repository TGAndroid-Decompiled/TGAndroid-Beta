package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class mj extends FragmentContextView {
    public final int Y0;
    public final bn Z0;

    public mj(bn bnVar, Context context, bn bnVar2, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, bnVar2, null, true, h6Var);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = bnVar;
                super(context, bnVar2, null, false, h6Var);
                return;
            default:
                this.Z0 = bnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                bn bnVar = this.Z0;
                org.telegram.ui.Components.ch chVar = bnVar.f45919b1;
                FrameLayout frameLayout = bnVar.f46101p2;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.j(frameLayout, z10, true);
                return;
            default:
                bn bnVar2 = this.Z0;
                org.telegram.ui.Components.ch chVar2 = bnVar2.f45919b1;
                FrameLayout frameLayout2 = bnVar2.f46076n2;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                chVar2.j(frameLayout2, z11, true);
                return;
        }
    }
}
