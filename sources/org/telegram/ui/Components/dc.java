package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dc extends GestureDetector.SimpleOnGestureListener {
    public final sb f23312a;
    public final gb f23313b;

    public dc(gb gbVar, sb sbVar) {
        this.f23313b = gbVar;
        this.f23312a = sbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        gb gbVar = this.f23313b;
        if (gbVar.f24164s) {
            return false;
        }
        sb sbVar = this.f23312a;
        gbVar.v = sb.access$1400(sbVar, true);
        gbVar.f24165w = sb.access$1400(sbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        gb gbVar = this.f23313b;
        if ((f7 < 0.0f && gbVar.v) || (f7 > 0.0f && gbVar.f24165w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        sb sbVar = this.f23312a;
        o1.k kVar = new o1.k(sbVar, o1.h.f15343m, signum * sbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final dc f22701b;

                {
                    this.f22701b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f22701b.f23313b.f24167y.b();
                            return;
                        default:
                            this.f22701b.f23313b.f24167y.b();
                            return;
                    }
                }
            });
            kVar.b(new i7(sbVar, 2));
        }
        kVar.f15361u.a(1.0f);
        kVar.f15361u.b(100.0f);
        kVar.f15351a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(sbVar, o1.h.f15350t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final dc f22701b;

                {
                    this.f22701b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f22701b.f23313b.f24167y.b();
                            return;
                        default:
                            this.f22701b.f23313b.f24167y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f15361u.a(1.0f);
            kVar.f15361u.b(10.0f);
            kVar.f15351a = f7;
            kVar2.f();
        }
        gbVar.f24164s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gb gbVar = this.f23313b;
        float f11 = gbVar.h + f7;
        gbVar.h = f11;
        float f12 = gbVar.f24162n + f10;
        gbVar.f24162n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            gbVar.f24163r = true;
        }
        if (!gbVar.d) {
            return false;
        }
        float f13 = gbVar.f24161f - f7;
        gbVar.f24161f = f13;
        sb sbVar = this.f23312a;
        sbVar.setTranslationX(f13);
        float f14 = gbVar.f24161f;
        if (f14 == 0.0f || ((f14 < 0.0f && gbVar.v) || (f14 > 0.0f && gbVar.f24165w))) {
            sbVar.setAlpha(1.0f - (Math.abs(f14) / sbVar.getWidth()));
        }
        return true;
    }
}
