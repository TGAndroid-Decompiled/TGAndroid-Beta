package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f49614a = 0;
    public boolean f49615b;
    public final Object f49616c;
    public final Object d;

    public lh(f40 f40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = f40Var;
        this.f49616c = u3Var;
        this.f49615b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f49614a) {
            case 0:
                bn bnVar = (bn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f49616c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                vi viVar = bnVar.f46143p1;
                if (viVar != null) {
                    viVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f49615b) {
                    return true;
                }
                this.f49615b = true;
                return bnVar.M8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.L1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47529p4 = null;
                b20 b20Var = f40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.f49616c;
                b20Var.j(u3Var);
                if (f40Var.f47518n2) {
                    f40Var.f47518n2 = false;
                    f40Var.R0(true);
                    if (this.f49615b && u3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.f47518n2 = true;
                } else {
                    f40Var.R0(true);
                }
                f40Var.f30173b.requestLayout();
                return false;
        }
    }

    public lh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.f49616c = viewTreeObserver;
    }
}
