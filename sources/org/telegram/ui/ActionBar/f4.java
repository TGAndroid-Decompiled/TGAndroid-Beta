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
            if (!z10 && !this.f22935c && !this.d && this.f22936e) {
                View view = v4Var.f23893a;
                i4 i4Var = v4Var.f23902l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f23893a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f22938g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f23894b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f23812x.start();
            t4Var.D.setEmpty();
        }
    }
}
