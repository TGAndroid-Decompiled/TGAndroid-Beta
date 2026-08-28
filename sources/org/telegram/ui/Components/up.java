package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class up extends Drawable {
    public final Drawable f33101a;
    public Path f33102b;
    public final RectF f33103c;
    public final RectF d;
    public boolean f33104e;
    public final float[] f33105f;

    public up(Drawable drawable) {
        eg.a aVar = new eg.a(this, 6);
        this.f33103c = new RectF();
        this.d = new RectF();
        this.f33104e = false;
        this.f33105f = new float[8];
        Drawable drawable2 = this.f33101a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f33101a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f33101a.setCallback(aVar);
        }
    }

    public final void a() {
        if (!this.f33104e) {
            return;
        }
        Path path = this.f33102b;
        if (path == null) {
            this.f33102b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f33103c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f33102b.addRoundRect(rectF, this.f33105f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f33101a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f33104e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f33101a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f33102b);
            this.f33101a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f33101a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f33101a;
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
    public final void setAlpha(int i9) {
        Drawable drawable = this.f33101a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f33101a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
