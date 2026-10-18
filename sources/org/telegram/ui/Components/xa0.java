package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class xa0 extends xh.k {
    public final int E = 1;
    public final Object F;

    public xa0(org.telegram.ui.lh0 lh0Var, org.telegram.ui.lh0 lh0Var2, FrameLayout frameLayout, long j10) {
        super(lh0Var2, frameLayout, j10, true);
        this.F = lh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                rx0 rx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (rx0Var.getVisibility() != 4) {
                        rx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f27442w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.lh0.U((org.telegram.ui.lh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public xa0(xh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j10) {
        super(n2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
