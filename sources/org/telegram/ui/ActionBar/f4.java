package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f19484a;
    public boolean f19485b;
    public boolean f19486c;
    public boolean d;
    public boolean e = true;
    public boolean f19487f;
    public long f19488g;

    public f4(v4 v4Var) {
        this.f19484a = v4Var;
    }

    public final void a() {
        if (this.f19487f) {
            boolean z10 = this.f19485b;
            v4 v4Var = this.f19484a;
            if (!z10 && !this.f19486c && !this.d && this.e) {
                View view = v4Var.f20463a;
                i4 i4Var = v4Var.f20471l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f20463a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f19488g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f20464b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f20364x.start();
            t4Var.D.setEmpty();
        }
    }
}
