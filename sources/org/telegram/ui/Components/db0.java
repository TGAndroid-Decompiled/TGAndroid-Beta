package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class db0 extends xh.l {
    public final int E = 1;
    public final Object F;

    public db0(org.telegram.ui.fi0 fi0Var, org.telegram.ui.fi0 fi0Var2, FrameLayout frameLayout, long j10) {
        super(fi0Var2, frameLayout, j10, true);
        this.F = fi0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                wx0 wx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (wx0Var.getVisibility() != 4) {
                        wx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f28542w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.fi0.U((org.telegram.ui.fi0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public db0(xh.b bVar, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, long j10) {
        super(m2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
