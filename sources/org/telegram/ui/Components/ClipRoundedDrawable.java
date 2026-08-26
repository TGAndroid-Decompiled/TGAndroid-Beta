package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class ClipRoundedDrawable extends Drawable {
    private Drawable.Callback callback;
    private Drawable drawable;
    private boolean hasRadius;
    private RectF padding;
    private Path path;
    private float[] radii;
    private RectF tempBounds;

    public ClipRoundedDrawable() {
        this.callback = new Drawable.Callback() {
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
        this.tempBounds = new RectF();
        this.padding = new RectF();
        this.hasRadius = false;
        this.radii = new float[8];
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
            RectF rectF = this.tempBounds;
            float f = rectF.left;
            RectF rectF2 = this.padding;
            rectF.left = f + rectF2.left;
            rectF.top += rectF2.top;
            rectF.right -= rectF2.right;
            rectF.bottom -= rectF2.bottom;
            this.path.addRoundRect(rectF, this.radii, Path.Direction.CW);
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

    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override
    public int getIntrinsicHeight() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override
    public int getOpacity() {
        return -2;
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

    public ClipRoundedDrawable setPadding(float f, float f2, float f3, float f4) {
        this.padding.set(f, f2, f3, f4);
        updatePath();
        return this;
    }

    public ClipRoundedDrawable setRadii(float f, float f2) {
        float[] fArr = this.radii;
        float fMax = Math.max(0.0f, f);
        fArr[6] = fMax;
        fArr[4] = fMax;
        fArr[2] = fMax;
        fArr[0] = fMax;
        float[] fArr2 = this.radii;
        float fMax2 = Math.max(0.0f, f2);
        fArr2[7] = fMax2;
        fArr2[5] = fMax2;
        fArr2[3] = fMax2;
        fArr2[1] = fMax2;
        this.hasRadius = f > 0.0f || f2 > 0.0f;
        updatePath();
        return this;
    }

    public ClipRoundedDrawable setRadius(float f) {
        float[] fArr = this.radii;
        float fMax = Math.max(0.0f, f);
        fArr[7] = fMax;
        fArr[6] = fMax;
        fArr[5] = fMax;
        fArr[4] = fMax;
        fArr[3] = fMax;
        fArr[2] = fMax;
        fArr[1] = fMax;
        fArr[0] = fMax;
        this.hasRadius = f > 0.0f;
        updatePath();
        return this;
    }

    public ClipRoundedDrawable setRadii(float f, float f2, float f3, float f4) {
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
        return this;
    }

    public ClipRoundedDrawable(Drawable drawable) {
        this.callback = new Drawable.Callback() {
            @Override
            public void invalidateDrawable(Drawable drawable2) {
                ClipRoundedDrawable.this.invalidateSelf();
            }

            @Override
            public void scheduleDrawable(Drawable drawable2, Runnable runnable, long j) {
                ClipRoundedDrawable.this.scheduleSelf(runnable, j);
            }

            @Override
            public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
                ClipRoundedDrawable.this.unscheduleSelf(runnable);
            }
        };
        this.tempBounds = new RectF();
        this.padding = new RectF();
        this.hasRadius = false;
        this.radii = new float[8];
        setDrawable(drawable);
    }

    public void setRadii(float[] fArr) {
        if (fArr == null) {
            setRadius(0.0f);
            return;
        }
        if (fArr.length == 8) {
            for (int i = 0; i < 8; i++) {
                this.radii[i] = fArr[i];
            }
        } else if (fArr.length == 4) {
            setRadii(fArr[0], fArr[1], fArr[2], fArr[3]);
            return;
        }
        this.hasRadius = false;
        for (int i2 = 0; i2 < 8; i2++) {
            if (this.radii[i2] > 0.0f) {
                this.hasRadius = true;
                break;
            }
        }
        updatePath();
    }
}
