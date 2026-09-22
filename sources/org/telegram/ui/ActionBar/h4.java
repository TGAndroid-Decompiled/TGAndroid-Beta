package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f18720a;
    public boolean f18721b;
    public boolean f18722c;
    public boolean d;
    public boolean e = true;
    public boolean f18723f;
    public long f18724g;

    public h4(x4 x4Var) {
        this.f18720a = x4Var;
    }

    public final void a() {
        if (this.f18723f) {
            boolean z10 = this.f18721b;
            x4 x4Var = this.f18720a;
            if (!z10 && !this.f18722c && !this.d && this.e) {
                View view = x4Var.f19696a;
                k4 k4Var = x4Var.f19704l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f19696a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f18724g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f19697b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f19625x.start();
            v4Var.D.setEmpty();
        }
    }
}
