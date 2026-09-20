package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ec extends GestureDetector.SimpleOnGestureListener {
    public final tb f23821a;
    public final hb f23822b;

    public ec(hb hbVar, tb tbVar) {
        this.f23822b = hbVar;
        this.f23821a = tbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        hb hbVar = this.f23822b;
        if (hbVar.f24597s) {
            return false;
        }
        tb tbVar = this.f23821a;
        hbVar.v = tb.access$1400(tbVar, true);
        hbVar.f24598w = tb.access$1400(tbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        hb hbVar = this.f23822b;
        if ((f7 < 0.0f && hbVar.v) || (f7 > 0.0f && hbVar.f24598w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        tb tbVar = this.f23821a;
        o1.k kVar = new o1.k(tbVar, o1.h.f15504m, signum * tbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final ec f23231b;

                {
                    this.f23231b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23231b.f23822b.f24600y.b();
                            return;
                        default:
                            this.f23231b.f23822b.f24600y.b();
                            return;
                    }
                }
            });
            kVar.b(new j7(tbVar, 2));
        }
        kVar.f15522u.a(1.0f);
        kVar.f15522u.b(100.0f);
        kVar.f15512a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(tbVar, o1.h.f15511t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final ec f23231b;

                {
                    this.f23231b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23231b.f23822b.f24600y.b();
                            return;
                        default:
                            this.f23231b.f23822b.f24600y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f15522u.a(1.0f);
            kVar.f15522u.b(10.0f);
            kVar.f15512a = f7;
            kVar2.f();
        }
        hbVar.f24597s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        hb hbVar = this.f23822b;
        float f11 = hbVar.h + f7;
        hbVar.h = f11;
        float f12 = hbVar.f24595n + f10;
        hbVar.f24595n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            hbVar.f24596r = true;
        }
        if (!hbVar.d) {
            return false;
        }
        float f13 = hbVar.f24594f - f7;
        hbVar.f24594f = f13;
        tb tbVar = this.f23821a;
        tbVar.setTranslationX(f13);
        float f14 = hbVar.f24594f;
        if (f14 == 0.0f || ((f14 < 0.0f && hbVar.v) || (f14 > 0.0f && hbVar.f24598w))) {
            tbVar.setAlpha(1.0f - (Math.abs(f14) / tbVar.getWidth()));
        }
        return true;
    }
}
