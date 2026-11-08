package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class rb extends GestureDetector.SimpleOnGestureListener {
    public final gb f37597a;
    public final ua f37598b;

    public rb(ua uaVar, gb gbVar) {
        this.f37598b = uaVar;
        this.f37597a = gbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.f37598b;
        if (uaVar.f38583s) {
            return false;
        }
        gb gbVar = this.f37597a;
        uaVar.f38584w = gb.access$1400(gbVar, true);
        uaVar.f38585x = gb.access$1400(gbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ua uaVar = this.f37598b;
        if ((i7 < 0 && uaVar.f38584w) || (f10 > 0.0f && uaVar.f38585x)) {
            z9 = true;
        }
        float signum = Math.signum(f10);
        gb gbVar = this.f37597a;
        r1.g gVar = new r1.g(gbVar, r1.g.f54251o, signum * gbVar.getWidth() * 2.0f);
        if (!z9) {
            gVar.a(new r1.c(this) {
                public final rb f36878b;

                {
                    this.f36878b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36878b.f37598b.D.b();
                            return;
                        default:
                            this.f36878b.f37598b.D.b();
                            return;
                    }
                }
            });
            gVar.b(new e7(gbVar, 2));
        }
        gVar.f54268m.a(1.0f);
        gVar.f54268m.b(100.0f);
        gVar.f54258a = f10;
        gVar.h();
        if (z9) {
            r1.g gVar2 = new r1.g((Object) gbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final rb f36878b;

                {
                    this.f36878b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36878b.f37598b.D.b();
                            return;
                        default:
                            this.f36878b.f37598b.D.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f54268m.a(1.0f);
            gVar.f54268m.b(10.0f);
            gVar.f54258a = f10;
            gVar2.h();
        }
        uaVar.f38583s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ua uaVar = this.f37598b;
        float f12 = uaVar.h + f10;
        uaVar.h = f12;
        float f13 = uaVar.f38581n + f11;
        uaVar.f38581n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f22542e) {
            uaVar.f38582r = true;
        }
        if (!uaVar.d) {
            return false;
        }
        float f14 = uaVar.f38580f - f10;
        uaVar.f38580f = f14;
        gb gbVar = this.f37597a;
        gbVar.setTranslationX(f14);
        float f15 = uaVar.f38580f;
        if (f15 == 0.0f || ((f15 < 0.0f && uaVar.f38584w) || (f15 > 0.0f && uaVar.f38585x))) {
            gbVar.setAlpha(1.0f - (Math.abs(f15) / gbVar.getWidth()));
        }
        return true;
    }
}
