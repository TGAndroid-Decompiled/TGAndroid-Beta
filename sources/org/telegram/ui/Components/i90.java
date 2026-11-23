package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class i90 extends zh.l {
    public final int E = 1;
    public final Object F;

    public i90(bi.e9 e9Var, bi.e9 e9Var2, FrameLayout frameLayout, long j3) {
        super(e9Var2, frameLayout, j3, true);
        this.F = e9Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                mv0 mv0Var = bVar.R1;
                if (this.f62140e.isEmpty()) {
                    if (mv0Var.getVisibility() != 4) {
                        mv0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f38706w1.K.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    bi.e9.Z((bi.e9) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public i90(zh.b bVar, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(g2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
