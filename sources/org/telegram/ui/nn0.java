package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends org.telegram.ui.ActionBar.k {
    public final bo0 f40851a;

    public nn0(bo0 bo0Var) {
        this.f40851a = bo0Var;
    }

    @Override
    public final void b(int i10) {
        bo0 bo0Var = this.f40851a;
        if (i10 == -1) {
            if (!bo0Var.L0) {
                bo0Var.finishFragment();
            }
        } else if (i10 == 1 && !bo0Var.L0) {
            if (bo0Var.f36861q0 != 3) {
                AndroidUtilities.hideKeyboard(bo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = bo0Var.f36861q0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                bo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        bo0.k0(bo0Var);
                        return;
                    }
                    bo0.j0(bo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.h6[] h6VarArr = bo0Var.h;
                    if (i12 >= h6VarArr.length) {
                        break;
                    } else if (h6VarArr[i12].f24459b.f26519f) {
                        bo0Var.C0 = bo0Var.A0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                bo0Var.t0();
                return;
            }
            bo0Var.D0(true);
            bo0.m0(bo0Var);
        }
    }
}
