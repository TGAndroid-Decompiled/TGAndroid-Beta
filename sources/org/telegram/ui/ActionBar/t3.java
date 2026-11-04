package org.telegram.ui.ActionBar;

import android.view.View;
public final class t3 {
    public final k4 f28627a;
    public boolean f28628b;
    public boolean f28629c;
    public boolean d;
    public boolean f28630e = true;
    public boolean f28631f;
    public long f28632g;

    public t3(k4 k4Var) {
        this.f28627a = k4Var;
    }

    public final void a() {
        if (this.f28631f) {
            boolean z10 = this.f28628b;
            k4 k4Var = this.f28627a;
            if (!z10 && !this.f28629c && !this.d && this.f28630e) {
                View view = k4Var.f27767a;
                w3 w3Var = k4Var.f27776l;
                view.removeOnLayoutChangeListener(w3Var);
                k4Var.f27767a.addOnLayoutChangeListener(w3Var);
                k4Var.c();
                this.f28632g = System.currentTimeMillis();
                return;
            }
            i4 i4Var = k4Var.f27768b;
            if (!i4Var.f()) {
                return;
            }
            i4Var.G = true;
            i4Var.f27628x.start();
            i4Var.D.setEmpty();
        }
    }
}
