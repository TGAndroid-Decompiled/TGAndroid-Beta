package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class rr extends Drawable {
    public final Drawable f28045a;
    public final Drawable f28046b;
    public float f28047c;
    public float d = 255.0f;
    public ValueAnimator e;

    public rr(Drawable drawable, Drawable drawable2) {
        this.f28045a = drawable;
        this.f28046b = drawable2;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28047c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 15));
        this.e.setDuration(Math.abs(this.f28047c - f7) * 200.0f);
        this.e.setInterpolator(sr.f28339f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f28047c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f28047c) * this.d);
        Drawable drawable = this.f28045a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f28047c);
        Drawable drawable2 = this.f28046b;
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
        return this.f28045a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28045a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f28045a.setBounds(rect);
        this.f28046b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28045a.setColorFilter(colorFilter);
    }
}
