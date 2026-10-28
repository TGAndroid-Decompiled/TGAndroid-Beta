package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 {
    public final c5 f22828a;
    public boolean f22829b;
    public boolean f22830c;
    public boolean d;
    public boolean e = true;
    public boolean f22831f;
    public long f22832g;

    public l4(c5 c5Var) {
        this.f22828a = c5Var;
    }

    public final void a() {
        if (this.f22831f) {
            boolean z10 = this.f22829b;
            c5 c5Var = this.f22828a;
            if (!z10 && !this.f22830c && !this.d && this.e) {
                View view = c5Var.f22506a;
                p4 p4Var = c5Var.f22514l;
                view.removeOnLayoutChangeListener(p4Var);
                c5Var.f22506a.addOnLayoutChangeListener(p4Var);
                c5Var.c();
                this.f22832g = System.currentTimeMillis();
                return;
            }
            a5 a5Var = c5Var.f22507b;
            if (!a5Var.f()) {
                return;
            }
            a5Var.G = true;
            a5Var.f22417x.start();
            a5Var.D.setEmpty();
        }
    }
}
