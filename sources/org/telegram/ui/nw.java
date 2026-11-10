package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class nw implements ViewTreeObserver.OnPreDrawListener {
    public final int f48306a;
    public final Object f48307b;
    public final Object f48308c;

    public nw(int i7, Object obj, Object obj2) {
        this.f48306a = i7;
        this.f48308c = obj;
        this.f48307b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        switch (this.f48306a) {
            case 0:
                ((gv) this.f48308c).f46162a.f52577e0[0].f52125a.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.messenger.g0.i3((bi.r3) this.f48307b, 100L);
                return false;
            case 1:
                f40 f40Var = (f40) this.f48308c;
                f40Var.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.f45544k4 = null;
                f40Var.U3.j((org.telegram.messenger.s3) this.f48307b);
                org.telegram.messenger.g0.b4(f40Var.f45529g4);
                f40Var.f28672b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) this.f48307b).removeOnPreDrawListener(this);
                wh.h hVar = (wh.h) this.f48308c;
                org.telegram.ui.Components.jb jbVar = hVar.W;
                if (jbVar != null) {
                    int[] iArr = wh.h.f57911d0;
                    jbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.jb jbVar2 = hVar.W;
                    if (jbVar2.top) {
                        f10 = jbVar2.getTopOffset();
                    } else {
                        f10 = -jbVar2.getBottomOffset();
                    }
                    hVar.f57914a.getLocationInWindow(iArr);
                    hVar.X = (hVar.W.f34882a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + hVar.W.f34882a.getLeft();
                    hVar.Y = (hVar.W.f34882a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + hVar.W.f34882a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
