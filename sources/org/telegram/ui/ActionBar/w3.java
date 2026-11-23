package org.telegram.ui.ActionBar;

import android.view.View;
public final class w3 {
    public final l4 f30220a;
    public boolean f30221b;
    public boolean f30222c;
    public boolean d;
    public boolean f30223e = true;
    public boolean f30224f;
    public long f30225g;

    public w3(l4 l4Var) {
        this.f30220a = l4Var;
    }

    public final void a() {
        if (this.f30224f) {
            boolean z10 = this.f30221b;
            l4 l4Var = this.f30220a;
            if (!z10 && !this.f30222c && !this.d && this.f30223e) {
                View view = l4Var.f29219a;
                z3 z3Var = l4Var.f29228l;
                view.removeOnLayoutChangeListener(z3Var);
                l4Var.f29219a.addOnLayoutChangeListener(z3Var);
                l4Var.c();
                this.f30225g = System.currentTimeMillis();
                return;
            }
            j4 j4Var = l4Var.f29220b;
            if (!j4Var.f()) {
                return;
            }
            j4Var.G = true;
            j4Var.f29070x.start();
            j4Var.D.setEmpty();
        }
    }
}
