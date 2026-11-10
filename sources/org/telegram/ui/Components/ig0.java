package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class ig0 extends Drawable {
    public final Drawable f34620a;
    public final Drawable f34621b;
    public final Paint f34622c;
    public final RectF d;
    public int f34623e;
    public long f34624f;
    public float f34625g;
    public boolean h;
    public boolean f34626i;

    public ig0(Context context) {
        Paint paint = new Paint(1);
        this.f34622c = paint;
        this.d = new RectF();
        this.f34623e = 0;
        this.f34620a = jg.g.h(context, 2131232507);
        this.f34621b = jg.g.h(context, 2131232506);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f34624f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.y(2, bounds.centerY(), drawable), org.telegram.ui.Cells.f1.w(2, bounds.centerX(), drawable), org.telegram.ui.Cells.f1.f(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z9, boolean z10, boolean z11) {
        float f10;
        this.f34626i = z9;
        this.h = z10;
        this.f34624f = SystemClock.elapsedRealtime();
        if (!z11) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f34625g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig0.draw(android.graphics.Canvas):void");
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
        this.f34620a.setColorFilter(colorFilter);
        this.f34621b.setColorFilter(colorFilter);
        this.f34622c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
