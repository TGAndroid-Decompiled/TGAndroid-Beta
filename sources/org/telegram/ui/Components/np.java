package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class np extends Drawable {
    public final Drawable f36352a;
    public Path f36353b;
    public final RectF f36354c;
    public final RectF d;
    public boolean f36355e;
    public final float[] f36356f;

    public np(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f36354c = new RectF();
        this.d = new RectF();
        this.f36355e = false;
        this.f36356f = new float[8];
        Drawable drawable2 = this.f36352a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36352a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f36352a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f36355e) {
            return;
        }
        Path path = this.f36353b;
        if (path == null) {
            this.f36353b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f36354c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f36353b.addRoundRect(rectF, this.f36356f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f36352a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f36355e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f36352a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f36353b);
            this.f36352a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36352a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36352a;
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
    public final void setAlpha(int i7) {
        Drawable drawable = this.f36352a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36352a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
