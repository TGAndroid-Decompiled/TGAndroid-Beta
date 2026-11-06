package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f47517a = 0;
    public boolean f47518b;
    public final Object f47519c;
    public final Object d;

    public lh(c40 c40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = c40Var;
        this.f47519c = s3Var;
        this.f47518b = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f47517a) {
            case 0:
                an anVar = (an) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f47519c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                ui uiVar = anVar.f43873o1;
                if (uiVar != null) {
                    uiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f47518b) {
                    return true;
                }
                this.f47518b = true;
                return anVar.K8();
            default:
                c40 c40Var = (c40) this.d;
                k30 k30Var = c40Var.H1;
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f44554h4 = null;
                z10 z10Var = c40Var.R3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f47519c;
                z10Var.j(s3Var);
                if (c40Var.f44562j2) {
                    c40Var.f44562j2 = false;
                    c40Var.Q0(true);
                    if (this.f47518b && s3Var != null) {
                        k30Var.v0(0);
                    }
                    c40Var.f44562j2 = true;
                } else {
                    c40Var.Q0(true);
                }
                c40Var.f28615b.requestLayout();
                return false;
        }
    }

    public lh(an anVar, ViewTreeObserver viewTreeObserver) {
        this.d = anVar;
        this.f47519c = viewTreeObserver;
    }
}
