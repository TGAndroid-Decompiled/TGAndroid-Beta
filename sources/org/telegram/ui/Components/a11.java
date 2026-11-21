package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class a11 extends v4.u0 {
    public final int f33267a;
    public final long f33268b;
    public final h11 f33269c;

    public a11(h11 h11Var, int i7, long j3) {
        this.f33269c = h11Var;
        this.f33267a = i7;
        this.f33268b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f33269c.f35750w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        h11 h11Var = this.f33269c;
        h11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var != null && c0Var.N0() >= h11Var.f35749s.f33982c.size() - 3) {
            if (h11Var.j()) {
                h11Var.k();
                return;
            }
            boolean z10 = h11Var.d;
            int i11 = this.f33267a;
            if (z10) {
                org.telegram.messenger.mp.u1(i11).I1().g(false);
                return;
            }
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i11).f25797t7;
            long j3 = -this.f33268b;
            if (!e00Var.e(j3)) {
                e00Var.o(j3);
            }
        }
    }
}
