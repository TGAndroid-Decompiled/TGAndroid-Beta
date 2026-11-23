package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 {
    public final l4 f30270a;
    public boolean f30271b;
    public boolean f30272c;
    public boolean d;
    public boolean f30273e = true;
    public boolean f30274f;
    public long f30275g;

    public w3(l4 l4Var) {
        this.f30270a = l4Var;
    }

    public final void a() {
        if (this.f30274f) {
            boolean z10 = this.f30271b;
            l4 l4Var = this.f30270a;
            if (!z10 && !this.f30272c && !this.d && this.f30273e) {
                View view = l4Var.f29270a;
                z3 z3Var = l4Var.f29279l;
                view.removeOnLayoutChangeListener(z3Var);
                l4Var.f29270a.addOnLayoutChangeListener(z3Var);
                l4Var.c();
                this.f30275g = System.currentTimeMillis();
                return;
            }
            j4 j4Var = l4Var.f29271b;
            if (!j4Var.f()) {
                return;
            }
            j4Var.G = true;
            j4Var.f29123x.start();
            j4Var.D.setEmpty();
        }
    }
}
