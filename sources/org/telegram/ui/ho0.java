package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ho0 extends org.telegram.ui.ActionBar.k {
    public final wo0 f33430a;

    public ho0(wo0 wo0Var) {
        this.f33430a = wo0Var;
    }

    @Override
    public final void b(int i10) {
        wo0 wo0Var = this.f33430a;
        if (i10 == -1) {
            if (!wo0Var.P0) {
                wo0Var.finishFragment();
            }
        } else if (i10 == 1 && !wo0Var.P0) {
            if (wo0Var.f38286u0 != 3) {
                AndroidUtilities.hideKeyboard(wo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = wo0Var.f38286u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                wo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        wo0.k0(wo0Var);
                        return;
                    }
                    wo0.j0(wo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.l6[] l6VarArr = wo0Var.h;
                    if (i12 >= l6VarArr.length) {
                        break;
                    } else if (l6VarArr[i12].f19486b.f21247f) {
                        wo0Var.G0 = wo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                wo0Var.t0();
                return;
            }
            wo0Var.D0(true);
            wo0.m0(wo0Var);
        }
    }
}
