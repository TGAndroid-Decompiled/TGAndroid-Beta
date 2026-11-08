package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class e6 extends org.telegram.ui.Components.j6 {
    public final int f42451s;
    public final g6 f42452w;

    public e6(g6 g6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f42451s = i7;
        this.f42452w = g6Var;
    }

    public static void e(e6 e6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(e6 e6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f42451s) {
            case 0:
                float c10 = getDrawable().c();
                g6 g6Var = this.f42452w;
                float b10 = g6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, g6Var.U / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * g6Var.T) + b10;
                g6Var.f42538b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - g6Var.T) * g6Var.f42546f0.e(false, g6Var.f42542d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                g6Var.c(e10, new d3(drawable, 4), new n(15, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                g6 g6Var2 = this.f42452w;
                float e11 = (1.0f - g6Var2.T) * g6Var2.f42546f0.e(false, g6Var2.f42542d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                g6Var2.c(e11, new d3(drawable2, 4), new n(16, this, canvas));
                return;
        }
    }
}
