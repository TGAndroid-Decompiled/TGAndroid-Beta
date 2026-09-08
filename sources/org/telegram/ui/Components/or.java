package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class or extends Drawable {
    public final Drawable f29196a;
    public final Drawable f29197b;
    public float f29198c;
    public float d = 255.0f;
    public ValueAnimator f29199e;

    public or(Drawable drawable, Drawable drawable2) {
        this.f29196a = drawable;
        this.f29197b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new nr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new nr(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f29199e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29198c, f7);
        this.f29199e = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 15));
        this.f29199e.setDuration(Math.abs(this.f29198c - f7) * 200.0f);
        this.f29199e.setInterpolator(pr.f29493f);
        this.f29199e.start();
    }

    public final void b(float f7) {
        this.f29198c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f29198c) * this.d);
        Drawable drawable = this.f29196a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f29198c);
        Drawable drawable2 = this.f29197b;
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
        return this.f29196a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29196a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f29196a.setBounds(rect);
        this.f29197b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29196a.setColorFilter(colorFilter);
    }
}
