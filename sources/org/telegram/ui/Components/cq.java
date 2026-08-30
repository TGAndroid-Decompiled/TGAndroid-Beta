package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class cq extends Drawable {
    public final Drawable f24037a;
    public Path f24038b;
    public final RectF f24039c;
    public final RectF d;
    public boolean e;
    public final float[] f24040f;

    public cq(Drawable drawable) {
        i.f fVar = new i.f(this, 6);
        this.f24039c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f24040f = new float[8];
        Drawable drawable2 = this.f24037a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f24037a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f24037a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f24038b;
        if (path == null) {
            this.f24038b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f24039c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f24038b.addRoundRect(rectF, this.f24040f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f24037a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f24037a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f24038b);
            this.f24037a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f24037a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f24037a;
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
        Drawable drawable = this.f24037a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24037a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
