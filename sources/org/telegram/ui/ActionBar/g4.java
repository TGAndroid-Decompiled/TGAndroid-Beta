package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final w4 f20656a;
    public boolean f20657b;
    public boolean f20658c;
    public boolean d;
    public boolean f20659e = true;
    public boolean f20660f;
    public long f20661g;

    public g4(w4 w4Var) {
        this.f20656a = w4Var;
    }

    public final void a() {
        if (this.f20660f) {
            boolean z10 = this.f20657b;
            w4 w4Var = this.f20656a;
            if (!z10 && !this.f20658c && !this.d && this.f20659e) {
                View view = w4Var.f21668a;
                j4 j4Var = w4Var.f21677l;
                view.removeOnLayoutChangeListener(j4Var);
                w4Var.f21668a.addOnLayoutChangeListener(j4Var);
                w4Var.c();
                this.f20661g = System.currentTimeMillis();
                return;
            }
            u4 u4Var = w4Var.f21669b;
            if (!u4Var.f()) {
                return;
            }
            u4Var.G = true;
            u4Var.f21562x.start();
            u4Var.D.setEmpty();
        }
    }
}
