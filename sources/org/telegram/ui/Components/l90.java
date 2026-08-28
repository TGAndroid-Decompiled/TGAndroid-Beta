package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class l90 extends eh.x {
    public final int E = 0;
    public final Object F;

    public l90(org.telegram.ui.ih0 ih0Var, org.telegram.ui.ih0 ih0Var2, FrameLayout frameLayout, long j10) {
        super(ih0Var2, frameLayout, j10, true);
        this.F = ih0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                eh.c cVar = (eh.c) this.F;
                gw0 gw0Var = cVar.S;
                if (this.f5249e.isEmpty()) {
                    if (gw0Var.getVisibility() != 4) {
                        gw0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    cVar.f32376w.F.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.ih0.T((org.telegram.ui.ih0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public l90(eh.c cVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j10) {
        super(o2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
