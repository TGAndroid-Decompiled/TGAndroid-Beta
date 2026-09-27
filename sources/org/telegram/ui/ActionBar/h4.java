package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18944a;
    public boolean f18945b;
    public boolean f18946c;
    public boolean d;
    public boolean e = true;
    public boolean f18947f;
    public long f18948g;

    public h4(x4 x4Var) {
        this.f18944a = x4Var;
    }

    public final void a() {
        if (this.f18947f) {
            boolean z10 = this.f18945b;
            x4 x4Var = this.f18944a;
            if (!z10 && !this.f18946c && !this.d && this.e) {
                View view = x4Var.f19926a;
                k4 k4Var = x4Var.f19934l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19926a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18948g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19927b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19827x.start();
            v4Var.D.setEmpty();
        }
    }
}
