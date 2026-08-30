package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class mr extends Drawable {
    public final Drawable f27109a;
    public final Drawable f27110b;
    public float f27111c;
    public float d = 255.0f;
    public ValueAnimator e;

    public mr(Drawable drawable, Drawable drawable2) {
        this.f27109a = drawable;
        this.f27110b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new lr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new lr(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27111c, f10);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 15));
        this.e.setDuration(Math.abs(this.f27111c - f10) * 200.0f);
        this.e.setInterpolator(nr.f27346f);
        this.e.start();
    }

    public final void b(float f10) {
        this.f27111c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27111c) * this.d);
        Drawable drawable = this.f27109a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27111c);
        Drawable drawable2 = this.f27110b;
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
        return this.f27109a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27109a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27109a.setBounds(rect);
        this.f27110b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27109a.setColorFilter(colorFilter);
    }
}
