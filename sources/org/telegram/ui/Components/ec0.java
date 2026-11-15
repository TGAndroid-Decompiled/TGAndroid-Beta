package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ec0 extends Drawable implements Drawable.Callback {
    public final fh.g f34269a;
    public final RectF f34270b = new RectF();
    public int f34271c = 255;

    public ec0(fh.g gVar) {
        this.f34269a = gVar;
        gVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f34269a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f34270b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f10 = this.f34271c / 255.0f;
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
        this.f34269a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34271c = i7;
        this.f34269a.setAlpha(i7);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34269a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
