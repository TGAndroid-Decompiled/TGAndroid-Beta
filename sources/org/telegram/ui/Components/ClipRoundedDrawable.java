package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class ClipRoundedDrawable extends Drawable {
    private Drawable drawable;
    private Path path;
    private Drawable.Callback callback = new Drawable.Callback() {
        @Override
        public void invalidateDrawable(Drawable drawable) {
            ClipRoundedDrawable.this.invalidateSelf();
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            ClipRoundedDrawable.this.scheduleSelf(runnable, j);
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            ClipRoundedDrawable.this.unscheduleSelf(runnable);
        }
    };
    private RectF tempBounds = new RectF();
    private boolean hasRadius = false;
    private float[] radii = new float[8];
    private int R = (int) Math.round(Math.random() * 9999999.0d);

    @Override
    public int getOpacity() {
        return -2;
    }

    public ClipRoundedDrawable(Drawable drawable) {
        setDrawable(drawable);
    }

    public Drawable getDrawable() {
        return this.drawable;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.drawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.drawable.setCallback(this.callback);
        }
    }

    public void setRadii(float f, float f2, float f3, float f4) {
        float[] fArr = this.radii;
        float fMax = Math.max(0.0f, f);
        boolean z = true;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float[] fArr2 = this.radii;
        float fMax2 = Math.max(0.0f, f2);
        fArr2[3] = fMax2;
        fArr2[2] = fMax2;
        float[] fArr3 = this.radii;
        float fMax3 = Math.max(0.0f, f3);
        fArr3[5] = fMax3;
        fArr3[4] = fMax3;
        float[] fArr4 = this.radii;
        float fMax4 = Math.max(0.0f, f4);
        fArr4[7] = fMax4;
        fArr4[6] = fMax4;
        if (f <= 0.0f && f2 <= 0.0f && f3 <= 0.0f && f4 <= 0.0f) {
            z = false;
        }
        this.hasRadius = z;
        updatePath();
    }

    private void updatePath() {
        if (this.hasRadius) {
            Path path = this.path;
            if (path == null) {
                this.path = new Path();
            } else {
                path.rewind();
            }
            this.tempBounds.set(getBounds());
            this.path.addRoundRect(this.tempBounds, this.radii, Path.Direction.CW);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            if (!this.hasRadius) {
                canvas.save();
                canvas.clipRect(getBounds());
                this.drawable.draw(canvas);
                canvas.restore();
                return;
            }
            canvas.save();
            updatePath();
            canvas.clipPath(this.path);
            this.drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void setAlpha(int i) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return super.getIntrinsicHeight();
    }
}
