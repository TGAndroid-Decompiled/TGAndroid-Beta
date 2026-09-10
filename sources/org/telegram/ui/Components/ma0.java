package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ma0 extends vh.p {
    public final int E = 1;
    public final Object F;

    public ma0(org.telegram.ui.ai0 ai0Var, org.telegram.ui.ai0 ai0Var2, FrameLayout frameLayout, long j3) {
        super(ai0Var2, frameLayout, j3, true);
        this.F = ai0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                vh.c cVar = (vh.c) this.F;
                jx0 jx0Var = cVar.W;
                if (this.e.isEmpty()) {
                    if (jx0Var.getVisibility() != 4) {
                        jx0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    cVar.f21750w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.ai0.U((org.telegram.ui.ai0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public ma0(vh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j3) {
        super(p2Var, frameLayout, j3, false);
        this.F = cVar;
    }
}
