package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ga0 extends kh.v {
    public final int E = 0;
    public final Object F;

    public ga0(org.telegram.ui.rh0 rh0Var, org.telegram.ui.rh0 rh0Var2, FrameLayout frameLayout, long j10) {
        super(rh0Var2, frameLayout, j10, true);
        this.F = rh0Var;
    }

    @Override
    public final void f(String str, boolean z4, boolean z10) {
        switch (this.E) {
            case 0:
                kh.c cVar = (kh.c) this.F;
                ax0 ax0Var = cVar.T;
                if (this.f11307e.isEmpty()) {
                    if (ax0Var.getVisibility() != 4) {
                        ax0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z10) {
                    cVar.f30994w.G.setText("");
                    return;
                } else {
                    super.f(str, z4, z10);
                    return;
                }
            default:
                if (z10) {
                    org.telegram.ui.rh0.U((org.telegram.ui.rh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z4, z10);
                    return;
                }
        }
    }

    public ga0(kh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j10) {
        super(p2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
