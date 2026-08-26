package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda451;

public final class CrossfadeDrawable extends Drawable {
    public ValueAnimator animator;
    public final Drawable bottomDrawable;
    public float globalAlpha = 255.0f;
    public float progress;
    public final Drawable topDrawable;

    public CrossfadeDrawable(Drawable drawable, Drawable drawable2) {
        this.topDrawable = drawable;
        this.bottomDrawable = drawable2;
        if (drawable != null) {
            final int i = 0;
            drawable.setCallback(new Drawable.Callback(this) {
                public final CrossfadeDrawable this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void invalidateDrawable(Drawable drawable3) {
                    switch (i) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.invalidateSelf();
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.invalidateSelf();
                            }
                            break;
                    }
                }

                @Override
                public final void scheduleDrawable(Drawable drawable3, Runnable runnable, long j) {
                    switch (i) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.scheduleSelf(runnable, j);
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.scheduleSelf(runnable, j);
                            }
                            break;
                    }
                }

                @Override
                public final void unscheduleDrawable(Drawable drawable3, Runnable runnable) {
                    switch (i) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.unscheduleSelf(runnable);
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.unscheduleSelf(runnable);
                            }
                            break;
                    }
                }
            });
        }
        if (drawable2 != null) {
            final int i2 = 1;
            drawable2.setCallback(new Drawable.Callback(this) {
                public final CrossfadeDrawable this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void invalidateDrawable(Drawable drawable3) {
                    switch (i2) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.invalidateSelf();
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.invalidateSelf();
                            }
                            break;
                    }
                }

                @Override
                public final void scheduleDrawable(Drawable drawable3, Runnable runnable, long j) {
                    switch (i2) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.scheduleSelf(runnable, j);
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.scheduleSelf(runnable, j);
                            }
                            break;
                    }
                }

                @Override
                public final void unscheduleDrawable(Drawable drawable3, Runnable runnable) {
                    switch (i2) {
                        case 0:
                            CrossfadeDrawable crossfadeDrawable = this.this$0;
                            if (crossfadeDrawable.progress < 1.0f) {
                                crossfadeDrawable.unscheduleSelf(runnable);
                            }
                            break;
                        default:
                            CrossfadeDrawable crossfadeDrawable2 = this.this$0;
                            if (crossfadeDrawable2.progress > 0.0f) {
                                crossfadeDrawable2.unscheduleSelf(runnable);
                            }
                            break;
                    }
                }
            });
        }
    }

    public final void animateToProgress(float f) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda451(this, 1));
        this.animator.setDuration((long) (Math.abs(this.progress - f) * 200.0f));
        this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animator.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i = (int) ((1.0f - this.progress) * this.globalAlpha);
        Drawable drawable = this.topDrawable;
        drawable.setAlpha(i);
        int i2 = (int) (this.globalAlpha * this.progress);
        Drawable drawable2 = this.bottomDrawable;
        drawable2.setAlpha(i2);
        if (i > 0) {
            drawable.draw(canvas);
        }
        if (i2 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.topDrawable.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.topDrawable.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.topDrawable.setBounds(rect);
        this.bottomDrawable.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i) {
        this.globalAlpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.topDrawable.setColorFilter(colorFilter);
    }
}
