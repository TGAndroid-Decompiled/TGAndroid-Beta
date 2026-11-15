package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class z80 extends zh.l {
    public final int E = 1;
    public final Object F;

    public z80(bi.t6 t6Var, bi.t6 t6Var2, FrameLayout frameLayout, long j3) {
        super(t6Var2, frameLayout, j3, true);
        this.F = t6Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                cv0 cv0Var = bVar.R1;
                if (this.f61445e.isEmpty()) {
                    if (cv0Var.getVisibility() != 4) {
                        cv0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f34199w1.K.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    bi.t6.Z((bi.t6) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public z80(zh.b bVar, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.k2 k2Var, long j3) {
        super(e2Var, k2Var, j3, false);
        this.F = bVar;
    }
}
