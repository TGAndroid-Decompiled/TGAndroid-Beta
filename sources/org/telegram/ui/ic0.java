package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ic0 extends s4.u0 {
    public final rc0 f40109a;

    public ic0(rc0 rc0Var) {
        this.f40109a = rc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rc0 rc0Var = this.f40109a;
        rc0Var.Q = z10;
        if (!z10 && rc0Var.L != null) {
            rc0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rc0 rc0Var = this.f40109a;
        rc0Var.B0(false);
        if (rc0Var.L != null) {
            rc0Var.N += i11;
        }
    }
}
