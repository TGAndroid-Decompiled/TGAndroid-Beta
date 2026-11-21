package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 {
    public final l4 f30217a;
    public boolean f30218b;
    public boolean f30219c;
    public boolean d;
    public boolean f30220e = true;
    public boolean f30221f;
    public long f30222g;

    public w3(l4 l4Var) {
        this.f30217a = l4Var;
    }

    public final void a() {
        if (this.f30221f) {
            boolean z10 = this.f30218b;
            l4 l4Var = this.f30217a;
            if (!z10 && !this.f30219c && !this.d && this.f30220e) {
                View view = l4Var.f29216a;
                z3 z3Var = l4Var.f29225l;
                view.removeOnLayoutChangeListener(z3Var);
                l4Var.f29216a.addOnLayoutChangeListener(z3Var);
                l4Var.c();
                this.f30222g = System.currentTimeMillis();
                return;
            }
            j4 j4Var = l4Var.f29217b;
            if (!j4Var.f()) {
                return;
            }
            j4Var.G = true;
            j4Var.f29067x.start();
            j4Var.D.setEmpty();
        }
    }
}
