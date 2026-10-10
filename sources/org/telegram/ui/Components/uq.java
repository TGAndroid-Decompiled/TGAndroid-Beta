package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class uq extends Drawable {
    public final Drawable f31623a;
    public Path f31624b;
    public final RectF f31625c;
    public final RectF d;
    public boolean f31626e;
    public final float[] f31627f;

    public uq(Drawable drawable) {
        i.f fVar = new i.f(this, 2);
        this.f31625c = new RectF();
        this.d = new RectF();
        this.f31626e = false;
        this.f31627f = new float[8];
        Drawable drawable2 = this.f31623a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f31623a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f31623a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.f31626e) {
            return;
        }
        Path path = this.f31624b;
        if (path == null) {
            this.f31624b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f31625c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f31624b.addRoundRect(rectF, this.f31627f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31623a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f31626e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f31623a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f31624b);
            this.f31623a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f31623a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f31623a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f31623a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f31623a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
