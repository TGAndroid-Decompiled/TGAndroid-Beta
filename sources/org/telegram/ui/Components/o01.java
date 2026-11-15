package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class o01 extends v4.t0 {
    public final int f37773a;
    public final long f37774b;
    public final v01 f37775c;

    public o01(v01 v01Var, int i7, long j3) {
        this.f37775c = v01Var;
        this.f37773a = i7;
        this.f37774b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f37775c.f40228w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        v01 v01Var = this.f37775c;
        v01Var.i();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= v01Var.f40227s.f38458c.size() - 3) {
            boolean z10 = v01Var.d;
            int i11 = this.f37773a;
            if (z10) {
                org.telegram.messenger.np.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(i11).f25386r7;
            long j3 = -this.f37774b;
            if (!h00Var.e(j3)) {
                h00Var.o(j3);
            }
        }
    }
}
