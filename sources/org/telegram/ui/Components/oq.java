package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class oq extends Drawable {
    public final Drawable f29119a;
    public Path f29120b;
    public final RectF f29121c;
    public final RectF d;
    public boolean e;
    public final float[] f29122f;

    public oq(Drawable drawable) {
        ah.f1 f1Var = new ah.f1(this, 4);
        this.f29121c = new RectF();
        this.d = new RectF();
        this.e = false;
        this.f29122f = new float[8];
        Drawable drawable2 = this.f29119a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29119a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f29119a.setCallback(f1Var);
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Path path = this.f29120b;
        if (path == null) {
            this.f29120b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f29121c;
        rectF.set(bounds);
        float f7 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f7 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f29120b.addRoundRect(rectF, this.f29122f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f29119a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f29119a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f29120b);
            this.f29119a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29119a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29119a;
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
        Drawable drawable = this.f29119a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29119a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
