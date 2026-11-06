package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class i01 extends v4.s0 {
    public final int f34462a;
    public final long f34463b;
    public final n01 f34464c;

    public i01(n01 n01Var, int i7, long j3) {
        this.f34464c = n01Var;
        this.f34462a = i7;
        this.f34463b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f34464c.f36198w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n01 n01Var = this.f34464c;
        n01Var.h();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= n01Var.f36197s.f35137c.size() - 3) {
            boolean z9 = n01Var.d;
            int i11 = this.f34462a;
            if (z9) {
                org.telegram.messenger.qp.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).f24862q7;
            long j3 = -this.f34463b;
            if (!k00Var.e(j3)) {
                k00Var.o(j3);
            }
        }
    }
}
