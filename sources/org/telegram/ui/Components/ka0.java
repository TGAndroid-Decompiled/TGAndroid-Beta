package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ka0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public ka0(org.telegram.ui.bi0 bi0Var, org.telegram.ui.bi0 bi0Var2, FrameLayout frameLayout, long j3) {
        super(bi0Var2, frameLayout, j3, true);
        this.F = bi0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                jx0 jx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (jx0Var.getVisibility() != 4) {
                        jx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f23190w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.bi0.U((org.telegram.ui.bi0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public ka0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
