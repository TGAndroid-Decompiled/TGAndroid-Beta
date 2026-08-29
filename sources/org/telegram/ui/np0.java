package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class np0 extends f2.a1 {
    public final zp0 f40874a;

    public np0(zp0 zp0Var) {
        this.f40874a = zp0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f40874a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        zp0 zp0Var = this.f40874a;
        if (zp0Var.F == null) {
            int L0 = zp0Var.I.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(zp0Var.I.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > zp0Var.I.B() - 2 && !zp0Var.f45293r && !zp0Var.f45295s) {
                if (zp0Var.f45271a == 1) {
                    z10 = true;
                }
                zp0Var.d0(zp0Var.v, zp0Var.f45298w, z10, true);
            }
        }
    }
}
