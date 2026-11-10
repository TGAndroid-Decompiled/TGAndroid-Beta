package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class nj extends FragmentContextView {
    public final int X0;
    public final cn Y0;

    public nj(cn cnVar, Context context, cn cnVar2, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, cnVar2, null, true, h6Var);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = cnVar;
                super(context, cnVar2, null, false, h6Var);
                return;
            default:
                this.Y0 = cnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                cn cnVar = this.Y0;
                org.telegram.ui.Components.kg kgVar = cnVar.f44419a1;
                FrameLayout frameLayout = cnVar.f44602o2;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                kgVar.i(frameLayout, z9, true);
                return;
            default:
                cn cnVar2 = this.Y0;
                org.telegram.ui.Components.kg kgVar2 = cnVar2.f44419a1;
                FrameLayout frameLayout2 = cnVar2.f44578m2;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kgVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
