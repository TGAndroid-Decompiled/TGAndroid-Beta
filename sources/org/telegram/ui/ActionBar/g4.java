package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20875a;
    public boolean f20876b;
    public boolean f20877c;
    public boolean d;
    public boolean e = true;
    public boolean f20878f;
    public long f20879g;

    public g4(x4 x4Var) {
        this.f20875a = x4Var;
    }

    public final void a() {
        if (this.f20878f) {
            boolean z10 = this.f20876b;
            x4 x4Var = this.f20875a;
            if (!z10 && !this.f20877c && !this.d && this.e) {
                View view = x4Var.f21882a;
                k4 k4Var = x4Var.f21890l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21882a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20879g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21883b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21824x.start();
            v4Var.D.setEmpty();
        }
    }
}
