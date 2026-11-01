package org.telegram.ui;
public final class dm0 extends org.telegram.ui.ActionBar.k {
    public final qm0 f36635a;

    public dm0(qm0 qm0Var) {
        this.f36635a = qm0Var;
    }

    @Override
    public final void b(int i10) {
        qm0 qm0Var = this.f36635a;
        if (i10 == -1) {
            if (!qm0Var.P0) {
                qm0Var.finishFragment();
            }
        } else if (i10 == 1 && !qm0Var.P0) {
            if (qm0Var.f40844u0 != 3) {
                org.telegram.messenger.i0.v1(qm0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = qm0Var.f40844u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                qm0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        qm0.p0(qm0Var);
                        return;
                    }
                    qm0.o0(qm0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.m6[] m6VarArr = qm0Var.h;
                    if (i12 >= m6VarArr.length) {
                        break;
                    } else if (m6VarArr[i12].f22313b.f24162f) {
                        qm0Var.G0 = qm0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                qm0Var.z0();
                return;
            }
            qm0Var.J0(true);
            qm0.r0(qm0Var);
        }
    }
}
