package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class lj extends FragmentContextView {
    public final int Y0;
    public final an Z0;

    public lj(an anVar, Context context, an anVar2, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, anVar2, null, true, e6Var);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = anVar;
                super(context, anVar2, null, false, e6Var);
                return;
            default:
                this.Z0 = anVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                an anVar = this.Z0;
                org.telegram.ui.Components.rg rgVar = anVar.f45134b1;
                FrameLayout frameLayout = anVar.f45315p2;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rgVar.i(frameLayout, z10, true);
                return;
            default:
                an anVar2 = this.Z0;
                org.telegram.ui.Components.rg rgVar2 = anVar2.f45134b1;
                FrameLayout frameLayout2 = anVar2.f45290n2;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rgVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
