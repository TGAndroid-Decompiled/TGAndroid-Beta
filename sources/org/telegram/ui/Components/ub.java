package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class ub extends GestureDetector.SimpleOnGestureListener {
    public final kb f40342a;
    public final ya f40343b;

    public ub(ya yaVar, kb kbVar) {
        this.f40343b = yaVar;
        this.f40342a = kbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ya yaVar = this.f40343b;
        if (yaVar.f42392s) {
            return false;
        }
        kb kbVar = this.f40342a;
        yaVar.f42393w = kb.access$1600(kbVar, true);
        yaVar.f42394x = kb.access$1600(kbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ya yaVar = this.f40343b;
        if ((i7 < 0 && yaVar.f42393w) || (f10 > 0.0f && yaVar.f42394x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        kb kbVar = this.f40342a;
        r1.g gVar = new r1.g(kbVar, r1.g.f56429o, signum * kbVar.getWidth() * 2.0f);
        if (!z10) {
            gVar.a(new r1.c(this) {
                public final ub f39554b;

                {
                    this.f39554b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f39554b.f40343b.E.b();
                            return;
                        default:
                            this.f39554b.f40343b.E.b();
                            return;
                    }
                }
            });
            gVar.b(new i7(kbVar, 2));
        }
        gVar.f56446m.a(1.0f);
        gVar.f56446m.b(100.0f);
        gVar.f56436a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) kbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final ub f39554b;

                {
                    this.f39554b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f39554b.f40343b.E.b();
                            return;
                        default:
                            this.f39554b.f40343b.E.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f56446m.a(1.0f);
            gVar.f56446m.b(10.0f);
            gVar.f56436a = f10;
            gVar2.h();
        }
        yaVar.f42392s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ya yaVar = this.f40343b;
        float f12 = yaVar.h + f10;
        yaVar.h = f12;
        float f13 = yaVar.f42390n + f11;
        yaVar.f42390n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f24205e) {
            yaVar.f42391r = true;
        }
        if (!yaVar.d) {
            return false;
        }
        float f14 = yaVar.f42389f - f10;
        yaVar.f42389f = f14;
        kb kbVar = this.f40342a;
        kbVar.setTranslationX(f14);
        float f15 = yaVar.f42389f;
        if (f15 == 0.0f || ((f15 < 0.0f && yaVar.f42393w) || (f15 > 0.0f && yaVar.f42394x))) {
            kbVar.setAlpha(1.0f - (Math.abs(f15) / kbVar.getWidth()));
        }
        return true;
    }
}
