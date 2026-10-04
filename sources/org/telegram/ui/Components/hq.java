package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hq extends Drawable {
    public final Drawable f27211a;
    public Path f27212b;
    public final RectF f27213c;
    public final RectF d;
    public boolean f27214e;
    public final float[] f27215f;

    public hq(Drawable drawable) {
        ah.d dVar = new ah.d(this, 3);
        this.f27213c = new RectF();
        this.d = new RectF();
        this.f27214e = false;
        this.f27215f = new float[8];
        Drawable drawable2 = this.f27211a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27211a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f27211a.setCallback(dVar);
        }
    }

    public final void a() {
        if (!this.f27214e) {
            return;
        }
        Path path = this.f27212b;
        if (path == null) {
            this.f27212b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f27213c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f27212b.addRoundRect(rectF, this.f27215f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f27211a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f27214e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f27211a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f27212b);
            this.f27211a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27211a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27211a;
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
        Drawable drawable = this.f27211a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27211a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
