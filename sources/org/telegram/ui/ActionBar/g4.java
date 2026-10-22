package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20874a;
    public boolean f20875b;
    public boolean f20876c;
    public boolean d;
    public boolean e = true;
    public boolean f20877f;
    public long f20878g;

    public g4(x4 x4Var) {
        this.f20874a = x4Var;
    }

    public final void a() {
        if (this.f20877f) {
            boolean z10 = this.f20875b;
            x4 x4Var = this.f20874a;
            if (!z10 && !this.f20876c && !this.d && this.e) {
                View view = x4Var.f21881a;
                k4 k4Var = x4Var.f21889l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21881a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20878g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21882b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21823x.start();
            v4Var.D.setEmpty();
        }
    }
}
