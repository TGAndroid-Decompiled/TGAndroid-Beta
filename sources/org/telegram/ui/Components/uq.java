package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class uq extends Drawable {
    public final Drawable f31589a;
    public Path f31590b;
    public final RectF f31591c;
    public final RectF d;
    public boolean f31592e;
    public final float[] f31593f;

    public uq(Drawable drawable) {
        i.f fVar = new i.f(this, 2);
        this.f31591c = new RectF();
        this.d = new RectF();
        this.f31592e = false;
        this.f31593f = new float[8];
        Drawable drawable2 = this.f31589a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f31589a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f31589a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.f31592e) {
            return;
        }
        Path path = this.f31590b;
        if (path == null) {
            this.f31590b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f31591c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f31590b.addRoundRect(rectF, this.f31593f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31589a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f31592e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f31589a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f31590b);
            this.f31589a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f31589a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f31589a;
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
        Drawable drawable = this.f31589a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f31589a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
