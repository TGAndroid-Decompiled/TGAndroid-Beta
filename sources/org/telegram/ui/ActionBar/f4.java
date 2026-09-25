package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f18879a;
    public boolean f18880b;
    public boolean f18881c;
    public boolean d;
    public boolean e = true;
    public boolean f18882f;
    public long f18883g;

    public f4(v4 v4Var) {
        this.f18879a = v4Var;
    }

    public final void a() {
        if (this.f18882f) {
            boolean z10 = this.f18880b;
            v4 v4Var = this.f18879a;
            if (!z10 && !this.f18881c && !this.d && this.e) {
                View view = v4Var.f19877a;
                i4 i4Var = v4Var.f19885l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f19877a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f18883g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f19878b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f19778x.start();
            t4Var.D.setEmpty();
        }
    }
}
