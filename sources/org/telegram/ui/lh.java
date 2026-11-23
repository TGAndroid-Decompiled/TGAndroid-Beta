package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class lh implements ViewTreeObserver.OnPreDrawListener {
    public final int f49759a = 0;
    public boolean f49760b;
    public final Object f49761c;
    public final Object d;

    public lh(e40 e40Var, org.telegram.messenger.u3 u3Var, boolean z10) {
        this.d = e40Var;
        this.f49761c = u3Var;
        this.f49760b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f49759a) {
            case 0:
                bn bnVar = (bn) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f49761c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                vi viVar = bnVar.f46315p1;
                if (viVar != null) {
                    viVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f49760b) {
                    return true;
                }
                this.f49760b = true;
                return bnVar.M8();
            default:
                e40 e40Var = (e40) this.d;
                m30 m30Var = e40Var.L1;
                m30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.f47383p4 = null;
                a20 a20Var = e40Var.Z3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.f49761c;
                a20Var.j(u3Var);
                if (e40Var.f47372n2) {
                    e40Var.f47372n2 = false;
                    e40Var.R0(true);
                    if (this.f49760b && u3Var != null) {
                        m30Var.v0(0);
                    }
                    e40Var.f47372n2 = true;
                } else {
                    e40Var.R0(true);
                }
                e40Var.f30226b.requestLayout();
                return false;
        }
    }

    public lh(bn bnVar, ViewTreeObserver viewTreeObserver) {
        this.d = bnVar;
        this.f49761c = viewTreeObserver;
    }
}
