package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class jc0 extends s4.r0 {
    public final sc0 f38526a;

    public jc0(sc0 sc0Var) {
        this.f38526a = sc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc0 sc0Var = this.f38526a;
        sc0Var.Q = z10;
        if (!z10 && sc0Var.L != null) {
            sc0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sc0 sc0Var = this.f38526a;
        sc0Var.A0(false);
        if (sc0Var.L != null) {
            sc0Var.N += i11;
        }
    }
}
