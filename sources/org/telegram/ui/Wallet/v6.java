package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class v6 extends org.telegram.ui.Components.o6 {
    public final int f45207s;
    public final x6 f45208w;

    public v6(x6 x6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f45207s = i7;
        this.f45208w = x6Var;
    }

    public static void e(v6 v6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(v6 v6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f45207s) {
            case 0:
                float c10 = getDrawable().c();
                x6 x6Var = this.f45208w;
                float b10 = x6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, x6Var.V / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * x6Var.U) + b10;
                x6Var.f45298b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - x6Var.U) * x6Var.f45307g0.e(false, x6Var.f45304e0);
                org.telegram.ui.Components.n6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x6Var.c(e10, new h3(drawable, 4), new u4(5, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                x6 x6Var2 = this.f45208w;
                float e11 = (1.0f - x6Var2.U) * x6Var2.f45307g0.e(false, x6Var2.f45304e0);
                org.telegram.ui.Components.n6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x6Var2.c(e11, new h3(drawable2, 4), new u4(6, this, canvas));
                return;
        }
    }
}
