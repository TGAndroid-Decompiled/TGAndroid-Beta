package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class le0 extends Drawable implements Drawable.Callback {
    public final dh.d f28146a;
    public final RectF f28147b = new RectF();
    public int f28148c = 255;

    public le0(dh.d dVar) {
        this.f28146a = dVar;
        dVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f28146a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f28147b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f7 = this.f28148c / 255.0f;
        zh.t.c(canvas, rectF, min, f7);
        zh.t.a(canvas, rectF, min, 0, f7);
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
        this.f28146a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28148c = i10;
        this.f28146a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28146a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
