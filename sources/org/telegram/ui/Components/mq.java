package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class mq extends Drawable {
    public final Drawable f28668a;
    public Path f28669b;
    public final RectF f28670c;
    public final RectF d;
    public boolean e;
    public final float[] f28671f;

    public mq(Drawable drawable) {
        ah.f1 f1Var = new ah.f1(this, 4);
        this.f28670c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f28671f = new float[8];
        Drawable drawable2 = this.f28668a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f28668a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f28668a.setCallback(f1Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f28669b;
        if (path == null) {
            this.f28669b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f28670c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f28669b.addRoundRect(rectF, this.f28671f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f28668a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f28668a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f28669b);
            this.f28668a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f28668a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f28668a;
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
        Drawable drawable = this.f28668a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28668a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
