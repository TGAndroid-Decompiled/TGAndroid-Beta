package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class ow implements ViewTreeObserver.OnPreDrawListener {
    public final int f50775a;
    public final Object f50776b;
    public final Object f50777c;

    public ow(int i7, Object obj, Object obj2) {
        this.f50775a = i7;
        this.f50777c = obj;
        this.f50776b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f50775a) {
            case 0:
                ((gv) this.f50777c).f48363a.f46549f0[0].f45822a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.e4) this.f50776b, 100L);
                return false;
            case 1:
                e40 e40Var = (e40) this.f50777c;
                e40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.f47383p4 = null;
                e40Var.Z3.j((org.telegram.messenger.u3) this.f50776b);
                org.telegram.messenger.g0.Z3(e40Var.f47365l4);
                e40Var.f30226b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f50776b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f50777c;
                org.telegram.ui.Components.nb nbVar = hVar.X;
                if (nbVar != null) {
                    int[] iArr = wh.h.f60040e0;
                    nbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.nb nbVar2 = hVar.X;
                    if (nbVar2.top) {
                        f10 = nbVar2.getTopOffset();
                    } else {
                        f10 = -nbVar2.getBottomOffset();
                    }
                    hVar.f60043a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f37751a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f37751a.getLeft();
                    hVar.Z = (hVar.X.f37751a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f37751a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
