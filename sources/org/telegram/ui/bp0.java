package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class bp0 extends f2.z0 {
    public final int f32931a;
    public final hp0 f32932b;

    public bp0(hp0 hp0Var, int i10) {
        this.f32932b = hp0Var;
        this.f32931a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lh.l7 l7Var;
        ng.e eVar;
        hp0 hp0Var = this.f32932b;
        np0 np0Var = hp0Var.m0;
        if (i11 != 0) {
            np0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = np0Var.f36558c0) != null) {
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
        if (this.f32931a == 1) {
            l7Var = np0Var.f36557c;
        } else {
            l7Var = np0Var.f36555b;
        }
        if (l7Var != null && hp0Var.c()) {
            l7Var.a();
        }
    }
}
