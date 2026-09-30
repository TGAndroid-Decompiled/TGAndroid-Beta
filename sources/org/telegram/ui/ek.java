package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ek extends FragmentContextView {
    public final int Q0;
    public final wn R0;

    public ek(wn wnVar, Context context, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, wnVar2, null, true, d6Var);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = wnVar;
                super(context, wnVar2, null, false, d6Var);
                return;
            default:
                this.R0 = wnVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                wn wnVar = this.R0;
                org.telegram.ui.Components.eh ehVar = wnVar.M0;
                FrameLayout frameLayout = wnVar.a2;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ehVar.i(frameLayout, z10, true);
                return;
            default:
                wn wnVar2 = this.R0;
                org.telegram.ui.Components.eh ehVar2 = wnVar2.M0;
                FrameLayout frameLayout2 = wnVar2.Y1;
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
