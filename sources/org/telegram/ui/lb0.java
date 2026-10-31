package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class lb0 extends s4.s0 {
    public final int f39147a;
    public final yb0 f39148b;

    public lb0(yb0 yb0Var, int i10) {
        this.f39147a = i10;
        this.f39148b = yb0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39147a) {
            case 0:
                if (i10 == 1) {
                    yb0 yb0Var = this.f39148b;
                    if (yb0Var.f43814z0 && yb0Var.A0) {
                        org.telegram.messenger.i0.v1(yb0Var.getParentActivity().getCurrentFocus());
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
                yb0 yb0Var2 = this.f39148b;
                yb0Var2.O = z10;
                if (!z10 && yb0Var2.J != null) {
                    yb0Var2.J = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39147a) {
            case 1:
                yb0 yb0Var = this.f39148b;
                yb0Var.O0(false);
                if (yb0Var.J != null) {
                    yb0Var.L += i11;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
