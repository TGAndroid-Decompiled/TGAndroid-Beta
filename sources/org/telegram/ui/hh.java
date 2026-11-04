package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class hh implements ViewTreeObserver.OnPreDrawListener {
    public final int f45921a = 0;
    public boolean f45922b;
    public final Object f45923c;
    public final Object d;

    public hh(x30 x30Var, org.telegram.messenger.s3 s3Var, boolean z10) {
        this.d = x30Var;
        this.f45923c = s3Var;
        this.f45922b = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f45921a) {
            case 0:
                wm wmVar = (wm) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f45923c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qi qiVar = wmVar.f51433p1;
                if (qiVar != null) {
                    qiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.f45922b) {
                    return true;
                }
                this.f45922b = true;
                return wmVar.K8();
            default:
                x30 x30Var = (x30) this.d;
                f30 f30Var = x30Var.I1;
                f30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.f51748i4 = null;
                u10 u10Var = x30Var.S3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.f45923c;
                u10Var.j(s3Var);
                if (x30Var.f51755k2) {
                    x30Var.f51755k2 = false;
                    x30Var.Q0(true);
                    if (this.f45922b && s3Var != null) {
                        f30Var.v0(0);
                    }
                    x30Var.f51755k2 = true;
                } else {
                    x30Var.Q0(true);
                }
                x30Var.f28586b.requestLayout();
                return false;
        }
    }

    public hh(wm wmVar, ViewTreeObserver viewTreeObserver) {
        this.d = wmVar;
        this.f45923c = viewTreeObserver;
    }
}
