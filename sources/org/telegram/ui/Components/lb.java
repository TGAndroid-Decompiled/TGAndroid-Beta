package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class lb extends GestureDetector.SimpleOnGestureListener {
    public final bb f28102a;
    public final oa f28103b;

    public lb(oa oaVar, bb bbVar) {
        this.f28103b = oaVar;
        this.f28102a = bbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        oa oaVar = this.f28103b;
        if (oaVar.f29078s) {
            return false;
        }
        bb bbVar = this.f28102a;
        oaVar.f29079w = bb.access$1400(bbVar, true);
        oaVar.f29080x = bb.access$1400(bbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        oa oaVar = this.f28103b;
        if ((i10 < 0 && oaVar.f29079w) || (f7 > 0.0f && oaVar.f29080x)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        bb bbVar = this.f28102a;
        o1.j jVar = new o1.j(bbVar, o1.j.f13942o, signum * bbVar.getWidth() * 2.0f);
        if (!z10) {
            jVar.a(new o1.f(this) {
                public final lb f27328b;

                {
                    this.f27328b = this;
                }

                @Override
                public final void a(o1.j jVar2, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27328b.f28103b.D.b();
                            return;
                        default:
                            this.f27328b.f28103b.D.b();
                            return;
                    }
                }
            });
            jVar.b(new a7(bbVar, 2));
        }
        jVar.f13958m.a(1.0f);
        jVar.f13958m.b(100.0f);
        jVar.f13949a = f7;
        jVar.h();
        if (z10) {
            o1.j jVar2 = new o1.j((Object) bbVar, (o1.h) o1.j.v, 0.0f);
            jVar2.a(new o1.f(this) {
                public final lb f27328b;

                {
                    this.f27328b = this;
                }

                @Override
                public final void a(o1.j jVar22, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f27328b.f28103b.D.b();
                            return;
                        default:
                            this.f27328b.f28103b.D.b();
                            return;
                    }
                }
            });
            jVar2.b(new Object());
            jVar.f13958m.a(1.0f);
            jVar.f13958m.b(10.0f);
            jVar.f13949a = f7;
            jVar2.h();
        }
        oaVar.f29078s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        oa oaVar = this.f28103b;
        float f11 = oaVar.h + f7;
        oaVar.h = f11;
        float f12 = oaVar.f29076n + f10;
        oaVar.f29076n = f12;
        if (Utilities.t(0.0f, 0.0f, f11, f12) > org.telegram.messenger.i0.e) {
            oaVar.f29077r = true;
        }
        if (!oaVar.d) {
            return false;
        }
        float f13 = oaVar.f29075f - f7;
        oaVar.f29075f = f13;
        bb bbVar = this.f28102a;
        bbVar.setTranslationX(f13);
        float f14 = oaVar.f29075f;
        if (f14 == 0.0f || ((f14 < 0.0f && oaVar.f29079w) || (f14 > 0.0f && oaVar.f29080x))) {
            bbVar.setAlpha(1.0f - (Math.abs(f14) / bbVar.getWidth()));
        }
        return true;
    }
}
