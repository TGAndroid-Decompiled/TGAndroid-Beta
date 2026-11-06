package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class l01 extends v4.s0 {
    public final int f35457a;
    public final long f35458b;
    public final s01 f35459c;

    public l01(s01 s01Var, int i7, long j3) {
        this.f35459c = s01Var;
        this.f35457a = i7;
        this.f35458b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f35459c.f37833w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        s01 s01Var = this.f35459c;
        s01Var.i();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= s01Var.f37832s.f36161c.size() - 3) {
            boolean z9 = s01Var.d;
            int i11 = this.f35457a;
            if (z9) {
                org.telegram.messenger.qp.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).f24870q7;
            long j3 = -this.f35458b;
            if (!k00Var.e(j3)) {
                k00Var.o(j3);
            }
        }
    }
}
