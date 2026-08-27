package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class sp extends Drawable {

    public final Drawable f32514a;

    public Path f32515b;

    public final RectF f32516c;
    public final RectF d;

    public boolean f32517e;

    public final float[] f32518f;

    public sp(Drawable drawable) {
        fg.a aVar = new fg.a(this, 6);
        this.f32516c = new RectF();
        this.d = new RectF();
        this.f32517e = false;
        this.f32518f = new float[8];
        Drawable drawable2 = this.f32514a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f32514a = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f32514a.setCallback(aVar);
        }
    }

    public final void a() {
        if (this.f32517e) {
            Path path = this.f32515b;
            if (path == null) {
                this.f32515b = new Path();
            } else {
                path.rewind();
            }
            Rect bounds = getBounds();
            RectF rectF = this.f32516c;
            rectF.set(bounds);
            float f10 = rectF.left;
            RectF rectF2 = this.d;
            rectF.left = f10 + rectF2.left;
            rectF.top += rectF2.top;
            rectF.right -= rectF2.right;
            rectF.bottom -= rectF2.bottom;
            this.f32515b.addRoundRect(rectF, this.f32518f, Path.Direction.CW);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f32514a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.f32517e) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.f32514a.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            a();
            canvas.clipPath(this.f32515b);
            this.f32514a.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f32514a;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f32514a;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f32514a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32514a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
