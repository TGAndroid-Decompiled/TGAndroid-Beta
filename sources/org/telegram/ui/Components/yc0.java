package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class yc0 extends Drawable implements Drawable.Callback {
    public final vg.f f32692a;
    public final RectF f32693b = new RectF();
    public int f32694c = 255;

    public yc0(vg.f fVar) {
        this.f32692a = fVar;
        fVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f32692a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f32693b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f7 = this.f32694c / 255.0f;
        qh.t.c(canvas, rectF, min, f7);
        qh.t.a(canvas, rectF, min, 0, f7);
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
        this.f32692a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32694c = i10;
        this.f32692a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32692a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
