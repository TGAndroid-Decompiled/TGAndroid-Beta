package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class if0 implements si.a, qi.a {
    public final eh.c f34708a;

    public if0(eh.c cVar) {
        this.f34708a = cVar;
    }

    @Override
    public final int a() {
        return ((qi.a) b()).a();
    }

    public final si.a b() {
        pi.r f10 = pi.q.f();
        boolean z10 = f10.f53625a;
        eh.c cVar = this.f34708a;
        if (!z10) {
            return cVar.f9982c;
        }
        if (f10.f53626b && Build.VERSION.SDK_INT >= 33) {
            return cVar.f9980a;
        }
        return cVar.f9981b;
    }

    @Override
    public final void c(float f10, float f11, int i3, Canvas canvas, RectF rectF) {
        ((qi.a) b()).c(f10, f11, i3, canvas, rectF);
    }

    @Override
    public final int e() {
        return ((qi.a) b()).e();
    }

    @Override
    public final int f() {
        return ((qi.a) b()).f();
    }

    @Override
    public final boolean g() {
        si.a b10 = b();
        if ((b10 instanceof qi.a) && ((qi.a) b10).g()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        b().l(canvas, f10, f11, f12, f13);
    }
}
