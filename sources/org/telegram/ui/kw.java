package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class kw implements ViewTreeObserver.OnPreDrawListener {
    public final int f47321a;
    public final Object f47322b;
    public final Object f47323c;

    public kw(int i7, Object obj, Object obj2) {
        this.f47321a = i7;
        this.f47323c = obj;
        this.f47322b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f47321a) {
            case 0:
                ((dv) this.f47323c).f45146a.f51551e0[0].f50839a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.f47322b, 100L);
                return false;
            case 1:
                c40 c40Var = (c40) this.f47323c;
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.f44575h4 = null;
                c40Var.R3.j((org.telegram.messenger.s3) this.f47322b);
                org.telegram.messenger.g0.b4(c40Var.f44559d4);
                c40Var.f28615b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f47322b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f47323c;
                org.telegram.ui.Components.kb kbVar = hVar.W;
                if (kbVar != null) {
                    int[] iArr = wh.h.f57803d0;
                    kbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.kb kbVar2 = hVar.W;
                    if (kbVar2.top) {
                        f10 = kbVar2.getTopOffset();
                    } else {
                        f10 = -kbVar2.getBottomOffset();
                    }
                    hVar.f57806a.getLocationInWindow(iArr);
                    hVar.X = (hVar.W.f35251a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.W.f35251a.getLeft();
                    hVar.Y = (hVar.W.f35251a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.W.f35251a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
