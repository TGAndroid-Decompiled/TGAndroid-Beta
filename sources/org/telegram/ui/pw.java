package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class pw implements ViewTreeObserver.OnPreDrawListener {
    public final int f50929a;
    public final Object f50930b;
    public final Object f50931c;

    public pw(int i7, Object obj, Object obj2) {
        this.f50929a = i7;
        this.f50931c = obj;
        this.f50930b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f50929a) {
            case 0:
                ((hv) this.f50931c).f48501a.f46683f0[0].f46318a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.e4) this.f50930b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.f50931c;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47495p4 = null;
                f40Var.Z3.j((org.telegram.messenger.u3) this.f50930b);
                org.telegram.messenger.g0.Z3(f40Var.f47477l4);
                f40Var.f30142b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f50930b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f50931c;
                org.telegram.ui.Components.ob obVar = hVar.X;
                if (obVar != null) {
                    int[] iArr = wh.h.f59922e0;
                    obVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ob obVar2 = hVar.X;
                    if (obVar2.top) {
                        f10 = obVar2.getTopOffset();
                    } else {
                        f10 = -obVar2.getBottomOffset();
                    }
                    hVar.f59925a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f38123a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f38123a.getLeft();
                    hVar.Z = (hVar.X.f38123a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f38123a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
