package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class z01 extends v4.u0 {
    public final int f42611a;
    public final long f42612b;
    public final g11 f42613c;

    public z01(g11 g11Var, int i7, long j3) {
        this.f42613c = g11Var;
        this.f42611a = i7;
        this.f42612b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f42613c.f35389w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        g11 g11Var = this.f42613c;
        g11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var != null && c0Var.N0() >= g11Var.f35388s.f33705c.size() - 3) {
            if (g11Var.j()) {
                g11Var.k();
                return;
            }
            boolean z10 = g11Var.d;
            int i11 = this.f42611a;
            if (z10) {
                org.telegram.messenger.np.u1(i11).I1().g(false);
                return;
            }
            org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i11).f25968t7;
            long j3 = -this.f42612b;
            if (!f00Var.e(j3)) {
                f00Var.o(j3);
            }
        }
    }
}
