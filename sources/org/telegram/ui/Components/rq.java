package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class rq extends Drawable {
    public final Drawable f28621a;
    public Path f28622b;
    public final RectF f28623c;
    public final RectF d;
    public boolean e;
    public final float[] f28624f;

    public rq(Drawable drawable) {
        ah.f1 f1Var = new ah.f1(this, 3);
        this.f28623c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f28624f = new float[8];
        Drawable drawable2 = this.f28621a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f28621a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f28621a.setCallback(f1Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f28622b;
        if (path == null) {
            this.f28622b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f28623c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f28622b.addRoundRect(rectF, this.f28624f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f28621a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f28621a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f28622b);
            this.f28621a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f28621a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f28621a;
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
        Drawable drawable = this.f28621a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28621a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
