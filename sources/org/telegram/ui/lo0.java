package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lo0 extends org.telegram.ui.ActionBar.j {
    public final ap0 f37800a;

    public lo0(ap0 ap0Var) {
        this.f37800a = ap0Var;
    }

    @Override
    public final void b(int i10) {
        ap0 ap0Var = this.f37800a;
        if (i10 == -1) {
            if (!ap0Var.P0) {
                ap0Var.finishFragment();
            }
        } else if (i10 == 1 && !ap0Var.P0) {
            if (ap0Var.f34039u0 != 3) {
                AndroidUtilities.hideKeyboard(ap0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = ap0Var.f34039u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                ap0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        ap0.k0(ap0Var);
                        return;
                    }
                    ap0.j0(ap0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ap0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f21160b.f22982f) {
                        ap0Var.G0 = ap0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                ap0Var.t0();
                return;
            }
            ap0Var.D0(true);
            ap0.m0(ap0Var);
        }
    }
}
