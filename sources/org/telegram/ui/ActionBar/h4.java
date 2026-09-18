package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18907a;
    public boolean f18908b;
    public boolean f18909c;
    public boolean d;
    public boolean e = true;
    public boolean f18910f;
    public long f18911g;

    public h4(x4 x4Var) {
        this.f18907a = x4Var;
    }

    public final void a() {
        if (this.f18910f) {
            boolean z10 = this.f18908b;
            x4 x4Var = this.f18907a;
            if (!z10 && !this.f18909c && !this.d && this.e) {
                View view = x4Var.f19887a;
                k4 k4Var = x4Var.f19895l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19887a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18911g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19888b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19816x.start();
            v4Var.D.setEmpty();
        }
    }
}
