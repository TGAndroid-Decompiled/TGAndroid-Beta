package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class hq0 extends s4.s0 {
    public final tq0 f34273a;

    public hq0(tq0 tq0Var) {
        this.f34273a = tq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f34273a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        tq0 tq0Var = this.f34273a;
        if (tq0Var.J == null) {
            int L0 = tq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(tq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > tq0Var.M.B() - 2 && !tq0Var.f38210r && !tq0Var.f38212s) {
                if (tq0Var.f38189a == 1) {
                    z10 = true;
                }
                tq0Var.d0(tq0Var.v, tq0Var.f38217w, z10, true);
            }
        }
    }
}
