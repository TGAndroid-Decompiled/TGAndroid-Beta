package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class jk extends FragmentContextView {
    public final int N0;
    public final eo O0;

    public jk(eo eoVar, Context context, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, eoVar2, null, true, f6Var);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = eoVar;
                super(context, eoVar2, null, false, f6Var);
                return;
            default:
                this.O0 = eoVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.N0) {
            case 0:
                eo eoVar = this.O0;
                org.telegram.ui.Components.fh fhVar = eoVar.M0;
                FrameLayout frameLayout = eoVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fhVar.i(frameLayout, z10, true);
                return;
            default:
                eo eoVar2 = this.O0;
                org.telegram.ui.Components.fh fhVar2 = eoVar2.M0;
                FrameLayout frameLayout2 = eoVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                fhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
