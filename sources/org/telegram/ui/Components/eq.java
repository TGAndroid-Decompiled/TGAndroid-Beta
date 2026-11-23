package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class eq extends Drawable {
    public final Drawable f34944a;
    public Path f34945b;
    public final RectF f34946c;
    public final RectF d;
    public boolean f34947e;
    public final float[] f34948f;

    public eq(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f34946c = new RectF();
        this.d = new RectF();
        this.f34947e = false;
        this.f34948f = new float[8];
        Drawable drawable2 = this.f34944a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f34944a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f34944a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f34947e) {
            return;
        }
        Path path = this.f34945b;
        if (path == null) {
            this.f34945b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f34946c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f34945b.addRoundRect(rectF, this.f34948f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f34944a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f34947e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f34944a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f34945b);
            this.f34944a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f34944a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f34944a;
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
        Drawable drawable = this.f34944a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34944a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
