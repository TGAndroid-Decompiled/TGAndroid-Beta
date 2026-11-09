package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class hf0 implements ri.a, pi.a {
    public final dh.c f34288a;

    public hf0(dh.c cVar) {
        this.f34288a = cVar;
    }

    @Override
    public final int a() {
        return ((pi.a) b()).a();
    }

    public final ri.a b() {
        oi.r f10 = oi.q.f();
        boolean z9 = f10.f21122a;
        dh.c cVar = this.f34288a;
        if (!z9) {
            return cVar.f8702c;
        }
        if (f10.f21123b && Build.VERSION.SDK_INT >= 33) {
            return cVar.f8700a;
        }
        return cVar.f8701b;
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        ((pi.a) b()).d(f10, f11, i7, canvas, rectF);
    }

    @Override
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        b().e(canvas, f10, f11, f12, f13);
    }

    @Override
    public final int f() {
        return ((pi.a) b()).f();
    }

    @Override
    public final int g() {
        return ((pi.a) b()).g();
    }

    @Override
    public final boolean h() {
        ri.a b10 = b();
        if ((b10 instanceof pi.a) && ((pi.a) b10).h()) {
            return true;
        }
        return false;
    }
}
