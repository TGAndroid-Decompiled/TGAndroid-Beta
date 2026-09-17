package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class bd0 extends s4.s0 {
    public final kd0 f32104a;

    public bd0(kd0 kd0Var) {
        this.f32104a = kd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kd0 kd0Var = this.f32104a;
        kd0Var.Q = z10;
        if (!z10 && kd0Var.L != null) {
            kd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        kd0 kd0Var = this.f32104a;
        kd0Var.A0(false);
        if (kd0Var.L != null) {
            kd0Var.N += i11;
        }
    }
}
