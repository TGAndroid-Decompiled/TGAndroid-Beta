package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class gi implements ViewTreeObserver.OnPreDrawListener {
    public final int f37511a = 1;
    public boolean f37512b;
    public final Object f37513c;
    public final Object d;

    public gi(a50 a50Var, org.telegram.messenger.v3 v3Var, boolean z10) {
        this.d = a50Var;
        this.f37513c = v3Var;
        this.f37512b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f37511a) {
            case 0:
                un unVar = (un) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f37513c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qj qjVar = unVar.f42166o1;
                if (qjVar != null) {
                    qjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f37512b) {
                    return true;
                }
                this.f37512b = true;
                return unVar.H8();
            default:
                a50 a50Var = (a50) this.d;
                h40 h40Var = a50Var.H1;
                h40Var.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.f35608h4 = null;
                x20 x20Var = a50Var.R3;
                org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) this.f37513c;
                x20Var.j(v3Var);
                if (a50Var.f35616j2) {
                    a50Var.f35616j2 = false;
                    a50Var.Q0(true);
                    if (this.f37512b && v3Var != null) {
                        h40Var.v0(0);
                    }
                    a50Var.f35616j2 = true;
                } else {
                    a50Var.Q0(true);
                }
                a50Var.f21587b.requestLayout();
                return false;
        }
    }

    public gi(un unVar, ViewTreeObserver viewTreeObserver) {
        this.d = unVar;
        this.f37513c = viewTreeObserver;
    }
}
