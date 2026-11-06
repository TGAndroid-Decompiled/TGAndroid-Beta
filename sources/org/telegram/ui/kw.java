package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class kw implements ViewTreeObserver.OnPreDrawListener {
    public final int f47294a;
    public final Object f47295b;
    public final Object f47296c;

    public kw(int i7, Object obj, Object obj2) {
        this.f47294a = i7;
        this.f47296c = obj;
        this.f47295b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f47294a) {
            case 0:
                ((dv) this.f47296c).f45118a.f51534e0[0].f50833a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.f47295b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.f47296c;
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f44554h4 = null;
                c40Var.R3.j((org.telegram.messenger.s3) this.f47295b);
                org.telegram.messenger.g0.b4(c40Var.f44538d4);
                c40Var.f28615b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f47295b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f47296c;
                org.telegram.ui.Components.kb kbVar = hVar.W;
                if (kbVar != null) {
                    int[] iArr = wh.h.f57778d0;
                    kbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.kb kbVar2 = hVar.W;
                    if (kbVar2.top) {
                        f10 = kbVar2.getTopOffset();
                    } else {
                        f10 = -kbVar2.getBottomOffset();
                    }
                    hVar.f57781a.getLocationInWindow(iArr);
                    hVar.X = (hVar.W.f35248a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.W.f35248a.getLeft();
                    hVar.Y = (hVar.W.f35248a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.W.f35248a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
