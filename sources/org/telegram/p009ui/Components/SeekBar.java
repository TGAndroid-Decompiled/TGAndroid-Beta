package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class SeekBar {
    private static Paint paint;
    private static int thumbWidth;
    private int backgroundColor;
    private int backgroundSelectedColor;
    private float bufferedProgress;
    private int cacheColor;
    private int circleColor;
    private float currentRadius;
    private SeekBarDelegate delegate;
    private int height;
    private long lastUpdateTime;
    private View parentView;
    private int progressColor;
    private boolean selected;
    private int width;
    private int thumbX = 0;
    private int draggingThumbX = 0;
    private int thumbDX = 0;
    private boolean pressed = false;
    private RectF rect = new RectF();
    private int lineHeight = AndroidUtilities.m34dp(2.0f);

    public interface SeekBarDelegate {

        public final class CC {
            public static void $default$onSeekBarContinuousDrag(SeekBarDelegate seekBarDelegate, float f) {
            }
        }

        void onSeekBarContinuousDrag(float f);

        void onSeekBarDrag(float f);
    }

    public SeekBar(View view) {
        if (paint == null) {
            paint = new Paint(1);
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
                            this.thumbX = i5 - i3;
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

    public void setColors(int i, int i2, int i3, int i4, int i5) {
        this.backgroundColor = i;
        this.cacheColor = i2;
        this.circleColor = i4;
        this.progressColor = i3;
        this.backgroundSelectedColor = i5;
    }

    public void setProgress(float f) {
        int ceil = (int) Math.ceil((this.width - thumbWidth) * f);
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

    public void setBufferedProgress(float f) {
        this.bufferedProgress = f;
    }

    public float getProgress() {
        return this.thumbX / (this.width - thumbWidth);
    }

    public boolean isDragging() {
        return this.pressed;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getWidth() {
        return this.width - thumbWidth;
    }

    public void draw(Canvas canvas) {
        int i;
        RectF rectF = this.rect;
        int i2 = thumbWidth;
        int i3 = this.height;
        int i4 = this.lineHeight;
        rectF.set(i2 / 2, (i3 / 2) - (i4 / 2), this.width - (i2 / 2), (i3 / 2) + (i4 / 2));
        paint.setColor(this.selected ? this.backgroundSelectedColor : this.backgroundColor);
        RectF rectF2 = this.rect;
        int i5 = thumbWidth;
        canvas.drawRoundRect(rectF2, i5 / 2, i5 / 2, paint);
        if (this.bufferedProgress > 0.0f) {
            paint.setColor(this.selected ? this.backgroundSelectedColor : this.cacheColor);
            RectF rectF3 = this.rect;
            int i6 = thumbWidth;
            int i7 = this.height;
            int i8 = this.lineHeight;
            rectF3.set(i6 / 2, (i7 / 2) - (i8 / 2), (i6 / 2) + (this.bufferedProgress * (this.width - i6)), (i7 / 2) + (i8 / 2));
            RectF rectF4 = this.rect;
            int i9 = thumbWidth;
            canvas.drawRoundRect(rectF4, i9 / 2, i9 / 2, paint);
        }
        RectF rectF5 = this.rect;
        float f = thumbWidth / 2;
        int i10 = this.height;
        int i11 = this.lineHeight;
        rectF5.set(f, (i10 / 2) - (i11 / 2), (i / 2) + (this.pressed ? this.draggingThumbX : this.thumbX), (i10 / 2) + (i11 / 2));
        paint.setColor(this.progressColor);
        RectF rectF6 = this.rect;
        int i12 = thumbWidth;
        canvas.drawRoundRect(rectF6, i12 / 2, i12 / 2, paint);
        paint.setColor(this.circleColor);
        float dp = AndroidUtilities.m34dp(this.pressed ? 8.0f : 6.0f);
        if (this.currentRadius != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.lastUpdateTime;
            if (elapsedRealtime > 18) {
                elapsedRealtime = 16;
            }
            float f2 = this.currentRadius;
            if (f2 < dp) {
                float dp2 = f2 + (AndroidUtilities.m34dp(1.0f) * (((float) elapsedRealtime) / 60.0f));
                this.currentRadius = dp2;
                if (dp2 > dp) {
                    this.currentRadius = dp;
                }
            } else {
                float dp3 = f2 - (AndroidUtilities.m34dp(1.0f) * (((float) elapsedRealtime) / 60.0f));
                this.currentRadius = dp3;
                if (dp3 < dp) {
                    this.currentRadius = dp;
                }
            }
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }
        canvas.drawCircle((this.pressed ? this.draggingThumbX : this.thumbX) + (thumbWidth / 2), this.height / 2, this.currentRadius, paint);
    }
}
