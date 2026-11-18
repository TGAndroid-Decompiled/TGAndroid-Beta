package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class kh implements ViewTreeObserver.OnPreDrawListener {
    public final int f49270a = 0;
    public boolean f49271b;
    public final Object f49272c;
    public final Object d;

    public kh(f40 f40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = f40Var;
        this.f49272c = u3Var;
        this.f49271b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f49270a) {
            case 0:
                bn bnVar = (bn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f49272c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                vi viVar = bnVar.f46129p1;
                if (viVar != null) {
                    viVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f49271b) {
                    return true;
                }
                this.f49271b = true;
                return bnVar.M8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.L1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47505p4 = null;
                b20 b20Var = f40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.f49272c;
                b20Var.j(u3Var);
                if (f40Var.f47494n2) {
                    f40Var.f47494n2 = false;
                    f40Var.R0(true);
                    if (this.f49271b && u3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.f47494n2 = true;
                } else {
                    f40Var.R0(true);
                }
                f40Var.f30192b.requestLayout();
                return false;
        }
    }

    public kh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.f49272c = viewTreeObserver;
    }
}
