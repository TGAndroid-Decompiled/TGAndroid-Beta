package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class mw implements ViewTreeObserver.OnPreDrawListener {
    public final int f48009a;
    public final Object f48010b;
    public final Object f48011c;

    public mw(int i7, Object obj, Object obj2) {
        this.f48009a = i7;
        this.f48011c = obj;
        this.f48010b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f48009a) {
            case 0:
                ((fv) this.f48011c).f45795a.f52231e0[0].f51772a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.f48010b, 100L);
                return false;
            case 1:
                e40 e40Var = (e40) this.f48011c;
                e40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.f45217h4 = null;
                e40Var.R3.j((org.telegram.messenger.s3) this.f48010b);
                org.telegram.messenger.g0.b4(e40Var.f45201d4);
                e40Var.f28624b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f48010b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f48011c;
                org.telegram.ui.Components.kb kbVar = hVar.W;
                if (kbVar != null) {
                    int[] iArr = wh.h.f57907d0;
                    kbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.kb kbVar2 = hVar.W;
                    if (kbVar2.top) {
                        f10 = kbVar2.getTopOffset();
                    } else {
                        f10 = -kbVar2.getBottomOffset();
                    }
                    hVar.f57910a.getLocationInWindow(iArr);
                    hVar.X = (hVar.W.f35291a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.W.f35291a.getLeft();
                    hVar.Y = (hVar.W.f35291a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.W.f35291a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
