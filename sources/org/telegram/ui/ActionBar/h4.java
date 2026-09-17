package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f20483a;
    public boolean f20484b;
    public boolean f20485c;
    public boolean d;
    public boolean f20486e = true;
    public boolean f20487f;
    public long f20488g;

    public h4(x4 x4Var) {
        this.f20483a = x4Var;
    }

    public final void a() {
        if (this.f20487f) {
            boolean z10 = this.f20484b;
            x4 x4Var = this.f20483a;
            if (!z10 && !this.f20485c && !this.d && this.f20486e) {
                View view = x4Var.f21508a;
                k4 k4Var = x4Var.f21517l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21508a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20488g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21509b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21432x.start();
            v4Var.D.setEmpty();
        }
    }
}
