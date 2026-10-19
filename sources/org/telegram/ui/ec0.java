package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ec0 extends s4.r0 {
    public final nc0 f36634a;

    public ec0(nc0 nc0Var) {
        this.f36634a = nc0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nc0 nc0Var = this.f36634a;
        nc0Var.Q = z10;
        if (!z10 && nc0Var.L != null) {
            nc0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nc0 nc0Var = this.f36634a;
        nc0Var.z0(false);
        if (nc0Var.L != null) {
            nc0Var.N += i11;
        }
    }
}
