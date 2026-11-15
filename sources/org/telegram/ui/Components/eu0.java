package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
public final class eu0 extends Drawable implements Drawable.Callback {
    public final g6 f34437a;
    public final Paint f34438b;

    public eu0() {
        g6 g6Var = new g6(false, true, true);
        this.f34437a = g6Var;
        g6Var.setCallback(this);
        g6Var.n(0.3f, 165L, er.h);
        g6Var.f34829b = 1;
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = g6Var.f34827a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.6f));
        Paint paint = new Paint(1);
        this.f34438b = paint;
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

    public final void b(boolean z10, float f10) {
        String str = a(f10) + "X";
        g6 g6Var = this.f34437a;
        if (z10 && TextUtils.equals(g6Var.f34836i, str)) {
            return;
        }
        g6Var.a();
        g6Var.t(str, z10, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        g6 g6Var = this.f34437a;
        Paint paint = this.f34438b;
        if (paint != null) {
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
            RectF rectF = org.telegram.messenger.g0.P;
            float L = ((org.telegram.messenger.g0.L(24.0f) - g6Var.c()) / 2.0f) - org.telegram.messenger.g0.N(3.0f);
            float N = org.telegram.messenger.g0.N(0.2f) + ((org.telegram.messenger.g0.L(24.0f) - g6Var.f34833e) / 2.0f);
            float c10 = g6Var.c();
            rectF.set(L, N, org.telegram.messenger.g0.N(3.0f) + ((c10 + org.telegram.messenger.g0.L(24.0f)) / 2.0f), (org.telegram.messenger.g0.L(24.0f) + g6Var.f34833e) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint);
        }
        g6Var.f34827a.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        g6Var.setBounds(0, (int) ((org.telegram.messenger.g0.L(24.0f) - g6Var.f34833e) / 2.0f), org.telegram.messenger.g0.L(24.0f), (int) ((org.telegram.messenger.g0.L(24.0f) + g6Var.f34833e) / 2.0f));
        g6Var.draw(canvas);
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
        this.f34437a.C = i7;
        Paint paint = this.f34438b;
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
