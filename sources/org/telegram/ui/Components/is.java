package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class is extends Drawable {
    public final Drawable f27272a;
    public final Drawable f27273b;
    public float f27274c;
    public float d = 255.0f;
    public ValueAnimator f27275e;

    public is(Drawable drawable, Drawable drawable2) {
        this.f27272a = drawable;
        this.f27273b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new hs(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new hs(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f27275e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27274c, f7);
        this.f27275e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 16));
        this.f27275e.setDuration(Math.abs(this.f27274c - f7) * 200.0f);
        this.f27275e.setInterpolator(js.f27627f);
        this.f27275e.start();
    }

    public final void b(float f7) {
        this.f27274c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27274c) * this.d);
        Drawable drawable = this.f27272a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27274c);
        Drawable drawable2 = this.f27273b;
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
        return this.f27272a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27272a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27272a.setBounds(rect);
        this.f27273b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27272a.setColorFilter(colorFilter);
    }
}
