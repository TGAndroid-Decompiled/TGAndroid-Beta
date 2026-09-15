package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class op0 extends s4.s0 {
    public final int f36317a;
    public final up0 f36318b;

    public op0(up0 up0Var, int i10) {
        this.f36318b = up0Var;
        this.f36317a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.n5 n5Var;
        ah.h hVar;
        up0 up0Var = this.f36318b;
        aq0 aq0Var = up0Var.f38083p0;
        if (i11 != 0) {
            aq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = aq0Var.f31894f0) != null) {
            hVar.f(i10, i11);
        }
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J != null && up0Var.c()) {
                up0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f36317a == 1) {
            n5Var = aq0Var.f31889c;
        } else {
            n5Var = aq0Var.f31887b;
        }
        if (n5Var != null && up0Var.c()) {
            n5Var.a();
        }
    }
}
