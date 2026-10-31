package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class fr extends Drawable {
    public final Drawable f26120a;
    public final Drawable f26121b;
    public float f26122c;
    public float d = 255.0f;

    public fr(Drawable drawable, Drawable drawable2) {
        this.f26120a = drawable;
        this.f26121b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new er(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new er(this, 1));
        }
    }

    public final void a(float f7) {
        this.f26122c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f26122c) * this.d);
        Drawable drawable = this.f26120a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f26122c);
        Drawable drawable2 = this.f26121b;
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
        return this.f26120a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26120a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f26120a.setBounds(rect);
        this.f26121b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26120a.setColorFilter(colorFilter);
    }
}
