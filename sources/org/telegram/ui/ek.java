package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ek extends FragmentContextView {
    public final int P0;
    public final wn Q0;

    public ek(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, wnVar2, null, true, d6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = wnVar;
                super(context, wnVar2, null, false, d6Var);
                return;
            default:
                this.Q0 = wnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.P0) {
            case 0:
                wn wnVar = this.Q0;
                org.telegram.ui.Components.dh dhVar = wnVar.M0;
                FrameLayout frameLayout = wnVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dhVar.i(frameLayout, z10, true);
                return;
            default:
                wn wnVar2 = this.Q0;
                org.telegram.ui.Components.dh dhVar2 = wnVar2.M0;
                FrameLayout frameLayout2 = wnVar2.Y1;
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
