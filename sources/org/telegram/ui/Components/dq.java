package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dq extends Drawable {
    public final Drawable f25437a;
    public Path f25438b;
    public final RectF f25439c;
    public final RectF d;
    public boolean f25440e;
    public final float[] f25441f;

    public dq(Drawable drawable) {
        ah.g1 g1Var = new ah.g1(this, 3);
        this.f25439c = new RectF();
        this.d = new RectF();
        this.f25440e = false;
        this.f25441f = new float[8];
        Drawable drawable2 = this.f25437a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25437a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f25437a.setCallback(g1Var);
        }
    }

    public final void a() {
        if (!this.f25440e) {
            return;
        }
        Path path = this.f25438b;
        if (path == null) {
            this.f25438b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f25439c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f25438b.addRoundRect(rectF, this.f25441f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f25437a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f25440e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f25437a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f25438b);
            this.f25437a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f25437a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f25437a;
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
        Drawable drawable = this.f25437a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25437a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
