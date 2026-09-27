package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class rr extends Drawable {
    public final Drawable f28079a;
    public final Drawable f28080b;
    public float f28081c;
    public float d = 255.0f;
    public ValueAnimator e;

    public rr(Drawable drawable, Drawable drawable2) {
        this.f28079a = drawable;
        this.f28080b = drawable2;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28081c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 15));
        this.e.setDuration(Math.abs(this.f28081c - f7) * 200.0f);
        this.e.setInterpolator(sr.f28359f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f28081c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f28081c) * this.d);
        Drawable drawable = this.f28079a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f28081c);
        Drawable drawable2 = this.f28080b;
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
        return this.f28079a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28079a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f28079a.setBounds(rect);
        this.f28080b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28079a.setColorFilter(colorFilter);
    }
}
