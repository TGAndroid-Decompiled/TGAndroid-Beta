package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dc extends GestureDetector.SimpleOnGestureListener {
    public final sb f23281a;
    public final gb f23282b;

    public dc(gb gbVar, sb sbVar) {
        this.f23282b = gbVar;
        this.f23281a = sbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        gb gbVar = this.f23282b;
        if (gbVar.f24289s) {
            return false;
        }
        sb sbVar = this.f23281a;
        gbVar.v = sb.access$1400(sbVar, true);
        gbVar.f24290w = sb.access$1400(sbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        gb gbVar = this.f23282b;
        if ((f7 < 0.0f && gbVar.v) || (f7 > 0.0f && gbVar.f24290w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        sb sbVar = this.f23281a;
        o1.k kVar = new o1.k(sbVar, o1.h.f15331m, signum * sbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final dc f22748b;

                {
                    this.f22748b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f22748b.f23282b.f24292y.b();
                            return;
                        default:
                            this.f22748b.f23282b.f24292y.b();
                            return;
                    }
                }
            });
            kVar.b(new i7(sbVar, 2));
        }
        kVar.f15349u.a(1.0f);
        kVar.f15349u.b(100.0f);
        kVar.f15339a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(sbVar, o1.h.f15338t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final dc f22748b;

                {
                    this.f22748b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f22748b.f23282b.f24292y.b();
                            return;
                        default:
                            this.f22748b.f23282b.f24292y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f15349u.a(1.0f);
            kVar.f15349u.b(10.0f);
            kVar.f15339a = f7;
            kVar2.f();
        }
        gbVar.f24289s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gb gbVar = this.f23282b;
        float f11 = gbVar.h + f7;
        gbVar.h = f11;
        float f12 = gbVar.f24287n + f10;
        gbVar.f24287n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            gbVar.f24288r = true;
        }
        if (!gbVar.d) {
            return false;
        }
        float f13 = gbVar.f24286f - f7;
        gbVar.f24286f = f13;
        sb sbVar = this.f23281a;
        sbVar.setTranslationX(f13);
        float f14 = gbVar.f24286f;
        if (f14 == 0.0f || ((f14 < 0.0f && gbVar.v) || (f14 > 0.0f && gbVar.f24290w))) {
            sbVar.setAlpha(1.0f - (Math.abs(f14) / sbVar.getWidth()));
        }
        return true;
    }
}
