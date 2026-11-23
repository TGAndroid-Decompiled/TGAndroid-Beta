package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public abstract class cq extends Drawable {
    public final Paint f34103a;
    public long f34104b;
    public final RectF f34105c;
    public float d;
    public boolean f34106e;
    public int f34107f;
    public int f34108g;

    public cq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq.draw(android.graphics.Canvas):void");
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

    public cq(float f10) {
        Paint paint = new Paint(1);
        this.f34103a = paint;
        new DecelerateInterpolator();
        this.f34105c = new RectF();
        this.f34108g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f34107f = org.telegram.messenger.g0.L(8.0f);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
