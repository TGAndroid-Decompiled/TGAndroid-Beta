package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
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
                public void scheduleDrawable(Drawable drawable3, Runnable runnable, long j) {
                }

                @Override
                public void unscheduleDrawable(Drawable drawable3, Runnable runnable) {
                }

                @Override
                public void invalidateDrawable(Drawable drawable3) {
                    if (CrossfadeDrawable.this.progress > 0.0f) {
                        CrossfadeDrawable.this.invalidateSelf();
                    }
                }
            });
        }
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        this.topDrawable.setBounds(rect);
        this.bottomDrawable.setBounds(rect);
    }

    @Override
    public void draw(Canvas canvas) {
        float f = this.progress;
        if (f < 1.0f) {
            this.topDrawable.setAlpha((int) (this.globalAlpha * (1.0f - f)));
            this.topDrawable.draw(canvas);
        }
        float f2 = this.progress;
        if (f2 > 0.0f) {
            this.bottomDrawable.setAlpha((int) (this.globalAlpha * f2));
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
