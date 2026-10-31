package org.telegram.ui;
public final class fm0 extends org.telegram.ui.ActionBar.k {
    public final sm0 f37300a;

    public fm0(sm0 sm0Var) {
        this.f37300a = sm0Var;
    }

    @Override
    public final void b(int i10) {
        sm0 sm0Var = this.f37300a;
        if (i10 == -1) {
            if (!sm0Var.P0) {
                sm0Var.finishFragment();
            }
        } else if (i10 == 1 && !sm0Var.P0) {
            if (sm0Var.f41578u0 != 3) {
                org.telegram.messenger.i0.v1(sm0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = sm0Var.f41578u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                sm0Var.F0(false);
                                return;
                            }
                            return;
                        }
                        sm0.o0(sm0Var);
                        return;
                    }
                    sm0.n0(sm0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.m6[] m6VarArr = sm0Var.h;
                    if (i12 >= m6VarArr.length) {
                        break;
                    } else if (m6VarArr[i12].f22312b.f24161f) {
                        sm0Var.G0 = sm0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                sm0Var.y0();
                return;
            }
            sm0Var.I0(true);
            sm0.q0(sm0Var);
        }
    }
}
