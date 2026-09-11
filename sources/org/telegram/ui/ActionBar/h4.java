package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f20482a;
    public boolean f20483b;
    public boolean f20484c;
    public boolean d;
    public boolean f20485e = true;
    public boolean f20486f;
    public long f20487g;

    public h4(x4 x4Var) {
        this.f20482a = x4Var;
    }

    public final void a() {
        if (this.f20486f) {
            boolean z10 = this.f20483b;
            x4 x4Var = this.f20482a;
            if (!z10 && !this.f20484c && !this.d && this.f20485e) {
                View view = x4Var.f21507a;
                k4 k4Var = x4Var.f21516l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21507a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20487g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21508b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21431x.start();
            v4Var.D.setEmpty();
        }
    }
}
