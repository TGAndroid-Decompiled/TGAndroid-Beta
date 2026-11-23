package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class vb extends GestureDetector.SimpleOnGestureListener {
    public final lb f40761a;
    public final za f40762b;

    public vb(za zaVar, lb lbVar) {
        this.f40762b = zaVar;
        this.f40761a = lbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        za zaVar = this.f40762b;
        if (zaVar.f42749s) {
            return false;
        }
        lb lbVar = this.f40761a;
        zaVar.f42750w = lb.access$1600(lbVar, true);
        zaVar.f42751x = lb.access$1600(lbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        za zaVar = this.f40762b;
        if ((i7 < 0 && zaVar.f42750w) || (f10 > 0.0f && zaVar.f42751x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        lb lbVar = this.f40761a;
        r1.g gVar = new r1.g(lbVar, r1.g.f56351o, signum * lbVar.getWidth() * 2.0f);
        if (!z10) {
            gVar.a(new r1.c(this) {
                public final vb f39812b;

                {
                    this.f39812b = this;
                }

                @Override
                public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f39812b.f40762b.E.b();
                            return;
                        default:
                            this.f39812b.f40762b.E.b();
                            return;
                    }
                }
            });
            gVar.b(new j7(lbVar, 2));
        }
        gVar.f56368m.a(1.0f);
        gVar.f56368m.b(100.0f);
        gVar.f56358a = f10;
        gVar.h();
        if (z10) {
            r1.g gVar2 = new r1.g((Object) lbVar, (r1.e) r1.g.v, 0.0f);
            gVar2.a(new r1.c(this) {
                public final vb f39812b;

                {
                    this.f39812b = this;
                }

                @Override
                public final void a(r1.g gVar22, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f39812b.f40762b.E.b();
                            return;
                        default:
                            this.f39812b.f40762b.E.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f56368m.a(1.0f);
            gVar.f56368m.b(10.0f);
            gVar.f56358a = f10;
            gVar2.h();
        }
        zaVar.f42749s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        za zaVar = this.f40762b;
        float f12 = zaVar.h + f10;
        zaVar.h = f12;
        float f13 = zaVar.f42747n + f11;
        zaVar.f42747n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f24025e) {
            zaVar.f42748r = true;
        }
        if (!zaVar.d) {
            return false;
        }
        float f14 = zaVar.f42746f - f10;
        zaVar.f42746f = f14;
        lb lbVar = this.f40761a;
        lbVar.setTranslationX(f14);
        float f15 = zaVar.f42746f;
        if (f15 == 0.0f || ((f15 < 0.0f && zaVar.f42750w) || (f15 > 0.0f && zaVar.f42751x))) {
            lbVar.setAlpha(1.0f - (Math.abs(f15) / lbVar.getWidth()));
        }
        return true;
    }
}
