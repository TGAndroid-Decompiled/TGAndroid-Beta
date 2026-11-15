package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class dr extends Drawable {
    public final Drawable f34039a;
    public final Drawable f34040b;
    public float f34041c;
    public float d = 255.0f;

    public dr(Drawable drawable, Drawable drawable2) {
        this.f34039a = drawable;
        this.f34040b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new cr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new cr(this, 1));
        }
    }

    public final void a(float f10) {
        this.f34041c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f34041c) * this.d);
        Drawable drawable = this.f34039a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f34041c);
        Drawable drawable2 = this.f34040b;
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
        return this.f34039a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34039a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f34039a.setBounds(rect);
        this.f34040b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34039a.setColorFilter(colorFilter);
    }
}
