package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.ma1;
public final class d6 extends org.telegram.ui.Components.h6 {
    public final int f42433s;
    public final f6 f42434w;

    public d6(f6 f6Var, Context context, int i3) {
        super(context, false, true, true, true, true);
        this.f42433s = i3;
        this.f42434w = f6Var;
    }

    public static void e(d6 d6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(d6 d6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f42433s) {
            case 0:
                float c2 = getDrawable().c();
                f6 f6Var = this.f42434w;
                float b10 = f6Var.b();
                if (c2 > 0.0f) {
                    f10 = Math.min(1.0f, f6Var.V / c2);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * f6Var.U) + b10;
                f6Var.f42524b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - f6Var.U) * f6Var.f42533g0.e(false, f6Var.f42530e0);
                org.telegram.ui.Components.g6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                f6Var.c(e10, new c3(drawable, 4), new ma1(20, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                f6 f6Var2 = this.f42434w;
                float e11 = (1.0f - f6Var2.U) * f6Var2.f42533g0.e(false, f6Var2.f42530e0);
                org.telegram.ui.Components.g6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                f6Var2.c(e11, new c3(drawable2, 4), new ma1(21, this, canvas));
                return;
        }
    }
}
