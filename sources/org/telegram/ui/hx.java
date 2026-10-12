package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class hx extends FragmentContextView {
    public final int R0;
    public final yy S0;

    public hx(yy yyVar, Context context, yy yyVar2, int i10) {
        super(context, yyVar2, true);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = yyVar;
                super(context, yyVar2, false);
                return;
            default:
                this.S0 = yyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.R0) {
            case 0:
                yy yyVar = this.S0;
                org.telegram.ui.Components.xs xsVar = yyVar.J1;
                FrameLayout frameLayout = yyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xsVar.i(frameLayout, z10, true);
                return;
            default:
                yy yyVar2 = this.S0;
                org.telegram.ui.Components.xs xsVar2 = yyVar2.J1;
                FrameLayout frameLayout2 = yyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xsVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
