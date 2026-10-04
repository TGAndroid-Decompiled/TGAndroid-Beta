package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20651a;
    public boolean f20652b;
    public boolean f20653c;
    public boolean d;
    public boolean f20654e = true;
    public boolean f20655f;
    public long f20656g;

    public g4(w4 w4Var) {
        this.f20651a = w4Var;
    }

    public final void a() {
        if (this.f20655f) {
            boolean z10 = this.f20652b;
            w4 w4Var = this.f20651a;
            if (!z10 && !this.f20653c && !this.d && this.f20654e) {
                View view = w4Var.f21663a;
                j4 j4Var = w4Var.f21672l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21663a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20656g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21664b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21557x.start();
            u4Var.D.setEmpty();
        }
    }
}
