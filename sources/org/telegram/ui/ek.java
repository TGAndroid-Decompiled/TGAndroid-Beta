package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ek extends FragmentContextView {
    public final int Q0;
    public final yn R0;

    public ek(yn ynVar, Context context, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, ynVar2, null, true, d6Var);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = ynVar;
                super(context, ynVar2, null, false, d6Var);
                return;
            default:
                this.R0 = ynVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                yn ynVar = this.R0;
                org.telegram.ui.Components.eh ehVar = ynVar.K0;
                FrameLayout frameLayout = ynVar.Y1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ehVar.i(frameLayout, z10, true);
                return;
            default:
                yn ynVar2 = this.R0;
                org.telegram.ui.Components.eh ehVar2 = ynVar2.K0;
                FrameLayout frameLayout2 = ynVar2.W1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ehVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
