package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f18895a;
    public boolean f18896b;
    public boolean f18897c;
    public boolean d;
    public boolean e = true;
    public boolean f18898f;
    public long f18899g;

    public f4(v4 v4Var) {
        this.f18895a = v4Var;
    }

    public final void a() {
        if (this.f18898f) {
            boolean z10 = this.f18896b;
            v4 v4Var = this.f18895a;
            if (!z10 && !this.f18897c && !this.d && this.e) {
                View view = v4Var.f19893a;
                i4 i4Var = v4Var.f19901l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f19893a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f18899g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f19894b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f19794x.start();
            t4Var.D.setEmpty();
        }
    }
}
