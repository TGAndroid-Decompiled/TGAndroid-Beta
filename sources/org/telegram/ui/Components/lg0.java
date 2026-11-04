package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class lg0 extends Drawable {
    public final Drawable f35720a;
    public final Drawable f35721b;
    public final Paint f35722c;
    public final RectF d;
    public int f35723e;
    public long f35724f;
    public float f35725g;
    public boolean h;
    public boolean f35726i;

    public lg0(Context context) {
        Paint paint = new Paint(1);
        this.f35722c = paint;
        this.d = new RectF();
        this.f35723e = 0;
        this.f35720a = k2.p1.g(context, 2131232507);
        this.f35721b = k2.p1.g(context, 2131232506);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f35724f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.B(2, bounds.centerY(), drawable), org.telegram.ui.Cells.f1.z(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.i(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f10;
        this.f35726i = z10;
        this.h = z11;
        this.f35724f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f35725g = f10;
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
        this.f35720a.setColorFilter(colorFilter);
        this.f35721b.setColorFilter(colorFilter);
        this.f35722c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
