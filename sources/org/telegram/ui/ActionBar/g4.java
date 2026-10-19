package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20868a;
    public boolean f20869b;
    public boolean f20870c;
    public boolean d;
    public boolean e = true;
    public boolean f20871f;
    public long f20872g;

    public g4(x4 x4Var) {
        this.f20868a = x4Var;
    }

    public final void a() {
        if (this.f20871f) {
            boolean z10 = this.f20869b;
            x4 x4Var = this.f20868a;
            if (!z10 && !this.f20870c && !this.d && this.e) {
                View view = x4Var.f21875a;
                k4 k4Var = x4Var.f21883l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21875a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20872g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21876b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21817x.start();
            v4Var.D.setEmpty();
        }
    }
}
