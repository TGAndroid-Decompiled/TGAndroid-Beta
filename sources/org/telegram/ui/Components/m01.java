package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class m01 extends v4.s0 {
    public final int f35887a;
    public final long f35888b;
    public final t01 f35889c;

    public m01(t01 t01Var, int i7, long j3) {
        this.f35889c = t01Var;
        this.f35887a = i7;
        this.f35888b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f35889c.f38227w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        t01 t01Var = this.f35889c;
        t01Var.i();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= t01Var.f38226s.f36593c.size() - 3) {
            boolean z9 = t01Var.d;
            int i11 = this.f35887a;
            if (z9) {
                org.telegram.messenger.qp.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i11).f24877q7;
            long j3 = -this.f35888b;
            if (!k00Var.e(j3)) {
                k00Var.o(j3);
            }
        }
    }
}
