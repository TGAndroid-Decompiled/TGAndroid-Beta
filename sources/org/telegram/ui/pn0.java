package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pn0 extends org.telegram.ui.ActionBar.j {
    public final eo0 f40266a;

    public pn0(eo0 eo0Var) {
        this.f40266a = eo0Var;
    }

    @Override
    public final void b(int i10) {
        eo0 eo0Var = this.f40266a;
        if (i10 == -1) {
            if (!eo0Var.P0) {
                eo0Var.finishFragment();
            }
        } else if (i10 == 1 && !eo0Var.P0) {
            if (eo0Var.f36734u0 != 3) {
                AndroidUtilities.hideKeyboard(eo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = eo0Var.f36734u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                eo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        eo0.k0(eo0Var);
                        return;
                    }
                    eo0.j0(eo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = eo0Var.h;
                    if (i12 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i12].f22488b.f24344f) {
                        eo0Var.G0 = eo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                eo0Var.t0();
                return;
            }
            eo0Var.D0(true);
            eo0.m0(eo0Var);
        }
    }
}
