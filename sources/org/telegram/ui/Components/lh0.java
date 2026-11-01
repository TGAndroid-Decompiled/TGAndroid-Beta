package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class lh0 extends Drawable {
    public final Drawable f28167a;
    public final Drawable f28168b;
    public final Paint f28169c;
    public final RectF d;
    public int e;
    public long f28170f;
    public float f28171g;
    public boolean h;
    public boolean f28172i;

    public lh0(Context context) {
        Paint paint = new Paint(1);
        this.f28169c = paint;
        this.d = new RectF();
        this.e = 0;
        this.f28167a = i0.a.f(context, 2131232506);
        this.f28168b = i0.a.f(context, 2131232505);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f28170f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.y(2, bounds.centerY(), drawable), org.telegram.ui.Cells.f1.w(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.f(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f28172i = z10;
        this.h = z11;
        this.f28170f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f28171g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lh0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28167a.setColorFilter(colorFilter);
        this.f28168b.setColorFilter(colorFilter);
        this.f28169c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
