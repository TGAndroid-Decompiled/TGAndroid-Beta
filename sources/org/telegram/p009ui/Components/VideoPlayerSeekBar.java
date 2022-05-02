package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;

public class VideoPlayerSeekBar {
    private static Paint paint;
    private static Paint strokePaint;
    private static int thumbWidth;
    private float animateFromBufferedProgress;
    private boolean animateResetBuffering;
    private int backgroundColor;
    private int backgroundSelectedColor;
    private float bufferedProgress;
    private int cacheColor;
    private int circleColor;
    private float currentRadius;
    private SeekBarDelegate delegate;
    private int height;
    private int horizontalPadding;
    private long lastUpdateTime;
    private View parentView;
    private int progressColor;
    private boolean selected;
    private int smallLineColor;
    private float transitionProgress;
    private int width;
    private int thumbX = 0;
    private int draggingThumbX = 0;
    private int thumbDX = 0;
    private boolean pressed = false;
    private RectF rect = new RectF();
    private float bufferedAnimationValue = 1.0f;
    private int lineHeight = AndroidUtilities.m34dp(4.0f);
    private int smallLineHeight = AndroidUtilities.m34dp(2.0f);
    private int fromThumbX = 0;
    private float animateThumbProgress = 1.0f;

    public interface SeekBarDelegate {
        void onSeekBarContinuousDrag(float f);

        void onSeekBarDrag(float f);
    }

    public VideoPlayerSeekBar(View view) {
        if (paint == null) {
            paint = new Paint(1);
            Paint paint2 = new Paint(1);
            strokePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            strokePaint.setColor(-16777216);
            strokePaint.setStrokeWidth(1.0f);
        }
        this.parentView = view;
        thumbWidth = AndroidUtilities.m34dp(24.0f);
        this.currentRadius = AndroidUtilities.m34dp(6.0f);
    }

    public void setDelegate(SeekBarDelegate seekBarDelegate) {
        this.delegate = seekBarDelegate;
    }

    public boolean onTouch(int i, float f, float f2) {
        SeekBarDelegate seekBarDelegate;
        if (i == 0) {
            if (this.transitionProgress > 0.0f) {
                return false;
            }
            int i2 = this.height;
            int i3 = thumbWidth;
            int i4 = (i2 - i3) / 2;
            if (f >= (-i4)) {
                int i5 = this.width;
                if (f <= i5 + i4 && f2 >= 0.0f && f2 <= i2) {
                    int i6 = this.thumbX;
                    if (i6 - i4 > f || f > i6 + i3 + i4) {
                        int i7 = ((int) f) - (i3 / 2);
                        this.thumbX = i7;
                        if (i7 < 0) {
                            this.thumbX = 0;
                        } else if (i7 > i5 - i3) {
                            this.thumbX = i3 - i5;
                        }
                    }
                    this.pressed = true;
                    int i8 = this.thumbX;
                    this.draggingThumbX = i8;
                    this.thumbDX = (int) (f - i8);
                    return true;
                }
            }
        } else if (i == 1 || i == 3) {
            if (this.pressed) {
                int i9 = this.draggingThumbX;
                this.thumbX = i9;
                if (i == 1 && (seekBarDelegate = this.delegate) != null) {
                    seekBarDelegate.onSeekBarDrag(i9 / (this.width - thumbWidth));
                }
                this.pressed = false;
                return true;
            }
        } else if (i == 2 && this.pressed) {
            int i10 = (int) (f - this.thumbDX);
            this.draggingThumbX = i10;
            if (i10 < 0) {
                this.draggingThumbX = 0;
            } else {
                int i11 = this.width;
                int i12 = thumbWidth;
                if (i10 > i11 - i12) {
                    this.draggingThumbX = i11 - i12;
                }
            }
            SeekBarDelegate seekBarDelegate2 = this.delegate;
            if (seekBarDelegate2 != null) {
                seekBarDelegate2.onSeekBarContinuousDrag(this.draggingThumbX / (this.width - thumbWidth));
            }
            return true;
        }
        return false;
    }

    public void setColors(int i, int i2, int i3, int i4, int i5, int i6) {
        this.backgroundColor = i;
        this.cacheColor = i2;
        this.circleColor = i4;
        this.progressColor = i3;
        this.backgroundSelectedColor = i5;
        this.smallLineColor = i6;
    }

    public void setProgress(float f, boolean z) {
        int ceil = (int) Math.ceil((this.width - thumbWidth) * f);
        if (z) {
            if (Math.abs(ceil - this.thumbX) > AndroidUtilities.m34dp(10.0f)) {
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                this.fromThumbX = (int) ((this.thumbX * interpolation) + (this.fromThumbX * (1.0f - interpolation)));
                this.animateThumbProgress = 0.0f;
            } else if (this.animateThumbProgress == 1.0f) {
                this.animateThumbProgress = 0.0f;
                this.fromThumbX = this.thumbX;
            }
        }
        this.thumbX = ceil;
        if (ceil < 0) {
            this.thumbX = 0;
            return;
        }
        int i = this.width;
        int i2 = thumbWidth;
        if (ceil > i - i2) {
            this.thumbX = i - i2;
        }
    }

    public void setProgress(float f) {
        setProgress(f, false);
    }

    public void setBufferedProgress(float f) {
        float f2 = this.bufferedProgress;
        if (f != f2) {
            this.animateFromBufferedProgress = f2;
            this.animateResetBuffering = f < f2;
            this.bufferedProgress = f;
            this.bufferedAnimationValue = 0.0f;
        }
    }

    public float getProgress() {
        return this.thumbX / (this.width - thumbWidth);
    }

    public int getThumbX() {
        return (this.pressed ? this.draggingThumbX : this.thumbX) + (thumbWidth / 2);
    }

    public void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getWidth() {
        return this.width - thumbWidth;
    }

    public void setTransitionProgress(float f) {
        if (this.transitionProgress != f) {
            this.transitionProgress = f;
            this.parentView.invalidate();
        }
    }

    public void setHorizontalPadding(int i) {
        this.horizontalPadding = i;
    }

    public void draw(Canvas canvas, View view) {
        int i;
        int i2;
        int i3;
        float lerp = AndroidUtilities.lerp(thumbWidth / 2.0f, this.smallLineHeight / 2.0f, this.transitionProgress);
        this.rect.left = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        RectF rectF = this.rect;
        int i4 = this.height;
        rectF.top = AndroidUtilities.lerp((i4 - this.lineHeight) / 2.0f, (i4 - AndroidUtilities.m34dp(3.0f)) - this.smallLineHeight, this.transitionProgress);
        RectF rectF2 = this.rect;
        int i5 = this.height;
        rectF2.bottom = AndroidUtilities.lerp((this.lineHeight + i5) / 2.0f, i5 - AndroidUtilities.m34dp(3.0f), this.transitionProgress);
        float f = this.thumbX;
        float f2 = this.animateThumbProgress;
        if (f2 != 1.0f) {
            float f3 = f2 + 0.07272727f;
            this.animateThumbProgress = f3;
            if (f3 >= 1.0f) {
                this.animateThumbProgress = 1.0f;
            } else {
                view.invalidate();
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                f = (this.fromThumbX * (1.0f - interpolation)) + (this.thumbX * interpolation);
            }
        }
        this.rect.right = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        setPaintColor(this.selected ? this.backgroundSelectedColor : this.backgroundColor, 1.0f - this.transitionProgress);
        canvas.drawRoundRect(this.rect, lerp, lerp, paint);
        float f4 = this.bufferedAnimationValue;
        if (f4 != 1.0f) {
            float f5 = f4 + 0.16f;
            this.bufferedAnimationValue = f5;
            if (f5 > 1.0f) {
                this.bufferedAnimationValue = 1.0f;
            } else {
                this.parentView.invalidate();
            }
        }
        if (this.animateResetBuffering) {
            float f6 = this.animateFromBufferedProgress;
            if (f6 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f6 * (this.width - i3)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, (1.0f - this.transitionProgress) * (1.0f - this.bufferedAnimationValue));
                canvas.drawRoundRect(this.rect, lerp, lerp, paint);
            }
            float f7 = this.bufferedProgress;
            if (f7 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f7 * (this.width - i2)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                canvas.drawRoundRect(this.rect, lerp, lerp, paint);
            }
        } else {
            float f8 = this.animateFromBufferedProgress;
            float f9 = this.bufferedAnimationValue;
            float f10 = (f8 * (1.0f - f9)) + (this.bufferedProgress * f9);
            if (f10 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f10 * (this.width - i)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                canvas.drawRoundRect(this.rect, lerp, lerp, paint);
            }
        }
        RectF rectF3 = this.rect;
        float f11 = this.horizontalPadding;
        float f12 = thumbWidth / 2.0f;
        if (this.pressed) {
            f = this.draggingThumbX;
        }
        rectF3.right = f11 + AndroidUtilities.lerp(f12 + f, (this.parentView.getWidth() - (this.horizontalPadding * 2.0f)) * getProgress(), this.transitionProgress);
        if (this.transitionProgress > 0.0f && this.rect.width() > 0.0f) {
            strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
            canvas.drawRoundRect(this.rect, lerp, lerp, strokePaint);
        }
        setPaintColor(ColorUtils.blendARGB(this.progressColor, this.smallLineColor, this.transitionProgress), 1.0f);
        canvas.drawRoundRect(this.rect, lerp, lerp, paint);
        setPaintColor(ColorUtils.blendARGB(this.circleColor, getProgress() == 0.0f ? 0 : this.smallLineColor, this.transitionProgress), 1.0f - this.transitionProgress);
        float dp = AndroidUtilities.m34dp(this.pressed ? 8.0f : 6.0f);
        if (this.currentRadius != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = elapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f13 = this.currentRadius;
            if (f13 < dp) {
                float dp2 = f13 + (AndroidUtilities.m34dp(1.0f) * (((float) j) / 60.0f));
                this.currentRadius = dp2;
                if (dp2 > dp) {
                    this.currentRadius = dp;
                }
            } else {
                float dp3 = f13 - (AndroidUtilities.m34dp(1.0f) * (((float) j) / 60.0f));
                this.currentRadius = dp3;
                if (dp3 < dp) {
                    this.currentRadius = dp;
                }
            }
            View view2 = this.parentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        float lerp2 = AndroidUtilities.lerp(this.currentRadius, 0.0f, this.transitionProgress);
        RectF rectF4 = this.rect;
        canvas.drawCircle(rectF4.right, rectF4.centerY(), lerp2, paint);
    }

    private void setPaintColor(int i, float f) {
        if (f < 1.0f) {
            i = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * f));
        }
        paint.setColor(i);
    }
}
