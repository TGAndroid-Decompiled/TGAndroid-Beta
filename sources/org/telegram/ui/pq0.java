package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pq0 extends s4.s0 {
    public final br0 f39618a;

    public pq0(br0 br0Var) {
        this.f39618a = br0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f39618a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        br0 br0Var = this.f39618a;
        if (br0Var.J == null) {
            int L0 = br0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(br0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > br0Var.M.B() - 2 && !br0Var.f34904r && !br0Var.f34906s) {
                if (br0Var.f34882a == 1) {
                    z10 = true;
                }
                br0Var.d0(br0Var.v, br0Var.f34911w, z10, true);
            }
        }
    }
}
