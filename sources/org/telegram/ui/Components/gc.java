package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gc extends GestureDetector.SimpleOnGestureListener {
    public final vb f26843a;
    public final jb f26844b;

    public gc(jb jbVar, vb vbVar) {
        this.f26844b = jbVar;
        this.f26843a = vbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jb jbVar = this.f26844b;
        if (jbVar.f27788s) {
            return false;
        }
        vb vbVar = this.f26843a;
        jbVar.v = vb.access$1400(vbVar, true);
        jbVar.f27789w = vb.access$1400(vbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        boolean z10 = false;
        if (Math.abs(f7) <= 2000.0f) {
            return false;
        }
        jb jbVar = this.f26844b;
        if ((f7 < 0.0f && jbVar.v) || (f7 > 0.0f && jbVar.f27789w)) {
            z10 = true;
        }
        float signum = Math.signum(f7);
        vb vbVar = this.f26843a;
        o1.k kVar = new o1.k(vbVar, o1.h.f16974m, signum * vbVar.getWidth() * 2.0f);
        if (!z10) {
            kVar.a(new o1.f(this) {
                public final gc f26107b;

                {
                    this.f26107b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26107b.f26844b.f27791y.b();
                            return;
                        default:
                            this.f26107b.f26844b.f27791y.b();
                            return;
                    }
                }
            });
            kVar.b(new k7(vbVar, 2));
        }
        kVar.f16993u.a(1.0f);
        kVar.f16993u.b(100.0f);
        kVar.f16982a = f7;
        kVar.f();
        if (z10) {
            o1.k kVar2 = new o1.k(vbVar, o1.h.f16981t, 0.0f);
            kVar2.a(new o1.f(this) {
                public final gc f26107b;

                {
                    this.f26107b = this;
                }

                @Override
                public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                    switch (r2) {
                        case 0:
                            this.f26107b.f26844b.f27791y.b();
                            return;
                        default:
                            this.f26107b.f26844b.f27791y.b();
                            return;
                    }
                }
            });
            kVar2.b(new Object());
            kVar.f16993u.a(1.0f);
            kVar.f16993u.b(10.0f);
            kVar.f16982a = f7;
            kVar2.f();
        }
        jbVar.f27788s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        jb jbVar = this.f26844b;
        float f11 = jbVar.h + f7;
        jbVar.h = f11;
        float f12 = jbVar.f27786n + f10;
        jbVar.f27786n = f12;
        if (Utilities.dist(0.0f, 0.0f, f11, f12) > AndroidUtilities.touchSlop) {
            jbVar.f27787r = true;
        }
        if (!jbVar.d) {
            return false;
        }
        float f13 = jbVar.f27785f - f7;
        jbVar.f27785f = f13;
        vb vbVar = this.f26843a;
        vbVar.setTranslationX(f13);
        float f14 = jbVar.f27785f;
        if (f14 == 0.0f || ((f14 < 0.0f && jbVar.v) || (f14 > 0.0f && jbVar.f27789w))) {
            vbVar.setAlpha(1.0f - (Math.abs(f14) / vbVar.getWidth()));
        }
        return true;
    }
}
