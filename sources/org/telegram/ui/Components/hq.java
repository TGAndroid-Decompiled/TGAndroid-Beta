package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hq extends Drawable {
    public final Drawable f27217a;
    public Path f27218b;
    public final RectF f27219c;
    public final RectF d;
    public boolean f27220e;
    public final float[] f27221f;

    public hq(Drawable drawable) {
        ah.d dVar = new ah.d(this, 3);
        this.f27219c = new RectF();
        this.d = new RectF();
        this.f27220e = false;
        this.f27221f = new float[8];
        Drawable drawable2 = this.f27217a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27217a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f27217a.setCallback(dVar);
        }
    }

    public final void a() {
        if (!this.f27220e) {
            return;
        }
        Path path = this.f27218b;
        if (path == null) {
            this.f27218b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f27219c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f27218b.addRoundRect(rectF, this.f27221f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f27217a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f27220e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f27217a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f27218b);
            this.f27217a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27217a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27217a;
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
        Drawable drawable = this.f27217a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27217a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
