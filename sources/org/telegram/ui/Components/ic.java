package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ic extends GestureDetector.SimpleOnGestureListener {
    public final xb f27345a;
    public final lb f27346b;

    public ic(lb lbVar, xb xbVar) {
        this.f27346b = lbVar;
        this.f27345a = xbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        lb lbVar = this.f27346b;
        if (lbVar.f28413s) {
            return false;
        }
        xb xbVar = this.f27345a;
        lbVar.v = xb.access$1400(xbVar, true);
        lbVar.f28414w = xb.access$1400(xbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        lb lbVar = this.f27346b;
        if ((i10 < 0 && lbVar.v) || (f7 > 0.0f && lbVar.f28414w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        xb xbVar = this.f27345a;
        o1.k kVar = new o1.k(xbVar, o1.h.f16919m, signum * xbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final ic f26664b;

                {
                    this.f26664b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26664b.f27346b.f28416y.b();
                            return;
                        default:
                            this.f26664b.f27346b.f28416y.b();
                            return;
                    }
                }
            });
            kVar.b(new m7(xbVar, 2));
        }
        kVar.f16938u.a(1.0f);
        kVar.f16938u.b(100.0f);
        kVar.f16927a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(xbVar, o1.h.f16926t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final ic f26664b;

                {
                    this.f26664b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26664b.f27346b.f28416y.b();
                            return;
                        default:
                            this.f26664b.f27346b.f28416y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f16938u.a(1.0f);
            kVar.f16938u.b(10.0f);
            kVar.f16927a = f7;
            kVar2.h();
        }
        lbVar.f28413s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        lb lbVar = this.f27346b;
        float f11 = lbVar.h + f7;
        lbVar.h = f11;
        float f12 = lbVar.f28411n + f10;
        lbVar.f28411n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            lbVar.f28412r = true;
        }
        if (!lbVar.d) {
            return false;
        }
        float f13 = lbVar.f28410f - f7;
        lbVar.f28410f = f13;
        xb xbVar = this.f27345a;
        xbVar.setTranslationX(f13);
        float f14 = lbVar.f28410f;
        if (f14 == 0.0f || ((f14 < 0.0f && lbVar.v) || (f14 > 0.0f && lbVar.f28414w))) {
            xbVar.setAlpha(1.0f - (Math.abs(f14) / xbVar.getWidth()));
        }
        return true;
    }
}
