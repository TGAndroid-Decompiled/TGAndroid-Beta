package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class io0 extends org.telegram.ui.ActionBar.j {
    public final xo0 f34653a;

    public io0(xo0 xo0Var) {
        this.f34653a = xo0Var;
    }

    @Override
    public final void b(int i10) {
        xo0 xo0Var = this.f34653a;
        if (i10 == -1) {
            if (!xo0Var.P0) {
                xo0Var.finishFragment();
            }
        } else if (i10 == 1 && !xo0Var.P0) {
            if (xo0Var.f39695u0 != 3) {
                AndroidUtilities.hideKeyboard(xo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = xo0Var.f39695u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                xo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        xo0.k0(xo0Var);
                        return;
                    }
                    xo0.j0(xo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.l6[] l6VarArr = xo0Var.h;
                    if (i12 >= l6VarArr.length) {
                        break;
                    } else if (l6VarArr[i12].f20631b.f22399f) {
                        xo0Var.G0 = xo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                xo0Var.t0();
                return;
            }
            xo0Var.D0(true);
            xo0.m0(xo0Var);
        }
    }
}
