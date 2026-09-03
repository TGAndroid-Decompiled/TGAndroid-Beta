package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class or extends Drawable {
    public final Drawable f29872a;
    public final Drawable f29873b;
    public float f29874c;
    public float d = 255.0f;
    public ValueAnimator f29875e;

    public or(Drawable drawable, Drawable drawable2) {
        this.f29872a = drawable;
        this.f29873b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new nr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new nr(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f29875e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f29874c, f10);
        this.f29875e = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 15));
        this.f29875e.setDuration(Math.abs(this.f29874c - f10) * 200.0f);
        this.f29875e.setInterpolator(pr.f30168f);
        this.f29875e.start();
    }

    public final void b(float f10) {
        this.f29874c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f29874c) * this.d);
        Drawable drawable = this.f29872a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f29874c);
        Drawable drawable2 = this.f29873b;
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
        return this.f29872a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29872a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f29872a.setBounds(rect);
        this.f29873b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29872a.setColorFilter(colorFilter);
    }
}
