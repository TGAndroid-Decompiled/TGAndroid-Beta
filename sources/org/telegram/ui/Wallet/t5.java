package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class t5 extends org.telegram.ui.Components.q6 {
    public final int f34899s;
    public final v5 v;

    public t5(v5 v5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.f34899s = i10;
        this.v = v5Var;
    }

    public static void e(t5 t5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(t5 t5Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        switch (this.f34899s) {
            case 0:
                float c10 = getDrawable().c();
                v5 v5Var = this.v;
                float a2 = v5Var.a();
                if (c10 > 0.0f) {
                    f7 = Math.min(1.0f, v5Var.f34970b0 / c10);
                } else {
                    f7 = 1.0f;
                }
                float f10 = ((f7 - a2) * v5Var.f34968a0) + a2;
                v5Var.f34969b = f10;
                int save = canvas.save();
                canvas.scale(f10, f10, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - v5Var.f34968a0) * v5Var.f34980j0.d(v5Var.f34978h0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                v5Var.d(d, false, new o2(drawable, 4), new t3(7, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                v5 v5Var2 = this.v;
                float d10 = (1.0f - v5Var2.f34968a0) * v5Var2.f34980j0.d(v5Var2.f34978h0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                v5Var2.d(d10, false, new o2(drawable2, 4), new t3(8, this, canvas));
                return;
        }
    }
}
