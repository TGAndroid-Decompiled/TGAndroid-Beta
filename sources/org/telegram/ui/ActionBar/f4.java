package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f19784a;
    public boolean f19785b;
    public boolean f19786c;
    public boolean d;
    public boolean e = true;
    public boolean f19787f;
    public long f19788g;

    public f4(v4 v4Var) {
        this.f19784a = v4Var;
    }

    public final void a() {
        if (this.f19787f) {
            boolean z10 = this.f19785b;
            v4 v4Var = this.f19784a;
            if (!z10 && !this.f19786c && !this.d && this.e) {
                View view = v4Var.f20763a;
                i4 i4Var = v4Var.f20771l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f20763a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f19788g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f20764b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f20664x.start();
            t4Var.D.setEmpty();
        }
    }
}
