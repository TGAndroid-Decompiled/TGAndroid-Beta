package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class pp0 extends s4.s0 {
    public final int f39640a;
    public final vp0 f39641b;

    public pp0(vp0 vp0Var, int i10) {
        this.f39641b = vp0Var;
        this.f39640a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zh.j5 j5Var;
        bh.f fVar;
        vp0 vp0Var = this.f39641b;
        bq0 bq0Var = vp0Var.f41646p0;
        if (i11 != 0) {
            bq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = bq0Var.f34894f0) != null) {
            fVar.f(i10, i11);
        }
        vp0Var.h();
        if (vp0Var.K != null) {
            if (vp0Var.J != null && vp0Var.c()) {
                vp0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f39640a == 1) {
            j5Var = bq0Var.f34888c;
        } else {
            j5Var = bq0Var.f34886b;
        }
        if (j5Var != null && vp0Var.c()) {
            j5Var.a();
        }
    }
}
