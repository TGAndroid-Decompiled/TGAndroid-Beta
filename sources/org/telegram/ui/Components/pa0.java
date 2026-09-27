package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class pa0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public pa0(org.telegram.ui.wh0 wh0Var, org.telegram.ui.wh0 wh0Var2, FrameLayout frameLayout, long j3) {
        super(wh0Var2, frameLayout, j3, true);
        this.F = wh0Var;
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
                    bVar.f23966w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.wh0.U((org.telegram.ui.wh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public pa0(wh.b bVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j3) {
        super(o2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
