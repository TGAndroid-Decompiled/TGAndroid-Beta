package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class bq extends Drawable {
    public final Drawable f33791a;
    public Path f33792b;
    public final RectF f33793c;
    public final RectF d;
    public boolean f33794e;
    public final float[] f33795f;

    public bq(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f33793c = new RectF();
        this.d = new RectF();
        this.f33794e = false;
        this.f33795f = new float[8];
        Drawable drawable2 = this.f33791a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f33791a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f33791a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f33794e) {
            return;
        }
        Path path = this.f33792b;
        if (path == null) {
            this.f33792b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f33793c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f33792b.addRoundRect(rectF, this.f33795f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f33791a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f33794e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f33791a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f33792b);
            this.f33791a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f33791a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f33791a;
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
        Drawable drawable = this.f33791a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33791a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
