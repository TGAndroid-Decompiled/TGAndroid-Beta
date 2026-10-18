package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fc extends GestureDetector.SimpleOnGestureListener {
    public final ub f26208a;
    public final ib f26209b;

    public fc(ib ibVar, ub ubVar) {
        this.f26209b = ibVar;
        this.f26208a = ubVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ib ibVar = this.f26209b;
        if (ibVar.f27164s) {
            return false;
        }
        ub ubVar = this.f26208a;
        ibVar.v = ub.access$1400(ubVar, true);
        ibVar.f27165w = ub.access$1400(ubVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        ib ibVar = this.f26209b;
        if ((i10 < 0 && ibVar.v) || (f7 > 0.0f && ibVar.f27165w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        ub ubVar = this.f26208a;
        o1.k kVar = new o1.k(ubVar, o1.h.f17540m, signum * ubVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final fc f25558b;

                {
                    this.f25558b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f25558b.f26209b.f27167y.b();
                            return;
                        default:
                            this.f25558b.f26209b.f27167y.b();
                            return;
                    }
                }
            });
            kVar.b(new l7(ubVar, 2));
        }
        kVar.f17558u.a(1.0f);
        kVar.f17558u.b(100.0f);
        kVar.f17548a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(ubVar, o1.h.f17547t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final fc f25558b;

                {
                    this.f25558b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f25558b.f26209b.f27167y.b();
                            return;
                        default:
                            this.f25558b.f26209b.f27167y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f17558u.a(1.0f);
            kVar.f17558u.b(10.0f);
            kVar.f17548a = f7;
            kVar2.h();
        }
        ibVar.f27164s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ib ibVar = this.f26209b;
        float f11 = ibVar.h + f7;
        ibVar.h = f11;
        float f12 = ibVar.f27162n + f10;
        ibVar.f27162n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ibVar.f27163r = true;
        }
        if (!ibVar.d) {
            return false;
        }
        float f13 = ibVar.f27161f - f7;
        ibVar.f27161f = f13;
        ub ubVar = this.f26208a;
        ubVar.setTranslationX(f13);
        float f14 = ibVar.f27161f;
        if (f14 == 0.0f || ((f14 < 0.0f && ibVar.v) || (f14 > 0.0f && ibVar.f27165w))) {
            ubVar.setAlpha(1.0f - (Math.abs(f14) / ubVar.getWidth()));
        }
        return true;
    }
}
