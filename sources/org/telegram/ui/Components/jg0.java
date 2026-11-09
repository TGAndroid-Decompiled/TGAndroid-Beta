package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class jg0 extends Drawable {
    public final Drawable f35011a;
    public final Drawable f35012b;
    public final Paint f35013c;
    public final RectF d;
    public int f35014e;
    public long f35015f;
    public float f35016g;
    public boolean h;
    public boolean f35017i;

    public jg0(Context context) {
        Paint paint = new Paint(1);
        this.f35013c = paint;
        this.d = new RectF();
        this.f35014e = 0;
        this.f35011a = jg.g.h(context, 2131232507);
        this.f35012b = jg.g.h(context, 2131232506);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f35015f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.y(2, bounds.centerY(), drawable), org.telegram.ui.Cells.f1.w(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.f(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z9, boolean z10, boolean z11) {
        float f10;
        this.f35017i = z9;
        this.h = z10;
        this.f35015f = SystemClock.elapsedRealtime();
        if (!z11) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f35016g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg0.draw(android.graphics.Canvas):void");
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35011a.setColorFilter(colorFilter);
        this.f35012b.setColorFilter(colorFilter);
        this.f35013c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
