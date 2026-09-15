package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class oq0 extends s4.s0 {
    public final ar0 f36320a;

    public oq0(ar0 ar0Var) {
        this.f36320a = ar0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f36320a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        ar0 ar0Var = this.f36320a;
        if (ar0Var.J == null) {
            int L0 = ar0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(ar0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > ar0Var.M.B() - 2 && !ar0Var.f31929r && !ar0Var.f31931s) {
                if (ar0Var.f31908a == 1) {
                    z10 = true;
                }
                ar0Var.d0(ar0Var.v, ar0Var.f31936w, z10, true);
            }
        }
    }
}
