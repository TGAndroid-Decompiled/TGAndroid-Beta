package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class tb extends GestureDetector.SimpleOnGestureListener {

    public final jb f32726a;

    public final xa f32727b;

    public tb(xa xaVar, jb jbVar) {
        this.f32727b = xaVar;
        this.f32726a = jbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        xa xaVar = this.f32727b;
        if (xaVar.f34566s) {
            return false;
        }
        jb jbVar = this.f32726a;
        xaVar.v = jb.access$1400(jbVar, true);
        xaVar.f34567w = jb.access$1400(jbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        xa xaVar = this.f32727b;
        if ((f10 < 0.0f && xaVar.v) || (f10 > 0.0f && xaVar.f34567w)) {
            z10 = true;
        }
        float fSignum = Math.signum(f10);
        jb jbVar = this.f32726a;
        o1.j jVar = new o1.j(jbVar, o1.h.f19129m, fSignum * jbVar.getWidth() * 2.0f);
        if (!z10) {
            final int i10 = 0;
            jVar.a(new o1.f(this) {

                public final tb f32120b;

                {
                    this.f32120b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                    switch (i10) {
                        case 0:
                            this.f32120b.f32727b.f34569y.b();
                            break;
                        default:
                            this.f32120b.f32727b.f34569y.b();
                            break;
                    }
                }
            });
            jVar.b(new e7(jbVar, 2));
        }
        jVar.f19147u.a(1.0f);
        jVar.f19147u.b(100.0f);
        jVar.f19137a = f10;
        jVar.f();
        if (z10) {
            o1.j jVar2 = new o1.j(jbVar, o1.h.f19136t, 0.0f);
            final int i11 = 1;
            jVar2.a(new o1.f(this) {

                public final tb f32120b;

                {
                    this.f32120b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                    switch (i11) {
                        case 0:
                            this.f32120b.f32727b.f34569y.b();
                            break;
                        default:
                            this.f32120b.f32727b.f34569y.b();
                            break;
                    }
                }
            });
            jVar2.b(new sb());
            jVar.f19147u.a(1.0f);
            jVar.f19147u.b(10.0f);
            jVar.f19137a = f10;
            jVar2.f();
        }
        xaVar.f34566s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        xa xaVar = this.f32727b;
        float f12 = xaVar.h + f10;
        xaVar.h = f12;
        float f13 = xaVar.f34564n + f11;
        xaVar.f34564n = f13;
        if (Utilities.dist(0.0f, 0.0f, f12, f13) > AndroidUtilities.touchSlop) {
            xaVar.f34565r = true;
        }
        if (!xaVar.d) {
            return false;
        }
        float f14 = xaVar.f34563f - f10;
        xaVar.f34563f = f14;
        jb jbVar = this.f32726a;
        jbVar.setTranslationX(f14);
        float f15 = xaVar.f34563f;
        if (f15 == 0.0f || ((f15 < 0.0f && xaVar.v) || (f15 > 0.0f && xaVar.f34567w))) {
            jbVar.setAlpha(1.0f - (Math.abs(f15) / jbVar.getWidth()));
        }
        return true;
    }
}
