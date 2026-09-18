package org.telegram.ui.ActionBar;

import android.view.View;
public final class i4 {
    public final y4 f18750a;
    public boolean f18751b;
    public boolean f18752c;
    public boolean d;
    public boolean e = true;
    public boolean f18753f;
    public long f18754g;

    public i4(y4 y4Var) {
        this.f18750a = y4Var;
    }

    public final void a() {
        if (this.f18753f) {
            boolean z10 = this.f18751b;
            y4 y4Var = this.f18750a;
            if (!z10 && !this.f18752c && !this.d && this.e) {
                View view = y4Var.f19728a;
                l4 l4Var = y4Var.f19736l;
                view.removeOnLayoutChangeListener(l4Var);
                y4Var.f19728a.addOnLayoutChangeListener(l4Var);
                y4Var.c();
                this.f18754g = System.currentTimeMillis();
                return;
            }
            w4 w4Var = y4Var.f19729b;
            if (!w4Var.f()) {
                return;
            }
            w4Var.G = true;
            w4Var.f19657x.start();
            w4Var.D.setEmpty();
        }
    }
}
