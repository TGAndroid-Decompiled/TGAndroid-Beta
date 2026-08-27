package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class pp0 extends f2.b1 {

    public final aq0 f41407a;

    public pp0(aq0 aq0Var) {
        this.f41407a = aq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f41407a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        aq0 aq0Var = this.f41407a;
        if (aq0Var.F == null) {
            int iL0 = aq0Var.I.L0();
            int iAbs = iL0 == -1 ? 0 : Math.abs(aq0Var.I.N0() - iL0) + 1;
            if (iAbs <= 0 || iL0 + iAbs <= aq0Var.I.B() - 2 || aq0Var.f36618r || aq0Var.f36620s) {
                return;
            }
            aq0Var.d0(aq0Var.v, aq0Var.f36623w, aq0Var.f36596a == 1, true);
        }
    }
}
