package org.telegram.ui.ActionBar;

import android.view.View;
public final class c4 {
    public final s4 f20205a;
    public boolean f20206b;
    public boolean f20207c;
    public boolean d;
    public boolean e = true;
    public boolean f20208f;
    public long f20209g;

    public c4(s4 s4Var) {
        this.f20205a = s4Var;
    }

    public final void a() {
        if (this.f20208f) {
            boolean z10 = this.f20206b;
            s4 s4Var = this.f20205a;
            if (!z10 && !this.f20207c && !this.d && this.e) {
                View view = s4Var.f20775a;
                f4 f4Var = s4Var.f20783l;
                view.removeOnLayoutChangeListener(f4Var);
                s4Var.f20775a.addOnLayoutChangeListener(f4Var);
                s4Var.c();
                this.f20209g = System.currentTimeMillis();
                return;
            }
            q4 q4Var = s4Var.f20776b;
            if (!q4Var.f()) {
                return;
            }
            q4Var.G = true;
            q4Var.f20700x.start();
            q4Var.D.setEmpty();
        }
    }
}
