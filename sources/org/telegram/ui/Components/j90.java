package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class j90 extends zh.l {
    public final int E = 1;
    public final Object F;

    public j90(bi.z8 z8Var, bi.z8 z8Var2, FrameLayout frameLayout, long j3) {
        super(z8Var2, frameLayout, j3, true);
        this.F = z8Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                kv0 kv0Var = bVar.R1;
                if (this.f62011e.isEmpty()) {
                    if (kv0Var.getVisibility() != 4) {
                        kv0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f37992w1.K.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    bi.z8.Z((bi.z8) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public j90(zh.b bVar, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(h2Var, n2Var, j3, false);
        this.F = bVar;
    }
}
