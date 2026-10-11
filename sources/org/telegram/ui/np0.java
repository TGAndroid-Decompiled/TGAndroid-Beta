package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class np0 extends s4.t0 {
    public final int f40304a;
    public final tp0 f40305b;

    public np0(tp0 tp0Var, int i10) {
        this.f40305b = tp0Var;
        this.f40304a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        yh.f5 f5Var;
        ah.h hVar;
        tp0 tp0Var = this.f40305b;
        zp0 zp0Var = tp0Var.f42241p0;
        if (i11 != 0) {
            zp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = zp0Var.f45046f0) != null) {
            hVar.f(i10, i11);
        }
        tp0Var.h();
        if (tp0Var.K != null) {
            if (tp0Var.J != null && tp0Var.c()) {
                tp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f40304a == 1) {
            f5Var = zp0Var.f45040c;
        } else {
            f5Var = zp0Var.f45038b;
        }
        if (f5Var != null && tp0Var.c()) {
            f5Var.a();
        }
    }
}
