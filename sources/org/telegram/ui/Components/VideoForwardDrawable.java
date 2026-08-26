package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.PhotoViewer;

public final class VideoForwardDrawable extends Drawable {
    public static final int[] playPath = {10, 7, 26, 16, 10, 25};
    public boolean animating;
    public float animationProgress;
    public Path clippingPath;
    public VideoForwardDrawableDelegate delegate;
    public float enterAnimationProgress;
    public boolean isOneShootAnimation;
    public final boolean isRound;
    public long lastAnimationTime;
    public int lastClippingPath;
    public boolean leftSide;
    public final Paint paint;
    public final Path path1;
    public float playScaleFactor;
    public boolean showing;
    public final TextPaint textPaint;
    public long time;
    public String timeStr;

    public interface VideoForwardDrawableDelegate {
        void invalidate();
    }

    public VideoForwardDrawable(boolean z) {
        Paint paint = new Paint(1);
        this.paint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        Path path = new Path();
        this.path1 = path;
        this.playScaleFactor = 1.0f;
        this.isRound = z;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        int i = 0;
        while (true) {
            int[] iArr = playPath;
            if (i >= 3) {
                this.path1.close();
                return;
            }
            if (i == 0) {
                int i2 = i * 2;
                this.path1.moveTo(AndroidUtilities.dp(iArr[i2]), AndroidUtilities.dp(iArr[i2 + 1]));
            } else {
                int i3 = i * 2;
                this.path1.lineTo(AndroidUtilities.dp(iArr[i3]), AndroidUtilities.dp(iArr[i3 + 1]));
            }
            i++;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int iWidth = ((bounds.width() - AndroidUtilities.dp(32.0f)) / 2) + bounds.left;
        int iHeight = ((bounds.height() - AndroidUtilities.dp(32.0f)) / 2) + bounds.top;
        int iM = this.leftSide ? RichMessageLayout$$ExternalSyntheticOutline1.m(bounds.width() / 4, 16.0f, iWidth) : RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(bounds.width() / 4, 16.0f, iWidth);
        canvas.save();
        if (this.isRound) {
            if (this.clippingPath == null) {
                this.clippingPath = new Path();
            }
            int i = bounds.left + (bounds.top << 8) + (bounds.bottom << 16) + (bounds.right << 24);
            if (this.lastClippingPath != i) {
                this.clippingPath.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(bounds);
                this.clippingPath.addOval(rectF, Path.Direction.CCW);
                this.lastClippingPath = i;
            }
            canvas.clipPath(this.clippingPath);
        } else {
            canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        boolean z = this.isOneShootAnimation;
        TextPaint textPaint = this.textPaint;
        Paint paint = this.paint;
        if (z) {
            float f2 = this.animationProgress;
            if (f2 <= 0.7f) {
                paint.setAlpha((int) (Math.min(1.0f, f2 / 0.3f) * 80.0f));
                textPaint.setAlpha((int) (Math.min(1.0f, this.animationProgress / 0.3f) * 255.0f));
            } else {
                paint.setAlpha((int) ((1.0f - ((f2 - 0.7f) / 0.3f)) * 80.0f));
                textPaint.setAlpha((int) ((1.0f - ((this.animationProgress - 0.7f) / 0.3f)) * 255.0f));
            }
        } else {
            paint.setAlpha((int) (this.enterAnimationProgress * 80.0f));
            textPaint.setAlpha((int) (this.enterAnimationProgress * 255.0f));
        }
        canvas.drawCircle(((Math.max(bounds.width(), bounds.height()) / 4) * (this.leftSide ? -1 : 1)) + iM, AndroidUtilities.dp(16.0f) + iHeight, Math.max(bounds.width(), bounds.height()) / 2, paint);
        canvas.restore();
        String str = this.timeStr;
        if (str != null) {
            canvas.drawText(str, (AndroidUtilities.dp(32.0f) * (this.leftSide ? -1 : 1)) + iM, AndroidUtilities.dp(15.0f) + AndroidUtilities.dp(32.0f) + iHeight, textPaint);
        }
        canvas.save();
        float f3 = this.playScaleFactor;
        float f4 = iM;
        float f5 = iHeight;
        canvas.scale(f3, f3, f4, (AndroidUtilities.dp(32.0f) / 2.0f) + f5);
        if (this.leftSide) {
            canvas.rotate(180.0f, f4, (AndroidUtilities.dp(32.0f) / 2) + iHeight);
        }
        canvas.translate(f4, f5);
        float f6 = this.animationProgress;
        Path path = this.path1;
        if (f6 <= 0.6f) {
            int iMin = f6 < 0.4f ? Math.min(255, (int) ((f6 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f6 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.isOneShootAnimation) {
                iMin = (int) (iMin * this.enterAnimationProgress);
            }
            paint.setAlpha(iMin);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f7 = this.animationProgress;
        if (f7 >= 0.2f && f7 <= 0.8f) {
            float f8 = f7 - 0.2f;
            int iMin2 = f8 < 0.4f ? Math.min(255, (int) ((f8 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f8 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.isOneShootAnimation) {
                iMin2 = (int) (iMin2 * this.enterAnimationProgress);
            }
            paint.setAlpha(iMin2);
            canvas.drawPath(path, paint);
        }
        canvas.translate(AndroidUtilities.dp(18.0f), 0.0f);
        float f9 = this.animationProgress;
        if (f9 >= 0.4f && f9 <= 1.0f) {
            float f10 = f9 - 0.4f;
            int iMin3 = f10 < 0.4f ? Math.min(255, (int) ((f10 * 255.0f) / 0.2f)) : (int) ((1.0f - ((f10 - 0.4f) / 0.2f)) * 255.0f);
            if (!this.isOneShootAnimation) {
                iMin3 = (int) (iMin3 * this.enterAnimationProgress);
            }
            paint.setAlpha(iMin3);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
        if (this.animating) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastAnimationTime;
            if (j > 17) {
                j = 17;
            }
            this.lastAnimationTime = jCurrentTimeMillis;
            float f11 = this.animationProgress;
            if (f11 < 1.0f) {
                float f12 = (j / 800.0f) + f11;
                this.animationProgress = f12;
                if (this.isOneShootAnimation) {
                    if (f12 >= 1.0f) {
                        this.animationProgress = 0.0f;
                        this.animating = false;
                        this.time = 0L;
                        this.timeStr = null;
                    }
                } else if (f12 >= 1.0f) {
                    if (this.showing) {
                        this.animationProgress = 0.0f;
                    } else {
                        this.animationProgress = 1.0f;
                    }
                }
                invalidate();
            }
            if (this.isOneShootAnimation) {
                return;
            }
            boolean z2 = this.showing;
            if (z2) {
                float f13 = this.enterAnimationProgress;
                if (f13 != 1.0f) {
                    this.enterAnimationProgress = f13 + 0.10666667f;
                    invalidate();
                } else if (!z2) {
                    f = this.enterAnimationProgress;
                    if (f != 0.0f) {
                        this.enterAnimationProgress = f - 0.10666667f;
                        invalidate();
                    }
                }
            } else if (!z2) {
                f = this.enterAnimationProgress;
                if (f != 0.0f) {
                    this.enterAnimationProgress = f - 0.10666667f;
                    invalidate();
                }
            }
            float f14 = this.enterAnimationProgress;
            if (f14 < 0.0f) {
                this.enterAnimationProgress = 0.0f;
            } else if (f14 > 1.0f) {
                this.enterAnimationProgress = 1.0f;
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void invalidate() {
        VideoForwardDrawableDelegate videoForwardDrawableDelegate = this.delegate;
        if (videoForwardDrawableDelegate != null) {
            videoForwardDrawableDelegate.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean isAnimating() {
        return this.animating;
    }

    @Override
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
        this.textPaint.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setDelegate(PhotoViewer.AnonymousClass24 anonymousClass24) {
        this.delegate = anonymousClass24;
    }

    public final void setLeftSide(boolean z) {
        boolean z2 = this.leftSide;
        if (z2 == z && this.animationProgress >= 1.0f && this.isOneShootAnimation) {
            return;
        }
        if (z2 != z) {
            this.time = 0L;
            this.timeStr = null;
        }
        this.leftSide = z;
        this.animating = true;
        this.animationProgress = 0.0f;
        invalidateSelf();
    }

    public final void setOneShootAnimation(boolean z) {
        if (this.isOneShootAnimation != z) {
            this.isOneShootAnimation = z;
            this.timeStr = null;
            this.time = 0L;
            this.animationProgress = 0.0f;
        }
    }

    public final void setTime(long j) {
        this.time = j;
        if (j >= 1000) {
            this.timeStr = LocaleController.formatPluralString("Seconds", (int) (j / 1000), new Object[0]);
        } else {
            this.timeStr = null;
        }
    }
}
