package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class eq extends Drawable {
    public final Drawable f23946a;
    public Path f23947b;
    public final RectF f23948c;
    public final RectF d;
    public boolean e;
    public final float[] f23949f;

    public eq(Drawable drawable) {
        ah.d dVar = new ah.d(this, 3);
        this.f23948c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f23949f = new float[8];
        Drawable drawable2 = this.f23946a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23946a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f23946a.setCallback(dVar);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f23947b;
        if (path == null) {
            this.f23947b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f23948c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f23947b.addRoundRect(rectF, this.f23949f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f23946a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f23946a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f23947b);
            this.f23946a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23946a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23946a;
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
        Drawable drawable = this.f23946a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23946a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
