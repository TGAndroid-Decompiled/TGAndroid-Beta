package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class r0 extends Drawable {
    public static final float[][] h = {new float[]{7.0f, 9.5f, 10.25f}, new float[]{12.0f, 17.0f, 10.25f}, new float[]{7.0f, 13.0f, 13.75f}, new float[]{15.5f, 17.0f, 13.75f}};
    public final Paint f40891a;
    public final Paint f40892b;
    public final RectF f40893c;
    public float d;
    public boolean f40894e;
    public ValueAnimator f40895f;
    public int f40896g;

    public r0(boolean z10) {
        float f10;
        Paint paint = new Paint(1);
        this.f40891a = paint;
        Paint paint2 = new Paint(1);
        this.f40892b = paint2;
        this.f40893c = new RectF();
        this.f40896g = 255;
        this.f40894e = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r0.draw(android.graphics.Canvas):void");
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
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40896g = i7;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40891a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
