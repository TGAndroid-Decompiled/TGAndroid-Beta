package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class lg0 extends Drawable {
    public final Drawable f36790a;
    public final Drawable f36791b;
    public final Paint f36792c;
    public final RectF d;
    public int f36793e;
    public long f36794f;
    public float f36795g;
    public boolean h;
    public boolean f36796i;

    public lg0(Context context) {
        Paint paint = new Paint(1);
        this.f36792c = paint;
        this.d = new RectF();
        this.f36793e = 0;
        this.f36790a = i5.c.g(context, 2131232508);
        this.f36791b = i5.c.g(context, 2131232507);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f36794f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.y0.A(2, bounds.centerX(), drawable), org.telegram.ui.Cells.y0.y(2, bounds.centerY(), drawable), org.telegram.ui.Cells.y0.w(2, bounds.centerX(), drawable), org.telegram.ui.Cells.y0.h(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f10;
        this.f36796i = z10;
        this.h = z11;
        this.f36794f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f36795g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg0.draw(android.graphics.Canvas):void");
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
        this.f36790a.setColorFilter(colorFilter);
        this.f36791b.setColorFilter(colorFilter);
        this.f36792c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
