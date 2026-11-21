package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class eq extends Drawable {
    public final Drawable f34962a;
    public Path f34963b;
    public final RectF f34964c;
    public final RectF d;
    public boolean f34965e;
    public final float[] f34966f;

    public eq(Drawable drawable) {
        a5.b bVar = new a5.b(this, 6);
        this.f34964c = new RectF();
        this.d = new RectF();
        this.f34965e = false;
        this.f34966f = new float[8];
        Drawable drawable2 = this.f34962a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f34962a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f34962a.setCallback(bVar);
        }
    }

    public final void a() {
        if (!this.f34965e) {
            return;
        }
        Path path = this.f34963b;
        if (path == null) {
            this.f34963b = new Path();
        } else {
            path.rewind();
        }
        Rect bounds = getBounds();
        RectF rectF = this.f34964c;
        rectF.set(bounds);
        float f10 = rectF.left;
        RectF rectF2 = this.d;
        rectF.left = f10 + rectF2.left;
        rectF.top += rectF2.top;
        rectF.right -= rectF2.right;
        rectF.bottom -= rectF2.bottom;
        this.f34963b.addRoundRect(rectF, this.f34966f, Path.Direction.CW);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f34962a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f34965e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f34962a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f34963b);
            this.f34962a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f34962a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f34962a;
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
        Drawable drawable = this.f34962a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34962a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
