package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class bk extends FragmentContextView {
    public final int R0;
    public final sn S0;

    public bk(sn snVar, Context context, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, snVar2, null, true, d6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = snVar;
                super(context, snVar2, null, false, d6Var);
                return;
            default:
                this.S0 = snVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                sn snVar = this.S0;
                org.telegram.ui.Components.ch chVar = snVar.M0;
                FrameLayout frameLayout = snVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                chVar.i(frameLayout, z10, true);
                return;
            default:
                sn snVar2 = this.S0;
                org.telegram.ui.Components.ch chVar2 = snVar2.M0;
                FrameLayout frameLayout2 = snVar2.Y1;
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
