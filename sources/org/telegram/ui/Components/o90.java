package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class o90 extends oh.q {
    public final int E = 1;
    public final Object F;

    public o90(kg.q1 q1Var, kg.q1 q1Var2, FrameLayout frameLayout, long j10) {
        super(q1Var2, frameLayout, j10, true);
        this.F = q1Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                oh.c cVar = (oh.c) this.F;
                ew0 ew0Var = cVar.N1;
                if (this.e.isEmpty()) {
                    if (ew0Var.getVisibility() != 4) {
                        ew0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    cVar.f26095s1.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    kg.q1.Z((kg.q1) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public o90(oh.c cVar, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(k2Var, p2Var, j10, false);
        this.F = cVar;
    }
}
