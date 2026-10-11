package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hc extends GestureDetector.SimpleOnGestureListener {
    public final wb f27062a;
    public final kb f27063b;

    public hc(kb kbVar, wb wbVar) {
        this.f27063b = kbVar;
        this.f27062a = wbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        kb kbVar = this.f27063b;
        if (kbVar.f28016s) {
            return false;
        }
        wb wbVar = this.f27062a;
        kbVar.v = wb.access$1400(wbVar, true);
        kbVar.f28017w = wb.access$1400(wbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        kb kbVar = this.f27063b;
        if ((i10 < 0 && kbVar.v) || (f7 > 0.0f && kbVar.f28017w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        wb wbVar = this.f27062a;
        o1.k kVar = new o1.k(wbVar, o1.h.f17005m, signum * wbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final hc f26435b;

                {
                    this.f26435b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26435b.f27063b.f28019y.b();
                            return;
                        default:
                            this.f26435b.f27063b.f28019y.b();
                            return;
                    }
                }
            });
            kVar.b(new m7(wbVar, 2));
        }
        kVar.f17024u.a(1.0f);
        kVar.f17024u.b(100.0f);
        kVar.f17013a = f7;
        kVar.h();
        if (z10) {
            o1.k kVar2 = new o1.k(wbVar, o1.h.f17012t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final hc f26435b;

                {
                    this.f26435b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26435b.f27063b.f28019y.b();
                            return;
                        default:
                            this.f26435b.f27063b.f28019y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f17024u.a(1.0f);
            kVar.f17024u.b(10.0f);
            kVar.f17013a = f7;
            kVar2.h();
        }
        kbVar.f28016s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        kb kbVar = this.f27063b;
        float f11 = kbVar.h + f7;
        kbVar.h = f11;
        float f12 = kbVar.f28014n + f10;
        kbVar.f28014n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            kbVar.f28015r = true;
        }
        if (!kbVar.d) {
            return false;
        }
        float f13 = kbVar.f28013f - f7;
        kbVar.f28013f = f13;
        wb wbVar = this.f27062a;
        wbVar.setTranslationX(f13);
        float f14 = kbVar.f28013f;
        if (f14 == 0.0f || ((f14 < 0.0f && kbVar.v) || (f14 > 0.0f && kbVar.f28017w))) {
            wbVar.setAlpha(1.0f - (Math.abs(f14) / wbVar.getWidth()));
        }
        return true;
    }
}
