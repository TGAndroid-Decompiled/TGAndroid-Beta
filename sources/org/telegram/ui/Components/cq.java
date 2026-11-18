package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class cq extends Drawable {
    public final Drawable f34159a;
    public Path f34160b;
    public final RectF f34161c;
    public final RectF d;
    public boolean f34162e;
    public final float[] f34163f;

    public cq(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f34161c = new RectF();
        this.d = new RectF();
        this.f34162e = false;
        this.f34163f = new float[8];
        Drawable drawable2 = this.f34159a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f34159a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f34159a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f34162e) {
            return;
        }
        Path path = this.f34160b;
        if (path == null) {
            this.f34160b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f34161c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f34160b.addRoundRect(rectF, this.f34163f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f34159a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f34162e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f34159a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f34160b);
            this.f34159a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f34159a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f34159a;
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
    public final void setAlpha(int i7) {
        Drawable drawable = this.f34159a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34159a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
