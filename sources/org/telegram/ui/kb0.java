package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class kb0 extends s4.s0 {
    public final int f38786a;
    public final xb0 f38787b;

    public kb0(xb0 xb0Var, int i10) {
        this.f38786a = i10;
        this.f38787b = xb0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f38786a) {
            case 0:
                if (i10 == 1) {
                    xb0 xb0Var = this.f38787b;
                    if (xb0Var.f43334z0 && xb0Var.A0) {
                        org.telegram.messenger.i0.v1(xb0Var.getParentActivity().getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xb0 xb0Var2 = this.f38787b;
                xb0Var2.O = z10;
                if (!z10 && xb0Var2.J != null) {
                    xb0Var2.J = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f38786a) {
            case 1:
                xb0 xb0Var = this.f38787b;
                xb0Var.P0(false);
                if (xb0Var.J != null) {
                    xb0Var.L += i11;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
