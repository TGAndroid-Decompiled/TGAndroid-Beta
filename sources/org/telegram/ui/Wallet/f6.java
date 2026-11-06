package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
public final class f6 extends org.telegram.ui.Components.j6 {
    public final int f42484s;
    public final h6 f42485w;

    public f6(h6 h6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f42484s = i7;
        this.f42485w = h6Var;
    }

    public static void e(f6 f6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public static void f(f6 f6Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        switch (this.f42484s) {
            case 0:
                float c10 = getDrawable().c();
                h6 h6Var = this.f42485w;
                float b10 = h6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, h6Var.U / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * h6Var.T) + b10;
                h6Var.f42568b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - h6Var.T) * h6Var.f42576f0.e(false, h6Var.f42572d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                h6Var.c(e10, new e3(drawable, 4), new n(15, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                h6 h6Var2 = this.f42485w;
                float e11 = (1.0f - h6Var2.T) * h6Var2.f42576f0.e(false, h6Var2.f42572d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                h6Var2.c(e11, new e3(drawable2, 4), new n(16, this, canvas));
                return;
        }
    }
}
