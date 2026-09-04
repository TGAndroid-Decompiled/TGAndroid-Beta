package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class dq extends Drawable {
    public final Drawable f25436a;
    public Path f25437b;
    public final RectF f25438c;
    public final RectF d;
    public boolean f25439e;
    public final float[] f25440f;

    public dq(Drawable drawable) {
        ah.g1 g1Var = new ah.g1(this, 3);
        this.f25438c = new RectF();
        this.d = new RectF();
        this.f25439e = false;
        this.f25440f = new float[8];
        Drawable drawable2 = this.f25436a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25436a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f25436a.setCallback(g1Var);
        }
    }

    public final void a() {
        if (!this.f25439e) {
            return;
        }
        Path path = this.f25437b;
        if (path == null) {
            this.f25437b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f25438c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f25437b.addRoundRect(rectF, this.f25440f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f25436a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f25439e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f25436a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f25437b);
            this.f25436a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f25436a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f25436a;
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
        Drawable drawable = this.f25436a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25436a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
