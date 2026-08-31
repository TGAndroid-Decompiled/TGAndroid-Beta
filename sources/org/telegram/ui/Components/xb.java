package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xb extends GestureDetector.SimpleOnGestureListener {
    public final nb f33015a;
    public final za f33016b;

    public xb(za zaVar, nb nbVar) {
        this.f33016b = zaVar;
        this.f33015a = nbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        za zaVar = this.f33016b;
        if (zaVar.f33846s) {
            return false;
        }
        nb nbVar = this.f33015a;
        zaVar.v = nb.access$1400(nbVar, true);
        zaVar.f33847w = nb.access$1400(nbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z4 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        za zaVar = this.f33016b;
        if ((f10 < 0.0f && zaVar.v) || (f10 > 0.0f && zaVar.f33847w)) {
            z4 = true;
        }
        float signum = Math.signum(f10);
        nb nbVar = this.f33015a;
        o1.j jVar = new o1.j(nbVar, o1.h.f16318m, signum * nbVar.getWidth() * 2.0f);
        if (!z4) {
            jVar.a(new o1.f(this) {
                public final xb f31876b;

                {
                    this.f31876b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f31876b.f33016b.f33849y.b();
                            return;
                        default:
                            this.f31876b.f33016b.f33849y.b();
                            return;
                    }
                }
            });
            jVar.b(new f7(nbVar, 2));
        }
        jVar.f16336u.a(1.0f);
        jVar.f16336u.b(100.0f);
        jVar.f16326a = f10;
        jVar.f();
        if (z4) {
            o1.j jVar2 = new o1.j(nbVar, o1.h.f16325t, 0.0f);
            jVar2.a(new o1.f(this) {
                public final xb f31876b;

                {
                    this.f31876b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f31876b.f33016b.f33849y.b();
                            return;
                        default:
                            this.f31876b.f33016b.f33849y.b();
                            return;
                    }
                }
            });
            jVar2.b(new Object());
            jVar.f16336u.a(1.0f);
            jVar.f16336u.b(10.0f);
            jVar.f16326a = f10;
            jVar2.f();
        }
        zaVar.f33846s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        za zaVar = this.f33016b;
        float f12 = zaVar.h + f10;
        zaVar.h = f12;
        float f13 = zaVar.f33844n + f11;
        zaVar.f33844n = f13;
        if (Utilities.dist(0.0f, 0.0f, f12, f13) > AndroidUtilities.touchSlop) {
            zaVar.f33845r = true;
        }
        if (!zaVar.d) {
            return false;
        }
        float f14 = zaVar.f33843f - f10;
        zaVar.f33843f = f14;
        nb nbVar = this.f33015a;
        nbVar.setTranslationX(f14);
        float f15 = zaVar.f33843f;
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.v) || (f15 > 0.0f && zaVar.f33847w))) {
            nbVar.setAlpha(1.0f - (Math.abs(f15) / nbVar.getWidth()));
        }
        return true;
    }
}
