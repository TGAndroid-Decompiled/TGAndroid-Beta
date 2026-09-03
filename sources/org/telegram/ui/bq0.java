package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bq0 extends f2.a1 {
    public final mq0 f35589a;

    public bq0(mq0 mq0Var) {
        this.f35589a = mq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35589a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        mq0 mq0Var = this.f35589a;
        if (mq0Var.G == null) {
            int L0 = mq0Var.J.L0();
            boolean z4 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(mq0Var.J.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > mq0Var.J.B() - 2 && !mq0Var.f39053r && !mq0Var.f39055s) {
                if (mq0Var.f39031a == 1) {
                    z4 = true;
                }
                mq0Var.d0(mq0Var.v, mq0Var.f39059w, z4, true);
            }
        }
    }
}
