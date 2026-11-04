package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class yb0 extends Drawable implements Drawable.Callback {
    public final gh.g f40677a;
    public final RectF f40678b = new RectF();
    public int f40679c = 255;

    public yb0(gh.g gVar) {
        this.f40677a = gVar;
        gVar.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f40677a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.f40678b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f10 = this.f40679c / 255.0f;
        bi.u.c(canvas, rectF, min, f10);
        bi.u.a(min, f10, 0, canvas, rectF);
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
        this.f40677a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40679c = i3;
        this.f40677a.setAlpha(i3);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40677a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
