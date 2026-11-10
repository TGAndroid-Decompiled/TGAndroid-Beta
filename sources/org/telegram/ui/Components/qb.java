package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class qb extends GestureDetector.SimpleOnGestureListener {
    public final fb f37230a;
    public final ta f37231b;

    public qb(ta taVar, fb fbVar) {
        this.f37231b = taVar;
        this.f37230a = fbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ta taVar = this.f37231b;
        if (taVar.f38257s) {
            return false;
        }
        fb fbVar = this.f37230a;
        taVar.f38258w = fb.access$1400(fbVar, true);
        taVar.f38259x = fb.access$1400(fbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ta taVar = this.f37231b;
        if ((i7 < 0 && taVar.f38258w) || (f10 > 0.0f && taVar.f38259x)) {
            z9 = true;
        }
        float signum = Math.signum(f10);
        fb fbVar = this.f37230a;
        r1.g gVar = new r1.g(fbVar, r1.g.f54262o, signum * fbVar.getWidth() * 2.0f);
        if (!z9) {
            gVar.a(new r1.c(this) {
                public final qb f36563b;

                {
                    this.f36563b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36563b.f37231b.D.b();
                            return;
                        default:
                            this.f36563b.f37231b.D.b();
                            return;
                    }
                }
            });
            gVar.b(new d7(fbVar, 2));
        }
        gVar.f54279m.a(1.0f);
        gVar.f54279m.b(100.0f);
        gVar.f54269a = f10;
        gVar.h();
        if (z9) {
            r1.g gVar2 = new r1.g((Object) fbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final qb f36563b;

                {
                    this.f36563b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36563b.f37231b.D.b();
                            return;
                        default:
                            this.f36563b.f37231b.D.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f54279m.a(1.0f);
            gVar.f54279m.b(10.0f);
            gVar.f54269a = f10;
            gVar2.h();
        }
        taVar.f38257s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ta taVar = this.f37231b;
        float f12 = taVar.h + f10;
        taVar.h = f12;
        float f13 = taVar.f38255n + f11;
        taVar.f38255n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f22546e) {
            taVar.f38256r = true;
        }
        if (!taVar.d) {
            return false;
        }
        float f14 = taVar.f38254f - f10;
        taVar.f38254f = f14;
        fb fbVar = this.f37230a;
        fbVar.setTranslationX(f14);
        float f15 = taVar.f38254f;
        if (f15 == 0.0f || ((f15 < 0.0f && taVar.f38258w) || (f15 > 0.0f && taVar.f38259x))) {
            fbVar.setAlpha(1.0f - (Math.abs(f15) / fbVar.getWidth()));
        }
        return true;
    }
}
