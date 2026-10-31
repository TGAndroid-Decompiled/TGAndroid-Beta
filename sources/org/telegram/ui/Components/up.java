package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class up extends Drawable {
    public final Drawable f31007a;
    public Path f31008b;
    public final RectF f31009c;
    public final RectF d;
    public boolean e;
    public final float[] f31010f;

    public up(Drawable drawable) {
        bi.s0 s0Var = new bi.s0(this, 2);
        this.f31009c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f31010f = new float[8];
        Drawable drawable2 = this.f31007a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f31007a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f31007a.setCallback(s0Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f31008b;
        if (path == null) {
            this.f31008b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f31009c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f31008b.addRoundRect(rectF, this.f31010f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31007a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f31007a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f31008b);
            this.f31007a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f31007a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f31007a;
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
        Drawable drawable = this.f31007a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f31007a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
