package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class mr extends Drawable {
    public final Drawable f37618a;
    public final Drawable f37619b;
    public float f37620c;
    public float d = 255.0f;

    public mr(Drawable drawable, Drawable drawable2) {
        this.f37618a = drawable;
        this.f37619b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new lr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new lr(this, 1));
        }
    }

    public final void a(float f10) {
        this.f37620c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f37620c) * this.d);
        Drawable drawable = this.f37618a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f37620c);
        Drawable drawable2 = this.f37619b;
        drawable2.setAlpha(i10);
        if (i7 > 0) {
            drawable.draw(canvas);
        }
        if (i10 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f37618a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37618a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f37618a.setBounds(rect);
        this.f37619b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37618a.setColorFilter(colorFilter);
    }
}
