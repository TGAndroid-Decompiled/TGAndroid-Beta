package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class on0 extends org.telegram.ui.ActionBar.j {
    public final co0 f41212a;

    public on0(co0 co0Var) {
        this.f41212a = co0Var;
    }

    @Override
    public final void b(int i9) {
        co0 co0Var = this.f41212a;
        if (i9 == -1) {
            if (!co0Var.L0) {
                co0Var.finishFragment();
            }
        } else if (i9 == 1 && !co0Var.L0) {
            if (co0Var.f37268q0 != 3) {
                AndroidUtilities.hideKeyboard(co0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = co0Var.f37268q0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                co0Var.z0(false);
                                return;
                            }
                            return;
                        }
                        co0.j0(co0Var);
                        return;
                    }
                    co0.i0(co0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = co0Var.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i11].f24572b.f26508f) {
                        co0Var.C0 = co0Var.A0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                co0Var.s0();
                return;
            }
            co0Var.C0(true);
            co0.l0(co0Var);
        }
    }
}
