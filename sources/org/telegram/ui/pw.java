package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class pw implements ViewTreeObserver.OnPreDrawListener {
    public final int f51027a;
    public final Object f51028b;
    public final Object f51029c;

    public pw(int i7, Object obj, Object obj2) {
        this.f51027a = i7;
        this.f51029c = obj;
        this.f51028b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f51027a) {
            case 0:
                ((hv) this.f51029c).f48530a.f46683f0[0].f46307a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.y3) this.f51028b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.f51029c;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47505p4 = null;
                f40Var.Z3.j((org.telegram.messenger.u3) this.f51028b);
                org.telegram.messenger.g0.Z3(f40Var.f47487l4);
                f40Var.f30192b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f51028b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f51029c;
                org.telegram.ui.Components.ob obVar = hVar.X;
                if (obVar != null) {
                    int[] iArr = wh.h.f59911e0;
                    obVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ob obVar2 = hVar.X;
                    if (obVar2.top) {
                        f10 = obVar2.getTopOffset();
                    } else {
                        f10 = -obVar2.getBottomOffset();
                    }
                    hVar.f59914a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f38054a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f38054a.getLeft();
                    hVar.Z = (hVar.X.f38054a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f38054a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
