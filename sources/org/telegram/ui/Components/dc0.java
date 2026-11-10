package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dc0 extends Drawable implements Drawable.Callback {
    public final fh.g f32947a;
    public final RectF f32948b = new RectF();
    public int f32949c = 255;

    public dc0(fh.g gVar) {
        this.f32947a = gVar;
        gVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f32947a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f32948b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f10 = this.f32949c / 255.0f;
        ai.z.c(canvas, rectF, min, f10);
        ai.z.a(min, f10, 0, canvas, rectF);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f32947a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f32949c = i7;
        this.f32947a.setAlpha(i7);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32947a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
