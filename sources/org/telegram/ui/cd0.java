package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class cd0 extends s4.r0 {
    public final ld0 f34562a;

    public cd0(ld0 ld0Var) {
        this.f34562a = ld0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ld0 ld0Var = this.f34562a;
        ld0Var.Q = z10;
        if (!z10 && ld0Var.L != null) {
            ld0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ld0 ld0Var = this.f34562a;
        ld0Var.z0(false);
        if (ld0Var.L != null) {
            ld0Var.N += i11;
        }
    }
}
