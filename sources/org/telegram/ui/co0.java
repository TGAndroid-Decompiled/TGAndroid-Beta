package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class co0 extends org.telegram.ui.ActionBar.j {
    public final ro0 f38400a;

    public co0(ro0 ro0Var) {
        this.f38400a = ro0Var;
    }

    @Override
    public final void b(int i10) {
        ro0 ro0Var = this.f38400a;
        if (i10 == -1) {
            if (!ro0Var.P0) {
                ro0Var.finishFragment();
            }
        } else if (i10 == 1 && !ro0Var.P0) {
            if (ro0Var.f43129u0 != 3) {
                AndroidUtilities.hideKeyboard(ro0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = ro0Var.f43129u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                ro0Var.B0(false);
                                return;
                            }
                            return;
                        }
                        ro0.l0(ro0Var);
                        return;
                    }
                    ro0.k0(ro0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.o6[] o6VarArr = ro0Var.h;
                    if (i12 >= o6VarArr.length) {
                        break;
                    } else if (o6VarArr[i12].f24609b.f26282f) {
                        ro0Var.G0 = ro0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                ro0Var.u0();
                return;
            }
            ro0Var.E0(true);
            ro0.n0(ro0Var);
        }
    }
}
