package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class fa0 extends v4.s0 {
    public final int f45524a;
    public final pa0 f45525b;

    public fa0(pa0 pa0Var, int i7) {
        this.f45524a = i7;
        this.f45525b = pa0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        switch (this.f45524a) {
            case 0:
                if (i7 == 1) {
                    pa0 pa0Var = this.f45525b;
                    if (pa0Var.f48749t0 && pa0Var.f48750u0) {
                        org.telegram.messenger.g0.v1(pa0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                pa0 pa0Var2 = this.f45525b;
                pa0Var2.M = z9;
                if (!z9 && pa0Var2.H != null) {
                    pa0Var2.H = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f45524a) {
            case 1:
                pa0 pa0Var = this.f45525b;
                pa0Var.K0(false);
                if (pa0Var.H != null) {
                    pa0Var.J += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
