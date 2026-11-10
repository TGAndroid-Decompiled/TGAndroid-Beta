package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class vq extends Drawable {
    public final Drawable f39713a;
    public final Drawable f39714b;
    public float f39715c;
    public float d = 255.0f;

    public vq(Drawable drawable, Drawable drawable2) {
        this.f39713a = drawable;
        this.f39714b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new uq(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new uq(this, 1));
        }
    }

    public final void a(float f10) {
        this.f39715c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f39715c) * this.d);
        Drawable drawable = this.f39713a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f39715c);
        Drawable drawable2 = this.f39714b;
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
        return this.f39713a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f39713a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f39713a.setBounds(rect);
        this.f39714b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39713a.setColorFilter(colorFilter);
    }
}
