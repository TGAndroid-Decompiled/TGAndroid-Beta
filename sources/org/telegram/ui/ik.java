package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ik extends FragmentContextView {
    public final int N0;
    public final bo O0;

    public ik(bo boVar, Context context, bo boVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, boVar2, null, true, f6Var);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = boVar;
                super(context, boVar2, null, false, f6Var);
                return;
            default:
                this.O0 = boVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.N0) {
            case 0:
                bo boVar = this.O0;
                org.telegram.ui.Components.bh bhVar = boVar.M0;
                FrameLayout frameLayout = boVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bhVar.i(frameLayout, z10, true);
                return;
            default:
                bo boVar2 = this.O0;
                org.telegram.ui.Components.bh bhVar2 = boVar2.M0;
                FrameLayout frameLayout2 = boVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
