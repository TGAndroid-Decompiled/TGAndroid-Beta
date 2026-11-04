package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
public final class pb extends GestureDetector.SimpleOnGestureListener {
    public final fb f37110a;
    public final ta f37111b;

    public pb(ta taVar, fb fbVar) {
        this.f37111b = taVar;
        this.f37110a = fbVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ta taVar = this.f37111b;
        if (taVar.f38371s) {
            return false;
        }
        fb fbVar = this.f37110a;
        taVar.f38372w = fb.access$1400(fbVar, true);
        taVar.f38373x = fb.access$1400(fbVar, false);
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10 = false;
        if (Math.abs(f10) <= 2000.0f) {
            return false;
        }
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ta taVar = this.f37111b;
        if ((i3 < 0 && taVar.f38372w) || (f10 > 0.0f && taVar.f38373x)) {
            z10 = true;
        }
        float signum = Math.signum(f10);
        fb fbVar = this.f37110a;
        q1.g gVar = new q1.g(fbVar, q1.g.f53636o, signum * fbVar.getWidth() * 2.0f);
        if (!z10) {
            gVar.a(new q1.c(this) {
                public final pb f36427b;

                {
                    this.f36427b = this;
                }

                @Override
                public final void a(q1.g gVar2, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36427b.f37111b.E.b();
                            return;
                        default:
                            this.f36427b.f37111b.E.b();
                            return;
                    }
                }
            });
            gVar.b(new c7(fbVar, 2));
        }
        gVar.f53653m.a(1.0f);
        gVar.f53653m.b(100.0f);
        gVar.f53643a = f10;
        gVar.h();
        if (z10) {
            q1.g gVar2 = new q1.g((Object) fbVar, (q1.e) q1.g.v, 0.0f);
            gVar2.a(new q1.c(this) {
                public final pb f36427b;

                {
                    this.f36427b = this;
                }

                @Override
                public final void a(q1.g gVar22, boolean z11, float f12, float f13) {
                    switch (r2) {
                        case 0:
                            this.f36427b.f37111b.E.b();
                            return;
                        default:
                            this.f36427b.f37111b.E.b();
                            return;
                    }
                }
            });
            gVar2.b(new Object());
            gVar.f53653m.a(1.0f);
            gVar.f53653m.b(10.0f);
            gVar.f53643a = f10;
            gVar2.h();
        }
        taVar.f38371s = true;
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ta taVar = this.f37111b;
        float f12 = taVar.h + f10;
        taVar.h = f12;
        float f13 = taVar.f38369n + f11;
        taVar.f38369n = f13;
        if (Utilities.t(0.0f, 0.0f, f12, f13) > org.telegram.messenger.g0.f22587e) {
            taVar.f38370r = true;
        }
        if (!taVar.d) {
            return false;
        }
        float f14 = taVar.f38368f - f10;
        taVar.f38368f = f14;
        fb fbVar = this.f37110a;
        fbVar.setTranslationX(f14);
        float f15 = taVar.f38368f;
        if (f15 == 0.0f || ((f15 < 0.0f && taVar.f38372w) || (f15 > 0.0f && taVar.f38373x))) {
            fbVar.setAlpha(1.0f - (Math.abs(f15) / fbVar.getWidth()));
        }
        return true;
    }
}
