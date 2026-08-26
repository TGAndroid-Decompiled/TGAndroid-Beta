package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.iv.RichDetailsCell;

public final class ClipRoundedDrawable extends Drawable {
    public final Drawable drawable;
    public boolean hasRadius;
    public final RectF padding;
    public Path path;
    public final float[] radii;
    public final RectF tempBounds;

    public ClipRoundedDrawable(Drawable drawable) {
        RichDetailsCell.AnonymousClass1 anonymousClass1 = new RichDetailsCell.AnonymousClass1(this, 4);
        this.tempBounds = new RectF();
        this.padding = new RectF();
        this.hasRadius = false;
        this.radii = new float[8];
        Drawable drawable2 = this.drawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            drawable.setCallback(anonymousClass1);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.hasRadius) {
                canvas.save();
                canvas.clipRect(getBounds());
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            updatePath();
            canvas.clipPath(this.path);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void updatePath() {
        if (this.hasRadius) {
            Path path = this.path;
            if (path == null) {
                this.path = new Path();
            } else {
                path.rewind();
            }
            RectF rectF = this.tempBounds;
            rectF.set(getBounds());
            float f = rectF.left;
            RectF rectF2 = this.padding;
            rectF.left = f + rectF2.left;
            rectF.top += rectF2.top;
            rectF.right -= rectF2.right;
            rectF.bottom -= rectF2.bottom;
            this.path.addRoundRect(rectF, this.radii, Path.Direction.CW);
        }
    }
}
