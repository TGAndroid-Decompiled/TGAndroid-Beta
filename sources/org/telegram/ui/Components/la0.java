package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class la0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public la0(org.telegram.ui.ai0 ai0Var, org.telegram.ui.ai0 ai0Var2, FrameLayout frameLayout, long j3) {
        super(ai0Var2, frameLayout, j3, true);
        this.F = ai0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                kx0 kx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (kx0Var.getVisibility() != 4) {
                        kx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f23475w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.ai0.U((org.telegram.ui.ai0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public la0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
