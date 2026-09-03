package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class lr extends Drawable {
    public final Drawable f26866a;
    public final Drawable f26867b;
    public float f26868c;
    public float d = 255.0f;
    public ValueAnimator e;

    public lr(Drawable drawable, Drawable drawable2) {
        this.f26866a = drawable;
        this.f26867b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new kr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new kr(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26868c, f10);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 15));
        this.e.setDuration(Math.abs(this.f26868c - f10) * 200.0f);
        this.e.setInterpolator(mr.f27122f);
        this.e.start();
    }

    public final void b(float f10) {
        this.f26868c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f26868c) * this.d);
        Drawable drawable = this.f26866a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f26868c);
        Drawable drawable2 = this.f26867b;
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
        return this.f26866a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26866a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f26866a.setBounds(rect);
        this.f26867b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26866a.setColorFilter(colorFilter);
    }
}
