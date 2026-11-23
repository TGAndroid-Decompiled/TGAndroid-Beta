package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class pc0 extends Drawable implements Drawable.Callback {
    public final fh.g f38525a;
    public final RectF f38526b = new RectF();
    public int f38527c = 255;

    public pc0(fh.g gVar) {
        this.f38525a = gVar;
        gVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f38525a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f38526b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f10 = this.f38527c / 255.0f;
        ci.u.c(canvas, rectF, min, f10);
        ci.u.a(min, f10, 0, canvas, rectF);
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
        this.f38525a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38527c = i7;
        this.f38525a.setAlpha(i7);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38525a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
