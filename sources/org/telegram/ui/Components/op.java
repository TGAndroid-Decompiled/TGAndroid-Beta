package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public abstract class op extends Drawable {
    public final Paint f36674a;
    public long f36675b;
    public final RectF f36676c;
    public float d;
    public boolean f36677e;
    public int f36678f;
    public int f36679g;

    public op() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op.draw(android.graphics.Canvas):void");
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

    public op(float f10) {
        Paint paint = new Paint(1);
        this.f36674a = paint;
        new DecelerateInterpolator();
        this.f36676c = new RectF();
        this.f36679g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f36678f = org.telegram.messenger.g0.L(8.0f);
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
