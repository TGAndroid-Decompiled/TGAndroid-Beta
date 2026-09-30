package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gc extends GestureDetector.SimpleOnGestureListener {
    public final vb f24532a;
    public final jb f24533b;

    public gc(jb jbVar, vb vbVar) {
        this.f24533b = jbVar;
        this.f24532a = vbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jb jbVar = this.f24533b;
        if (jbVar.f25394s) {
            return false;
        }
        vb vbVar = this.f24532a;
        jbVar.v = vb.access$1400(vbVar, true);
        jbVar.f25395w = vb.access$1400(vbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        jb jbVar = this.f24533b;
        if ((f7 < 0.0f && jbVar.v) || (f7 > 0.0f && jbVar.f25395w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        vb vbVar = this.f24532a;
        o1.k kVar = new o1.k(vbVar, o1.h.f15531m, signum * vbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final gc f23952b;

                {
                    this.f23952b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23952b.f24533b.f25397y.b();
                            return;
                        default:
                            this.f23952b.f24533b.f25397y.b();
                            return;
                    }
                }
            });
            kVar.b(new k7(vbVar, 2));
        }
        kVar.f15549u.a(1.0f);
        kVar.f15549u.b(100.0f);
        kVar.f15539a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(vbVar, o1.h.f15538t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final gc f23952b;

                {
                    this.f23952b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f23952b.f24533b.f25397y.b();
                            return;
                        default:
                            this.f23952b.f24533b.f25397y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f15549u.a(1.0f);
            kVar.f15549u.b(10.0f);
            kVar.f15539a = f7;
            kVar2.f();
        }
        jbVar.f25394s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jb jbVar = this.f24533b;
        float f11 = jbVar.h + f7;
        jbVar.h = f11;
        float f12 = jbVar.f25392n + f10;
        jbVar.f25392n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            jbVar.f25393r = true;
        }
        if (!jbVar.d) {
            return false;
        }
        float f13 = jbVar.f25391f - f7;
        jbVar.f25391f = f13;
        vb vbVar = this.f24532a;
        vbVar.setTranslationX(f13);
        float f14 = jbVar.f25391f;
        if (f14 == 0.0f || ((f14 < 0.0f && jbVar.v) || (f14 > 0.0f && jbVar.f25395w))) {
            vbVar.setAlpha(1.0f - (Math.abs(f14) / vbVar.getWidth()));
        }
        return true;
    }
}
