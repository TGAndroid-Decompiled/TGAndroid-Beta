package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dr extends Drawable {

    public final Drawable f27832a;

    public final Drawable f27833b;

    public float f27834c;
    public float d = 255.0f;

    public ValueAnimator f27835e;

    public dr(Drawable drawable, Drawable drawable2) {
        this.f27832a = drawable;
        this.f27833b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new cr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new cr(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f27835e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27834c, f10);
        this.f27835e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new e6(this, 15));
        this.f27835e.setDuration((long) (Math.abs(this.f27834c - f10) * 200.0f));
        this.f27835e.setInterpolator(er.f28122f);
        this.f27835e.start();
    }

    public final void b(float f10) {
        this.f27834c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27834c) * this.d);
        Drawable drawable = this.f27832a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27834c);
        Drawable drawable2 = this.f27833b;
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
        return this.f27832a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27832a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27832a.setBounds(rect);
        this.f27833b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27832a.setColorFilter(colorFilter);
    }
}
