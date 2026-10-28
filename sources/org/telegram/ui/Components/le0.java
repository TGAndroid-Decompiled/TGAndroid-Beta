package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class le0 extends Drawable implements Drawable.Callback {
    public final eh.d f30239a;
    public final RectF f30240b = new RectF();
    public int f30241c = 255;

    public le0(eh.d dVar) {
        this.f30239a = dVar;
        dVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f30239a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f30240b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f7 = this.f30241c / 255.0f;
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
        this.f30239a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30241c = i10;
        this.f30239a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30239a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
