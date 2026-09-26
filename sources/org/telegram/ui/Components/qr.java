package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class qr extends Drawable {
    public final Drawable f27749a;
    public final Drawable f27750b;
    public float f27751c;
    public float d = 255.0f;
    public ValueAnimator e;

    public qr(Drawable drawable, Drawable drawable2) {
        this.f27749a = drawable;
        this.f27750b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new pr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new pr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27751c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 15));
        this.e.setDuration(Math.abs(this.f27751c - f7) * 200.0f);
        this.e.setInterpolator(rr.f28030f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f27751c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27751c) * this.d);
        Drawable drawable = this.f27749a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27751c);
        Drawable drawable2 = this.f27750b;
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
        return this.f27749a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27749a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27749a.setBounds(rect);
        this.f27750b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27749a.setColorFilter(colorFilter);
    }
}
