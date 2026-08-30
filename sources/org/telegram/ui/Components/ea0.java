package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ea0 extends jh.v {
    public final int E = 0;
    public final Object F;

    public ea0(org.telegram.ui.qh0 qh0Var, org.telegram.ui.qh0 qh0Var2, FrameLayout frameLayout, long j10) {
        super(qh0Var2, frameLayout, j10, true);
        this.F = qh0Var;
    }

    @Override
    public final void f(String str, boolean z4, boolean z10) {
        switch (this.E) {
            case 0:
                jh.c cVar = (jh.c) this.F;
                zw0 zw0Var = cVar.T;
                if (this.e.isEmpty()) {
                    if (zw0Var.getVisibility() != 4) {
                        zw0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z10) {
                    cVar.f28072w.G.setText("");
                    return;
                } else {
                    super.f(str, z4, z10);
                    return;
                }
            default:
                if (z10) {
                    org.telegram.ui.qh0.U((org.telegram.ui.qh0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z4, z10);
                    return;
                }
        }
    }

    public ea0(jh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j10) {
        super(p2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
