package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class j6 extends org.telegram.ui.Components.f6 {
    public final int f34759s;
    public final l6 f34760w;

    public j6(l6 l6Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.f34759s = i10;
        this.f34760w = l6Var;
    }

    public static void e(j6 j6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(j6 j6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        switch (this.f34759s) {
            case 0:
                float c10 = getDrawable().c();
                l6 l6Var = this.f34760w;
                float b10 = l6Var.b();
                if (c10 > 0.0f) {
                    f7 = Math.min(1.0f, l6Var.U / c10);
                } else {
                    f7 = 1.0f;
                }
                float f10 = ((f7 - b10) * l6Var.T) + b10;
                l6Var.f34850b = f10;
                int save = canvas.save();
                canvas.scale(f10, f10, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - l6Var.T) * l6Var.f34857f0.e(false, l6Var.f34854d0);
                org.telegram.ui.Components.e6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                l6Var.c(e, new e3(drawable, 4), new m2(9, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                l6 l6Var2 = this.f34760w;
                float e7 = (1.0f - l6Var2.T) * l6Var2.f34857f0.e(false, l6Var2.f34854d0);
                org.telegram.ui.Components.e6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                l6Var2.c(e7, new e3(drawable2, 4), new m2(10, this, canvas));
                return;
        }
    }
}
