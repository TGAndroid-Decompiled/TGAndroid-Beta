package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class w6 extends org.telegram.ui.Components.n6 {
    public final int f45338s;
    public final y6 f45339w;

    public w6(y6 y6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f45338s = i7;
        this.f45339w = y6Var;
    }

    public static void e(w6 w6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(w6 w6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f45338s) {
            case 0:
                float c10 = getDrawable().c();
                y6 y6Var = this.f45339w;
                float b10 = y6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, y6Var.V / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * y6Var.U) + b10;
                y6Var.f45430b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - y6Var.U) * y6Var.f45439g0.e(false, y6Var.f45436e0);
                org.telegram.ui.Components.m6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                y6Var.c(e10, new i3(drawable, 4), new r(9, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                y6 y6Var2 = this.f45339w;
                float e11 = (1.0f - y6Var2.U) * y6Var2.f45439g0.e(false, y6Var2.f45436e0);
                org.telegram.ui.Components.m6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                y6Var2.c(e11, new i3(drawable2, 4), new r(10, this, canvas));
                return;
        }
    }
}
