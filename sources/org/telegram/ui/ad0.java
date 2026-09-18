package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ad0 extends s4.s0 {
    public final jd0 f32005a;

    public ad0(jd0 jd0Var) {
        this.f32005a = jd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jd0 jd0Var = this.f32005a;
        jd0Var.Q = z10;
        if (!z10 && jd0Var.L != null) {
            jd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jd0 jd0Var = this.f32005a;
        jd0Var.A0(false);
        if (jd0Var.L != null) {
            jd0Var.N += i11;
        }
    }
}
