package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class dr extends Drawable {
    public final Drawable f34052a;
    public final Drawable f34053b;
    public float f34054c;
    public float d = 255.0f;

    public dr(Drawable drawable, Drawable drawable2) {
        this.f34052a = drawable;
        this.f34053b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new cr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new cr(this, 1));
        }
    }

    public final void a(float f10) {
        this.f34054c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f34054c) * this.d);
        Drawable drawable = this.f34052a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f34054c);
        Drawable drawable2 = this.f34053b;
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
        return this.f34052a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34052a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f34052a.setBounds(rect);
        this.f34053b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34052a.setColorFilter(colorFilter);
    }
}
