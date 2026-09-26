package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f18878a;
    public boolean f18879b;
    public boolean f18880c;
    public boolean d;
    public boolean e = true;
    public boolean f18881f;
    public long f18882g;

    public f4(v4 v4Var) {
        this.f18878a = v4Var;
    }

    public final void a() {
        if (this.f18881f) {
            boolean z10 = this.f18879b;
            v4 v4Var = this.f18878a;
            if (!z10 && !this.f18880c && !this.d && this.e) {
                View view = v4Var.f19876a;
                i4 i4Var = v4Var.f19884l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f19876a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f18882g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f19877b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f19777x.start();
            t4Var.D.setEmpty();
        }
    }
}
