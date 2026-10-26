package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.zc1;
public final class u5 extends org.telegram.ui.Components.s6 {
    public final int f37353s;
    public final w5 v;

    public u5(w5 w5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.f37353s = i10;
        this.v = w5Var;
    }

    public static void e(u5 u5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(u5 u5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        switch (this.f37353s) {
            case 0:
                float c10 = getDrawable().c();
                w5 w5Var = this.v;
                float b10 = w5Var.b();
                if (c10 > 0.0f) {
                    f7 = Math.min(1.0f, w5Var.U / c10);
                } else {
                    f7 = 1.0f;
                }
                float f10 = ((f7 - b10) * w5Var.T) + b10;
                w5Var.f37422b = f10;
                int save = canvas.save();
                canvas.scale(f10, f10, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - w5Var.T) * w5Var.f37429f0.d(w5Var.f37426d0, false);
                org.telegram.ui.Components.r6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                w5Var.c(d, new n2(drawable, 4), new zc1(27, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                w5 w5Var2 = this.v;
                float d10 = (1.0f - w5Var2.T) * w5Var2.f37429f0.d(w5Var2.f37426d0, false);
                org.telegram.ui.Components.r6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                w5Var2.c(d10, new n2(drawable2, 4), new zc1(28, this, canvas));
                return;
        }
    }
}
