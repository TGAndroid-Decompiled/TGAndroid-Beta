package org.telegram.ui.ActionBar;

import android.view.View;
public final class c4 {
    public final s4 f20206a;
    public boolean f20207b;
    public boolean f20208c;
    public boolean d;
    public boolean e = true;
    public boolean f20209f;
    public long f20210g;

    public c4(s4 s4Var) {
        this.f20206a = s4Var;
    }

    public final void a() {
        if (this.f20209f) {
            boolean z10 = this.f20207b;
            s4 s4Var = this.f20206a;
            if (!z10 && !this.f20208c && !this.d && this.e) {
                View view = s4Var.f20776a;
                f4 f4Var = s4Var.f20784l;
                view.removeOnLayoutChangeListener(f4Var);
                s4Var.f20776a.addOnLayoutChangeListener(f4Var);
                s4Var.c();
                this.f20210g = System.currentTimeMillis();
                return;
            }
            q4 q4Var = s4Var.f20777b;
            if (!q4Var.f()) {
                return;
            }
            q4Var.G = true;
            q4Var.f20701x.start();
            q4Var.D.setEmpty();
        }
    }
}
