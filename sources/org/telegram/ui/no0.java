package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class no0 extends org.telegram.ui.ActionBar.j {
    public final cp0 f38751a;

    public no0(cp0 cp0Var) {
        this.f38751a = cp0Var;
    }

    @Override
    public final void b(int i10) {
        cp0 cp0Var = this.f38751a;
        if (i10 == -1) {
            if (!cp0Var.P0) {
                cp0Var.finishFragment();
            }
        } else if (i10 == 1 && !cp0Var.P0) {
            if (cp0Var.f35027u0 != 3) {
                AndroidUtilities.hideKeyboard(cp0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = cp0Var.f35027u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                cp0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        cp0.k0(cp0Var);
                        return;
                    }
                    cp0.j0(cp0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = cp0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f21454b.f23282f) {
                        cp0Var.G0 = cp0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                cp0Var.t0();
                return;
            }
            cp0Var.D0(true);
            cp0.m0(cp0Var);
        }
    }
}
