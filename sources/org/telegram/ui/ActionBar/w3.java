package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 {
    public final l4 f28715a;
    public boolean f28716b;
    public boolean f28717c;
    public boolean d;
    public boolean f28718e = true;
    public boolean f28719f;
    public long f28720g;

    public w3(l4 l4Var) {
        this.f28715a = l4Var;
    }

    public final void a() {
        if (this.f28719f) {
            boolean z9 = this.f28716b;
            l4 l4Var = this.f28715a;
            if (!z9 && !this.f28717c && !this.d && this.f28718e) {
                View view = l4Var.f27752a;
                z3 z3Var = l4Var.f27761l;
                view.removeOnLayoutChangeListener(z3Var);
                l4Var.f27752a.addOnLayoutChangeListener(z3Var);
                l4Var.c();
                this.f28720g = System.currentTimeMillis();
                return;
            }
            j4 j4Var = l4Var.f27753b;
            if (!j4Var.f()) {
                return;
            }
            j4Var.G = true;
            j4Var.f27590x.start();
            j4Var.D.setEmpty();
        }
    }
}
