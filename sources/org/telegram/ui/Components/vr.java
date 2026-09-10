package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class vr extends Drawable {
    public final Drawable f28589a;
    public final Drawable f28590b;
    public float f28591c;
    public float d = 255.0f;
    public ValueAnimator e;

    public vr(Drawable drawable, Drawable drawable2) {
        this.f28589a = drawable;
        this.f28590b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new ur(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new ur(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28591c, f7);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 15));
        this.e.setDuration(Math.abs(this.f28591c - f7) * 200.0f);
        this.e.setInterpolator(wr.f28819f);
        this.e.start();
    }

    public final void b(float f7) {
        this.f28591c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f28591c) * this.d);
        Drawable drawable = this.f28589a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f28591c);
        Drawable drawable2 = this.f28590b;
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
        return this.f28589a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28589a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f28589a.setBounds(rect);
        this.f28590b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28589a.setColorFilter(colorFilter);
    }
}
