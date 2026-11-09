package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ha0 extends v4.s0 {
    public final int f46268a;
    public final ra0 f46269b;

    public ha0(ra0 ra0Var, int i7) {
        this.f46268a = i7;
        this.f46269b = ra0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        switch (this.f46268a) {
            case 0:
                if (i7 == 1) {
                    ra0 ra0Var = this.f46269b;
                    if (ra0Var.f49384t0 && ra0Var.f49385u0) {
                        org.telegram.messenger.g0.v1(ra0Var.getParentActivity().getCurrentFocus());
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
                ra0 ra0Var2 = this.f46269b;
                ra0Var2.M = z9;
                if (!z9 && ra0Var2.H != null) {
                    ra0Var2.H = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f46268a) {
            case 1:
                ra0 ra0Var = this.f46269b;
                ra0Var.K0(false);
                if (ra0Var.H != null) {
                    ra0Var.J += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
