package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
public final class du0 extends Drawable implements Drawable.Callback {
    public final i6 f33074a;
    public final Paint f33075b;

    public du0() {
        i6 i6Var = new i6(false, true, true);
        this.f33074a = i6Var;
        i6Var.setCallback(this);
        i6Var.n(0.3f, 165L, xq.h);
        i6Var.f34508b = 1;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f34506a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.6f));
        Paint paint = new Paint(1);
        this.f33075b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float round = Math.round(f10 * 10.0f) / 10.0f;
        long j3 = round;
        if (round == ((float) j3)) {
            return a8.p0.o(j3, "");
        }
        return "" + round;
    }

    public final void b(boolean z9, float f10) {
        String str = a(f10) + "X";
        i6 i6Var = this.f33074a;
        if (z9 && TextUtils.equals(i6Var.f34514i, str)) {
            return;
        }
        i6Var.a();
        i6Var.t(str, z9, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        i6 i6Var = this.f33074a;
        Paint paint = this.f33075b;
        if (paint != null) {
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
            RectF rectF = org.telegram.messenger.g0.P;
            float L = ((org.telegram.messenger.g0.L(24.0f) - i6Var.c()) / 2.0f) - org.telegram.messenger.g0.N(3.0f);
            float N = org.telegram.messenger.g0.N(0.2f) + ((org.telegram.messenger.g0.L(24.0f) - i6Var.f34511e) / 2.0f);
            float c10 = i6Var.c();
            rectF.set(L, N, org.telegram.messenger.g0.N(3.0f) + ((c10 + org.telegram.messenger.g0.L(24.0f)) / 2.0f), (org.telegram.messenger.g0.L(24.0f) + i6Var.f34511e) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
        }
        i6Var.f34506a.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        i6Var.setBounds(0, (int) ((org.telegram.messenger.g0.L(24.0f) - i6Var.f34511e) / 2.0f), org.telegram.messenger.g0.L(24.0f), (int) ((org.telegram.messenger.g0.L(24.0f) + i6Var.f34511e) / 2.0f));
        i6Var.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33074a.B = i7;
        Paint paint = this.f33075b;
        if (paint != null) {
            paint.setAlpha(i7);
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
