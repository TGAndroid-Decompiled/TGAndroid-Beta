package org.telegram.ui.Components;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class i01 extends u4.t0 {
    public final int f34558a;
    public final long f34559b;
    public final n01 f34560c;

    public i01(n01 n01Var, int i3, long j10) {
        this.f34560c = n01Var;
        this.f34558a = i3;
        this.f34559b = j10;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        EditText editText = this.f34560c.f36321w;
        if (i3 == 1 && editText.hasFocus()) {
            org.telegram.messenger.g0.v1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        n01 n01Var = this.f34560c;
        n01Var.h();
        u4.b0 b0Var = (u4.b0) recyclerView.getLayoutManager();
        if (b0Var != null && b0Var.N0() >= n01Var.f36320s.f35234c.size() - 3) {
            boolean z10 = n01Var.d;
            int i11 = this.f34558a;
            if (z10) {
                org.telegram.messenger.hp.s1(i11).G1().g(false);
                return;
            }
            org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i11).f23102q7;
            long j10 = -this.f34559b;
            if (!c00Var.e(j10)) {
                c00Var.o(j10);
            }
        }
    }
}
