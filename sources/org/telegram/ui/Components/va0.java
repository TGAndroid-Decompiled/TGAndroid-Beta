package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class va0 extends yh.k {
    public final int E = 1;
    public final Object F;

    public va0(org.telegram.ui.mh0 mh0Var, org.telegram.ui.mh0 mh0Var2, FrameLayout frameLayout, long j10) {
        super(mh0Var2, frameLayout, j10, true);
        this.F = mh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                fy0 fy0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (fy0Var.getVisibility() != 4) {
                        fy0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f27097w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.mh0.V((org.telegram.ui.mh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public va0(yh.b bVar, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, long j10) {
        super(r2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
