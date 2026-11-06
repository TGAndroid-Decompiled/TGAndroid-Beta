package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class k01 extends v4.s0 {
    public final int f35098a;
    public final long f35099b;
    public final r01 f35100c;

    public k01(r01 r01Var, int i7, long j3) {
        this.f35100c = r01Var;
        this.f35098a = i7;
        this.f35099b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f35100c.f37473w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        r01 r01Var = this.f35100c;
        r01Var.j();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= r01Var.f37472s.f35812c.size() - 3) {
            boolean z9 = r01Var.d;
            int i11 = this.f35098a;
            if (z9) {
                org.telegram.messenger.qp.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).f24862q7;
            long j3 = -this.f35099b;
            if (!k00Var.e(j3)) {
                k00Var.o(j3);
            }
        }
    }
}
