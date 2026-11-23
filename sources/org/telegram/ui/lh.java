package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f49618a = 0;
    public boolean f49619b;
    public final Object f49620c;
    public final Object d;

    public lh(f40 f40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = f40Var;
        this.f49620c = u3Var;
        this.f49619b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f49618a) {
            case 0:
                bn bnVar = (bn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f49620c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                vi viVar = bnVar.f46147p1;
                if (viVar != null) {
                    viVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f49619b) {
                    return true;
                }
                this.f49619b = true;
                return bnVar.M8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.L1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47533p4 = null;
                b20 b20Var = f40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.f49620c;
                b20Var.j(u3Var);
                if (f40Var.f47522n2) {
                    f40Var.f47522n2 = false;
                    f40Var.R0(true);
                    if (this.f49619b && u3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.f47522n2 = true;
                } else {
                    f40Var.R0(true);
                }
                f40Var.f30176b.requestLayout();
                return false;
        }
    }

    public lh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.f49620c = viewTreeObserver;
    }
}
