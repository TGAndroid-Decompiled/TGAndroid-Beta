package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.SeekBarAccessibilityDelegate;
import org.telegram.ui.Components.SpeedIconDrawable;
public class ActionBarMenuSlider extends FrameLayout {
    private boolean backgroundDark;
    private Paint backgroundPaint;
    private Bitmap blurBitmap;
    private AnimatedFloat blurBitmapAlpha;
    private Matrix blurBitmapMatrix;
    private BitmapShader blurBitmapShader;
    private boolean blurIsInChat;
    private Paint blurPaint;
    private Paint brightenBlurPaint;
    private Paint darkenBlurPaint;
    private boolean dragging;
    private boolean drawBlur;
    private boolean drawShadow;
    private Paint fillPaint;
    private float fromValue;
    private float fromX;
    private int[] location;
    private Utilities.Callback2<Float, Boolean> onValueChange;
    private Runnable prepareBlur;
    private boolean preparingBlur;
    private int pseudoBlurColor1;
    private int pseudoBlurColor2;
    private LinearGradient pseudoBlurGradient;
    private Matrix pseudoBlurMatrix;
    private Paint pseudoBlurPaint;
    private int pseudoBlurWidth;
    protected Theme.ResourcesProvider resourcesProvider;
    private float roundRadiusDp;
    private Paint shadowPaint;
    private long tapStart;
    private AnimatedTextView.AnimatedTextDrawable textDrawable;
    private float value;
    private ValueAnimator valueAnimator;
    private ColorFilter whiteColorFilter;

    protected int getColorValue(float f) {
        return -1;
    }

    protected String getStringValue(float f) {
        return null;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ActionBarMenuSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.value = 0.5f;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.blurBitmapAlpha = new AnimatedFloat(1.0f, this, 0L, 320L, cubicBezierInterpolator);
        this.location = new int[2];
        this.roundRadiusDp = 0.0f;
        this.shadowPaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.blurPaint = new Paint(1);
        this.brightenBlurPaint = new Paint(1);
        this.darkenBlurPaint = new Paint(1);
        this.pseudoBlurPaint = new Paint(1);
        this.fillPaint = new Paint(1);
        this.blurIsInChat = true;
        this.preparingBlur = false;
        this.prepareBlur = new Runnable() {
            @Override
            public final void run() {
                ActionBarMenuSlider.this.lambda$new$2();
            }
        };
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true) {
            @Override
            public void invalidateSelf() {
                ActionBarMenuSlider.this.invalidate();
            }
        };
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setCallback(this);
        this.textDrawable.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textDrawable.setAnimationProperties(0.3f, 0L, 165L, cubicBezierInterpolator);
        this.textDrawable.setTextSize(AndroidUtilities.dpf2(14.0f));
        this.textDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        this.textDrawable.getPaint().setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        this.textDrawable.setGravity(LocaleController.isRTL ? 5 : 3);
        this.shadowPaint.setColor(0);
        this.shadowPaint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        this.pseudoBlurPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.backgroundPaint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider));
        boolean z = AndroidUtilities.computePerceivedBrightness(this.backgroundPaint.getColor()) <= 0.721f;
        this.backgroundDark = z;
        this.textDrawable.setTextColor(z ? -1 : -16777216);
        this.darkenBlurPaint.setColor(Theme.multAlpha(-16777216, 0.025f));
        this.brightenBlurPaint.setColor(Theme.multAlpha(-1, 0.35f));
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float f, boolean z) {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.valueAnimator = null;
        }
        final float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (!z) {
            this.value = clamp;
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.value, clamp);
            this.valueAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ActionBarMenuSlider.this.lambda$setValue$0(valueAnimator2);
                }
            });
            this.valueAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ActionBarMenuSlider.this.valueAnimator = null;
                    ActionBarMenuSlider.this.value = clamp;
                    ActionBarMenuSlider.this.invalidate();
                }
            });
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.valueAnimator.setDuration(220L);
            this.valueAnimator.start();
        }
        String stringValue = getStringValue(clamp);
        if (stringValue != null && !TextUtils.equals(this.textDrawable.getText(), stringValue)) {
            this.textDrawable.cancelAnimation();
            this.textDrawable.setText(stringValue, true);
        }
        this.fillPaint.setColor(getColorValue(clamp));
    }

    public void lambda$setValue$0(ValueAnimator valueAnimator) {
        this.value = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
        boolean z = AndroidUtilities.computePerceivedBrightness(this.backgroundPaint.getColor()) <= 0.721f;
        this.backgroundDark = z;
        this.textDrawable.setTextColor(z ? -1 : -16777216);
    }

    public void setTextColor(int i) {
        this.textDrawable.setTextColor(i);
    }

    private void updateValue(float f, boolean z) {
        setValue(f, false);
        Utilities.Callback2<Float, Boolean> callback2 = this.onValueChange;
        if (callback2 != null) {
            callback2.run(Float.valueOf(this.value), Boolean.valueOf(z));
        }
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.onValueChange = callback2;
    }

    public void setDrawShadow(boolean z) {
        this.drawShadow = z;
        int dp = z ? AndroidUtilities.dp(8.0f) : 0;
        setPadding(dp, dp, dp, dp);
        invalidate();
    }

    public void setDrawBlur(boolean z) {
        this.drawBlur = z;
        invalidate();
    }

    public void setRoundRadiusDp(float f) {
        this.roundRadiusDp = f;
        invalidate();
    }

    public void lambda$new$2() {
        this.preparingBlur = true;
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ActionBarMenuSlider.this.lambda$new$1((Bitmap) obj);
            }
        }, 8.0f);
    }

    public void lambda$new$1(Bitmap bitmap) {
        this.preparingBlur = false;
        this.blurBitmap = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.blurBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = this.blurBitmapMatrix;
        if (matrix == null) {
            this.blurBitmapMatrix = new Matrix();
        } else {
            matrix.reset();
        }
        this.blurBitmapMatrix.postScale(8.0f, 8.0f);
        Matrix matrix2 = this.blurBitmapMatrix;
        int[] iArr = this.location;
        matrix2.postTranslate(-iArr[0], -iArr[1]);
        this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
        this.blurPaint.setShader(this.blurBitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.2f);
        this.blurPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.drawShadow) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) + getPaddingRight() + getPaddingLeft(), 1073741824);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f) + getPaddingTop() + getPaddingBottom(), 1073741824));
        boolean z = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_CHAT_BLUR);
        if (this.drawBlur && this.blurBitmap == null && !this.preparingBlur && z) {
            this.prepareBlur.run();
        }
    }

    public void invalidateBlur(boolean z) {
        this.blurIsInChat = z;
        this.blurPaint.setShader(null);
        this.blurBitmapShader = null;
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.blurBitmap = null;
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationOnScreen(this.location);
        Matrix matrix = this.blurBitmapMatrix;
        if (matrix != null) {
            matrix.reset();
            this.blurBitmapMatrix.postScale(8.0f, 8.0f);
            Matrix matrix2 = this.blurBitmapMatrix;
            int[] iArr = this.location;
            matrix2.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.blurBitmapShader;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                invalidate();
            }
        }
        updatePseudoBlurColors();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.drawShadow) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.shadowPaint);
        }
        if (this.drawBlur) {
            float f = this.blurBitmapAlpha.set(this.blurBitmap != null ? 1.0f : 0.0f);
            if (f < 1.0f) {
                if (this.pseudoBlurMatrix == null || this.pseudoBlurWidth != ((int) rectF.width())) {
                    Matrix matrix = this.pseudoBlurMatrix;
                    if (matrix == null) {
                        this.pseudoBlurMatrix = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.pseudoBlurMatrix;
                    int width = (int) rectF.width();
                    this.pseudoBlurWidth = width;
                    matrix2.postScale(width, 1.0f);
                    this.pseudoBlurGradient.setLocalMatrix(this.pseudoBlurMatrix);
                }
                this.pseudoBlurPaint.setAlpha((int) ((1.0f - f) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.pseudoBlurPaint);
            }
            if (this.blurBitmap != null && this.value < 1.0f && f > 0.0f) {
                this.blurPaint.setAlpha((int) (f * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.blurPaint);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.brightenBlurPaint);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.darkenBlurPaint);
            this.fillPaint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.backgroundPaint);
        }
        if (!this.backgroundDark) {
            drawText(canvas, false);
        }
        if (this.value < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.value), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.roundRadiusDp), AndroidUtilities.dp(this.roundRadiusDp), this.fillPaint);
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

    private void drawText(Canvas canvas, boolean z) {
        ColorFilter colorFilter;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        if (z) {
            colorFilter = this.whiteColorFilter;
            if (colorFilter == null) {
                colorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.whiteColorFilter = colorFilter;
            }
        } else {
            colorFilter = null;
        }
        animatedTextDrawable.setColorFilter(colorFilter);
        this.textDrawable.setBounds(getPaddingLeft() + AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        this.textDrawable.draw(canvas);
    }

    private Pair<Integer, Integer> getBitmapGradientColors(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int[] iArr = this.location;
        float f = iArr[0] / AndroidUtilities.displaySize.x;
        float measuredWidth = (iArr[0] + getMeasuredWidth()) / AndroidUtilities.displaySize.x;
        float currentActionBarHeight = ((this.location[1] - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y;
        int width = (int) (f * bitmap.getWidth());
        int width2 = (int) (measuredWidth * bitmap.getWidth());
        int height = (int) (currentActionBarHeight * bitmap.getHeight());
        if (width < 0 || width >= bitmap.getWidth() || width2 < 0 || width2 >= bitmap.getWidth() || height < 0 || height >= bitmap.getHeight()) {
            return null;
        }
        return new Pair<>(Integer.valueOf(bitmap.getPixel(width, height)), Integer.valueOf(bitmap.getPixel(width2, height)));
    }

    private void updatePseudoBlurColors() {
        int color;
        int i;
        if (this.blurIsInChat) {
            Drawable cachedWallpaper = Theme.getCachedWallpaper();
            if (cachedWallpaper instanceof ColorDrawable) {
                color = ((ColorDrawable) cachedWallpaper).getColor();
            } else {
                Bitmap bitmap = null;
                if (cachedWallpaper instanceof MotionBackgroundDrawable) {
                    bitmap = ((MotionBackgroundDrawable) cachedWallpaper).getBitmap();
                } else if (cachedWallpaper instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) cachedWallpaper).getBitmap();
                }
                Pair<Integer, Integer> bitmapGradientColors = getBitmapGradientColors(bitmap);
                if (bitmapGradientColors != null) {
                    int intValue = ((Integer) bitmapGradientColors.first).intValue();
                    i = ((Integer) bitmapGradientColors.second).intValue();
                    color = intValue;
                    if (this.pseudoBlurGradient == null && this.pseudoBlurColor1 == color && this.pseudoBlurColor2 == i) {
                        return;
                    }
                    this.pseudoBlurColor1 = color;
                    this.pseudoBlurColor2 = i;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{color, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.pseudoBlurGradient = linearGradient;
                    this.pseudoBlurPaint.setShader(linearGradient);
                }
                color = Theme.multAlpha(Theme.getColor("windowBackgroundWhite", this.resourcesProvider), 0.25f);
            }
        } else {
            color = Theme.getColor("windowBackgroundWhite", this.resourcesProvider);
            if (!Theme.isCurrentThemeDark()) {
                color = Theme.blendOver(color, Theme.multAlpha(-16777216, 0.18f));
            }
        }
        i = color;
        if (this.pseudoBlurGradient == null) {
        }
        this.pseudoBlurColor1 = color;
        this.pseudoBlurColor2 = i;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{color, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.pseudoBlurGradient = linearGradient2;
        this.pseudoBlurPaint.setShader(linearGradient2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dragging = true;
            this.fromX = x;
            this.fromValue = this.value;
            this.tapStart = System.currentTimeMillis();
        } else if (action == 2 || action == 1) {
            if (action == 1) {
                this.dragging = false;
                if (System.currentTimeMillis() - this.tapStart < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    Utilities.Callback2<Float, Boolean> callback2 = this.onValueChange;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                    }
                    return true;
                }
            }
            updateValue(this.fromValue + ((x - this.fromX) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())), !this.dragging);
        }
        return true;
    }

    public static class SpeedSlider extends ActionBarMenuSlider {
        private final SeekBarAccessibilityDelegate seekBarAccessibilityDelegate;

        public float getSpeed(float f) {
            return (f * 2.3f) + 0.2f;
        }

        public SpeedSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setImportantForAccessibility(1);
            FloatSeekBarAccessibilityDelegate floatSeekBarAccessibilityDelegate = new FloatSeekBarAccessibilityDelegate(false) {
                @Override
                public float getDelta() {
                    return 0.2f;
                }

                @Override
                protected float getMaxValue() {
                    return 2.5f;
                }

                @Override
                protected float getMinValue() {
                    return 0.2f;
                }

                @Override
                public float getProgress() {
                    return SpeedSlider.this.getSpeed();
                }

                @Override
                public void setProgress(float f) {
                    SpeedSlider.this.setSpeed(f, true);
                }

                @Override
                public CharSequence getContentDescription(View view) {
                    return SpeedIconDrawable.formatNumber(SpeedSlider.this.getSpeed()) + "x  " + LocaleController.getString("AccDescrSpeedSlider", R.string.AccDescrSpeedSlider);
                }
            };
            this.seekBarAccessibilityDelegate = floatSeekBarAccessibilityDelegate;
            setAccessibilityDelegate(floatSeekBarAccessibilityDelegate);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.seekBarAccessibilityDelegate.onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.seekBarAccessibilityDelegate.performAccessibilityActionInternal(this, i, bundle);
        }

        public float getSpeed() {
            return getSpeed(getValue());
        }

        public void setSpeed(float f, boolean z) {
            setValue((f - 0.2f) / 2.3f, z);
        }

        @Override
        protected String getStringValue(float f) {
            return SpeedIconDrawable.formatNumber((f * 2.3f) + 0.2f) + "x";
        }

        @Override
        protected int getColorValue(float f) {
            return ColorUtils.blendARGB(Theme.getColor("color_lightblue", this.resourcesProvider), Theme.getColor("color_blue", this.resourcesProvider), MathUtils.clamp((((f * 2.3f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f));
        }
    }
}
