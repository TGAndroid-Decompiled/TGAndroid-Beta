package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class vp extends Drawable {
    public final Drawable f41124a;
    public Path f41125b;
    public final RectF f41126c;
    public final RectF d;
    public boolean f41127e;
    public final float[] f41128f;

    public vp(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f41126c = new RectF();
        this.d = new RectF();
        this.f41127e = false;
        this.f41128f = new float[8];
        Drawable drawable2 = this.f41124a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f41124a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f41124a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f41127e) {
            return;
        }
        Path path = this.f41125b;
        if (path == null) {
            this.f41125b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f41126c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f41125b.addRoundRect(rectF, this.f41128f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f41124a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f41127e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f41124a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f41125b);
            this.f41124a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f41124a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f41124a;
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
        Drawable drawable = this.f41124a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f41124a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
