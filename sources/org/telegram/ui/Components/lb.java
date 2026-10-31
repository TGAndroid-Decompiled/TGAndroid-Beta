package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class lb extends GestureDetector.SimpleOnGestureListener {
    public final bb f28058a;
    public final oa f28059b;

    public lb(oa oaVar, bb bbVar) {
        this.f28059b = oaVar;
        this.f28058a = bbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        oa oaVar = this.f28059b;
        if (oaVar.f29017s) {
            return false;
        }
        bb bbVar = this.f28058a;
        oaVar.f29018w = bb.access$1400(bbVar, true);
        oaVar.f29019x = bb.access$1400(bbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        oa oaVar = this.f28059b;
        if ((i10 < 0 && oaVar.f29018w) || (f7 > 0.0f && oaVar.f29019x)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        bb bbVar = this.f28058a;
        o1.j jVar = new o1.j(bbVar, o1.j.f13941o, signum * bbVar.getWidth() * 2.0f);
        if (!z10) {
            jVar.a(new o1.f(this) {
                public final lb f27273b;

                {
                    this.f27273b = this;
                }

                @Override
                public final void a(o1.j jVar2, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27273b.f28059b.D.b();
                            return;
                        default:
                            this.f27273b.f28059b.D.b();
                            return;
                    }
                }
            });
            jVar.b(new a7(bbVar, 2));
        }
        jVar.f13957m.a(1.0f);
        jVar.f13957m.b(100.0f);
        jVar.f13948a = f7;
        jVar.h();
        if (z10) {
            o1.j jVar2 = new o1.j((Object) bbVar, (o1.h) o1.j.v, 0.0f);
            jVar2.a(new o1.f(this) {
                public final lb f27273b;

                {
                    this.f27273b = this;
                }

                @Override
                public final void a(o1.j jVar22, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27273b.f28059b.D.b();
                            return;
                        default:
                            this.f27273b.f28059b.D.b();
                            return;
                    }
                }
            });
            jVar2.b(new Object());
            jVar.f13957m.a(1.0f);
            jVar.f13957m.b(10.0f);
            jVar.f13948a = f7;
            jVar2.h();
        }
        oaVar.f29017s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        oa oaVar = this.f28059b;
        float f11 = oaVar.h + f7;
        oaVar.h = f11;
        float f12 = oaVar.f29015n + f10;
        oaVar.f29015n = f12;
        if (Utilities.t(0.0f, 0.0f, f11, f12) > org.telegram.messenger.i0.e) {
            oaVar.f29016r = true;
        }
        if (!oaVar.d) {
            return false;
        }
        float f13 = oaVar.f29014f - f7;
        oaVar.f29014f = f13;
        bb bbVar = this.f28058a;
        bbVar.setTranslationX(f13);
        float f14 = oaVar.f29014f;
        if (f14 == 0.0f || ((f14 < 0.0f && oaVar.f29018w) || (f14 > 0.0f && oaVar.f29019x))) {
            bbVar.setAlpha(1.0f - (Math.abs(f14) / bbVar.getWidth()));
        }
        return true;
    }
}
