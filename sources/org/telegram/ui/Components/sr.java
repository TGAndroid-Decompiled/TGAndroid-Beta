package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class sr extends Drawable {
    public final Drawable f30861a;
    public final Drawable f30862b;
    public float f30863c;
    public float d = 255.0f;
    public ValueAnimator f30864e;

    public sr(Drawable drawable, Drawable drawable2) {
        this.f30861a = drawable;
        this.f30862b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new rr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new rr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f30864e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30863c, f7);
        this.f30864e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 15));
        this.f30864e.setDuration(Math.abs(this.f30863c - f7) * 200.0f);
        this.f30864e.setInterpolator(tr.f31140f);
        this.f30864e.start();
    }

    public final void b(float f7) {
        this.f30863c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f30863c) * this.d);
        Drawable drawable = this.f30861a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f30863c);
        Drawable drawable2 = this.f30862b;
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
        return this.f30861a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30861a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f30861a.setBounds(rect);
        this.f30862b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30861a.setColorFilter(colorFilter);
    }
}
