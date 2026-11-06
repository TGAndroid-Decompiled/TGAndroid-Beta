package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class rb extends GestureDetector.SimpleOnGestureListener {
    public final gb f37616a;
    public final ua f37617b;

    public rb(ua uaVar, gb gbVar) {
        this.f37617b = uaVar;
        this.f37616a = gbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.f37617b;
        if (uaVar.f38572s) {
            return false;
        }
        gb gbVar = this.f37616a;
        uaVar.f38573w = gb.access$1400(gbVar, true);
        uaVar.f38574x = gb.access$1400(gbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z9 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ua uaVar = this.f37617b;
        if ((i7 < 0 && uaVar.f38573w) || (f10 > 0.0f && uaVar.f38574x)) {
            z9 = true;
        }
        float signum = Math.signum(f10);
        gb gbVar = this.f37616a;
        r1.g gVar = new r1.g(gbVar, r1.g.f54158o, signum * gbVar.getWidth() * 2.0f);
        if (!z9) {
            gVar.a(new r1.c(this) {
                public final rb f36836b;

                {
                    this.f36836b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36836b.f37617b.D.b();
                            return;
                        default:
                            this.f36836b.f37617b.D.b();
                            return;
                    }
                }
            });
            gVar.b(new e7(gbVar, 2));
        }
        gVar.f54175m.a(1.0f);
        gVar.f54175m.b(100.0f);
        gVar.f54165a = f10;
        gVar.h();
        if (z9) {
            r1.g gVar2 = new r1.g((Object) gbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final rb f36836b;

                {
                    this.f36836b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z10, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36836b.f37617b.D.b();
                            return;
                        default:
                            this.f36836b.f37617b.D.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f54175m.a(1.0f);
            gVar.f54175m.b(10.0f);
            gVar.f54165a = f10;
            gVar2.h();
        }
        uaVar.f38572s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ua uaVar = this.f37617b;
        float f12 = uaVar.h + f10;
        uaVar.h = f12;
        float f13 = uaVar.f38570n + f11;
        uaVar.f38570n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f22516e) {
            uaVar.f38571r = true;
        }
        if (!uaVar.d) {
            return false;
        }
        float f14 = uaVar.f38569f - f10;
        uaVar.f38569f = f14;
        gb gbVar = this.f37616a;
        gbVar.setTranslationX(f14);
        float f15 = uaVar.f38569f;
        if (f15 == 0.0f || ((f15 < 0.0f && uaVar.f38573w) || (f15 > 0.0f && uaVar.f38574x))) {
            gbVar.setAlpha(1.0f - (Math.abs(f15) / gbVar.getWidth()));
        }
        return true;
    }
}
