package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dq extends Drawable {
    public final Drawable f25463a;
    public Path f25464b;
    public final RectF f25465c;
    public final RectF d;
    public boolean f25466e;
    public final float[] f25467f;

    public dq(Drawable drawable) {
        ah.g1 g1Var = new ah.g1(this, 3);
        this.f25465c = new RectF();
        this.d = new RectF();
        this.f25466e = false;
        this.f25467f = new float[8];
        Drawable drawable2 = this.f25463a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25463a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f25463a.setCallback(g1Var);
        }
    }

    public final void a() {
        if (!this.f25466e) {
            return;
        }
        Path path = this.f25464b;
        if (path == null) {
            this.f25464b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f25465c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f25464b.addRoundRect(rectF, this.f25467f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f25463a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f25466e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f25463a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f25464b);
            this.f25463a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f25463a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f25463a;
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
        Drawable drawable = this.f25463a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25463a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
