package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f48990a = 0;
    public boolean f48991b;
    public final Object f48992c;
    public final Object d;

    public lh(c40 c40Var, org.telegram.messenger.s3 s3Var, boolean z10) {
        this.d = c40Var;
        this.f48992c = s3Var;
        this.f48991b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f48990a) {
            case 0:
                an anVar = (an) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f48992c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                ui uiVar = anVar.f45313p1;
                if (uiVar != null) {
                    uiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f48991b) {
                    return true;
                }
                this.f48991b = true;
                return anVar.M8();
            default:
                c40 c40Var = (c40) this.d;
                k30 k30Var = c40Var.L1;
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f45947p4 = null;
                y10 y10Var = c40Var.Z3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f48992c;
                y10Var.j(s3Var);
                if (c40Var.f45936n2) {
                    c40Var.f45936n2 = false;
                    c40Var.Q0(true);
                    if (this.f48991b && s3Var != null) {
                        k30Var.v0(0);
                    }
                    c40Var.f45936n2 = true;
                } else {
                    c40Var.Q0(true);
                }
                c40Var.f29682b.requestLayout();
                return false;
        }
    }

    public lh(an anVar, ViewTreeObserver viewTreeObserver) {
        this.d = anVar;
        this.f48992c = viewTreeObserver;
    }
}
