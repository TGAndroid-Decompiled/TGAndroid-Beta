package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class mw implements ViewTreeObserver.OnPreDrawListener {
    public final int f49323a;
    public final Object f49324b;
    public final Object f49325c;

    public mw(int i7, Object obj, Object obj2) {
        this.f49323a = i7;
        this.f49325c = obj;
        this.f49324b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f49323a) {
            case 0:
                ((ev) this.f49325c).f46909a.f53638f0[0].f53335a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((di.x2) this.f49324b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.f49325c;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f45947p4 = null;
                c40Var.Z3.j((org.telegram.messenger.s3) this.f49324b);
                org.telegram.messenger.g0.a4(c40Var.f45929l4);
                c40Var.f29682b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f49324b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f49325c;
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
                    hVar.Y = (hVar.X.f34555a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f34555a.getLeft();
                    hVar.Z = (hVar.X.f34555a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f34555a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
