package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class hp0 extends s4.u0 {
    public final int f39949a;
    public final np0 f39950b;

    public hp0(np0 np0Var, int i10) {
        this.f39950b = np0Var;
        this.f39949a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bi.t9 t9Var;
        np0 np0Var = this.f39950b;
        tp0 tp0Var = np0Var.f41856p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J != null && np0Var.c()) {
                np0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f39949a == 1) {
            t9Var = tp0Var.f43715c;
        } else {
            t9Var = tp0Var.f43713b;
        }
        if (t9Var != null && np0Var.c()) {
            t9Var.b();
        }
    }
}
