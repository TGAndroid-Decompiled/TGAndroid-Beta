package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18920a;
    public boolean f18921b;
    public boolean f18922c;
    public boolean d;
    public boolean e = true;
    public boolean f18923f;
    public long f18924g;

    public h4(x4 x4Var) {
        this.f18920a = x4Var;
    }

    public final void a() {
        if (this.f18923f) {
            boolean z10 = this.f18921b;
            x4 x4Var = this.f18920a;
            if (!z10 && !this.f18922c && !this.d && this.e) {
                View view = x4Var.f19919a;
                k4 k4Var = x4Var.f19927l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19919a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18924g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19920b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19848x.start();
            v4Var.D.setEmpty();
        }
    }
}
