package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class cs extends Drawable {
    public final Drawable f27239a;
    public final Drawable f27240b;
    public float f27241c;
    public float d = 255.0f;

    public cs(Drawable drawable, Drawable drawable2) {
        this.f27239a = drawable;
        this.f27240b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new bs(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new bs(this, 1));
        }
    }

    public final void a(float f7) {
        this.f27241c = f7;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = (int) ((1.0f - this.f27241c) * this.d);
        Drawable drawable = this.f27239a;
        drawable.setAlpha(i10);
        int i11 = (int) (this.d * this.f27241c);
        Drawable drawable2 = this.f27240b;
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
        return this.f27239a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27239a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f27239a.setBounds(rect);
        this.f27240b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27239a.setColorFilter(colorFilter);
    }
}
