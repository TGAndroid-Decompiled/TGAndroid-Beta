package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class gc0 extends f2.d1 {
    public final pc0 f38508a;

    public gc0(pc0 pc0Var) {
        this.f38508a = pc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        boolean z10;
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pc0 pc0Var = this.f38508a;
        pc0Var.M = z10;
        if (!z10 && pc0Var.H != null) {
            pc0Var.H = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        pc0 pc0Var = this.f38508a;
        pc0Var.z0(false);
        if (pc0Var.H != null) {
            pc0Var.J += i10;
        }
    }
}
