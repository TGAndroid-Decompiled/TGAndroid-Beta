package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class w80 extends yh.m {
    public final int E = 1;
    public final Object F;

    public w80(bi.w4 w4Var, bi.w4 w4Var2, FrameLayout frameLayout, long j3) {
        super(w4Var2, frameLayout, j3, true);
        this.F = w4Var;
    }

    @Override
    public final void f(String str, boolean z9, boolean z10) {
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                bv0 bv0Var = bVar.Q1;
                if (this.f59553e.isEmpty()) {
                    if (bv0Var.getVisibility() != 4) {
                        bv0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z10) {
                    bVar.f32471v1.J.setText("");
                    return;
                } else {
                    super.f(str, z9, z10);
                    return;
                }
            default:
                if (z10) {
                    bi.w4.Z((bi.w4) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z9, z10);
                    return;
                }
        }
    }

    public w80(yh.b bVar, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(f2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
