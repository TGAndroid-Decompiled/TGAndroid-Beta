package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fc extends GestureDetector.SimpleOnGestureListener {
    public final ub f26215a;
    public final ib f26216b;

    public fc(ib ibVar, ub ubVar) {
        this.f26216b = ibVar;
        this.f26215a = ubVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ib ibVar = this.f26216b;
        if (ibVar.f27171s) {
            return false;
        }
        ub ubVar = this.f26215a;
        ibVar.v = ub.access$1400(ubVar, true);
        ibVar.f27172w = ub.access$1400(ubVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        ib ibVar = this.f26216b;
        if ((i10 < 0 && ibVar.v) || (f7 > 0.0f && ibVar.f27172w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        ub ubVar = this.f26215a;
        o1.k kVar = new o1.k(ubVar, o1.h.f17544m, signum * ubVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final fc f25565b;

                {
                    this.f25565b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f25565b.f26216b.f27174y.b();
                            return;
                        default:
                            this.f25565b.f26216b.f27174y.b();
                            return;
                    }
                }
            });
            kVar.b(new l7(ubVar, 2));
        }
        kVar.f17562u.a(1.0f);
        kVar.f17562u.b(100.0f);
        kVar.f17552a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(ubVar, o1.h.f17551t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final fc f25565b;

                {
                    this.f25565b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f25565b.f26216b.f27174y.b();
                            return;
                        default:
                            this.f25565b.f26216b.f27174y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f17562u.a(1.0f);
            kVar.f17562u.b(10.0f);
            kVar.f17552a = f7;
            kVar2.h();
        }
        ibVar.f27171s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ib ibVar = this.f26216b;
        float f11 = ibVar.h + f7;
        ibVar.h = f11;
        float f12 = ibVar.f27169n + f10;
        ibVar.f27169n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            ibVar.f27170r = true;
        }
        if (!ibVar.d) {
            return false;
        }
        float f13 = ibVar.f27168f - f7;
        ibVar.f27168f = f13;
        ub ubVar = this.f26215a;
        ubVar.setTranslationX(f13);
        float f14 = ibVar.f27168f;
        if (f14 == 0.0f || ((f14 < 0.0f && ibVar.v) || (f14 > 0.0f && ibVar.f27172w))) {
            ubVar.setAlpha(1.0f - (Math.abs(f14) / ubVar.getWidth()));
        }
        return true;
    }
}
