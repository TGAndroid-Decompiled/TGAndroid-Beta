package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fc extends GestureDetector.SimpleOnGestureListener {
    public final ub f28153a;
    public final ib f28154b;

    public fc(ib ibVar, ub ubVar) {
        this.f28154b = ibVar;
        this.f28153a = ubVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ib ibVar = this.f28154b;
        if (ibVar.f29261s) {
            return false;
        }
        ub ubVar = this.f28153a;
        ibVar.v = ub.access$1600(ubVar, true);
        ibVar.f29262w = ub.access$1600(ubVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        ib ibVar = this.f28154b;
        if ((i10 < 0 && ibVar.v) || (f7 > 0.0f && ibVar.f29262w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        ub ubVar = this.f28153a;
        o1.j jVar = new o1.j(ubVar, o1.h.f18952m, signum * ubVar.getWidth() * 2.0f);
        if (!z10) {
            jVar.a(new o1.f(this) {
                public final fc f27506b;

                {
                    this.f27506b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27506b.f28154b.f29264y.b();
                            return;
                        default:
                            this.f27506b.f28154b.f29264y.b();
                            return;
                    }
                }
            });
            jVar.b(new n7(ubVar, 2));
        }
        jVar.f18969u.a(1.0f);
        jVar.f18969u.b(100.0f);
        jVar.f18960a = f7;
        jVar.h();
        if (z10) {
            o1.j jVar2 = new o1.j(ubVar, o1.h.f18959t, 0.0f);
            jVar2.a(new o1.f(this) {
                public final fc f27506b;

                {
                    this.f27506b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27506b.f28154b.f29264y.b();
                            return;
                        default:
                            this.f27506b.f28154b.f29264y.b();
                            return;
                    }
                }
            });
            jVar2.b(new Object());
            jVar.f18969u.a(1.0f);
            jVar.f18969u.b(10.0f);
            jVar.f18960a = f7;
            jVar2.h();
        }
        ibVar.f29261s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ib ibVar = this.f28154b;
        float f11 = ibVar.h + f7;
        ibVar.h = f11;
        float f12 = ibVar.f29259n + f10;
        ibVar.f29259n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ibVar.f29260r = true;
        }
        if (!ibVar.d) {
            return false;
        }
        float f13 = ibVar.f29258f - f7;
        ibVar.f29258f = f13;
        ub ubVar = this.f28153a;
        ubVar.setTranslationX(f13);
        float f14 = ibVar.f29258f;
        if (f14 == 0.0f || ((f14 < 0.0f && ibVar.v) || (f14 > 0.0f && ibVar.f29262w))) {
            ubVar.setAlpha(1.0f - (Math.abs(f14) / ubVar.getWidth()));
        }
        return true;
    }
}
