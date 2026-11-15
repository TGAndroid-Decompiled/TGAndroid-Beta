package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class jf0 implements ui.a, si.a {
    public final dh.c f35972a;

    public jf0(dh.c cVar) {
        this.f35972a = cVar;
    }

    @Override
    public final int a() {
        return ((si.a) b()).a();
    }

    public final ui.a b() {
        ri.r f10 = ri.q.f();
        boolean z10 = f10.f56143a;
        dh.c cVar = this.f35972a;
        if (!z10) {
            return cVar.f8091c;
        }
        if (f10.f56144b && Build.VERSION.SDK_INT >= 33) {
            return cVar.f8089a;
        }
        return cVar.f8090b;
    }

    @Override
    public final void b0(float f10, float f11, float f12, float f13, Canvas canvas) {
        b().b0(f10, f11, f12, f13, canvas);
    }

    @Override
    public final void d(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        ((si.a) b()).d(f10, f11, i7, canvas, rectF);
    }

    @Override
    public final int e() {
        return ((si.a) b()).e();
    }

    @Override
    public final int f() {
        return ((si.a) b()).f();
    }

    @Override
    public final boolean g() {
        ui.a b10 = b();
        if ((b10 instanceof si.a) && ((si.a) b10).g()) {
            return true;
        }
        return false;
    }
}
