package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ao0 extends org.telegram.ui.ActionBar.j {
    public final po0 f37840a;

    public ao0(po0 po0Var) {
        this.f37840a = po0Var;
    }

    @Override
    public final void b(int i10) {
        po0 po0Var = this.f37840a;
        if (i10 == -1) {
            if (!po0Var.P0) {
                po0Var.finishFragment();
            }
        } else if (i10 == 1 && !po0Var.P0) {
            if (po0Var.f42615u0 != 3) {
                AndroidUtilities.hideKeyboard(po0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = po0Var.f42615u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                po0Var.B0(false);
                                return;
                            }
                            return;
                        }
                        po0.l0(po0Var);
                        return;
                    }
                    po0.k0(po0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.o6[] o6VarArr = po0Var.h;
                    if (i12 >= o6VarArr.length) {
                        break;
                    } else if (o6VarArr[i12].f24605b.f26278f) {
                        po0Var.G0 = po0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                po0Var.u0();
                return;
            }
            po0Var.E0(true);
            po0.n0(po0Var);
        }
    }
}
