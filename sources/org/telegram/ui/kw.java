package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class kw implements ViewTreeObserver.OnPreDrawListener {
    public final int f47325a;
    public final Object f47326b;
    public final Object f47327c;

    public kw(int i7, Object obj, Object obj2) {
        this.f47325a = i7;
        this.f47327c = obj;
        this.f47326b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f47325a) {
            case 0:
                ((dv) this.f47327c).f45140a.f51556e0[0].f50782a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.f47326b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.f47327c;
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f44577h4 = null;
                c40Var.R3.j((org.telegram.messenger.s3) this.f47326b);
                org.telegram.messenger.g0.b4(c40Var.f44561d4);
                c40Var.f28619b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f47326b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f47327c;
                org.telegram.ui.Components.kb kbVar = hVar.W;
                if (kbVar != null) {
                    int[] iArr = wh.h.f57895d0;
                    kbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.kb kbVar2 = hVar.W;
                    if (kbVar2.top) {
                        f10 = kbVar2.getTopOffset();
                    } else {
                        f10 = -kbVar2.getBottomOffset();
                    }
                    hVar.f57898a.getLocationInWindow(iArr);
                    hVar.X = (hVar.W.f35268a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.W.f35268a.getLeft();
                    hVar.Y = (hVar.W.f35268a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.W.f35268a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
