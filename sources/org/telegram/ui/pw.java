package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class pw implements ViewTreeObserver.OnPreDrawListener {
    public final int f50997a;
    public final Object f50998b;
    public final Object f50999c;

    public pw(int i7, Object obj, Object obj2) {
        this.f50997a = i7;
        this.f50999c = obj;
        this.f50998b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f50997a) {
            case 0:
                ((hv) this.f50999c).f48533a.f46722f0[0].f46325a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.h3((bi.c4) this.f50998b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.f50999c;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f47533p4 = null;
                f40Var.Z3.j((org.telegram.messenger.u3) this.f50998b);
                org.telegram.messenger.g0.Z3(f40Var.f47515l4);
                f40Var.f30176b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f50998b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f50999c;
                org.telegram.ui.Components.ob obVar = hVar.X;
                if (obVar != null) {
                    int[] iArr = wh.h.f59957e0;
                    obVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.X.getTranslationY();
                    org.telegram.ui.Components.ob obVar2 = hVar.X;
                    if (obVar2.top) {
                        f10 = obVar2.getTopOffset();
                    } else {
                        f10 = -obVar2.getBottomOffset();
                    }
                    hVar.f59960a.getLocationInWindow(iArr);
                    hVar.Y = (hVar.X.f38157a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.X.f38157a.getLeft();
                    hVar.Z = (hVar.X.f38157a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.X.f38157a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
