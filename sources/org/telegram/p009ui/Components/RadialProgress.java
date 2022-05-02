package org.telegram.p009ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class RadialProgress {
    private static DecelerateInterpolator decelerateInterpolator;
    private Drawable checkBackgroundDrawable;
    private Drawable currentDrawable;
    private Drawable currentMiniDrawable;
    private boolean currentMiniWithRound;
    private boolean currentWithRound;
    private boolean drawMiniProgress;
    private boolean hideCurrentDrawable;
    private Bitmap miniDrawBitmap;
    private Canvas miniDrawCanvas;
    private Paint miniProgressBackgroundPaint;
    private Paint miniProgressPaint;
    private View parent;
    private Drawable previousDrawable;
    private Drawable previousMiniDrawable;
    private boolean previousMiniWithRound;
    private boolean previousWithRound;
    private Paint progressPaint;
    private long lastUpdateTime = 0;
    private float radOffset = 0.0f;
    private float currentProgress = 0.0f;
    private float animationProgressStart = 0.0f;
    private long currentProgressTime = 0;
    private float animatedProgressValue = 0.0f;
    private RectF progressRect = new RectF();
    private RectF cicleRect = new RectF();
    private float animatedAlphaValue = 1.0f;
    private int progressColor = -1;
    private int diff = AndroidUtilities.m34dp(4.0f);
    private boolean alphaForPrevious = true;
    private boolean alphaForMiniPrevious = true;
    private float overrideAlpha = 1.0f;

    public RadialProgress(View view) {
        if (decelerateInterpolator == null) {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint.setStrokeWidth(AndroidUtilities.m34dp(3.0f));
        Paint paint2 = new Paint(1);
        this.miniProgressPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.miniProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.miniProgressPaint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
        this.miniProgressBackgroundPaint = new Paint(1);
        this.parent = view;
    }

    public void setProgressRect(int i, int i2, int i3, int i4) {
        this.progressRect.set(i, i2, i3, i4);
    }

    private void updateAnimation(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        Drawable drawable = this.checkBackgroundDrawable;
        if (drawable == null || !(this.currentDrawable == drawable || this.previousDrawable == drawable)) {
            boolean z2 = true;
            if (z) {
                if (this.animatedProgressValue != 1.0f) {
                    this.radOffset += ((float) (360 * j)) / 3000.0f;
                    float f = this.currentProgress;
                    float f2 = this.animationProgressStart;
                    float f3 = f - f2;
                    if (f3 > 0.0f) {
                        long j2 = this.currentProgressTime + j;
                        this.currentProgressTime = j2;
                        if (j2 >= 300) {
                            this.animatedProgressValue = f;
                            this.animationProgressStart = f;
                            this.currentProgressTime = 0L;
                        } else {
                            this.animatedProgressValue = f2 + (f3 * decelerateInterpolator.getInterpolation(((float) j2) / 300.0f));
                        }
                    }
                    invalidateParent();
                }
                if (this.drawMiniProgress) {
                    if (this.animatedProgressValue >= 1.0f && this.previousMiniDrawable != null) {
                        float f4 = this.animatedAlphaValue - (((float) j) / 200.0f);
                        this.animatedAlphaValue = f4;
                        if (f4 <= 0.0f) {
                            this.animatedAlphaValue = 0.0f;
                            this.previousMiniDrawable = null;
                            if (this.currentMiniDrawable == null) {
                                z2 = false;
                            }
                            this.drawMiniProgress = z2;
                        }
                        invalidateParent();
                    }
                } else if (this.animatedProgressValue >= 1.0f && this.previousDrawable != null) {
                    float f5 = this.animatedAlphaValue - (((float) j) / 200.0f);
                    this.animatedAlphaValue = f5;
                    if (f5 <= 0.0f) {
                        this.animatedAlphaValue = 0.0f;
                        this.previousDrawable = null;
                    }
                    invalidateParent();
                }
            } else if (this.drawMiniProgress) {
                if (this.previousMiniDrawable != null) {
                    float f6 = this.animatedAlphaValue - (((float) j) / 200.0f);
                    this.animatedAlphaValue = f6;
                    if (f6 <= 0.0f) {
                        this.animatedAlphaValue = 0.0f;
                        this.previousMiniDrawable = null;
                        if (this.currentMiniDrawable == null) {
                            z2 = false;
                        }
                        this.drawMiniProgress = z2;
                    }
                    invalidateParent();
                }
            } else if (this.previousDrawable != null) {
                float f7 = this.animatedAlphaValue - (((float) j) / 200.0f);
                this.animatedAlphaValue = f7;
                if (f7 <= 0.0f) {
                    this.animatedAlphaValue = 0.0f;
                    this.previousDrawable = null;
                }
                invalidateParent();
            }
        } else {
            throw null;
        }
    }

    public void setProgressColor(int i) {
        this.progressColor = i;
    }

    public void setProgress(float f, boolean z) {
        if (this.drawMiniProgress) {
            if (!(f == 1.0f || this.animatedAlphaValue == 0.0f || this.previousMiniDrawable == null)) {
                this.animatedAlphaValue = 0.0f;
                this.previousMiniDrawable = null;
                this.drawMiniProgress = this.currentMiniDrawable != null;
            }
        } else if (!(f == 1.0f || this.animatedAlphaValue == 0.0f || this.previousDrawable == null)) {
            this.animatedAlphaValue = 0.0f;
            this.previousDrawable = null;
        }
        if (!z) {
            this.animatedProgressValue = f;
            this.animationProgressStart = f;
        } else {
            if (this.animatedProgressValue > f) {
                this.animatedProgressValue = f;
            }
            this.animationProgressStart = this.animatedProgressValue;
        }
        this.currentProgress = f;
        this.currentProgressTime = 0L;
        invalidateParent();
    }

    private void invalidateParent() {
        int dp = AndroidUtilities.m34dp(2.0f);
        View view = this.parent;
        RectF rectF = this.progressRect;
        int i = ((int) rectF.left) - dp;
        int i2 = ((int) rectF.top) - dp;
        int i3 = dp * 2;
        view.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public void setBackground(Drawable drawable, boolean z, boolean z2) {
        Drawable drawable2;
        this.lastUpdateTime = System.currentTimeMillis();
        if (!z2 || (drawable2 = this.currentDrawable) == drawable) {
            this.previousDrawable = null;
            this.previousWithRound = false;
        } else {
            this.previousDrawable = drawable2;
            this.previousWithRound = this.currentWithRound;
            this.animatedAlphaValue = 1.0f;
            setProgress(1.0f, z2);
        }
        this.currentWithRound = z;
        this.currentDrawable = drawable;
        if (!z2) {
            this.parent.invalidate();
        } else {
            invalidateParent();
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        float f;
        int i;
        float f2;
        int i2;
        Drawable drawable2;
        if (!this.drawMiniProgress || this.currentDrawable == null) {
            Drawable drawable3 = this.previousDrawable;
            if (drawable3 != null) {
                if (this.alphaForPrevious) {
                    drawable3.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
                } else {
                    drawable3.setAlpha((int) (this.overrideAlpha * 255.0f));
                }
                Drawable drawable4 = this.previousDrawable;
                RectF rectF = this.progressRect;
                drawable4.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.previousDrawable.draw(canvas);
            }
            if (!this.hideCurrentDrawable && (drawable = this.currentDrawable) != null) {
                if (this.previousDrawable != null) {
                    drawable.setAlpha((int) ((1.0f - this.animatedAlphaValue) * 255.0f * this.overrideAlpha));
                } else {
                    drawable.setAlpha((int) (this.overrideAlpha * 255.0f));
                }
                Drawable drawable5 = this.currentDrawable;
                RectF rectF2 = this.progressRect;
                drawable5.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                this.currentDrawable.draw(canvas);
            }
            if (this.currentWithRound || this.previousWithRound) {
                this.progressPaint.setColor(this.progressColor);
                if (this.previousWithRound) {
                    this.progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
                } else {
                    this.progressPaint.setAlpha((int) (this.overrideAlpha * 255.0f));
                }
                RectF rectF3 = this.cicleRect;
                RectF rectF4 = this.progressRect;
                float f3 = rectF4.left;
                int i3 = this.diff;
                rectF3.set(f3 + i3, rectF4.top + i3, rectF4.right - i3, rectF4.bottom - i3);
                canvas.drawArc(this.cicleRect, this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), false, this.progressPaint);
                updateAnimation(true);
                return;
            }
            updateAnimation(false);
            return;
        }
        if (this.miniDrawCanvas != null) {
            this.miniDrawBitmap.eraseColor(0);
        }
        this.currentDrawable.setAlpha((int) (this.overrideAlpha * 255.0f));
        if (this.miniDrawCanvas != null) {
            this.currentDrawable.setBounds(0, 0, (int) this.progressRect.width(), (int) this.progressRect.height());
            this.currentDrawable.draw(this.miniDrawCanvas);
        } else {
            Drawable drawable6 = this.currentDrawable;
            RectF rectF5 = this.progressRect;
            drawable6.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
            this.currentDrawable.draw(canvas);
        }
        if (Math.abs(this.progressRect.width() - AndroidUtilities.m34dp(44.0f)) < AndroidUtilities.density) {
            i2 = 20;
            float f4 = 16;
            f2 = this.progressRect.centerX() + AndroidUtilities.m34dp(f4);
            f = this.progressRect.centerY() + AndroidUtilities.m34dp(f4);
            i = 0;
        } else {
            i2 = 22;
            f2 = this.progressRect.centerX() + AndroidUtilities.m34dp(18.0f);
            f = this.progressRect.centerY() + AndroidUtilities.m34dp(18.0f);
            i = 2;
        }
        int i4 = i2 / 2;
        float f5 = (this.previousMiniDrawable == null || !this.alphaForMiniPrevious) ? 1.0f : this.animatedAlphaValue * this.overrideAlpha;
        Canvas canvas2 = this.miniDrawCanvas;
        if (canvas2 != null) {
            float f6 = i2 + 18 + i;
            canvas2.drawCircle(AndroidUtilities.m34dp(f6), AndroidUtilities.m34dp(f6), AndroidUtilities.m34dp(i4 + 1) * f5, Theme.checkboxSquare_eraserPaint);
        } else {
            this.miniProgressBackgroundPaint.setColor(this.progressColor);
            if (this.previousMiniDrawable == null || this.currentMiniDrawable != null) {
                this.miniProgressBackgroundPaint.setAlpha(255);
            } else {
                this.miniProgressBackgroundPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
            }
            canvas.drawCircle(f2, f, AndroidUtilities.m34dp(12.0f), this.miniProgressBackgroundPaint);
        }
        if (this.miniDrawCanvas != null) {
            Bitmap bitmap = this.miniDrawBitmap;
            RectF rectF6 = this.progressRect;
            canvas.drawBitmap(bitmap, (int) rectF6.left, (int) rectF6.top, (Paint) null);
        }
        Drawable drawable7 = this.previousMiniDrawable;
        if (drawable7 != null) {
            if (this.alphaForMiniPrevious) {
                drawable7.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
            } else {
                drawable7.setAlpha((int) (this.overrideAlpha * 255.0f));
            }
            float f7 = i4;
            this.previousMiniDrawable.setBounds((int) (f2 - (AndroidUtilities.m34dp(f7) * f5)), (int) (f - (AndroidUtilities.m34dp(f7) * f5)), (int) ((AndroidUtilities.m34dp(f7) * f5) + f2), (int) ((AndroidUtilities.m34dp(f7) * f5) + f));
            this.previousMiniDrawable.draw(canvas);
        }
        if (!this.hideCurrentDrawable && (drawable2 = this.currentMiniDrawable) != null) {
            if (this.previousMiniDrawable != null) {
                drawable2.setAlpha((int) ((1.0f - this.animatedAlphaValue) * 255.0f * this.overrideAlpha));
            } else {
                drawable2.setAlpha((int) (this.overrideAlpha * 255.0f));
            }
            float f8 = i4;
            this.currentMiniDrawable.setBounds((int) (f2 - AndroidUtilities.m34dp(f8)), (int) (f - AndroidUtilities.m34dp(f8)), (int) (AndroidUtilities.m34dp(f8) + f2), (int) (AndroidUtilities.m34dp(f8) + f));
            this.currentMiniDrawable.draw(canvas);
        }
        if (this.currentMiniWithRound || this.previousMiniWithRound) {
            this.miniProgressPaint.setColor(this.progressColor);
            if (this.previousMiniWithRound) {
                this.miniProgressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
            } else {
                this.miniProgressPaint.setAlpha((int) (this.overrideAlpha * 255.0f));
            }
            float f9 = i4 - 2;
            this.cicleRect.set(f2 - (AndroidUtilities.m34dp(f9) * f5), f - (AndroidUtilities.m34dp(f9) * f5), f2 + (AndroidUtilities.m34dp(f9) * f5), f + (AndroidUtilities.m34dp(f9) * f5));
            canvas.drawArc(this.cicleRect, this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), false, this.miniProgressPaint);
            updateAnimation(true);
            return;
        }
        updateAnimation(false);
    }
}
