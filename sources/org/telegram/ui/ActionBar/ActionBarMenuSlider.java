package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.MotionBackgroundDrawable;

public abstract class ActionBarMenuSlider extends FrameLayout {
    public boolean backgroundDark;
    public final Paint backgroundPaint;
    public Bitmap blurBitmap;
    public final AnimatedFloat blurBitmapAlpha;
    public Matrix blurBitmapMatrix;
    public BitmapShader blurBitmapShader;
    public boolean blurIsInChat;
    public final Paint blurPaint;
    public final Paint brightenBlurPaint;
    public final Paint darkenBlurPaint;
    public boolean dragging;
    public boolean drawBlur;
    public boolean drawShadow;
    public final Paint fillPaint;
    public float fromValue;
    public float fromX;
    public final AnonymousClass1 leftTextDrawable;
    public final int[] location;
    public Utilities.Callback2 onValueChange;
    public final Theme$$ExternalSyntheticLambda8 prepareBlur;
    public boolean preparingBlur;
    public int pseudoBlurColor1;
    public int pseudoBlurColor2;
    public LinearGradient pseudoBlurGradient;
    public Matrix pseudoBlurMatrix;
    public final Paint pseudoBlurPaint;
    public int pseudoBlurWidth;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnonymousClass1 rightTextDrawable;
    public float roundRadiusDp;
    public final Paint shadowPaint;
    public final Paint stopPaint;
    public float[] stops;
    public long tapStart;
    public float value;
    public ValueAnimator valueAnimator;
    public PorterDuffColorFilter whiteColorFilter;

    public final class SpeedSlider extends ActionBarMenuSlider {
        public String label;
        public final AnonymousClass1 seekBarAccessibilityDelegate;

        public SpeedSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.label = null;
            setFocusable(true);
            setFocusableInTouchMode(true);
            setImportantForAccessibility(1);
            ?? r1 = new FloatSeekBarAccessibilityDelegate() {
                @Override
                public final CharSequence getContentDescription() {
                    StringBuilder sb = new StringBuilder();
                    sb.append(CanvasButton.AnonymousClass2.formatNumber(SpeedSlider.this.getSpeed()));
                    sb.append("x  ");
                    return NotificationsController$$ExternalSyntheticOutline1.m(sb, R.string.AccDescrSpeedSlider);
                }

                @Override
                public final float getDelta() {
                    return 0.2f;
                }

                @Override
                public final float getMaxValue() {
                    return 3.0f;
                }

                @Override
                public final float getMinValue() {
                    return 0.2f;
                }

                @Override
                public final float getProgress() {
                    return SpeedSlider.this.getSpeed();
                }

                @Override
                public final void setProgress(float f) {
                    SpeedSlider.this.setSpeed(f, true);
                }
            };
            this.seekBarAccessibilityDelegate = r1;
            setAccessibilityDelegate(r1);
        }

        public float getSpeed() {
            return (getValue() * 2.8f) + 0.2f;
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || performAccessibilityActionInternal(this, i, bundle);
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public final void setSpeed(float f, boolean z) {
            setValue((f - 0.2f) / 2.8f, z);
        }

        @Override
        public void setStops(float[] fArr) {
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = (fArr[i] - 0.2f) / 2.8f;
            }
            super.setStops(fArr);
        }
    }

    public ActionBarMenuSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.value = 0.5f;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.blurBitmapAlpha = new AnimatedFloat(1.0f, this, 0L, 320L, cubicBezierInterpolator);
        this.location = new int[2];
        this.roundRadiusDp = 0.0f;
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        Paint paint2 = new Paint(1);
        this.backgroundPaint = paint2;
        this.blurPaint = new Paint(1);
        Paint paint3 = new Paint(1);
        this.brightenBlurPaint = paint3;
        Paint paint4 = new Paint(1);
        this.darkenBlurPaint = paint4;
        Paint paint5 = new Paint(1);
        this.pseudoBlurPaint = paint5;
        this.fillPaint = new Paint(1);
        Paint paint6 = new Paint(1);
        this.stopPaint = paint6;
        this.blurIsInChat = true;
        this.preparingBlur = false;
        this.prepareBlur = new Theme$$ExternalSyntheticLambda8((SpeedSlider) this, 4);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        final SpeedSlider speedSlider = (SpeedSlider) this;
        final int i = 0;
        ?? r12 = new AnimatedTextView.AnimatedTextDrawable() {
            {
                super(false, true, true, false);
            }

            @Override
            public final void invalidateSelf() {
                switch (i) {
                    case 0:
                        speedSlider.invalidate();
                        break;
                    default:
                        speedSlider.invalidate();
                        break;
                }
            }
        };
        this.leftTextDrawable = r12;
        r12.setCallback(this);
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = r12.textPaint;
        textPaint.setTypeface(typefaceBold);
        r12.moveAmplitude = 0.3f;
        r12.animateDuration = 165L;
        r12.animateWave = 1.0f;
        r12.animateInterpolator = cubicBezierInterpolator;
        r12.setTextSize(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        r12.gravity = LocaleController.isRTL ? 5 : 3;
        final int i2 = 1;
        ?? r0 = new AnimatedTextView.AnimatedTextDrawable() {
            {
                super(false, true, true, false);
            }

            @Override
            public final void invalidateSelf() {
                switch (i2) {
                    case 0:
                        speedSlider.invalidate();
                        break;
                    default:
                        speedSlider.invalidate();
                        break;
                }
            }
        };
        this.rightTextDrawable = r0;
        r0.setCallback(this);
        Typeface typefaceBold2 = AndroidUtilities.bold();
        TextPaint textPaint2 = r0.textPaint;
        textPaint2.setTypeface(typefaceBold2);
        r0.moveAmplitude = 0.3f;
        r0.animateDuration = 165L;
        r0.animateWave = 1.0f;
        r0.animateInterpolator = cubicBezierInterpolator;
        r0.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        r0.gravity = LocaleController.isRTL ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        boolean z = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.backgroundDark = z;
        int i3 = z ? -1 : -16777216;
        textPaint.setColor(i3);
        r12.alpha = Color.alpha(i3);
        int i4 = this.backgroundDark ? -1 : -16777216;
        textPaint2.setColor(i4);
        r0.alpha = Color.alpha(i4);
        paint4.setColor(Theme.multAlpha(0.025f, -16777216));
        paint3.setColor(Theme.multAlpha(0.35f, -1));
        paint6.setColor(Theme.multAlpha(0.2f, -1));
    }

    public final void drawStops(Canvas canvas) {
        if (this.stops == null) {
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr = this.stops;
            if (i >= fArr.length) {
                return;
            }
            float f = fArr[i];
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRect((rectF.width() * f) + rectF.left, rectF.top, (rectF.width() * f) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.stopPaint);
            i++;
        }
    }

    public final void drawText(Canvas canvas, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z) {
            porterDuffColorFilter = this.whiteColorFilter;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.whiteColorFilter = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        AnonymousClass1 anonymousClass1 = this.leftTextDrawable;
        anonymousClass1.textPaint.setColorFilter(porterDuffColorFilter);
        anonymousClass1.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        anonymousClass1.draw(canvas);
        if (z && (porterDuffColorFilter2 = this.whiteColorFilter) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.whiteColorFilter = porterDuffColorFilter2;
        }
        AnonymousClass1 anonymousClass2 = this.rightTextDrawable;
        anonymousClass2.textPaint.setColorFilter(porterDuffColorFilter2);
        anonymousClass2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        anonymousClass2.draw(canvas);
    }

    public float getValue() {
        return this.value;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.drawShadow) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.shadowPaint);
        }
        boolean z = this.drawBlur;
        Paint paint = this.fillPaint;
        if (z) {
            float f = this.blurBitmapAlpha.set(this.blurBitmap != null ? 1.0f : 0.0f, false);
            if (f < 1.0f) {
                if (this.pseudoBlurMatrix == null || this.pseudoBlurWidth != ((int) rectF.width())) {
                    Matrix matrix = this.pseudoBlurMatrix;
                    if (matrix == null) {
                        this.pseudoBlurMatrix = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.pseudoBlurMatrix;
                    int iWidth = (int) rectF.width();
                    this.pseudoBlurWidth = iWidth;
                    matrix2.postScale(iWidth, 1.0f);
                    this.pseudoBlurGradient.setLocalMatrix(this.pseudoBlurMatrix);
                }
                Paint paint2 = this.pseudoBlurPaint;
                paint2.setAlpha((int) ((1.0f - f) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), paint2);
            }
            if (this.blurBitmap != null && this.value < 1.0f && f > 0.0f) {
                Paint paint3 = this.blurPaint;
                paint3.setAlpha((int) (f * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.brightenBlurPaint);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.darkenBlurPaint);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.backgroundPaint);
        }
        drawStops(canvas);
        if (!this.backgroundDark) {
            drawText(canvas, false);
        }
        if (this.value < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.value) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), paint);
        drawStops(canvas);
        if (!this.backgroundDark) {
            drawText(canvas, true);
        }
        if (this.value < 1.0f) {
            canvas.restore();
        }
        if (this.backgroundDark) {
            drawText(canvas, false);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int color;
        int iIntValue;
        Bitmap bitmap;
        super.onLayout(z, i, i2, i3, i4);
        int[] iArr = this.location;
        getLocationOnScreen(iArr);
        Matrix matrix = this.blurBitmapMatrix;
        if (matrix != null) {
            matrix.reset();
            this.blurBitmapMatrix.postScale(8.0f, 8.0f);
            this.blurBitmapMatrix.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.blurBitmapShader;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                invalidate();
            }
        }
        boolean z2 = this.blurIsInChat;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z2) {
            Drawable cachedWallpaper = Theme.getCachedWallpaper();
            if (!(cachedWallpaper instanceof ColorDrawable)) {
                Pair pair = null;
                if (cachedWallpaper instanceof MotionBackgroundDrawable) {
                    bitmap = ((MotionBackgroundDrawable) cachedWallpaper).currentBitmap;
                } else {
                    bitmap = cachedWallpaper instanceof BitmapDrawable ? ((BitmapDrawable) cachedWallpaper).getBitmap() : null;
                }
                if (bitmap != null) {
                    int i5 = iArr[0];
                    float f = i5 / AndroidUtilities.displaySize.x;
                    float measuredWidth = (getMeasuredWidth() + i5) / AndroidUtilities.displaySize.x;
                    float currentActionBarHeight = ((iArr[1] - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y;
                    int width = (int) (f * bitmap.getWidth());
                    int width2 = (int) (measuredWidth * bitmap.getWidth());
                    int height = (int) (currentActionBarHeight * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && width2 >= 0 && width2 < bitmap.getWidth() && height >= 0 && height < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, height)), Integer.valueOf(bitmap.getPixel(width2, height)));
                    }
                }
                if (pair != null) {
                    color = ((Integer) pair.first).intValue();
                    iIntValue = ((Integer) pair.second).intValue();
                } else {
                    color = Theme.multAlpha(0.25f, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                }
                if (this.pseudoBlurGradient == null && this.pseudoBlurColor1 == color && this.pseudoBlurColor2 == iIntValue) {
                    return;
                }
                this.pseudoBlurColor1 = color;
                this.pseudoBlurColor2 = iIntValue;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{color, iIntValue}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.pseudoBlurGradient = linearGradient;
                this.pseudoBlurPaint.setShader(linearGradient);
            }
            color = ((ColorDrawable) cachedWallpaper).getColor();
        } else {
            color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
            if (!Theme.currentTheme.isDark()) {
                color = Theme.blendOver(color, Theme.multAlpha(0.18f, -16777216));
            }
        }
        iIntValue = color;
        if (this.pseudoBlurGradient == null) {
        }
        this.pseudoBlurColor1 = color;
        this.pseudoBlurColor2 = iIntValue;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{color, iIntValue}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.pseudoBlurGradient = linearGradient2;
        this.pseudoBlurPaint.setShader(linearGradient2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.drawShadow) {
            i = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i), 1073741824);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
        boolean z = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256);
        if (this.drawBlur && this.blurBitmap == null && !this.preparingBlur && z) {
            this.prepareBlur.run();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fMax;
        boolean z;
        Utilities.Callback2 callback2;
        int i;
        float[] fArr;
        float x = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dragging = true;
            this.fromX = x;
            this.fromValue = this.value;
            this.tapStart = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i2 = 0;
            if (action == 1) {
                this.dragging = false;
                if (System.currentTimeMillis() - this.tapStart < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.stops != null) {
                        while (true) {
                            float[] fArr2 = this.stops;
                            if (i2 >= fArr2.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr2[i2]) < 0.1f) {
                                paddingLeft = this.stops[i2];
                                break;
                            }
                            i2++;
                        }
                    }
                    Utilities.Callback2 callback3 = this.onValueChange;
                    if (callback3 != null) {
                        callback3.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                } else {
                    fMax = ((x - this.fromX) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.fromValue;
                    if (this.stops != null) {
                        i = 0;
                        while (true) {
                            fArr = this.stops;
                            if (i >= fArr.length) {
                                break;
                            }
                            if (Math.abs(fMax - fArr[i]) < 0.05f) {
                                fMax = this.stops[i];
                                break;
                            }
                            i++;
                        }
                    }
                    z = !this.dragging;
                    setValue(fMax, false);
                    callback2 = this.onValueChange;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(this.value), Boolean.valueOf(z));
                    }
                }
            } else {
                fMax = ((x - this.fromX) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.fromValue;
                if (this.stops != null) {
                    i = 0;
                    while (true) {
                        fArr = this.stops;
                        if (i >= fArr.length) {
                            break;
                            break;
                        }
                        if (Math.abs(fMax - fArr[i]) < 0.05f) {
                            fMax = this.stops[i];
                            break;
                        }
                        i++;
                    }
                }
                z = !this.dragging;
                setValue(fMax, false);
                callback2 = this.onValueChange;
                if (callback2 != null) {
                    callback2.run(Float.valueOf(this.value), Boolean.valueOf(z));
                }
            }
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i) {
        Paint paint = this.backgroundPaint;
        paint.setColor(i);
        boolean z = AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f;
        this.backgroundDark = z;
        int i2 = z ? -1 : -16777216;
        AnonymousClass1 anonymousClass1 = this.leftTextDrawable;
        anonymousClass1.textPaint.setColor(i2);
        anonymousClass1.alpha = Color.alpha(i2);
        int i3 = this.backgroundDark ? -1 : -16777216;
        AnonymousClass1 anonymousClass2 = this.rightTextDrawable;
        anonymousClass2.textPaint.setColor(i3);
        anonymousClass2.alpha = Color.alpha(i3);
    }

    public void setDrawBlur(boolean z) {
        this.drawBlur = z;
        invalidate();
    }

    public void setDrawShadow(boolean z) {
        this.drawShadow = z;
        int iDp = z ? AndroidUtilities.dp(8.0f) : 0;
        setPadding(iDp, iDp, iDp, iDp);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.onValueChange = callback2;
    }

    public void setRoundRadiusDp(float f) {
        this.roundRadiusDp = f;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.stops = fArr;
    }

    public void setTextColor(int i) {
        AnonymousClass1 anonymousClass1 = this.leftTextDrawable;
        anonymousClass1.textPaint.setColor(i);
        anonymousClass1.alpha = Color.alpha(i);
        AnonymousClass1 anonymousClass2 = this.rightTextDrawable;
        anonymousClass2.textPaint.setColor(i);
        anonymousClass2.alpha = Color.alpha(i);
    }

    public final void setValue(float f, boolean z) {
        int i = 1;
        ValueAnimator valueAnimator = this.valueAnimator;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.valueAnimator = null;
        }
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.value, fClamp);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(this, i));
            this.valueAnimator.addListener(new SlideIntChooseView.AnonymousClass3(this, fClamp, i));
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.valueAnimator.setDuration(220L);
            this.valueAnimator.start();
        } else {
            this.value = fClamp;
            invalidate();
        }
        SpeedSlider speedSlider = (SpeedSlider) this;
        String str2 = speedSlider.label;
        if (str2 == null) {
            str2 = CanvasButton.AnonymousClass2.formatNumber((fClamp * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            AnonymousClass1 anonymousClass1 = this.leftTextDrawable;
            if (!TextUtils.equals(anonymousClass1.currentText, str2)) {
                ValueAnimator valueAnimator2 = anonymousClass1.animator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                anonymousClass1.setText(str2, true, true);
            }
        }
        if (speedSlider.label != null) {
            str = CanvasButton.AnonymousClass2.formatNumber((fClamp * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            AnonymousClass1 anonymousClass2 = this.rightTextDrawable;
            if (!TextUtils.equals(anonymousClass2.currentText, str)) {
                ValueAnimator valueAnimator3 = anonymousClass2.animator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                anonymousClass2.setText(str, true, true);
            }
        }
        int i2 = Theme.key_color_lightblue;
        Theme.ResourcesProvider resourcesProvider = speedSlider.resourcesProvider;
        this.fillPaint.setColor(ColorUtils.blendARGB(MathUtils.clamp((((fClamp * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), Theme.getColor(i2, resourcesProvider), Theme.getColor(Theme.key_color_blue, resourcesProvider)));
    }
}
