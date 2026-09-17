package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class ca0 extends wh.n {
    public final int E = 1;
    public final Object F;

    public ca0(org.telegram.ui.bi0 bi0Var, org.telegram.ui.bi0 bi0Var2, FrameLayout frameLayout, long j3) {
        super(bi0Var2, frameLayout, j3, true);
        this.F = bi0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                zw0 zw0Var = bVar.W;
                if (this.e.isEmpty()) {
                    if (zw0Var.getVisibility() != 4) {
                        zw0Var.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z11) {
                    bVar.f26944w.J.setText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
            default:
                if (z11) {
                    org.telegram.ui.bi0.U((org.telegram.ui.bi0) this.F).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z10, z11);
                    return;
                }
        }
    }

    public ca0(wh.b bVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j3) {
        super(o2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
