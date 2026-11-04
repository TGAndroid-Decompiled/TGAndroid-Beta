package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hj extends FragmentContextView {
    public final int Y0;
    public final wm Z0;

    public hj(wm wmVar, Context context, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, wmVar2, null, true, e6Var);
        this.Y0 = i3;
        switch (i3) {
            case 1:
                this.Z0 = wmVar;
                super(context, wmVar2, null, false, e6Var);
                return;
            default:
                this.Z0 = wmVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                wm wmVar = this.Z0;
                org.telegram.ui.Components.jg jgVar = wmVar.f51252b1;
                FrameLayout frameLayout = wmVar.f51434p2;
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jgVar.i(frameLayout, z10, true);
                return;
            default:
                wm wmVar2 = this.Z0;
                org.telegram.ui.Components.jg jgVar2 = wmVar2.f51252b1;
                FrameLayout frameLayout2 = wmVar2.f51409n2;
                if (i3 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jgVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
