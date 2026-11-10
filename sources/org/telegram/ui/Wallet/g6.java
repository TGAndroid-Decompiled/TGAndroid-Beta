package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.sb1;
public final class g6 extends org.telegram.ui.Components.i6 {
    public final int f42532s;
    public final i6 f42533w;

    public g6(i6 i6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f42532s = i7;
        this.f42533w = i6Var;
    }

    public static void e(g6 g6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(g6 g6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f42532s) {
            case 0:
                float c10 = getDrawable().c();
                i6 i6Var = this.f42533w;
                float b10 = i6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, i6Var.U / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * i6Var.T) + b10;
                i6Var.f42622b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - i6Var.T) * i6Var.f42630f0.e(false, i6Var.f42626d0);
                org.telegram.ui.Components.h6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                i6Var.c(e10, new c3(drawable, 4), new sb1(16, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                i6 i6Var2 = this.f42533w;
                float e11 = (1.0f - i6Var2.T) * i6Var2.f42630f0.e(false, i6Var2.f42626d0);
                org.telegram.ui.Components.h6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                i6Var2.c(e11, new c3(drawable2, 4), new sb1(17, this, canvas));
                return;
        }
    }
}
