package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dc extends GestureDetector.SimpleOnGestureListener {
    public final sb f25693a;
    public final gb f25694b;

    public dc(gb gbVar, sb sbVar) {
        this.f25694b = gbVar;
        this.f25693a = sbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        gb gbVar = this.f25694b;
        if (gbVar.f26611s) {
            return false;
        }
        sb sbVar = this.f25693a;
        gbVar.v = sb.access$1400(sbVar, true);
        gbVar.f26612w = sb.access$1400(sbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        gb gbVar = this.f25694b;
        if ((i10 < 0 && gbVar.v) || (f7 > 0.0f && gbVar.f26612w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        sb sbVar = this.f25693a;
        o1.k kVar = new o1.k(sbVar, o1.h.f17604m, signum * sbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final dc f24963b;

                {
                    this.f24963b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f24963b.f25694b.f26614y.b();
                            return;
                        default:
                            this.f24963b.f25694b.f26614y.b();
                            return;
                    }
                }
            });
            kVar.b(new j7(sbVar, 2));
        }
        kVar.f17622u.a(1.0f);
        kVar.f17622u.b(100.0f);
        kVar.f17612a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(sbVar, o1.h.f17611t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final dc f24963b;

                {
                    this.f24963b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f24963b.f25694b.f26614y.b();
                            return;
                        default:
                            this.f24963b.f25694b.f26614y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f17622u.a(1.0f);
            kVar.f17622u.b(10.0f);
            kVar.f17612a = f7;
            kVar2.h();
        }
        gbVar.f26611s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        gb gbVar = this.f25694b;
        float f11 = gbVar.h + f7;
        gbVar.h = f11;
        float f12 = gbVar.f26609n + f10;
        gbVar.f26609n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            gbVar.f26610r = true;
        }
        if (!gbVar.d) {
            return false;
        }
        float f13 = gbVar.f26608f - f7;
        gbVar.f26608f = f13;
        sb sbVar = this.f25693a;
        sbVar.setTranslationX(f13);
        float f14 = gbVar.f26608f;
        if (f14 == 0.0f || ((f14 < 0.0f && gbVar.v) || (f14 > 0.0f && gbVar.f26612w))) {
            sbVar.setAlpha(1.0f - (Math.abs(f14) / sbVar.getWidth()));
        }
        return true;
    }
}
