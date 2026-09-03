package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class bq extends Drawable {
    public final Drawable f23734a;
    public Path f23735b;
    public final RectF f23736c;
    public final RectF d;
    public boolean e;
    public final float[] f23737f;

    public bq(Drawable drawable) {
        i.f fVar = new i.f(this, 6);
        this.f23736c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f23737f = new float[8];
        Drawable drawable2 = this.f23734a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f23734a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f23734a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f23735b;
        if (path == null) {
            this.f23735b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f23736c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f23735b.addRoundRect(rectF, this.f23737f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f23734a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f23734a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f23735b);
            this.f23734a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23734a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23734a;
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
        Drawable drawable = this.f23734a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23734a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
