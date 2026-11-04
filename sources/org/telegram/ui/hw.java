package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class hw implements ViewTreeObserver.OnPreDrawListener {
    public final int f45996a;
    public final Object f45997b;
    public final Object f45998c;

    public hw(int i3, Object obj, Object obj2) {
        this.f45996a = i3;
        this.f45998c = obj;
        this.f45997b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f45996a) {
            case 0:
                ((av) this.f45998c).f43848a.f50230f0[0].f49897a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((ci.e3) this.f45997b, 100L);
                return false;
            case 1:
                x30 x30Var = (x30) this.f45998c;
                x30Var.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.f51748i4 = null;
                x30Var.S3.j((org.telegram.messenger.s3) this.f45997b);
                org.telegram.messenger.g0.b4(x30Var.f51733e4);
                x30Var.f28586b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f45997b).removeOnPreDrawListener(this);
                xh.h hVar = (xh.h) this.f45998c;
                org.telegram.ui.Components.ib ibVar = hVar.X;
                if (ibVar != null) {
                    int[] iArr = xh.h.f58846e0;
                    ibVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ib ibVar2 = hVar.X;
                    if (ibVar2.top) {
                        f10 = ibVar2.getTopOffset();
                    } else {
                        f10 = -ibVar2.getBottomOffset();
                    }
                    hVar.f58849a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f34650a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f34650a.getLeft();
                    hVar.Z = (hVar.X.f34650a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f34650a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
