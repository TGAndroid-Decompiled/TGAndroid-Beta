package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;

public final class WallpaperCheckBoxView extends View {
    public final PhotoViewer.AnonymousClass5 PROGRESS_PROPERTY;
    public final Paint backgroundPaint;
    public ObjectAnimator checkAnimator;
    public final Paint checkPaint;
    public int[] colors;
    public String currentText;
    public int currentTextSize;
    public float dimAmount;
    public final Paint dimPaint;
    public final Bitmap drawBitmap;
    public final Canvas drawCanvas;
    public final Paint eraserPaint;
    public boolean isChecked;
    public int maxTextSize;
    public final View parentView;
    public float progress;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextPaint textPaint;

    public WallpaperCheckBoxView(Context context, boolean z, View view, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.colors = new int[4];
        this.PROGRESS_PROPERTY = new PhotoViewer.AnonymousClass5(this);
        this.dimPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        this.rect = new RectF();
        if (z) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.drawBitmap = bitmapCreateBitmap;
            this.drawCanvas = new Canvas(bitmapCreateBitmap);
        }
        this.parentView = view;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.checkPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.eraserPaint = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.backgroundPaint = new Paint(1);
    }

    private void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        RectF rectF = this.rect;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        View view = this.parentView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Theme.applyServiceShaderMatrixForView(this, view, resourcesProvider);
        float measuredHeight = getMeasuredHeight() / 2;
        float measuredHeight2 = getMeasuredHeight() / 2;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackground") : null;
        if (paint == null) {
            paint = Theme.getThemePaint("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight, measuredHeight2, paint);
        if (resourcesProvider == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService()) {
            float measuredHeight3 = getMeasuredHeight() / 2;
            float measuredHeight4 = getMeasuredHeight() / 2;
            Paint paint2 = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackgroundDarken") : null;
            if (paint2 == null) {
                paint2 = Theme.getThemePaint("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight3, measuredHeight4, paint2);
        }
        if (this.dimAmount > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.dimPaint);
        }
        TextPaint textPaint = this.textPaint;
        int i = Theme.key_chat_serviceText;
        textPaint.setColor(Theme.getColor(i, resourcesProvider));
        int iM$2 = OKLCH.m$2(28.0f, getMeasuredWidth() - this.currentTextSize, 2);
        canvas2.drawText(this.currentText, AndroidUtilities.dp(28.0f) + iM$2, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(iM$2, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.drawBitmap;
        int i2 = 0;
        Paint paint3 = this.backgroundPaint;
        if (bitmap != null) {
            float f2 = this.progress;
            float f3 = f2 / 0.5f;
            if (f2 <= 0.5f) {
                f = f3;
            } else {
                f = 2.0f - f3;
                f3 = 1.0f;
            }
            float fDp = AndroidUtilities.dp(1.0f) * f;
            rectF.set(fDp, fDp, AndroidUtilities.dp(18.0f) - fDp, AndroidUtilities.dp(18.0f) - fDp);
            bitmap.eraseColor(0);
            paint3.setColor(Theme.getColor(i, resourcesProvider));
            Canvas canvas3 = this.drawCanvas;
            canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            if (f3 != 1.0f) {
                float fMin = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f3) + fDp);
                rectF.set(AndroidUtilities.dp(2.0f) + fMin, AndroidUtilities.dp(2.0f) + fMin, AndroidUtilities.dp(16.0f) - fMin, AndroidUtilities.dp(16.0f) - fMin);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.eraserPaint);
            }
            if (this.progress > 0.5f) {
                float f4 = 1.0f - f;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f4)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * f4)), this.checkPaint);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f4) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f4)), this.checkPaint);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.colors;
            if (iArr[3] != 0) {
                while (i2 < 4) {
                    paint3.setColor(this.colors[i2]);
                    canvas2.drawArc(rectF, (i2 * 90) - 90, 90.0f, true, paint3);
                    i2++;
                    canvas2 = canvas;
                }
            } else if (iArr[2] != 0) {
                while (i2 < 3) {
                    paint3.setColor(this.colors[i2]);
                    canvas.drawArc(rectF, (i2 * 120) - 90, 120.0f, true, paint3);
                    i2++;
                }
            } else if (iArr[1] != 0) {
                while (i2 < 2) {
                    paint3.setColor(this.colors[i2]);
                    canvas.drawArc(rectF, (i2 * 180) - 90, 180.0f, true, paint3);
                    i2++;
                }
            } else {
                canvas2 = canvas;
                paint3.setColor(iArr[0]);
                canvas2.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint3);
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(zzkm.m(56.0f, this.maxTextSize), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public final void setChecked(boolean z, boolean z2) {
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (z2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, this.PROGRESS_PROPERTY, z ? 1.0f : 0.0f);
            this.checkAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            this.checkAnimator.start();
            return;
        }
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.progress = z ? 1.0f : 0.0f;
        invalidate();
    }

    public final void setColor(int i, int i2) {
        if (this.colors == null) {
            this.colors = new int[4];
        }
        this.colors[i] = i2;
        invalidate();
    }

    public void setDimAmount(float f) {
        this.dimAmount = f;
        this.dimPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f)));
        invalidate();
    }
}
