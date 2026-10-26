package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class bk extends FragmentContextView {
    public final int X0;
    public final un Y0;

    public bk(un unVar, Context context, un unVar2, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, unVar2, null, true, u6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = unVar;
                super(context, unVar2, null, false, u6Var);
                return;
            default:
                this.Y0 = unVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                un unVar = this.Y0;
                org.telegram.ui.Components.ch chVar = unVar.Y0;
                FrameLayout frameLayout = unVar.f44331m2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                un unVar2 = this.Y0;
                org.telegram.ui.Components.ch chVar2 = unVar2.Y0;
                FrameLayout frameLayout2 = unVar2.f44308k2;
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
