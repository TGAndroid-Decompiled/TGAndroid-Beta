package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class z90 extends hh.v {
    public final int E = 0;
    public final Object F;

    public z90(org.telegram.ui.ih0 ih0Var, org.telegram.ui.ih0 ih0Var2, FrameLayout frameLayout, long j10) {
        super(ih0Var2, frameLayout, j10, true);
        this.F = ih0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                hh.c cVar = (hh.c) this.F;
                qw0 qw0Var = cVar.S;
                if (this.f8123e.isEmpty()) {
                    if (qw0Var.getVisibility() != 4) {
                        qw0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    cVar.f28335w.F.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.ih0.U((org.telegram.ui.ih0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public z90(hh.c cVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j10) {
        super(o2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
