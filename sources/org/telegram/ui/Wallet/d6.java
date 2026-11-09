package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.wb1;
public final class d6 extends org.telegram.ui.Components.j6 {
    public final int f42369s;
    public final f6 f42370w;

    public d6(f6 f6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.f42369s = i7;
        this.f42370w = f6Var;
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
        switch (this.f42369s) {
            case 0:
                float c10 = getDrawable().c();
                f6 f6Var = this.f42370w;
                float b10 = f6Var.b();
                if (c10 > 0.0f) {
                    f10 = Math.min(1.0f, f6Var.U / c10);
                } else {
                    f10 = 1.0f;
                }
                float f11 = ((f10 - b10) * f6Var.T) + b10;
                f6Var.f42456b = f11;
                int save = canvas.save();
                canvas.scale(f11, f11, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - f6Var.T) * f6Var.f42464f0.e(false, f6Var.f42460d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                f6Var.c(e10, new c3(drawable, 4), new wb1(16, this, canvas));
                canvas.restoreToCount(save);
                return;
            default:
                f6 f6Var2 = this.f42370w;
                float e11 = (1.0f - f6Var2.T) * f6Var2.f42464f0.e(false, f6Var2.f42460d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                f6Var2.c(e11, new c3(drawable2, 4), new wb1(17, this, canvas));
                return;
        }
    }
}
