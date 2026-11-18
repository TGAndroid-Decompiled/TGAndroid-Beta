package org.telegram.ui.ActionBar;

import android.view.View;
public final class x3 {
    public final m4 f30234a;
    public boolean f30235b;
    public boolean f30236c;
    public boolean d;
    public boolean f30237e = true;
    public boolean f30238f;
    public long f30239g;

    public x3(m4 m4Var) {
        this.f30234a = m4Var;
    }

    public final void a() {
        if (this.f30238f) {
            boolean z10 = this.f30235b;
            m4 m4Var = this.f30234a;
            if (!z10 && !this.f30236c && !this.d && this.f30237e) {
                View view = m4Var.f29234a;
                a4 a4Var = m4Var.f29243l;
                view.removeOnLayoutChangeListener(a4Var);
                m4Var.f29234a.addOnLayoutChangeListener(a4Var);
                m4Var.c();
                this.f30239g = System.currentTimeMillis();
                return;
            }
            k4 k4Var = m4Var.f29235b;
            if (!k4Var.f()) {
                return;
            }
            k4Var.G = true;
            k4Var.f29142x.start();
            k4Var.D.setEmpty();
        }
    }
}
