package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class pr extends Drawable {
    public final Drawable f27429a;
    public final Drawable f27430b;
    public float f27431c;
    public float d = 255.0f;
    public ValueAnimator e;

    public pr(Drawable drawable, Drawable drawable2) {
        this.f27429a = drawable;
        this.f27430b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new or(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new or(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27431c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 15));
        this.e.setDuration(Math.abs(this.f27431c - f7) * 200.0f);
        this.e.setInterpolator(qr.f27642f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f27431c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27431c) * this.d);
        Drawable drawable = this.f27429a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27431c);
        Drawable drawable2 = this.f27430b;
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
        return this.f27429a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27429a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27429a.setBounds(rect);
        this.f27430b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27429a.setColorFilter(colorFilter);
    }
}
