package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ak extends FragmentContextView {
    public final int X0;
    public final sn Y0;

    public ak(sn snVar, Context context, sn snVar2, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, snVar2, null, true, g6Var);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = snVar;
                super(context, snVar2, null, false, g6Var);
                return;
            default:
                this.Y0 = snVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.X0) {
            case 0:
                sn snVar = this.Y0;
                org.telegram.ui.Components.ah ahVar = snVar.Y0;
                FrameLayout frameLayout = snVar.f41595m2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ahVar.i(frameLayout, z10, true);
                return;
            default:
                sn snVar2 = this.Y0;
                org.telegram.ui.Components.ah ahVar2 = snVar2.Y0;
                FrameLayout frameLayout2 = snVar2.f41572k2;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ahVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
