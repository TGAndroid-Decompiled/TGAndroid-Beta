package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class do0 extends org.telegram.ui.ActionBar.j {
    public final so0 f35824a;

    public do0(so0 so0Var) {
        this.f35824a = so0Var;
    }

    @Override
    public final void b(int i10) {
        so0 so0Var = this.f35824a;
        if (i10 == -1) {
            if (!so0Var.P0) {
                so0Var.finishFragment();
            }
        } else if (i10 == 1 && !so0Var.P0) {
            if (so0Var.f40579u0 != 3) {
                AndroidUtilities.hideKeyboard(so0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = so0Var.f40579u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                so0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        so0.k0(so0Var);
                        return;
                    }
                    so0.j0(so0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = so0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f22407b.f24301f) {
                        so0Var.G0 = so0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                so0Var.t0();
                return;
            }
            so0Var.D0(true);
            so0.m0(so0Var);
        }
    }
}
