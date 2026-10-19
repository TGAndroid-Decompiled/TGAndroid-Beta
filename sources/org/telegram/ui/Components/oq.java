package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class oq extends Drawable {
    public final Drawable f29070a;
    public Path f29071b;
    public final RectF f29072c;
    public final RectF d;
    public boolean e;
    public final float[] f29073f;

    public oq(Drawable drawable) {
        ah.f1 f1Var = new ah.f1(this, 4);
        this.f29072c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f29073f = new float[8];
        Drawable drawable2 = this.f29070a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29070a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f29070a.setCallback(f1Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f29071b;
        if (path == null) {
            this.f29071b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f29072c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f29071b.addRoundRect(rectF, this.f29073f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f29070a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f29070a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f29071b);
            this.f29070a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29070a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29070a;
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
        Drawable drawable = this.f29070a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29070a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
