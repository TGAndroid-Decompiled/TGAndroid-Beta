package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class wa0 extends xh.k {
    public final int E = 1;
    public final Object F;

    public wa0(org.telegram.ui.mh0 mh0Var, org.telegram.ui.mh0 mh0Var2, FrameLayout frameLayout, long j10) {
        super(mh0Var2, frameLayout, j10, true);
        this.F = mh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                vx0 vx0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (vx0Var.getVisibility() != 4) {
                        vx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f30094w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.mh0.U((org.telegram.ui.mh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public wa0(xh.b bVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j10) {
        super(o2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
