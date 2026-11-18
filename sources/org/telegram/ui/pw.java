package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class pw implements ViewTreeObserver.OnPreDrawListener {
    public final int f50948a;
    public final Object f50949b;
    public final Object f50950c;

    public pw(int i7, Object obj, Object obj2) {
        this.f50948a = i7;
        this.f50950c = obj;
        this.f50949b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f50948a) {
            case 0:
                ((hv) this.f50950c).f48486a.f46663f0[0].f46298a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.y3) this.f50949b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.f50950c;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47461p4 = null;
                f40Var.Z3.j((org.telegram.messenger.u3) this.f50949b);
                org.telegram.messenger.g0.Z3(f40Var.f47443l4);
                f40Var.f30190b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f50949b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f50950c;
                org.telegram.ui.Components.ob obVar = hVar.X;
                if (obVar != null) {
                    int[] iArr = wh.h.f59912e0;
                    obVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ob obVar2 = hVar.X;
                    if (obVar2.top) {
                        f10 = obVar2.getTopOffset();
                    } else {
                        f10 = -obVar2.getBottomOffset();
                    }
                    hVar.f59915a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f38054a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f38054a.getLeft();
                    hVar.Z = (hVar.X.f38054a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f38054a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
