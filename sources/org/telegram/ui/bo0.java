package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bo0 extends org.telegram.ui.ActionBar.j {
    public final qo0 f32153a;

    public bo0(qo0 qo0Var) {
        this.f32153a = qo0Var;
    }

    @Override
    public final void b(int i10) {
        qo0 qo0Var = this.f32153a;
        if (i10 == -1) {
            if (!qo0Var.P0) {
                qo0Var.finishFragment();
            }
        } else if (i10 == 1 && !qo0Var.P0) {
            if (qo0Var.f36515u0 != 3) {
                AndroidUtilities.hideKeyboard(qo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = qo0Var.f36515u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                qo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        qo0.k0(qo0Var);
                        return;
                    }
                    qo0.j0(qo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = qo0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f20334b.f22133f) {
                        qo0Var.G0 = qo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                qo0Var.t0();
                return;
            }
            qo0Var.D0(true);
            qo0.m0(qo0Var);
        }
    }
}
