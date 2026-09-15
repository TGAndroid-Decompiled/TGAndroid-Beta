package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ca0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public ca0(org.telegram.ui.zh0 zh0Var, org.telegram.ui.zh0 zh0Var2, FrameLayout frameLayout, long j3) {
        super(zh0Var2, frameLayout, j3, true);
        this.F = zh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                yw0 yw0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (yw0Var.getVisibility() != 4) {
                        yw0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f26710w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.zh0.U((org.telegram.ui.zh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public ca0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
