package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18722a;
    public boolean f18723b;
    public boolean f18724c;
    public boolean d;
    public boolean e = true;
    public boolean f18725f;
    public long f18726g;

    public h4(x4 x4Var) {
        this.f18722a = x4Var;
    }

    public final void a() {
        if (this.f18725f) {
            boolean z10 = this.f18723b;
            x4 x4Var = this.f18722a;
            if (!z10 && !this.f18724c && !this.d && this.e) {
                View view = x4Var.f19700a;
                k4 k4Var = x4Var.f19708l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19700a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18726g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19701b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19629x.start();
            v4Var.D.setEmpty();
        }
    }
}
