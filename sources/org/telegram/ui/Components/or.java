package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class or extends Drawable {
    public final Drawable f29170a;
    public final Drawable f29171b;
    public float f29172c;
    public float d = 255.0f;
    public ValueAnimator f29173e;

    public or(Drawable drawable, Drawable drawable2) {
        this.f29170a = drawable;
        this.f29171b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new nr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new nr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f29173e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29172c, f7);
        this.f29173e = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 15));
        this.f29173e.setDuration(Math.abs(this.f29172c - f7) * 200.0f);
        this.f29173e.setInterpolator(pr.f29467f);
        this.f29173e.start();
    }

    public final void b(float f7) {
        this.f29172c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f29172c) * this.d);
        Drawable drawable = this.f29170a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f29172c);
        Drawable drawable2 = this.f29171b;
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
        return this.f29170a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29170a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f29170a.setBounds(rect);
        this.f29171b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29170a.setColorFilter(colorFilter);
    }
}
