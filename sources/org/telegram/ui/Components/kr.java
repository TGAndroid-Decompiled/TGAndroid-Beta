package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class kr extends Drawable {
    public final Drawable f36863a;
    public final Drawable f36864b;
    public float f36865c;
    public float d = 255.0f;

    public kr(Drawable drawable, Drawable drawable2) {
        this.f36863a = drawable;
        this.f36864b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new jr(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new jr(this, 1));
        }
    }

    public final void a(float f10) {
        this.f36865c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f36865c) * this.d);
        Drawable drawable = this.f36863a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f36865c);
        Drawable drawable2 = this.f36864b;
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
        return this.f36863a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36863a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f36863a.setBounds(rect);
        this.f36864b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36863a.setColorFilter(colorFilter);
    }
}
