package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class eb0 extends wh.l {
    public final int E = 1;
    public final Object F;

    public eb0(org.telegram.ui.zh0 zh0Var, org.telegram.ui.zh0 zh0Var2, FrameLayout frameLayout, long j3) {
        super(zh0Var2, frameLayout, j3, true);
        this.F = zh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                by0 by0Var = bVar.W;
                if (this.f50553e.isEmpty()) {
                    if (by0Var.getVisibility() != 4) {
                        by0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f31473w.J.setText("");
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

    public eb0(wh.b bVar, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, long j3) {
        super(m2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
