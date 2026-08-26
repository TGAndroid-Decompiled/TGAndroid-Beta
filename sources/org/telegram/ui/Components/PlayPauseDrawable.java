package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class PlayPauseDrawable extends Drawable {
    public int alpha = 255;
    public float duration = 300.0f;
    public long lastUpdateTime;
    public final Paint paint;
    public View parent;
    public boolean pause;
    public float progress;
    public final int size;

    public PlayPauseDrawable(int i) {
        this.size = AndroidUtilities.dp(i);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-1);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        View view;
        Canvas canvas2;
        float interpolation;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = jCurrentAnimationTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentAnimationTimeMillis;
        if (j > 18) {
            j = 16;
        }
        boolean z = this.pause;
        if (z) {
            float f3 = this.progress;
            if (f3 < 1.0f) {
                float f4 = (j / this.duration) + f3;
                this.progress = f4;
                if (f4 >= 1.0f) {
                    this.progress = 1.0f;
                } else {
                    View view2 = this.parent;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    invalidateSelf();
                }
            } else if (!z) {
                f = this.progress;
                if (f > 0.0f) {
                    f2 = f - (j / this.duration);
                    this.progress = f2;
                    if (f2 <= 0.0f) {
                        this.progress = 0.0f;
                    } else {
                        view = this.parent;
                        if (view != null) {
                            view.invalidate();
                        }
                        invalidateSelf();
                    }
                }
            }
        } else if (!z) {
            f = this.progress;
            if (f > 0.0f) {
                f2 = f - (j / this.duration);
                this.progress = f2;
                if (f2 <= 0.0f) {
                    this.progress = 0.0f;
                } else {
                    view = this.parent;
                    if (view != null) {
                        view.invalidate();
                    }
                    invalidateSelf();
                }
            }
        }
        Rect bounds = getBounds();
        int i = this.alpha;
        if (i == 255) {
            canvas.save();
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i, 31);
        }
        canvas2.translate(DiffUtil.m(1.0f, this.progress, AndroidUtilities.dp(1.0f), bounds.centerX()), bounds.centerY());
        float f5 = this.progress * 500.0f;
        if (f5 < 100.0f) {
            interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f5 / 100.0f) * (-5.0f);
        } else {
            interpolation = f5 < 484.0f ? (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f5 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
        }
        int i2 = this.size;
        canvas2.scale((i2 * 1.45f) / AndroidUtilities.dp(28.0f), (i2 * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        PathAnimator pathAnimator = Theme.playPauseAnimator;
        if (pathAnimator != null) {
            Paint paint = this.paint;
            pathAnimator.draw(canvas2, paint, f5);
            canvas2.scale(1.0f, -1.0f);
            Theme.playPauseAnimator.draw(canvas2, paint, f5);
        }
        canvas2.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.size;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.size;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setPause(boolean z, boolean z2) {
        if (this.pause != z) {
            this.pause = z;
            if (!z2) {
                this.progress = z ? 1.0f : 0.0f;
            }
            this.lastUpdateTime = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }
}
