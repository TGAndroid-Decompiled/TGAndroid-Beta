package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class hq extends Drawable {
    public final Drawable f24926a;
    public Path f24927b;
    public final RectF f24928c;
    public final RectF d;
    public boolean e;
    public final float[] f24929f;

    public hq(Drawable drawable) {
        i.f fVar = new i.f(this, 2);
        this.f24928c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f24929f = new float[8];
        Drawable drawable2 = this.f24926a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f24926a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f24926a.setCallback(fVar);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f24927b;
        if (path == null) {
            this.f24927b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f24928c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f24927b.addRoundRect(rectF, this.f24929f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f24926a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f24926a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f24927b);
            this.f24926a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f24926a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f24926a;
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
        Drawable drawable = this.f24926a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24926a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
