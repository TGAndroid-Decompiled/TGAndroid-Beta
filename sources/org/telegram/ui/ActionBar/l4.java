package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 {
    public final c5 f22827a;
    public boolean f22828b;
    public boolean f22829c;
    public boolean d;
    public boolean e = true;
    public boolean f22830f;
    public long f22831g;

    public l4(c5 c5Var) {
        this.f22827a = c5Var;
    }

    public final void a() {
        if (this.f22830f) {
            boolean z10 = this.f22828b;
            c5 c5Var = this.f22827a;
            if (!z10 && !this.f22829c && !this.d && this.e) {
                View view = c5Var.f22505a;
                p4 p4Var = c5Var.f22513l;
                view.removeOnLayoutChangeListener(p4Var);
                c5Var.f22505a.addOnLayoutChangeListener(p4Var);
                c5Var.c();
                this.f22831g = System.currentTimeMillis();
                return;
            }
            a5 a5Var = c5Var.f22506b;
            if (!a5Var.f()) {
                return;
            }
            a5Var.G = true;
            a5Var.f22416x.start();
            a5Var.D.setEmpty();
        }
    }
}
