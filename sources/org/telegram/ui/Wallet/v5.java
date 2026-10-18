package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class v5 extends org.telegram.ui.Components.q6 {
    public final int f34996s;
    public final x5 v;

    public v5(x5 x5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.f34996s = i10;
        this.v = x5Var;
    }

    public static void e(v5 v5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(v5 v5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        switch (this.f34996s) {
            case 0:
                float c10 = getDrawable().c();
                x5 x5Var = this.v;
                float a2 = x5Var.a();
                if (c10 > 0.0f) {
                    f7 = Math.min(1.0f, x5Var.V / c10);
                } else {
                    f7 = 1.0f;
                }
                float f10 = ((f7 - a2) * x5Var.U) + a2;
                x5Var.f35084b = f10;
                int save = canvas.save();
                canvas.scale(f10, f10, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - x5Var.U) * x5Var.f35095j0.d(x5Var.f35093h0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x5Var.b(d, false, new o2(drawable, 4), new v3(8, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                x5 x5Var2 = this.v;
                float d10 = (1.0f - x5Var2.U) * x5Var2.f35095j0.d(x5Var2.f35093h0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x5Var2.b(d10, false, new o2(drawable2, 4), new v3(9, this, canvas));
                return;
        }
    }
}
