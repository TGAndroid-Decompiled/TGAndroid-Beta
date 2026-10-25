package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class qq extends Drawable {
    public final Drawable f31995a;
    public Path f31996b;
    public final RectF f31997c;
    public final RectF d;
    public boolean e;
    public final float[] f31998f;

    public qq(Drawable drawable) {
        bh.u0 u0Var = new bh.u0(this, 5);
        this.f31997c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f31998f = new float[8];
        Drawable drawable2 = this.f31995a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f31995a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f31995a.setCallback(u0Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f31996b;
        if (path == null) {
            this.f31996b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f31997c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f31996b.addRoundRect(rectF, this.f31998f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31995a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f31995a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f31996b);
            this.f31995a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f31995a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f31995a;
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
        Drawable drawable = this.f31995a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f31995a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
