package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class eq extends Drawable {
    public final Drawable f23644a;
    public Path f23645b;
    public final RectF f23646c;
    public final RectF d;
    public boolean e;
    public final float[] f23647f;

    public eq(Drawable drawable) {
        ah.d dVar = new ah.d(this, 3);
        this.f23646c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f23647f = new float[8];
        Drawable drawable2 = this.f23644a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23644a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f23644a.setCallback(dVar);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f23645b;
        if (path == null) {
            this.f23645b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f23646c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f23645b.addRoundRect(rectF, this.f23647f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f23644a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f23644a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f23645b);
            this.f23644a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23644a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23644a;
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
        Drawable drawable = this.f23644a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23644a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
