package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class gk extends FragmentContextView {
    public final int X0;
    public final un Y0;

    public gk(un unVar, Context context, un unVar2, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, unVar2, null, true, p6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = unVar;
                super(context, unVar2, null, false, p6Var);
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
                org.telegram.ui.Components.hg hgVar = unVar.f42180a1;
                FrameLayout frameLayout = unVar.f42356o2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hgVar.i(frameLayout, z10, true);
                return;
            default:
                un unVar2 = this.Y0;
                org.telegram.ui.Components.hg hgVar2 = unVar2.f42180a1;
                FrameLayout frameLayout2 = unVar2.f42329m2;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hgVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
