package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 {
    public final x4 f20867a;
    public boolean f20868b;
    public boolean f20869c;
    public boolean d;
    public boolean e = true;
    public boolean f20870f;
    public long f20871g;

    public g4(x4 x4Var) {
        this.f20867a = x4Var;
    }

    public final void a() {
        if (this.f20870f) {
            boolean z10 = this.f20868b;
            x4 x4Var = this.f20867a;
            if (!z10 && !this.f20869c && !this.d && this.e) {
                View view = x4Var.f21874a;
                k4 k4Var = x4Var.f21882l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21874a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20871g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21875b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21816x.start();
            v4Var.D.setEmpty();
        }
    }
}
