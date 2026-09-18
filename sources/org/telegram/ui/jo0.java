package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jo0 extends org.telegram.ui.ActionBar.j {
    public final yo0 f34919a;

    public jo0(yo0 yo0Var) {
        this.f34919a = yo0Var;
    }

    @Override
    public final void b(int i10) {
        yo0 yo0Var = this.f34919a;
        if (i10 == -1) {
            if (!yo0Var.P0) {
                yo0Var.finishFragment();
            }
        } else if (i10 == 1 && !yo0Var.P0) {
            if (yo0Var.f39981u0 != 3) {
                AndroidUtilities.hideKeyboard(yo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = yo0Var.f39981u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                yo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        yo0.k0(yo0Var);
                        return;
                    }
                    yo0.j0(yo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = yo0Var.h;
                    if (i12 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i12].f20332b.f22175f) {
                        yo0Var.G0 = yo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                yo0Var.t0();
                return;
            }
            yo0Var.D0(true);
            yo0.m0(yo0Var);
        }
    }
}
