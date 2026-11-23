package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class z01 extends v4.t0 {
    public final int f42568a;
    public final long f42569b;
    public final g11 f42570c;

    public z01(g11 g11Var, int i7, long j3) {
        this.f42570c = g11Var;
        this.f42568a = i7;
        this.f42569b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f42570c.f35351w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        g11 g11Var = this.f42570c;
        g11Var.o();
        v4.b0 b0Var = (v4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= g11Var.f35350s.f33682c.size() - 3) {
            if (g11Var.j()) {
                g11Var.k();
                return;
            }
            boolean z10 = g11Var.d;
            int i11 = this.f42568a;
            if (z10) {
                org.telegram.messenger.np.u1(i11).I1().g(false);
                return;
            }
            org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i11).f25932t7;
            long j3 = -this.f42569b;
            if (!f00Var.e(j3)) {
                f00Var.o(j3);
            }
        }
    }
}
