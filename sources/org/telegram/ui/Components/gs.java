package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class gs extends Drawable {
    public final Drawable f26865a;
    public final Drawable f26866b;
    public float f26867c;
    public float d = 255.0f;
    public ValueAnimator f26868e;

    public gs(Drawable drawable, Drawable drawable2) {
        this.f26865a = drawable;
        this.f26866b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new fs(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new fs(this, 1));
        }
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f26868e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26867c, f7);
        this.f26868e = ofFloat;
        ofFloat.addUpdateListener(new m6(this, 16));
        this.f26868e.setDuration(Math.abs(this.f26867c - f7) * 200.0f);
        this.f26868e.setInterpolator(hs.f27118f);
        this.f26868e.start();
    }

    public final void b(float f7) {
        this.f26867c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f26867c) * this.d);
        Drawable drawable = this.f26865a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f26867c);
        Drawable drawable2 = this.f26866b;
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
        return this.f26865a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26865a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f26865a.setBounds(rect);
        this.f26866b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26865a.setColorFilter(colorFilter);
    }
}
