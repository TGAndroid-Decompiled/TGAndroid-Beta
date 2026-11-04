package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class np extends Drawable {
    public final Drawable f36598a;
    public Path f36599b;
    public final RectF f36600c;
    public final RectF d;
    public boolean f36601e;
    public final float[] f36602f;

    public np(Drawable drawable) {
        ah.a aVar = new ah.a(this, 7);
        this.f36600c = new RectF();
        this.d = new RectF();
        this.f36601e = false;
        this.f36602f = new float[8];
        Drawable drawable2 = this.f36598a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36598a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f36598a.setCallback(aVar);
        }
    }

    public final void a() {
        if (!this.f36601e) {
            return;
        }
        Path path = this.f36599b;
        if (path == null) {
            this.f36599b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f36600c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f36599b.addRoundRect(rectF, this.f36602f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f36598a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f36601e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f36598a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f36599b);
            this.f36598a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36598a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36598a;
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
    public final void setAlpha(int i3) {
        Drawable drawable = this.f36598a;
        if (drawable != null) {
            drawable.setAlpha(i3);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36598a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
