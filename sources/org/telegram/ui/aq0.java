package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class aq0 extends s4.r0 {
    public final mq0 f35767a;

    public aq0(mq0 mq0Var) {
        this.f35767a = mq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35767a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        mq0 mq0Var = this.f35767a;
        if (mq0Var.J == null) {
            int L0 = mq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(mq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > mq0Var.M.B() - 2 && !mq0Var.f39664r && !mq0Var.f39666s) {
                if (mq0Var.f39643a == 1) {
                    z10 = true;
                }
                mq0Var.d0(mq0Var.v, mq0Var.f39671w, z10, true);
            }
        }
    }
}
