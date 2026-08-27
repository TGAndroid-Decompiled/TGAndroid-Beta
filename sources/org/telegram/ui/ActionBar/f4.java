package org.telegram.ui.ActionBar;

import android.view.View;

public final class f4 {

    public final v4 f22933a;

    public boolean f22934b;

    public boolean f22935c;
    public boolean d;

    public boolean f22936e = true;

    public boolean f22937f;

    public long f22938g;

    public f4(v4 v4Var) {
        this.f22933a = v4Var;
    }

    public final void a() {
        if (this.f22937f) {
            boolean z10 = this.f22934b;
            v4 v4Var = this.f22933a;
            if (z10 || this.f22935c || this.d || !this.f22936e) {
                t4 t4Var = v4Var.f23904b;
                if (t4Var.f()) {
                    t4Var.G = true;
                    t4Var.f23802x.start();
                    t4Var.D.setEmpty();
                    return;
                }
                return;
            }
            View view = v4Var.f23903a;
            i4 i4Var = v4Var.f23912l;
            view.removeOnLayoutChangeListener(i4Var);
            v4Var.f23903a.addOnLayoutChangeListener(i4Var);
            v4Var.c();
            this.f22938g = System.currentTimeMillis();
        }
    }
}
