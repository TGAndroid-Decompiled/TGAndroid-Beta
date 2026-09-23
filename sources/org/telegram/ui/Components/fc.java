package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fc extends GestureDetector.SimpleOnGestureListener {
    public final ub f23934a;
    public final ib f23935b;

    public fc(ib ibVar, ub ubVar) {
        this.f23935b = ibVar;
        this.f23934a = ubVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ib ibVar = this.f23935b;
        if (ibVar.f24933s) {
            return false;
        }
        ub ubVar = this.f23934a;
        ibVar.v = ub.access$1400(ubVar, true);
        ibVar.f24934w = ub.access$1400(ubVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        ib ibVar = this.f23935b;
        if ((f7 < 0.0f && ibVar.v) || (f7 > 0.0f && ibVar.f24934w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        ub ubVar = this.f23934a;
        o1.k kVar = new o1.k(ubVar, o1.h.f15308m, signum * ubVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final fc f23368b;

                {
                    this.f23368b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23368b.f23935b.f24936y.b();
                            return;
                        default:
                            this.f23368b.f23935b.f24936y.b();
                            return;
                    }
                }
            });
            kVar.b(new k7(ubVar, 2));
        }
        kVar.f15326u.a(1.0f);
        kVar.f15326u.b(100.0f);
        kVar.f15316a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(ubVar, o1.h.f15315t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final fc f23368b;

                {
                    this.f23368b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23368b.f23935b.f24936y.b();
                            return;
                        default:
                            this.f23368b.f23935b.f24936y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f15326u.a(1.0f);
            kVar.f15326u.b(10.0f);
            kVar.f15316a = f7;
            kVar2.f();
        }
        ibVar.f24933s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ib ibVar = this.f23935b;
        float f11 = ibVar.h + f7;
        ibVar.h = f11;
        float f12 = ibVar.f24931n + f10;
        ibVar.f24931n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ibVar.f24932r = true;
        }
        if (!ibVar.d) {
            return false;
        }
        float f13 = ibVar.f24930f - f7;
        ibVar.f24930f = f13;
        ub ubVar = this.f23934a;
        ubVar.setTranslationX(f13);
        float f14 = ibVar.f24930f;
        if (f14 == 0.0f || ((f14 < 0.0f && ibVar.v) || (f14 > 0.0f && ibVar.f24934w))) {
            ubVar.setAlpha(1.0f - (Math.abs(f14) / ubVar.getWidth()));
        }
        return true;
    }
}
