package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f47544a = 0;
    public boolean f47545b;
    public final Object f47546c;
    public final Object d;

    public lh(c40 c40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = c40Var;
        this.f47546c = s3Var;
        this.f47545b = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f47544a) {
            case 0:
                an anVar = (an) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f47546c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                ui uiVar = anVar.f43898o1;
                if (uiVar != null) {
                    uiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f47545b) {
                    return true;
                }
                this.f47545b = true;
                return anVar.K8();
            default:
                c40 c40Var = (c40) this.d;
                k30 k30Var = c40Var.H1;
                k30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f44575h4 = null;
                z10 z10Var = c40Var.R3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f47546c;
                z10Var.j(s3Var);
                if (c40Var.f44583j2) {
                    c40Var.f44583j2 = false;
                    c40Var.Q0(true);
                    if (this.f47545b && s3Var != null) {
                        k30Var.v0(0);
                    }
                    c40Var.f44583j2 = true;
                } else {
                    c40Var.Q0(true);
                }
                c40Var.f28615b.requestLayout();
                return false;
        }
    }

    public lh(an anVar, ViewTreeObserver viewTreeObserver) {
        this.d = anVar;
        this.f47546c = viewTreeObserver;
    }
}
