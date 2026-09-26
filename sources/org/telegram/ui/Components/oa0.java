package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class oa0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public oa0(org.telegram.ui.th0 th0Var, org.telegram.ui.th0 th0Var2, FrameLayout frameLayout, long j3) {
        super(th0Var2, frameLayout, j3, true);
        this.F = th0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                ix0 ix0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (ix0Var.getVisibility() != 4) {
                        ix0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f22919w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.th0.U((org.telegram.ui.th0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public oa0(wh.b bVar, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, long j3) {
        super(m2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
