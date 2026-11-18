package org.telegram.ui.ActionBar;

import android.view.View;
public final class x3 {
    public final m4 f30236a;
    public boolean f30237b;
    public boolean f30238c;
    public boolean d;
    public boolean f30239e = true;
    public boolean f30240f;
    public long f30241g;

    public x3(m4 m4Var) {
        this.f30236a = m4Var;
    }

    public final void a() {
        if (this.f30240f) {
            boolean z10 = this.f30237b;
            m4 m4Var = this.f30236a;
            if (!z10 && !this.f30238c && !this.d && this.f30239e) {
                View view = m4Var.f29236a;
                a4 a4Var = m4Var.f29245l;
                view.removeOnLayoutChangeListener(a4Var);
                m4Var.f29236a.addOnLayoutChangeListener(a4Var);
                m4Var.c();
                this.f30241g = System.currentTimeMillis();
                return;
            }
            k4 k4Var = m4Var.f29237b;
            if (!k4Var.f()) {
                return;
            }
            k4Var.G = true;
            k4Var.f29144x.start();
            k4Var.D.setEmpty();
        }
    }
}
