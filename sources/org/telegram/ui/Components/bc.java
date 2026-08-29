package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bc extends GestureDetector.SimpleOnGestureListener {
    public final rb f27023a;
    public final eb f27024b;

    public bc(eb ebVar, rb rbVar) {
        this.f27024b = ebVar;
        this.f27023a = rbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        eb ebVar = this.f27024b;
        if (ebVar.f27995s) {
            return false;
        }
        rb rbVar = this.f27023a;
        ebVar.v = rb.access$1400(rbVar, true);
        ebVar.f27996w = rb.access$1400(rbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        boolean z10 = false;
        if (Math.abs(f9) <= 2000.0f) {
            return false;
        }
        eb ebVar = this.f27024b;
        if ((f9 < 0.0f && ebVar.v) || (f9 > 0.0f && ebVar.f27996w)) {
            z10 = true;
        }
        float signum = Math.signum(f9);
        rb rbVar = this.f27023a;
        o1.k kVar = new o1.k(rbVar, o1.i.f19027m, signum * rbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.g(this) {
                public final bc f35301b;

                {
                    this.f35301b = this;
                }

                @Override
                public final void a(o1.i iVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f35301b.f27024b.f27998y.b();
                            return;
                        default:
                            this.f35301b.f27024b.f27998y.b();
                            return;
                    }
                }
            });
            kVar.b(new j7(rbVar, 2));
        }
        kVar.f19045u.a(1.0f);
        kVar.f19045u.b(100.0f);
        kVar.f19035a = f9;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(rbVar, o1.i.f19034t, 0.0f);
            kVar2.a(new o1.g(this) {
                public final bc f35301b;

                {
                    this.f35301b = this;
                }

                @Override
                public final void a(o1.i iVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f35301b.f27024b.f27998y.b();
                            return;
                        default:
                            this.f35301b.f27024b.f27998y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f19045u.a(1.0f);
            kVar.f19045u.b(10.0f);
            kVar.f19035a = f9;
            kVar2.f();
        }
        ebVar.f27995s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        eb ebVar = this.f27024b;
        float f11 = ebVar.h + f9;
        ebVar.h = f11;
        float f12 = ebVar.f27993n + f10;
        ebVar.f27993n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ebVar.f27994r = true;
        }
        if (!ebVar.d) {
            return false;
        }
        float f13 = ebVar.f27992f - f9;
        ebVar.f27992f = f13;
        rb rbVar = this.f27023a;
        rbVar.setTranslationX(f13);
        float f14 = ebVar.f27992f;
        if (f14 == 0.0f || ((f14 < 0.0f && ebVar.v) || (f14 > 0.0f && ebVar.f27996w))) {
            rbVar.setAlpha(1.0f - (Math.abs(f14) / rbVar.getWidth()));
        }
        return true;
    }
}
