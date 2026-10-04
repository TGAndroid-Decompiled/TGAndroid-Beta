package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20652a;
    public boolean f20653b;
    public boolean f20654c;
    public boolean d;
    public boolean f20655e = true;
    public boolean f20656f;
    public long f20657g;

    public g4(w4 w4Var) {
        this.f20652a = w4Var;
    }

    public final void a() {
        if (this.f20656f) {
            boolean z10 = this.f20653b;
            w4 w4Var = this.f20652a;
            if (!z10 && !this.f20654c && !this.d && this.f20655e) {
                View view = w4Var.f21664a;
                j4 j4Var = w4Var.f21673l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21664a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20657g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21665b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21558x.start();
            u4Var.D.setEmpty();
        }
    }
}
