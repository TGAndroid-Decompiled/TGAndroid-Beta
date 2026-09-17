package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dq extends Drawable {
    public final Drawable f25464a;
    public Path f25465b;
    public final RectF f25466c;
    public final RectF d;
    public boolean f25467e;
    public final float[] f25468f;

    public dq(Drawable drawable) {
        ah.g1 g1Var = new ah.g1(this, 3);
        this.f25466c = new RectF();
        this.d = new RectF();
        this.f25467e = false;
        this.f25468f = new float[8];
        Drawable drawable2 = this.f25464a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25464a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f25464a.setCallback(g1Var);
        }
    }

    public final void a() {
        if (!this.f25467e) {
            return;
        }
        Path path = this.f25465b;
        if (path == null) {
            this.f25465b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f25466c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f25465b.addRoundRect(rectF, this.f25468f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f25464a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f25467e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f25464a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f25465b);
            this.f25464a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f25464a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f25464a;
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
        Drawable drawable = this.f25464a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25464a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
