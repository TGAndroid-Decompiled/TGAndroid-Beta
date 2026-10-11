package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fo0 extends org.telegram.ui.ActionBar.j {
    public final uo0 f37761a;

    public fo0(uo0 uo0Var) {
        this.f37761a = uo0Var;
    }

    @Override
    public final void b(int i10) {
        uo0 uo0Var = this.f37761a;
        if (i10 == -1) {
            if (!uo0Var.P0) {
                uo0Var.finishFragment();
            }
        } else if (i10 == 1 && !uo0Var.P0) {
            if (uo0Var.f42759u0 != 3) {
                AndroidUtilities.hideKeyboard(uo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = uo0Var.f42759u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                uo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        uo0.k0(uo0Var);
                        return;
                    }
                    uo0.j0(uo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = uo0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f22419b.f24328f) {
                        uo0Var.G0 = uo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                uo0Var.t0();
                return;
            }
            uo0Var.D0(true);
            uo0.m0(uo0Var);
        }
    }
}
