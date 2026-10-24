package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class yr extends Drawable {
    public final Drawable f33025a;
    public final Drawable f33026b;
    public float f33027c;
    public float d = 255.0f;
    public ValueAnimator e;

    public yr(Drawable drawable, Drawable drawable2) {
        this.f33025a = drawable;
        this.f33026b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new xr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new xr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33027c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 16));
        this.e.setDuration(Math.abs(this.f33027c - f7) * 200.0f);
        this.e.setInterpolator(zr.f33337f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f33027c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f33027c) * this.d);
        Drawable drawable = this.f33025a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f33027c);
        Drawable drawable2 = this.f33026b;
        drawable2.setAlpha(i11);
        if (i10 > 0) {
            drawable.draw(canvas);
        }
        if (i11 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33025a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33025a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f33025a.setBounds(rect);
        this.f33026b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33025a.setColorFilter(colorFilter);
    }
}
