package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class xa0 extends xh.k {
    public final int E = 1;
    public final Object F;

    public xa0(org.telegram.ui.jh0 jh0Var, org.telegram.ui.jh0 jh0Var2, FrameLayout frameLayout, long j10) {
        super(jh0Var2, frameLayout, j10, true);
        this.F = jh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                tx0 tx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (tx0Var.getVisibility() != 4) {
                        tx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f28098w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.jh0.U((org.telegram.ui.jh0) this.F).setSearchFieldText("");
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
