package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vb extends GestureDetector.SimpleOnGestureListener {
    public final lb f33340a;
    public final za f33341b;

    public vb(za zaVar, lb lbVar) {
        this.f33341b = zaVar;
        this.f33340a = lbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        za zaVar = this.f33341b;
        if (zaVar.f35260s) {
            return false;
        }
        lb lbVar = this.f33340a;
        zaVar.v = lb.access$1400(lbVar, true);
        zaVar.f35261w = lb.access$1400(lbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        za zaVar = this.f33341b;
        if ((f10 < 0.0f && zaVar.v) || (f10 > 0.0f && zaVar.f35261w)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        lb lbVar = this.f33340a;
        o1.j jVar = new o1.j(lbVar, o1.h.f18782m, signum * lbVar.getWidth() * 2.0f);
        if (!z10) {
            jVar.a(new o1.f(this) {
                public final vb f32669b;

                {
                    this.f32669b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f32669b.f33341b.f35263y.b();
                            return;
                        default:
                            this.f32669b.f33341b.f35263y.b();
                            return;
                    }
                }
            });
            jVar.b(new e7(lbVar, 2));
        }
        jVar.f18800u.a(1.0f);
        jVar.f18800u.b(100.0f);
        jVar.f18790a = f10;
        jVar.f();
        if (z10) {
            o1.j jVar2 = new o1.j(lbVar, o1.h.f18789t, 0.0f);
            jVar2.a(new o1.f(this) {
                public final vb f32669b;

                {
                    this.f32669b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f32669b.f33341b.f35263y.b();
                            return;
                        default:
                            this.f32669b.f33341b.f35263y.b();
                            return;
                    }
                }
            });
            jVar2.b(new Object());
            jVar.f18800u.a(1.0f);
            jVar.f18800u.b(10.0f);
            jVar.f18790a = f10;
            jVar2.f();
        }
        zaVar.f35260s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        za zaVar = this.f33341b;
        float f12 = zaVar.h + f10;
        zaVar.h = f12;
        float f13 = zaVar.f35258n + f11;
        zaVar.f35258n = f13;
        if (Utilities.dist(0.0f, 0.0f, f12, f13) > AndroidUtilities.touchSlop) {
            zaVar.f35259r = true;
        }
        if (!zaVar.d) {
            return false;
        }
        float f14 = zaVar.f35257f - f10;
        zaVar.f35257f = f14;
        lb lbVar = this.f33340a;
        lbVar.setTranslationX(f14);
        float f15 = zaVar.f35257f;
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.v) || (f15 > 0.0f && zaVar.f35261w))) {
            lbVar.setAlpha(1.0f - (Math.abs(f15) / lbVar.getWidth()));
        }
        return true;
    }
}
