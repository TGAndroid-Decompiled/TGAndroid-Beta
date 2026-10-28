package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class dk extends FragmentContextView {
    public final int X0;
    public final wn Y0;

    public dk(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, wnVar2, null, true, u6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = wnVar;
                super(context, wnVar2, null, false, u6Var);
                return;
            default:
                this.Y0 = wnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                wn wnVar = this.Y0;
                org.telegram.ui.Components.ch chVar = wnVar.Y0;
                FrameLayout frameLayout = wnVar.f45199m2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                wn wnVar2 = this.Y0;
                org.telegram.ui.Components.ch chVar2 = wnVar2.Y0;
                FrameLayout frameLayout2 = wnVar2.f45176k2;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                chVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
