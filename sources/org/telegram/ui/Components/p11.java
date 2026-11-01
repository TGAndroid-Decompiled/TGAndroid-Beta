package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class p11 extends s4.s0 {
    public final int f29312a;
    public final long f29313b;
    public final u11 f29314c;

    public p11(u11 u11Var, int i10, long j10) {
        this.f29314c = u11Var;
        this.f29312a = i10;
        this.f29313b = j10;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        EditText editText = this.f29314c.f30828w;
        if (i10 == 1 && editText.hasFocus()) {
            org.telegram.messenger.i0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u11 u11Var = this.f29314c;
        u11Var.h();
        s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
        if (a0Var != null && a0Var.N0() >= u11Var.f30827s.f29856c.size() - 3) {
            boolean z10 = u11Var.d;
            int i12 = this.f29312a;
            if (z10) {
                org.telegram.messenger.wp.r1(i12).F1().g(false);
                return;
            }
            org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(i12).f19234r7;
            long j10 = -this.f29313b;
            if (!y00Var.e(j10)) {
                y00Var.o(j10);
            }
        }
    }
}
