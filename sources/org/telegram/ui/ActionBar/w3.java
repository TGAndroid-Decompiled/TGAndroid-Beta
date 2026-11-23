package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 {
    public final l4 f30186a;
    public boolean f30187b;
    public boolean f30188c;
    public boolean d;
    public boolean f30189e = true;
    public boolean f30190f;
    public long f30191g;

    public w3(l4 l4Var) {
        this.f30186a = l4Var;
    }

    public final void a() {
        if (this.f30190f) {
            boolean z10 = this.f30187b;
            l4 l4Var = this.f30186a;
            if (!z10 && !this.f30188c && !this.d && this.f30189e) {
                View view = l4Var.f29185a;
                z3 z3Var = l4Var.f29194l;
                view.removeOnLayoutChangeListener(z3Var);
                l4Var.f29185a.addOnLayoutChangeListener(z3Var);
                l4Var.c();
                this.f30191g = System.currentTimeMillis();
                return;
            }
            j4 j4Var = l4Var.f29186b;
            if (!j4Var.f()) {
                return;
            }
            j4Var.G = true;
            j4Var.f29036x.start();
            j4Var.D.setEmpty();
        }
    }
}
