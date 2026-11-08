package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class np extends Drawable {
    public final Drawable f36409a;
    public Path f36410b;
    public final RectF f36411c;
    public final RectF d;
    public boolean f36412e;
    public final float[] f36413f;

    public np(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f36411c = new RectF();
        this.d = new RectF();
        this.f36412e = false;
        this.f36413f = new float[8];
        Drawable drawable2 = this.f36409a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36409a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f36409a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f36412e) {
            return;
        }
        Path path = this.f36410b;
        if (path == null) {
            this.f36410b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f36411c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f36410b.addRoundRect(rectF, this.f36413f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f36409a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f36412e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f36409a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f36410b);
            this.f36409a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36409a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36409a;
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
        Drawable drawable = this.f36409a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36409a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
