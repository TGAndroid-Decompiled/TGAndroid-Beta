package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f20634a;
    public boolean f20635b;
    public boolean f20636c;
    public boolean d;
    public boolean f20637e = true;
    public boolean f20638f;
    public long f20639g;

    public f4(v4 v4Var) {
        this.f20634a = v4Var;
    }

    public final void a() {
        if (this.f20638f) {
            boolean z10 = this.f20635b;
            v4 v4Var = this.f20634a;
            if (!z10 && !this.f20636c && !this.d && this.f20637e) {
                View view = v4Var.f21664a;
                i4 i4Var = v4Var.f21673l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f21664a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f20639g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f21665b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f21558x.start();
            t4Var.D.setEmpty();
        }
    }
}
