package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18935a;
    public boolean f18936b;
    public boolean f18937c;
    public boolean d;
    public boolean e = true;
    public boolean f18938f;
    public long f18939g;

    public h4(x4 x4Var) {
        this.f18935a = x4Var;
    }

    public final void a() {
        if (this.f18938f) {
            boolean z10 = this.f18936b;
            x4 x4Var = this.f18935a;
            if (!z10 && !this.f18937c && !this.d && this.e) {
                View view = x4Var.f19934a;
                k4 k4Var = x4Var.f19942l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19934a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18939g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19935b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19863x.start();
            v4Var.D.setEmpty();
        }
    }
}
