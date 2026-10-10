package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class go0 extends org.telegram.ui.ActionBar.j {
    public final vo0 f38109a;

    public go0(vo0 vo0Var) {
        this.f38109a = vo0Var;
    }

    @Override
    public final void b(int i10) {
        vo0 vo0Var = this.f38109a;
        if (i10 == -1) {
            if (!vo0Var.P0) {
                vo0Var.finishFragment();
            }
        } else if (i10 == 1 && !vo0Var.P0) {
            if (vo0Var.f42990u0 != 3) {
                AndroidUtilities.hideKeyboard(vo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = vo0Var.f42990u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                vo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        vo0.k0(vo0Var);
                        return;
                    }
                    vo0.j0(vo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = vo0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f22395b.f24304f) {
                        vo0Var.G0 = vo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                vo0Var.t0();
                return;
            }
            vo0Var.D0(true);
            vo0.m0(vo0Var);
        }
    }
}
