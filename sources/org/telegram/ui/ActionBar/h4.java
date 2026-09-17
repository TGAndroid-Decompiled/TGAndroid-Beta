package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f20510a;
    public boolean f20511b;
    public boolean f20512c;
    public boolean d;
    public boolean f20513e = true;
    public boolean f20514f;
    public long f20515g;

    public h4(x4 x4Var) {
        this.f20510a = x4Var;
    }

    public final void a() {
        if (this.f20514f) {
            boolean z10 = this.f20511b;
            x4 x4Var = this.f20510a;
            if (!z10 && !this.f20512c && !this.d && this.f20513e) {
                View view = x4Var.f21535a;
                k4 k4Var = x4Var.f21544l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21535a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20515g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21536b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21459x.start();
            v4Var.D.setEmpty();
        }
    }
}
