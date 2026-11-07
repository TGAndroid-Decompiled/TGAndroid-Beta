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
                av0 av0Var = bVar.N1;
                if (this.f59453e.isEmpty()) {
                    if (av0Var.getVisibility() != 4) {
                        av0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z10) {
                    bVar.f32028s1.J.setText("");
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

    public w80(yh.b bVar, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.l2 l2Var, long j3) {
        super(f2Var, l2Var, j3, false);
        this.F = bVar;
    }
}
