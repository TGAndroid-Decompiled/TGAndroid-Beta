package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class fr extends Drawable {
    public final Drawable f28556a;
    public final Drawable f28557b;
    public float f28558c;
    public float d = 255.0f;
    public ValueAnimator f28559e;

    public fr(Drawable drawable, Drawable drawable2) {
        this.f28556a = drawable;
        this.f28557b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new er(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new er(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f28559e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28558c, f10);
        this.f28559e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 15));
        this.f28559e.setDuration(Math.abs(this.f28558c - f10) * 200.0f);
        this.f28559e.setInterpolator(gr.f28844f);
        this.f28559e.start();
    }

    public final void b(float f10) {
        this.f28558c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9 = (int) ((1.0f - this.f28558c) * this.d);
        Drawable drawable = this.f28556a;
        drawable.setAlpha(i9);
        int i10 = (int) (this.d * this.f28558c);
        Drawable drawable2 = this.f28557b;
        drawable2.setAlpha(i10);
        if (i9 > 0) {
            drawable.draw(canvas);
        }
        if (i10 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f28556a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28556a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f28556a.setBounds(rect);
        this.f28557b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28556a.setColorFilter(colorFilter);
    }
}
