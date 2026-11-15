package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class mb extends GestureDetector.SimpleOnGestureListener {
    public final cb f37183a;
    public final qa f37184b;

    public mb(qa qaVar, cb cbVar) {
        this.f37184b = qaVar;
        this.f37183a = cbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        qa qaVar = this.f37184b;
        if (qaVar.f38599s) {
            return false;
        }
        cb cbVar = this.f37183a;
        qaVar.f38600w = cb.access$1400(cbVar, true);
        qaVar.f38601x = cb.access$1400(cbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        qa qaVar = this.f37184b;
        if ((i7 < 0 && qaVar.f38600w) || (f10 > 0.0f && qaVar.f38601x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        cb cbVar = this.f37183a;
        r1.g gVar = new r1.g(cbVar, r1.g.f55731o, signum * cbVar.getWidth() * 2.0f);
        if (!z10) {
            gVar.a(new r1.c(this) {
                public final mb f36359b;

                {
                    this.f36359b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36359b.f37184b.E.b();
                            return;
                        default:
                            this.f36359b.f37184b.E.b();
                            return;
                    }
                }
            });
            gVar.b(new c7(cbVar, 2));
        }
        gVar.f55748m.a(1.0f);
        gVar.f55748m.b(100.0f);
        gVar.f55738a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) cbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final mb f36359b;

                {
                    this.f36359b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36359b.f37184b.E.b();
                            return;
                        default:
                            this.f36359b.f37184b.E.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f55748m.a(1.0f);
            gVar.f55748m.b(10.0f);
            gVar.f55738a = f10;
            gVar2.h();
        }
        qaVar.f38599s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        qa qaVar = this.f37184b;
        float f12 = qaVar.h + f10;
        qaVar.h = f12;
        float f13 = qaVar.f38597n + f11;
        qaVar.f38597n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f23588e) {
            qaVar.f38598r = true;
        }
        if (!qaVar.d) {
            return false;
        }
        float f14 = qaVar.f38596f - f10;
        qaVar.f38596f = f14;
        cb cbVar = this.f37183a;
        cbVar.setTranslationX(f14);
        float f15 = qaVar.f38596f;
        if (f15 == 0.0f || ((f15 < 0.0f && qaVar.f38600w) || (f15 > 0.0f && qaVar.f38601x))) {
            cbVar.setAlpha(1.0f - (Math.abs(f15) / cbVar.getWidth()));
        }
        return true;
    }
}
