package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ir extends Drawable {
    public final Drawable f29453a;
    public final Drawable f29454b;
    public float f29455c;
    public float d = 255.0f;
    public ValueAnimator f29456e;

    public ir(Drawable drawable, Drawable drawable2) {
        this.f29453a = drawable;
        this.f29454b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new hr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new hr(this, 1));
        }
    }

    public final void a(float f9) {
        ValueAnimator valueAnimator = this.f29456e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29455c, f9);
        this.f29456e = ofFloat;
        ofFloat.addUpdateListener(new j6(this, 15));
        this.f29456e.setDuration(Math.abs(this.f29455c - f9) * 200.0f);
        this.f29456e.setInterpolator(jr.f29800f);
        this.f29456e.start();
    }

    public final void b(float f9) {
        this.f29455c = f9;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f29455c) * this.d);
        Drawable drawable = this.f29453a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f29455c);
        Drawable drawable2 = this.f29454b;
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
        return this.f29453a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29453a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f29453a.setBounds(rect);
        this.f29454b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29453a.setColorFilter(colorFilter);
    }
}
