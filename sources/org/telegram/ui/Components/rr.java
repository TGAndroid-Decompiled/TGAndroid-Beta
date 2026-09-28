package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class rr extends Drawable {
    public final Drawable f28036a;
    public final Drawable f28037b;
    public float f28038c;
    public float d = 255.0f;
    public ValueAnimator e;

    public rr(Drawable drawable, Drawable drawable2) {
        this.f28036a = drawable;
        this.f28037b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new qr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new qr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28038c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 15));
        this.e.setDuration(Math.abs(this.f28038c - f7) * 200.0f);
        this.e.setInterpolator(sr.f28348f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f28038c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f28038c) * this.d);
        Drawable drawable = this.f28036a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f28038c);
        Drawable drawable2 = this.f28037b;
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
        return this.f28036a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28036a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f28036a.setBounds(rect);
        this.f28037b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28036a.setColorFilter(colorFilter);
    }
}
