package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ia0 extends v4.s0 {
    public final int f46598a;
    public final sa0 f46599b;

    public ia0(sa0 sa0Var, int i7) {
        this.f46598a = i7;
        this.f46599b = sa0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        switch (this.f46598a) {
            case 0:
                if (i7 == 1) {
                    sa0 sa0Var = this.f46599b;
                    if (sa0Var.f49793t0 && sa0Var.f49794u0) {
                        org.telegram.messenger.g0.v1(sa0Var.getParentActivity().getCurrentFocus());
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
                sa0 sa0Var2 = this.f46599b;
                sa0Var2.M = z9;
                if (!z9 && sa0Var2.H != null) {
                    sa0Var2.H = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f46598a) {
            case 1:
                sa0 sa0Var = this.f46599b;
                sa0Var.K0(false);
                if (sa0Var.H != null) {
                    sa0Var.J += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
