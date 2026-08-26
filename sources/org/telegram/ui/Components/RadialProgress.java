package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class RadialProgress {
    private static DecelerateInterpolator decelerateInterpolator;
    private Drawable checkBackgroundDrawable;
    private CheckDrawable checkDrawable;
    private Drawable currentDrawable;
    private Drawable currentMiniDrawable;
    private boolean currentMiniWithRound;
    private boolean currentWithRound;
    private boolean disableUpdate;
    private boolean drawMiniProgress;
    private boolean hideCurrentDrawable;
    private Bitmap miniDrawBitmap;
    private Canvas miniDrawCanvas;
    private Paint miniProgressBackgroundPaint;
    private Paint miniProgressPaint;
    private View parent;
    private boolean previousCheckDrawable;
    private Drawable previousDrawable;
    private Drawable previousMiniDrawable;
    private boolean previousMiniWithRound;
    private boolean previousWithRound;
    private Paint progressPaint;
    private boolean roundRectProgress;
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
    private int diff = AndroidUtilities.dp(4.0f);
    private boolean alphaForPrevious = true;
    private boolean alphaForMiniPrevious = true;
    private float overrideAlpha = 1.0f;
    private Paint overridePaint = null;
    private float rotationSpeed = 3000.0f;
    private final Path roundProgressRectPath = new Path();
    private final Matrix roundProgressRectMatrix = new Matrix();
    private final PathMeasure roundProgressRectPathMeasure = new PathMeasure();
    private final Path roundRectProgressPath = new Path();

    public class CheckDrawable extends Drawable {
        private Paint paint;
        private float progress;

        public CheckDrawable() {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            this.paint.setColor(-1);
        }

        @Override
        public void draw(Canvas canvas) {
            int iCenterX = getBounds().centerX() - AndroidUtilities.dp(12.0f);
            int iCenterY = getBounds().centerY() - AndroidUtilities.dp(6.0f);
            float interpolation = this.progress != 1.0f ? RadialProgress.decelerateInterpolator.getInterpolation(this.progress) : 1.0f;
            canvas.drawLine(AndroidUtilities.dp(7.0f) + iCenterX, ((int) AndroidUtilities.dpf2(13.0f)) + iCenterY, ((int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(6.0f) * interpolation))) + iCenterX, ((int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(6.0f) * interpolation))) + iCenterY, this.paint);
            canvas.drawLine(((int) AndroidUtilities.dpf2(7.0f)) + iCenterX, ((int) AndroidUtilities.dpf2(13.0f)) + iCenterY, iCenterX + ((int) ((AndroidUtilities.dp(13.0f) * interpolation) + AndroidUtilities.dpf2(7.0f))), iCenterY + ((int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(13.0f) * interpolation))), this.paint);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(48.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(48.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public void resetProgress(boolean z) {
            this.progress = z ? 0.0f : 1.0f;
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }

        public boolean updateAnimation(long j) {
            float f = this.progress;
            if (f >= 1.0f) {
                return false;
            }
            float f2 = (j / 700.0f) + f;
            this.progress = f2;
            if (f2 <= 1.0f) {
                return true;
            }
            this.progress = 1.0f;
            return true;
        }
    }

    public RadialProgress(View view) {
        if (decelerateInterpolator == null) {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.progressPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        Paint paint3 = new Paint(1);
        this.miniProgressPaint = paint3;
        paint3.setStyle(style);
        this.miniProgressPaint.setStrokeCap(cap);
        this.miniProgressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.miniProgressBackgroundPaint = new Paint(1);
        this.parent = view;
    }

    private void drawArc(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        if (!this.roundRectProgress) {
            canvas.drawArc(rectF, f, f2, z, paint);
            return;
        }
        float fHeight = rectF.height() * 0.32f;
        if (Math.abs(f2) == 360.0f) {
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            return;
        }
        float f3 = ((((int) f) / 90) * 90) + 90;
        float f4 = (-199.0f) + f3;
        float f5 = ((f + f2) - f4) / 360.0f;
        this.roundProgressRectPath.rewind();
        this.roundProgressRectPath.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        this.roundProgressRectMatrix.reset();
        this.roundProgressRectMatrix.postRotate(f3, rectF.centerX(), rectF.centerY());
        this.roundProgressRectPath.transform(this.roundProgressRectMatrix);
        this.roundProgressRectPathMeasure.setPath(this.roundProgressRectPath, false);
        float length = this.roundProgressRectPathMeasure.getLength();
        this.roundRectProgressPath.reset();
        this.roundProgressRectPathMeasure.getSegment(((f - f4) / 360.0f) * length, length * f5, this.roundRectProgressPath, true);
        this.roundRectProgressPath.rLineTo(0.0f, 0.0f);
        canvas.drawPath(this.roundRectProgressPath, paint);
        if (f5 > 1.0f) {
            drawArc(canvas, rectF, f + 90.0f, f2 - 90.0f, z, paint);
        }
    }

    private void invalidateParent() {
        int iDp = AndroidUtilities.dp(2.0f);
        View view = this.parent;
        RectF rectF = this.progressRect;
        int i = ((int) rectF.left) - iDp;
        int i2 = ((int) rectF.top) - iDp;
        int i3 = iDp * 2;
        view.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    private void updateAnimation(boolean z) {
        if (this.disableUpdate) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        Drawable drawable = this.checkBackgroundDrawable;
        if (drawable != null && ((this.currentDrawable == drawable || this.previousDrawable == drawable) && this.checkDrawable.updateAnimation(j))) {
            invalidateParent();
        }
        if (!z) {
            if (!this.drawMiniProgress) {
                if (this.previousDrawable != null) {
                    float f = this.animatedAlphaValue - (j / 200.0f);
                    this.animatedAlphaValue = f;
                    if (f <= 0.0f) {
                        this.animatedAlphaValue = 0.0f;
                        this.previousDrawable = null;
                    }
                    invalidateParent();
                    return;
                }
                return;
            }
            if (this.previousMiniDrawable != null) {
                float f2 = this.animatedAlphaValue - (j / 200.0f);
                this.animatedAlphaValue = f2;
                if (f2 <= 0.0f) {
                    this.animatedAlphaValue = 0.0f;
                    this.previousMiniDrawable = null;
                    this.drawMiniProgress = this.currentMiniDrawable != null;
                }
                invalidateParent();
                return;
            }
            return;
        }
        if (this.animatedProgressValue != 1.0f) {
            this.radOffset = ((360 * j) / this.rotationSpeed) + this.radOffset;
            float f3 = this.currentProgress;
            float f4 = this.animationProgressStart;
            float f5 = f3 - f4;
            if (f5 > 0.0f) {
                long j2 = this.currentProgressTime + j;
                this.currentProgressTime = j2;
                if (j2 >= 300) {
                    this.animatedProgressValue = f3;
                    this.animationProgressStart = f3;
                    this.currentProgressTime = 0L;
                } else {
                    this.animatedProgressValue = (decelerateInterpolator.getInterpolation(j2 / 300.0f) * f5) + f4;
                }
            }
            invalidateParent();
        }
        if (!this.drawMiniProgress) {
            if (this.animatedProgressValue < 1.0f || this.previousDrawable == null) {
                return;
            }
            float f6 = this.animatedAlphaValue - (j / 200.0f);
            this.animatedAlphaValue = f6;
            if (f6 <= 0.0f) {
                this.animatedAlphaValue = 0.0f;
                this.previousDrawable = null;
            }
            invalidateParent();
            return;
        }
        if (this.animatedProgressValue < 1.0f || this.previousMiniDrawable == null) {
            return;
        }
        float f7 = this.animatedAlphaValue - (j / 200.0f);
        this.animatedAlphaValue = f7;
        if (f7 <= 0.0f) {
            this.animatedAlphaValue = 0.0f;
            this.previousMiniDrawable = null;
            this.drawMiniProgress = this.currentMiniDrawable != null;
        }
        invalidateParent();
    }

    public void copyParams(RadialProgress radialProgress) {
        this.currentProgress = radialProgress.currentProgress;
        this.animatedProgressValue = radialProgress.animatedProgressValue;
        this.radOffset = radialProgress.radOffset;
        this.lastUpdateTime = System.currentTimeMillis();
        invalidateParent();
    }

    public void disableUpdate(boolean z) {
        this.disableUpdate = z;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        float fCenterX;
        float fCenterY;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
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
            if (!this.currentWithRound && !this.previousWithRound) {
                updateAnimation(false);
                return;
            }
            Paint paint = this.overridePaint;
            if (paint == null) {
                this.progressPaint.setColor(this.progressColor);
                if (this.previousWithRound) {
                    this.progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
                } else {
                    this.progressPaint.setAlpha((int) (this.overrideAlpha * 255.0f));
                }
                paint = this.progressPaint;
            }
            Paint paint2 = paint;
            RectF rectF3 = this.cicleRect;
            RectF rectF4 = this.progressRect;
            float f5 = rectF4.left;
            float f6 = this.diff;
            rectF3.set(f5 + f6, rectF4.top + f6, rectF4.right - f6, rectF4.bottom - f6);
            drawArc(canvas, this.cicleRect, this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), false, paint2);
            updateAnimation(true);
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
        if (Math.abs(this.progressRect.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
            float f7 = 16;
            fCenterX = this.progressRect.centerX() + AndroidUtilities.dp(f7);
            fCenterY = this.progressRect.centerY() + AndroidUtilities.dp(f7);
            i = 20;
            i2 = 0;
        } else {
            fCenterX = this.progressRect.centerX() + AndroidUtilities.dp(18.0f);
            fCenterY = this.progressRect.centerY() + AndroidUtilities.dp(18.0f);
            i = 22;
            i2 = 2;
        }
        int i3 = i / 2;
        if (this.previousMiniDrawable == null || !this.alphaForMiniPrevious) {
            f = 360.0f;
            f2 = 1.0f;
        } else {
            f = 360.0f;
            f2 = this.animatedAlphaValue * this.overrideAlpha;
        }
        Canvas canvas2 = this.miniDrawCanvas;
        if (canvas2 != null) {
            float f8 = i + 18 + i2;
            f3 = -90.0f;
            f4 = 1.0f;
            canvas2.drawCircle(AndroidUtilities.dp(f8), AndroidUtilities.dp(f8), AndroidUtilities.dp(i3 + 1) * f2, Theme.checkboxSquare_eraserPaint);
        } else {
            f3 = -90.0f;
            f4 = 1.0f;
            this.miniProgressBackgroundPaint.setColor(this.progressColor);
            if (this.previousMiniDrawable == null || this.currentMiniDrawable != null) {
                this.miniProgressBackgroundPaint.setAlpha(255);
            } else {
                this.miniProgressBackgroundPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
            }
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(12.0f), this.miniProgressBackgroundPaint);
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
            float f9 = i3;
            this.previousMiniDrawable.setBounds((int) (fCenterX - (AndroidUtilities.dp(f9) * f2)), (int) (fCenterY - (AndroidUtilities.dp(f9) * f2)), (int) ((AndroidUtilities.dp(f9) * f2) + fCenterX), (int) ((AndroidUtilities.dp(f9) * f2) + fCenterY));
            this.previousMiniDrawable.draw(canvas);
        }
        if (!this.hideCurrentDrawable && (drawable2 = this.currentMiniDrawable) != null) {
            if (this.previousMiniDrawable != null) {
                drawable2.setAlpha((int) ((f4 - this.animatedAlphaValue) * 255.0f * this.overrideAlpha));
            } else {
                drawable2.setAlpha((int) (this.overrideAlpha * 255.0f));
            }
            float f10 = i3;
            this.currentMiniDrawable.setBounds((int) (fCenterX - AndroidUtilities.dp(f10)), (int) (fCenterY - AndroidUtilities.dp(f10)), (int) (AndroidUtilities.dp(f10) + fCenterX), (int) (AndroidUtilities.dp(f10) + fCenterY));
            this.currentMiniDrawable.draw(canvas);
        }
        if (!this.currentMiniWithRound && !this.previousMiniWithRound) {
            updateAnimation(false);
            return;
        }
        this.miniProgressPaint.setColor(this.progressColor);
        if (this.previousMiniWithRound) {
            this.miniProgressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * this.overrideAlpha));
        } else {
            this.miniProgressPaint.setAlpha((int) (this.overrideAlpha * 255.0f));
        }
        float f11 = i3 - 2;
        this.cicleRect.set(fCenterX - (AndroidUtilities.dp(f11) * f2), fCenterY - (AndroidUtilities.dp(f11) * f2), (AndroidUtilities.dp(f11) * f2) + fCenterX, (AndroidUtilities.dp(f11) * f2) + fCenterY);
        canvas.drawArc(this.cicleRect, this.radOffset + f3, Math.max(4.0f, this.animatedProgressValue * f), false, this.miniProgressPaint);
        updateAnimation(true);
    }

    public float getAlpha() {
        if (this.previousDrawable == null && this.currentDrawable == null) {
            return 0.0f;
        }
        return this.animatedAlphaValue;
    }

    public float getAnimatedProgress() {
        return this.animatedProgressValue;
    }

    public RectF getProgressRect() {
        return this.progressRect;
    }

    public boolean isDrawCheckDrawable() {
        return this.currentDrawable == this.checkBackgroundDrawable;
    }

    public void setAlphaForMiniPrevious(boolean z) {
        this.alphaForMiniPrevious = z;
    }

    public void setAlphaForPrevious(boolean z) {
        this.alphaForPrevious = z;
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
        if (z2) {
            invalidateParent();
        } else {
            this.parent.invalidate();
        }
    }

    public void setCheckBackground(boolean z, boolean z2) {
        if (this.checkDrawable == null) {
            this.checkDrawable = new CheckDrawable();
            int iDp = AndroidUtilities.dp(48.0f);
            CheckDrawable checkDrawable = this.checkDrawable;
            int i = Theme.default_shadow_color;
            OvalShape ovalShape = new OvalShape();
            float f = iDp;
            ovalShape.resize(f, f);
            ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
            shapeDrawable.getPaint().setColor(-1);
            CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawable, checkDrawable);
            combinedDrawable.setCustomSize(iDp, iDp);
            this.checkBackgroundDrawable = combinedDrawable;
        }
        Theme.setCombinedDrawableColor(this.checkBackgroundDrawable, Theme.getColor(null, Theme.key_chat_mediaLoaderPhoto, false), false);
        Theme.setCombinedDrawableColor(this.checkBackgroundDrawable, Theme.getColor(null, Theme.key_chat_mediaLoaderPhotoIcon, false), true);
        Drawable drawable = this.currentDrawable;
        Drawable drawable2 = this.checkBackgroundDrawable;
        if (drawable != drawable2) {
            setBackground(drawable2, z, z2);
            this.checkDrawable.resetProgress(z2);
        }
    }

    public void setDiff(int i) {
        this.diff = i;
    }

    public void setHideCurrentDrawable(boolean z) {
        this.hideCurrentDrawable = z;
    }

    public void setMiniBackground(Drawable drawable, boolean z, boolean z2) {
        Drawable drawable2;
        this.lastUpdateTime = System.currentTimeMillis();
        if (!z2 || (drawable2 = this.currentMiniDrawable) == drawable) {
            this.previousMiniDrawable = null;
            this.previousMiniWithRound = false;
        } else {
            this.previousMiniDrawable = drawable2;
            this.previousMiniWithRound = this.currentMiniWithRound;
            this.animatedAlphaValue = 1.0f;
            setProgress(1.0f, z2);
        }
        this.currentMiniWithRound = z;
        this.currentMiniDrawable = drawable;
        boolean z3 = (this.previousMiniDrawable == null && drawable == null) ? false : true;
        this.drawMiniProgress = z3;
        if (z3 && this.miniDrawBitmap == null) {
            try {
                this.miniDrawBitmap = Bitmap.createBitmap(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), Bitmap.Config.ARGB_8888);
                this.miniDrawCanvas = new Canvas(this.miniDrawBitmap);
            } catch (Throwable unused) {
            }
        }
        if (z2) {
            invalidateParent();
        } else {
            this.parent.invalidate();
        }
    }

    public void setMiniProgressBackgroundColor(int i) {
        this.miniProgressBackgroundPaint.setColor(i);
    }

    public void setOverrideAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setPaint(Paint paint) {
        this.overridePaint = paint;
    }

    public void setProgress(float f, boolean z) {
        if (this.drawMiniProgress) {
            if (f != 1.0f && this.animatedAlphaValue != 0.0f && this.previousMiniDrawable != null) {
                this.animatedAlphaValue = 0.0f;
                this.previousMiniDrawable = null;
                this.drawMiniProgress = this.currentMiniDrawable != null;
            }
        } else if (f != 1.0f && this.animatedAlphaValue != 0.0f && this.previousDrawable != null) {
            this.animatedAlphaValue = 0.0f;
            this.previousDrawable = null;
        }
        if (z) {
            if (this.animatedProgressValue > f) {
                this.animatedProgressValue = f;
            }
            this.animationProgressStart = this.animatedProgressValue;
        } else {
            this.animatedProgressValue = f;
            this.animationProgressStart = f;
        }
        this.currentProgress = f;
        this.currentProgressTime = 0L;
        invalidateParent();
    }

    public void setProgressColor(int i) {
        this.progressColor = i;
    }

    public void setProgressRect(int i, int i2, int i3, int i4) {
        this.progressRect.set(i, i2, i3, i4);
    }

    public void setRotationTime(float f) {
        this.rotationSpeed = f;
    }

    public void setRoundRectProgress(boolean z) {
        this.roundRectProgress = z;
    }

    public void setStrokeWidth(int i) {
        this.progressPaint.setStrokeWidth(i);
    }

    public boolean swapBackground(Drawable drawable) {
        if (this.currentDrawable == drawable) {
            return false;
        }
        this.currentDrawable = drawable;
        return true;
    }

    public boolean swapMiniBackground(Drawable drawable) {
        if (this.currentMiniDrawable == drawable) {
            return false;
        }
        this.currentMiniDrawable = drawable;
        this.drawMiniProgress = (this.previousMiniDrawable == null && drawable == null) ? false : true;
        return true;
    }
}
