package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class fa0 extends v4.t0 {
    public final int f47097a;
    public final pa0 f47098b;

    public fa0(pa0 pa0Var, int i7) {
        this.f47097a = i7;
        this.f47098b = pa0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        switch (this.f47097a) {
            case 0:
                if (i7 == 1) {
                    pa0 pa0Var = this.f47098b;
                    if (pa0Var.f50219u0 && pa0Var.f50220v0) {
                        org.telegram.messenger.g0.v1(pa0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pa0 pa0Var2 = this.f47098b;
                pa0Var2.N = z10;
                if (!z10 && pa0Var2.I != null) {
                    pa0Var2.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f47097a) {
            case 1:
                pa0 pa0Var = this.f47098b;
                pa0Var.K0(false);
                if (pa0Var.I != null) {
                    pa0Var.K += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
