package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f20392a;
    public boolean f20393b;
    public boolean f20394c;
    public boolean d;
    public boolean f20395e = true;
    public boolean f20396f;
    public long f20397g;

    public f4(v4 v4Var) {
        this.f20392a = v4Var;
    }

    public final void a() {
        if (this.f20396f) {
            boolean z10 = this.f20393b;
            v4 v4Var = this.f20392a;
            if (!z10 && !this.f20394c && !this.d && this.f20395e) {
                View view = v4Var.f21403a;
                i4 i4Var = v4Var.f21412l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f21403a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f20397g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f21404b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f21297x.start();
            t4Var.D.setEmpty();
        }
    }
}
