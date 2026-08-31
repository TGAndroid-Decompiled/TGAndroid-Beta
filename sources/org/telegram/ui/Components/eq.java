package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class eq extends Drawable {
    public final Drawable f26626a;
    public Path f26627b;
    public final RectF f26628c;
    public final RectF d;
    public boolean f26629e;
    public final float[] f26630f;

    public eq(Drawable drawable) {
        i.f fVar = new i.f(this, 6);
        this.f26628c = new RectF();
        this.d = new RectF();
        this.f26629e = false;
        this.f26630f = new float[8];
        Drawable drawable2 = this.f26626a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f26626a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f26626a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.f26629e) {
            return;
        }
        Path path = this.f26627b;
        if (path == null) {
            this.f26627b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f26628c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f26627b.addRoundRect(rectF, this.f26630f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f26626a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f26629e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f26626a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f26627b);
            this.f26626a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f26626a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f26626a;
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
        Drawable drawable = this.f26626a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f26626a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
