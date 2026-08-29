package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ic0 extends f2.a1 {
    public final rc0 f39205a;

    public ic0(rc0 rc0Var) {
        this.f39205a = rc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rc0 rc0Var = this.f39205a;
        rc0Var.M = z10;
        if (!z10 && rc0Var.H != null) {
            rc0Var.H = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rc0 rc0Var = this.f39205a;
        rc0Var.A0(false);
        if (rc0Var.H != null) {
            rc0Var.J += i11;
        }
    }
}
