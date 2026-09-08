package org.telegram.ui.ActionBar;

import android.view.View;
public final class h4 {
    public final x4 f20509a;
    public boolean f20510b;
    public boolean f20511c;
    public boolean d;
    public boolean f20512e = true;
    public boolean f20513f;
    public long f20514g;

    public h4(x4 x4Var) {
        this.f20509a = x4Var;
    }

    public final void a() {
        if (this.f20513f) {
            boolean z10 = this.f20510b;
            x4 x4Var = this.f20509a;
            if (!z10 && !this.f20511c && !this.d && this.f20512e) {
                View view = x4Var.f21534a;
                k4 k4Var = x4Var.f21543l;
                view.removeOnLayoutChangeListener(k4Var);
                x4Var.f21534a.addOnLayoutChangeListener(k4Var);
                x4Var.c();
                this.f20514g = System.currentTimeMillis();
                return;
            }
            v4 v4Var = x4Var.f21535b;
            if (!v4Var.f()) {
                return;
            }
            v4Var.G = true;
            v4Var.f21458x.start();
            v4Var.D.setEmpty();
        }
    }
}
