package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class bp0 extends f2.a1 {
    public final int f35585a;
    public final hp0 f35586b;

    public bp0(hp0 hp0Var, int i10) {
        this.f35586b = hp0Var;
        this.f35585a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mh.l7 l7Var;
        og.e eVar;
        hp0 hp0Var = this.f35586b;
        np0 np0Var = hp0Var.m0;
        if (i11 != 0) {
            np0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = np0Var.f39427c0) != null) {
            eVar.f(i10, i11);
        }
        hp0Var.h();
        if (hp0Var.H != null) {
            if (hp0Var.G != null && hp0Var.c()) {
                hp0Var.G.g(false);
                return;
            }
            return;
        }
        if (this.f35585a == 1) {
            l7Var = np0Var.f39426c;
        } else {
            l7Var = np0Var.f39424b;
        }
        if (l7Var != null && hp0Var.c()) {
            l7Var.a();
        }
    }
}
