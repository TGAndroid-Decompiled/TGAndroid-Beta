package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class s80 extends zh.k {
    public final int E = 1;
    public final Object F;

    public s80(ai.c7 c7Var, ai.c7 c7Var2, FrameLayout frameLayout, long j10) {
        super(c7Var2, frameLayout, j10, true);
        this.F = c7Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                zu0 zu0Var = bVar.O1;
                if (this.f60583e.isEmpty()) {
                    if (zu0Var.getVisibility() != 4) {
                        zu0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f39001t1.K.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    ai.c7.Z((ai.c7) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public s80(zh.b bVar, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.j2 j2Var, long j10) {
        super(d2Var, j2Var, j10, false);
        this.F = bVar;
    }
}
