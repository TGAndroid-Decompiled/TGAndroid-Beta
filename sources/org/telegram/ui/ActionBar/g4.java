package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20870a;
    public boolean f20871b;
    public boolean f20872c;
    public boolean d;
    public boolean e = true;
    public boolean f20873f;
    public long f20874g;

    public g4(x4 x4Var) {
        this.f20870a = x4Var;
    }

    public final void a() {
        if (this.f20873f) {
            boolean z10 = this.f20871b;
            x4 x4Var = this.f20870a;
            if (!z10 && !this.f20872c && !this.d && this.e) {
                View view = x4Var.f21877a;
                k4 k4Var = x4Var.f21885l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21877a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20874g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21878b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21819x.start();
            v4Var.D.setEmpty();
        }
    }
}
