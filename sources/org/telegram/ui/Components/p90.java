package org.telegram.ui.Components;

import android.widget.FrameLayout;

public final class p90 extends fh.v {
    public final int E = 0;
    public final Object F;

    public p90(org.telegram.ui.lh0 lh0Var, org.telegram.ui.lh0 lh0Var2, FrameLayout frameLayout, long j10) {
        super(lh0Var2, frameLayout, j10, true);
        this.F = lh0Var;
    }

    @Override
    public final void f(String str, boolean z10, boolean z11) {
        switch (this.E) {
            case 0:
                fh.c cVar = (fh.c) this.F;
                iw0 iw0Var = cVar.S;
                if (!this.f6176e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                    } else {
                        cVar.f32984w.F.setText("");
                    }
                } else if (iw0Var.getVisibility() != 4) {
                    iw0Var.setVisibility(4);
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                } else {
                    ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.lh0) this.F)).actionBar.setSearchFieldText("");
                }
                break;
        }
    }

    public p90(fh.c cVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j10) {
        super(n2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
