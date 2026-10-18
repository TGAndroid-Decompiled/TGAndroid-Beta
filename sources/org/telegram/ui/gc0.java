package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class gc0 extends s4.r0 {
    public final pc0 f37151a;

    public gc0(pc0 pc0Var) {
        this.f37151a = pc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pc0 pc0Var = this.f37151a;
        pc0Var.Q = z10;
        if (!z10 && pc0Var.L != null) {
            pc0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        pc0 pc0Var = this.f37151a;
        pc0Var.z0(false);
        if (pc0Var.L != null) {
            pc0Var.N += i11;
        }
    }
}
