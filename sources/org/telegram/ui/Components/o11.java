package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class o11 extends s4.s0 {
    public final int f28933a;
    public final long f28934b;
    public final t11 f28935c;

    public o11(t11 t11Var, int i10, long j10) {
        this.f28935c = t11Var;
        this.f28933a = i10;
        this.f28934b = j10;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        EditText editText = this.f28935c.f30418x;
        if (i10 == 1 && editText.hasFocus()) {
            org.telegram.messenger.i0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t11 t11Var = this.f28935c;
        t11Var.g();
        s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
        if (a0Var != null && a0Var.N0() >= t11Var.f30417w.f29508c.size() - 3) {
            boolean z10 = t11Var.d;
            int i12 = this.f28933a;
            if (z10) {
                org.telegram.messenger.vp.r1(i12).F1().g(false);
                return;
            }
            org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i12).f18891r7;
            long j10 = -this.f28934b;
            if (!x00Var.e(j10)) {
                x00Var.o(j10);
            }
        }
    }
}
