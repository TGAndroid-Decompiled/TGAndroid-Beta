package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public class CrossfadeDrawable extends Drawable {
    private final Drawable bottomDrawable;
    float globalAlpha = 255.0f;
    private float progress;
    private final Drawable topDrawable;

    @Override
    public int getOpacity() {
        return -3;
    }

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2) {
        this.topDrawable = drawable;
        this.bottomDrawable = drawable2;
        if (drawable != null) {
            drawable.setCallback(new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable3) {
                    if (CrossfadeDrawable.this.progress < 1.0f) {
                        CrossfadeDrawable.this.invalidateSelf();
                    }
                }

                @Override
                public void scheduleDrawable(Drawable drawable3, Runnable runnable, long j) {
                    if (CrossfadeDrawable.this.progress < 1.0f) {
                        CrossfadeDrawable.this.scheduleSelf(runnable, j);
                    }
                }

                @Override
                public void unscheduleDrawable(Drawable drawable3, Runnable runnable) {
                    if (CrossfadeDrawable.this.progress < 1.0f) {
                        CrossfadeDrawable.this.unscheduleSelf(runnable);
                    }
                }
            });
        }
        if (drawable2 != null) {
            drawable2.setCallback(new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable3) {
                    if (CrossfadeDrawable.this.progress > 0.0f) {
                        CrossfadeDrawable.this.invalidateSelf();
                    }
                }

                @Override
                public void scheduleDrawable(Drawable drawable3, Runnable runnable, long j) {
                    if (CrossfadeDrawable.this.progress > 0.0f) {
                        CrossfadeDrawable.this.scheduleSelf(runnable, j);
                    }
                }

                @Override
                public void unscheduleDrawable(Drawable drawable3, Runnable runnable) {
                    if (CrossfadeDrawable.this.progress > 0.0f) {
                        CrossfadeDrawable.this.unscheduleSelf(runnable);
                    }
                }
            });
        }
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect rect) {
        this.topDrawable.setBounds(rect);
        this.bottomDrawable.setBounds(rect);
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable = this.topDrawable;
        int i = (int) (this.globalAlpha * (1.0f - this.progress));
        drawable.setAlpha(i);
        Drawable drawable2 = this.bottomDrawable;
        int i2 = (int) (this.globalAlpha * this.progress);
        drawable2.setAlpha(i2);
        if (i > 0) {
            this.topDrawable.draw(canvas);
        }
        if (i2 > 0) {
            this.bottomDrawable.draw(canvas);
        }
    }

    @Override
    public void setAlpha(int i) {
        this.globalAlpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.topDrawable.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        return this.topDrawable.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.topDrawable.getIntrinsicHeight();
    }

    public float getProgress() {
        return this.progress;
    }

    public void setProgress(float f) {
        this.progress = f;
        invalidateSelf();
    }
}
