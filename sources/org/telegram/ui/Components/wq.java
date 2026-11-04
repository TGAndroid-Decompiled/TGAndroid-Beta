package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class wq extends Drawable {
    public final Drawable f40053a;
    public final Drawable f40054b;
    public float f40055c;
    public float d = 255.0f;

    public wq(Drawable drawable, Drawable drawable2) {
        this.f40053a = drawable;
        this.f40054b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new vq(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new vq(this, 1));
        }
    }

    public final void a(float f10) {
        this.f40055c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3 = (int) ((1.0f - this.f40055c) * this.d);
        Drawable drawable = this.f40053a;
        drawable.setAlpha(i3);
        int i10 = (int) (this.d * this.f40055c);
        Drawable drawable2 = this.f40054b;
        drawable2.setAlpha(i10);
        if (i3 > 0) {
            drawable.draw(canvas);
        }
        if (i10 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f40053a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f40053a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f40053a.setBounds(rect);
        this.f40054b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i3) {
        this.d = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40053a.setColorFilter(colorFilter);
    }
}
