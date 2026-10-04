package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class qa0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public qa0(org.telegram.ui.xh0 xh0Var, org.telegram.ui.xh0 xh0Var2, FrameLayout frameLayout, long j3) {
        super(xh0Var2, frameLayout, j3, true);
        this.F = xh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                tx0 tx0Var = bVar.W;
                if (this.f49146e.isEmpty()) {
                    if (tx0Var.getVisibility() != 4) {
                        tx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f28900w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.xh0.S((org.telegram.ui.xh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public qa0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
