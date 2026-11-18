package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class y01 extends v4.u0 {
    public final int f42241a;
    public final long f42242b;
    public final f11 f42243c;

    public y01(f11 f11Var, int i7, long j3) {
        this.f42243c = f11Var;
        this.f42241a = i7;
        this.f42242b = j3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        EditText editText = this.f42243c.f34897w;
        if (i7 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        f11 f11Var = this.f42243c;
        f11Var.o();
        v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
        if (c0Var != null && c0Var.N0() >= f11Var.f34896s.f33221c.size() - 3) {
            if (f11Var.j()) {
                f11Var.k();
                return;
            }
            boolean z10 = f11Var.d;
            int i11 = this.f42241a;
            if (z10) {
                org.telegram.messenger.mp.u1(i11).I1().g(false);
                return;
            }
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i11).f25771t7;
            long j3 = -this.f42242b;
            if (!e00Var.e(j3)) {
                e00Var.o(j3);
            }
        }
    }
}
