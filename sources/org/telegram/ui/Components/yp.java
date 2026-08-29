package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class yp extends Drawable {
    public final Drawable f35113a;
    public Path f35114b;
    public final RectF f35115c;
    public final RectF d;
    public boolean f35116e;
    public final float[] f35117f;

    public yp(Drawable drawable) {
        hg.a aVar = new hg.a(this, 6);
        this.f35115c = new RectF();
        this.d = new RectF();
        this.f35116e = false;
        this.f35117f = new float[8];
        Drawable drawable2 = this.f35113a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f35113a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f35113a.setCallback(aVar);
        }
    }

    public final void a() {
        if (!this.f35116e) {
            return;
        }
        Path path = this.f35114b;
        if (path == null) {
            this.f35114b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f35115c;
        rectF.set(bounds);
        float f9 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f9 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f35114b.addRoundRect(rectF, this.f35117f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f35113a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f35116e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f35113a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f35114b);
            this.f35113a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f35113a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f35113a;
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
        Drawable drawable = this.f35113a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f35113a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
