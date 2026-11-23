package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class xg0 extends Drawable {
    public final Drawable f42084a;
    public final Drawable f42085b;
    public final Paint f42086c;
    public final RectF d;
    public int f42087e;
    public long f42088f;
    public float f42089g;
    public boolean h;
    public boolean f42090i;

    public xg0(Context context) {
        Paint paint = new Paint(1);
        this.f42086c = paint;
        this.d = new RectF();
        this.f42087e = 0;
        this.f42084a = i5.c.g(context, 2131232509);
        this.f42085b = i5.c.g(context, 2131232508);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f42088f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.c0.C(2, bounds.centerX(), drawable), org.telegram.ui.Cells.c0.A(2, bounds.centerY(), drawable), org.telegram.ui.Cells.c0.y(2, bounds.centerX(), drawable), org.telegram.ui.Cells.c0.j(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f10;
        this.f42090i = z10;
        this.h = z11;
        this.f42088f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f42089g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xg0.draw(android.graphics.Canvas):void");
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
        this.f42084a.setColorFilter(colorFilter);
        this.f42085b.setColorFilter(colorFilter);
        this.f42086c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
