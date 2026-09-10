package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class kq extends Drawable {
    public final Drawable f24793a;
    public Path f24794b;
    public final RectF f24795c;
    public final RectF d;
    public boolean e;
    public final float[] f24796f;

    public kq(Drawable drawable) {
        hi.s0 s0Var = new hi.s0(this, 2);
        this.f24795c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f24796f = new float[8];
        Drawable drawable2 = this.f24793a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f24793a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f24793a.setCallback(s0Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f24794b;
        if (path == null) {
            this.f24794b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f24795c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f24794b.addRoundRect(rectF, this.f24796f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f24793a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f24793a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f24794b);
            this.f24793a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f24793a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f24793a;
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
        Drawable drawable = this.f24793a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24793a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
