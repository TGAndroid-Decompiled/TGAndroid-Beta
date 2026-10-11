package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class hs extends Drawable {
    public final Drawable f27223a;
    public final Drawable f27224b;
    public float f27225c;
    public float d = 255.0f;
    public ValueAnimator f27226e;

    public hs(Drawable drawable, Drawable drawable2) {
        this.f27223a = drawable;
        this.f27224b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new gs(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new gs(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f27226e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27225c, f7);
        this.f27226e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 16));
        this.f27226e.setDuration(Math.abs(this.f27225c - f7) * 200.0f);
        this.f27226e.setInterpolator(is.f27500f);
        this.f27226e.start();
    }

    public final void b(float f7) {
        this.f27225c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27225c) * this.d);
        Drawable drawable = this.f27223a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27225c);
        Drawable drawable2 = this.f27224b;
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
        return this.f27223a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27223a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27223a.setBounds(rect);
        this.f27224b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27223a.setColorFilter(colorFilter);
    }
}
