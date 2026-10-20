package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20871a;
    public boolean f20872b;
    public boolean f20873c;
    public boolean d;
    public boolean e = true;
    public boolean f20874f;
    public long f20875g;

    public g4(x4 x4Var) {
        this.f20871a = x4Var;
    }

    public final void a() {
        if (this.f20874f) {
            boolean z10 = this.f20872b;
            x4 x4Var = this.f20871a;
            if (!z10 && !this.f20873c && !this.d && this.e) {
                View view = x4Var.f21878a;
                k4 k4Var = x4Var.f21886l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21878a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20875g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21879b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21820x.start();
            v4Var.D.setEmpty();
        }
    }
}
