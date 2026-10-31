package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public abstract class vp extends Drawable {
    public final Paint f31803a;
    public long f31804b;
    public final RectF f31805c;
    public float d;
    public boolean e;
    public int f31806f;
    public int f31807g;

    public vp() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vp.draw(android.graphics.Canvas):void");
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

    public vp(float f7) {
        Paint paint = new Paint(1);
        this.f31803a = paint;
        new DecelerateInterpolator();
        this.f31805c = new RectF();
        this.f31807g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(f7));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f31806f = org.telegram.messenger.i0.L(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
