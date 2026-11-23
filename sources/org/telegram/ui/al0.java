package org.telegram.ui;
public final class al0 extends org.telegram.ui.ActionBar.j {
    public final ml0 f45615a;

    public al0(ml0 ml0Var) {
        this.f45615a = ml0Var;
    }

    @Override
    public final void b(int i7) {
        ml0 ml0Var = this.f45615a;
        if (i7 == -1) {
            if (!ml0Var.Q0) {
                ml0Var.finishFragment();
            }
        } else if (i7 == 1 && !ml0Var.Q0) {
            if (ml0Var.f49902v0 != 3) {
                org.telegram.messenger.g0.v1(ml0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = ml0Var.f49902v0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                ml0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        ml0.p0(ml0Var);
                        return;
                    }
                    ml0.o0(ml0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = ml0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i11].f30883b.f33095f) {
                        ml0Var.H0 = ml0Var.F0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                ml0Var.z0();
                return;
            }
            ml0Var.J0(true);
            ml0.r0(ml0Var);
        }
    }
}
