package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class l90 extends zh.l {
    public final int E = 1;
    public final Object F;

    public l90(bi.b9 b9Var, bi.b9 b9Var2, FrameLayout frameLayout, long j3) {
        super(b9Var2, frameLayout, j3, true);
        this.F = b9Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                nv0 nv0Var = bVar.R1;
                if (this.f62057e.isEmpty()) {
                    if (nv0Var.getVisibility() != 4) {
                        nv0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f39089w1.K.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    bi.b9.Z((bi.b9) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public l90(zh.b bVar, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(g2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
