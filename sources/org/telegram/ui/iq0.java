package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class iq0 extends s4.s0 {
    public final uq0 f34230a;

    public iq0(uq0 uq0Var) {
        this.f34230a = uq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f34230a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        uq0 uq0Var = this.f34230a;
        if (uq0Var.J == null) {
            int L0 = uq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(uq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > uq0Var.M.B() - 2 && !uq0Var.f38188r && !uq0Var.f38190s) {
                if (uq0Var.f38167a == 1) {
                    z10 = true;
                }
                uq0Var.d0(uq0Var.v, uq0Var.f38195w, z10, true);
            }
        }
    }
}
