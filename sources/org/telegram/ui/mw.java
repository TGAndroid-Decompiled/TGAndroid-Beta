package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class mw implements ViewTreeObserver.OnPreDrawListener {
    public final int f49324a;
    public final Object f49325b;
    public final Object f49326c;

    public mw(int i7, Object obj, Object obj2) {
        this.f49324a = i7;
        this.f49326c = obj;
        this.f49325b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f49324a) {
            case 0:
                ((ev) this.f49326c).f46925a.f53673f0[0].f53331a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((di.x2) this.f49325b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.f49326c;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f45958p4 = null;
                c40Var.Z3.j((org.telegram.messenger.s3) this.f49325b);
                org.telegram.messenger.g0.a4(c40Var.f45940l4);
                c40Var.f29682b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f49325b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f49326c;
                org.telegram.ui.Components.fb fbVar = hVar.X;
                if (fbVar != null) {
                    int[] iArr = wh.h.f59347e0;
                    fbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.fb fbVar2 = hVar.X;
                    if (fbVar2.top) {
                        f10 = fbVar2.getTopOffset();
                    } else {
                        f10 = -fbVar2.getBottomOffset();
                    }
                    hVar.f59350a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f34551a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f34551a.getLeft();
                    hVar.Z = (hVar.X.f34551a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f34551a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
