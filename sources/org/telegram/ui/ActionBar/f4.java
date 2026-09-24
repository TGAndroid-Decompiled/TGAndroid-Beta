package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f18864a;
    public boolean f18865b;
    public boolean f18866c;
    public boolean d;
    public boolean e = true;
    public boolean f18867f;
    public long f18868g;

    public f4(v4 v4Var) {
        this.f18864a = v4Var;
    }

    public final void a() {
        if (this.f18867f) {
            boolean z10 = this.f18865b;
            v4 v4Var = this.f18864a;
            if (!z10 && !this.f18866c && !this.d && this.e) {
                View view = v4Var.f19862a;
                i4 i4Var = v4Var.f19870l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f19862a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f18868g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f19863b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f19763x.start();
            t4Var.D.setEmpty();
        }
    }
}
