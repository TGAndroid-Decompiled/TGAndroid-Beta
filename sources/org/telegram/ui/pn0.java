package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class pn0 extends org.telegram.ui.ActionBar.j {

    public final do0 f41402a;

    public pn0(do0 do0Var) {
        this.f41402a = do0Var;
    }

    @Override
    public final void b(int i10) {
        do0 do0Var = this.f41402a;
        if (i10 == -1) {
            if (do0Var.L0) {
                return;
            }
            do0Var.finishFragment();
            return;
        }
        if (i10 != 1 || do0Var.L0) {
            return;
        }
        if (do0Var.f37474q0 != 3) {
            AndroidUtilities.hideKeyboard(do0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = do0Var.f37474q0;
        if (i11 == 0) {
            do0Var.D0(true);
            do0.m0(do0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.g6[] g6VarArr = do0Var.h;
                if (i12 >= g6VarArr.length) {
                    break;
                }
                if (g6VarArr[i12].f24398b.f26504f) {
                    do0Var.C0 = do0Var.A0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            do0Var.t0();
            return;
        }
        if (i11 == 2) {
            do0.j0(do0Var);
        } else if (i11 == 3) {
            do0.k0(do0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            do0Var.A0(false);
        }
    }
}
