package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class wq extends Drawable {
    public final Drawable f40063a;
    public final Drawable f40064b;
    public float f40065c;
    public float d = 255.0f;

    public wq(Drawable drawable, Drawable drawable2) {
        this.f40063a = drawable;
        this.f40064b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new vq(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new vq(this, 1));
        }
    }

    public final void a(float f10) {
        this.f40065c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f40065c) * this.d);
        Drawable drawable = this.f40063a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f40065c);
        Drawable drawable2 = this.f40064b;
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
        return this.f40063a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f40063a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f40063a.setBounds(rect);
        this.f40064b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40063a.setColorFilter(colorFilter);
    }
}
