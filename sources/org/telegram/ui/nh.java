package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class nh implements ViewTreeObserver.OnPreDrawListener {
    public final int f48209a = 0;
    public boolean f48210b;
    public final Object f48211c;
    public final Object d;

    public nh(f40 f40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = f40Var;
        this.f48211c = s3Var;
        this.f48210b = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f48209a) {
            case 0:
                cn cnVar = (cn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f48211c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                wi wiVar = cnVar.f44601o1;
                if (wiVar != null) {
                    wiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f48210b) {
                    return true;
                }
                this.f48210b = true;
                return cnVar.L8();
            default:
                f40 f40Var = (f40) this.d;
                n30 n30Var = f40Var.K1;
                n30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f45544k4 = null;
                c20 c20Var = f40Var.U3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f48211c;
                c20Var.j(s3Var);
                if (f40Var.f45551m2) {
                    f40Var.f45551m2 = false;
                    f40Var.Q0(true);
                    if (this.f48210b && s3Var != null) {
                        n30Var.v0(0);
                    }
                    f40Var.f45551m2 = true;
                } else {
                    f40Var.Q0(true);
                }
                f40Var.f28672b.requestLayout();
                return false;
        }
    }

    public nh(cn cnVar, ViewTreeObserver viewTreeObserver) {
        this.d = cnVar;
        this.f48211c = viewTreeObserver;
    }
}
