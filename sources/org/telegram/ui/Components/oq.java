package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class oq extends Drawable {
    public final Drawable f29044a;
    public Path f29045b;
    public final RectF f29046c;
    public final RectF d;
    public boolean e;
    public final float[] f29047f;

    public oq(Drawable drawable) {
        ah.f1 f1Var = new ah.f1(this, 4);
        this.f29046c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f29047f = new float[8];
        Drawable drawable2 = this.f29044a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29044a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f29044a.setCallback(f1Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f29045b;
        if (path == null) {
            this.f29045b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f29046c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f29045b.addRoundRect(rectF, this.f29047f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f29044a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f29044a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f29045b);
            this.f29044a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29044a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29044a;
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
        Drawable drawable = this.f29044a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29044a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
