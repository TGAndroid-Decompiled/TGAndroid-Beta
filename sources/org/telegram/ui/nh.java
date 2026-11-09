package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class nh implements ViewTreeObserver.OnPreDrawListener {
    public final int f48190a = 0;
    public boolean f48191b;
    public final Object f48192c;
    public final Object d;

    public nh(e40 e40Var, org.telegram.messenger.s3 s3Var, boolean z9) {
        this.d = e40Var;
        this.f48192c = s3Var;
        this.f48191b = z9;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f48190a) {
            case 0:
                cn cnVar = (cn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f48192c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                wi wiVar = cnVar.f44560o1;
                if (wiVar != null) {
                    wiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f48191b) {
                    return true;
                }
                this.f48191b = true;
                return cnVar.L8();
            default:
                e40 e40Var = (e40) this.d;
                m30 m30Var = e40Var.H1;
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.f45217h4 = null;
                b20 b20Var = e40Var.R3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f48192c;
                b20Var.j(s3Var);
                if (e40Var.f45225j2) {
                    e40Var.f45225j2 = false;
                    e40Var.Q0(true);
                    if (this.f48191b && s3Var != null) {
                        m30Var.v0(0);
                    }
                    e40Var.f45225j2 = true;
                } else {
                    e40Var.Q0(true);
                }
                e40Var.f28624b.requestLayout();
                return false;
        }
    }

    public nh(cn cnVar, ViewTreeObserver viewTreeObserver) {
        this.d = cnVar;
        this.f48192c = viewTreeObserver;
    }
}
