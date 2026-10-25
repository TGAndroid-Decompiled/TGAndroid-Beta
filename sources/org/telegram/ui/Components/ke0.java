package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ke0 extends Drawable implements Drawable.Callback {
    public final eh.d f29905a;
    public final RectF f29906b = new RectF();
    public int f29907c = 255;

    public ke0(eh.d dVar) {
        this.f29905a = dVar;
        dVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f29905a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f29906b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f7 = this.f29907c / 255.0f;
        ai.a0.c(canvas, rectF, min, f7);
        ai.a0.a(canvas, rectF, min, 0, f7);
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
        this.f29905a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29907c = i10;
        this.f29905a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29905a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
