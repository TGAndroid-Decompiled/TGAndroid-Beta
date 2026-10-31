package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class gi implements ViewTreeObserver.OnPreDrawListener {
    public final int f37556a = 1;
    public boolean f37557b;
    public final Object f37558c;
    public final Object d;

    public gi(b50 b50Var, org.telegram.messenger.v3 v3Var, boolean z10) {
        this.d = b50Var;
        this.f37558c = v3Var;
        this.f37557b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f37556a) {
            case 0:
                un unVar = (un) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f37558c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qj qjVar = unVar.f42355o1;
                if (qjVar != null) {
                    qjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f37557b) {
                    return true;
                }
                this.f37557b = true;
                return unVar.D8();
            default:
                b50 b50Var = (b50) this.d;
                i40 i40Var = b50Var.H1;
                i40Var.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.f36024h4 = null;
                y20 y20Var = b50Var.R3;
                org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) this.f37558c;
                y20Var.j(v3Var);
                if (b50Var.f36032j2) {
                    b50Var.f36032j2 = false;
                    b50Var.Q0(true);
                    if (this.f37557b && v3Var != null) {
                        i40Var.v0(0);
                    }
                    b50Var.f36032j2 = true;
                } else {
                    b50Var.Q0(true);
                }
                b50Var.f21586b.requestLayout();
                return false;
        }
    }

    public gi(un unVar, ViewTreeObserver viewTreeObserver) {
        this.d = unVar;
        this.f37558c = viewTreeObserver;
    }
}
