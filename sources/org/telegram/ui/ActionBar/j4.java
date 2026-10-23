package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 {
    public final a5 f20992a;
    public boolean f20993b;
    public boolean f20994c;
    public boolean d;
    public boolean e = true;
    public boolean f20995f;
    public long f20996g;

    public j4(a5 a5Var) {
        this.f20992a = a5Var;
    }

    public final void a() {
        if (this.f20995f) {
            boolean z10 = this.f20993b;
            a5 a5Var = this.f20992a;
            if (!z10 && !this.f20994c && !this.d && this.e) {
                View view = a5Var.f20691a;
                n4 n4Var = a5Var.f20699l;
                view.removeOnLayoutChangeListener(n4Var);
                a5Var.f20691a.addOnLayoutChangeListener(n4Var);
                a5Var.c();
                this.f20996g = System.currentTimeMillis();
                return;
            }
            y4 y4Var = a5Var.f20692b;
            if (!y4Var.f()) {
                return;
            }
            y4Var.G = true;
            y4Var.f22010x.start();
            y4Var.D.setEmpty();
        }
    }
}
