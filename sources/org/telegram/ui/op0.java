package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class op0 extends f2.d1 {
    public final zp0 f41228a;

    public op0(zp0 zp0Var) {
        this.f41228a = zp0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(this.f41228a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int abs;
        zp0 zp0Var = this.f41228a;
        if (zp0Var.F == null) {
            int L0 = zp0Var.I.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(zp0Var.I.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > zp0Var.I.B() - 2 && !zp0Var.f45228r && !zp0Var.f45230s) {
                if (zp0Var.f45206a == 1) {
                    z10 = true;
                }
                zp0Var.c0(zp0Var.v, zp0Var.f45233w, z10, true);
            }
        }
    }
}
