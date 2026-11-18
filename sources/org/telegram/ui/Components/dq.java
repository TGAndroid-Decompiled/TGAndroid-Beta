package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public abstract class dq extends Drawable {
    public final Paint f34481a;
    public long f34482b;
    public final RectF f34483c;
    public float d;
    public boolean f34484e;
    public int f34485f;
    public int f34486g;

    public dq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq.draw(android.graphics.Canvas):void");
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

    public dq(float f10) {
        Paint paint = new Paint(1);
        this.f34481a = paint;
        new DecelerateInterpolator();
        this.f34483c = new RectF();
        this.f34486g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f34485f = org.telegram.messenger.g0.L(8.0f);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
