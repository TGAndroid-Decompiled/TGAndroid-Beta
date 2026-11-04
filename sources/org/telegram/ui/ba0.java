package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ba0 extends u4.t0 {
    public final int f44007a;
    public final la0 f44008b;

    public ba0(la0 la0Var, int i3) {
        this.f44007a = i3;
        this.f44008b = la0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        boolean z10;
        switch (this.f44007a) {
            case 0:
                if (i3 == 1) {
                    la0 la0Var = this.f44008b;
                    if (la0Var.f47266u0 && la0Var.f47267v0) {
                        org.telegram.messenger.g0.v1(la0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la0 la0Var2 = this.f44008b;
                la0Var2.N = z10;
                if (!z10 && la0Var2.I != null) {
                    la0Var2.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f44007a) {
            case 1:
                la0 la0Var = this.f44008b;
                la0Var.K0(false);
                if (la0Var.I != null) {
                    la0Var.K += i10;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
