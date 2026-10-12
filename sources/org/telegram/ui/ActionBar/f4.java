package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f20391a;
    public boolean f20392b;
    public boolean f20393c;
    public boolean d;
    public boolean f20394e = true;
    public boolean f20395f;
    public long f20396g;

    public f4(v4 v4Var) {
        this.f20391a = v4Var;
    }

    public final void a() {
        if (this.f20395f) {
            boolean z10 = this.f20392b;
            v4 v4Var = this.f20391a;
            if (!z10 && !this.f20393c && !this.d && this.f20394e) {
                View view = v4Var.f21402a;
                i4 i4Var = v4Var.f21411l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f21402a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f20396g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f21403b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f21296x.start();
            t4Var.D.setEmpty();
        }
    }
}
