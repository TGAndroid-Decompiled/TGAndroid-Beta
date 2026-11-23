package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class jr extends Drawable {
    public final Drawable f36496a;
    public final Drawable f36497b;
    public float f36498c;
    public float d = 255.0f;

    public jr(Drawable drawable, Drawable drawable2) {
        this.f36496a = drawable;
        this.f36497b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new ir(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new ir(this, 1));
        }
    }

    public final void a(float f10) {
        this.f36498c = f10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7 = (int) ((1.0f - this.f36498c) * this.d);
        Drawable drawable = this.f36496a;
        drawable.setAlpha(i7);
        int i10 = (int) (this.d * this.f36498c);
        Drawable drawable2 = this.f36497b;
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
        return this.f36496a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36496a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f36496a.setBounds(rect);
        this.f36497b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36496a.setColorFilter(colorFilter);
    }
}
