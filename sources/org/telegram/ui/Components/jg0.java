package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
public final class jg0 implements hi.a, fi.a {
    public final tg.b f27426a;

    public jg0(tg.b bVar) {
        this.f27426a = bVar;
    }

    @Override
    public final int a() {
        return ((fi.a) b()).a();
    }

    public final hi.a b() {
        ei.s f7 = ei.r.f();
        boolean z10 = f7.f6693a;
        tg.b bVar = this.f27426a;
        if (!z10) {
            return bVar.f48710c;
        }
        if (f7.f6694b && Build.VERSION.SDK_INT >= 33) {
            return bVar.f48708a;
        }
        return bVar.f48709b;
    }

    @Override
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        ((fi.a) b()).d(f7, f10, i10, canvas, rectF);
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        b().e(canvas, f7, f10, f11, f12);
    }

    @Override
    public final int f() {
        return ((fi.a) b()).f();
    }

    @Override
    public final int g() {
        return ((fi.a) b()).g();
    }

    @Override
    public final boolean h() {
        hi.a b10 = b();
        if ((b10 instanceof fi.a) && ((fi.a) b10).h()) {
            return true;
        }
        return false;
    }
}
