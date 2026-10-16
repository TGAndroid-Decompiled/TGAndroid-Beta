package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ds extends Drawable {
    public final Drawable f24172a;
    public final Drawable f24173b;
    public float f24174c;
    public float d = 255.0f;
    public ValueAnimator e;

    public ds(Drawable drawable, Drawable drawable2) {
        this.f24172a = drawable;
        this.f24173b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new cs(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new cs(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f24174c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new n6(this, 16));
        this.e.setDuration(Math.abs(this.f24174c - f7) * 200.0f);
        this.e.setInterpolator(es.f24465f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f24174c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f24174c) * this.d);
        Drawable drawable = this.f24172a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f24174c);
        Drawable drawable2 = this.f24173b;
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
        return this.f24172a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24172a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f24172a.setBounds(rect);
        this.f24173b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24172a.setColorFilter(colorFilter);
    }
}
