package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ua0 extends yh.k {
    public final int E = 1;
    public final Object F;

    public ua0(org.telegram.ui.kh0 kh0Var, org.telegram.ui.kh0 kh0Var2, FrameLayout frameLayout, long j10) {
        super(kh0Var2, frameLayout, j10, true);
        this.F = kh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                ey0 ey0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (ey0Var.getVisibility() != 4) {
                        ey0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f26782w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.kh0.V((org.telegram.ui.kh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public ua0(yh.b bVar, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, long j10) {
        super(r2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
