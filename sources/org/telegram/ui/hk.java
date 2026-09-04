package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hk extends FragmentContextView {
    public final int N0;
    public final co O0;

    public hk(co coVar, Context context, co coVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, coVar2, null, true, f6Var);
        this.N0 = i10;
        switch (i10) {
            case 1:
                this.O0 = coVar;
                super(context, coVar2, null, false, f6Var);
                return;
            default:
                this.O0 = coVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.N0) {
            case 0:
                co coVar = this.O0;
                org.telegram.ui.Components.dh dhVar = coVar.M0;
                FrameLayout frameLayout = coVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dhVar.i(frameLayout, z10, true);
                return;
            default:
                co coVar2 = this.O0;
                org.telegram.ui.Components.dh dhVar2 = coVar2.M0;
                FrameLayout frameLayout2 = coVar2.Y1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dhVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
