package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f18880a;
    public boolean f18881b;
    public boolean f18882c;
    public boolean d;
    public boolean e = true;
    public boolean f18883f;
    public long f18884g;

    public f4(v4 v4Var) {
        this.f18880a = v4Var;
    }

    public final void a() {
        if (this.f18883f) {
            boolean z10 = this.f18881b;
            v4 v4Var = this.f18880a;
            if (!z10 && !this.f18882c && !this.d && this.e) {
                View view = v4Var.f19878a;
                i4 i4Var = v4Var.f19886l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f19878a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f18884g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f19879b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f19779x.start();
            t4Var.D.setEmpty();
        }
    }
}
