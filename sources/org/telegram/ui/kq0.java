package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kq0 extends s4.s0 {
    public final wq0 f38149a;

    public kq0(wq0 wq0Var) {
        this.f38149a = wq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f38149a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        wq0 wq0Var = this.f38149a;
        if (wq0Var.J == null) {
            int L0 = wq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(wq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > wq0Var.M.B() - 2 && !wq0Var.f42689r && !wq0Var.f42691s) {
                if (wq0Var.f42667a == 1) {
                    z10 = true;
                }
                wq0Var.d0(wq0Var.v, wq0Var.f42696w, z10, true);
            }
        }
    }
}
