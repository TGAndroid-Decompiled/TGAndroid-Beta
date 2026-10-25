package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class fq0 extends s4.u0 {
    public final rq0 f39434a;

    public fq0(rq0 rq0Var) {
        this.f39434a = rq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f39434a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        rq0 rq0Var = this.f39434a;
        if (rq0Var.J == null) {
            int L0 = rq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(rq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > rq0Var.M.B() - 2 && !rq0Var.f43260r && !rq0Var.f43262s) {
                if (rq0Var.f43239a == 1) {
                    z10 = true;
                }
                rq0Var.e0(rq0Var.v, rq0Var.f43267w, z10, true);
            }
        }
    }
}
