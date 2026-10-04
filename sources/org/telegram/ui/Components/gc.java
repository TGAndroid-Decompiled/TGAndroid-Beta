package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gc extends GestureDetector.SimpleOnGestureListener {
    public final vb f26789a;
    public final jb f26790b;

    public gc(jb jbVar, vb vbVar) {
        this.f26790b = jbVar;
        this.f26789a = vbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jb jbVar = this.f26790b;
        if (jbVar.f27716s) {
            return false;
        }
        vb vbVar = this.f26789a;
        jbVar.v = vb.access$1400(vbVar, true);
        jbVar.f27717w = vb.access$1400(vbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        jb jbVar = this.f26790b;
        if ((f7 < 0.0f && jbVar.v) || (f7 > 0.0f && jbVar.f27717w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        vb vbVar = this.f26789a;
        o1.k kVar = new o1.k(vbVar, o1.h.f16965m, signum * vbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final gc f26033b;

                {
                    this.f26033b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26033b.f26790b.f27719y.b();
                            return;
                        default:
                            this.f26033b.f26790b.f27719y.b();
                            return;
                    }
                }
            });
            kVar.b(new k7(vbVar, 2));
        }
        kVar.f16984u.a(1.0f);
        kVar.f16984u.b(100.0f);
        kVar.f16973a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(vbVar, o1.h.f16972t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final gc f26033b;

                {
                    this.f26033b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26033b.f26790b.f27719y.b();
                            return;
                        default:
                            this.f26033b.f26790b.f27719y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f16984u.a(1.0f);
            kVar.f16984u.b(10.0f);
            kVar.f16973a = f7;
            kVar2.f();
        }
        jbVar.f27716s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jb jbVar = this.f26790b;
        float f11 = jbVar.h + f7;
        jbVar.h = f11;
        float f12 = jbVar.f27714n + f10;
        jbVar.f27714n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            jbVar.f27715r = true;
        }
        if (!jbVar.d) {
            return false;
        }
        float f13 = jbVar.f27713f - f7;
        jbVar.f27713f = f13;
        vb vbVar = this.f26789a;
        vbVar.setTranslationX(f13);
        float f14 = jbVar.f27713f;
        if (f14 == 0.0f || ((f14 < 0.0f && jbVar.v) || (f14 > 0.0f && jbVar.f27717w))) {
            vbVar.setAlpha(1.0f - (Math.abs(f14) / vbVar.getWidth()));
        }
        return true;
    }
}
