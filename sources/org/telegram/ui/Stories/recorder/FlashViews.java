package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.LaunchActivity;
public class FlashViews {
    private ValueAnimator animator;
    public final View backgroundView;
    private int color;
    private final Context context;
    public final View foregroundView;
    private RadialGradient gradient;
    private int lastColor;
    private int lastHeight;
    private float lastInvert;
    private int lastWidth;
    private final Paint paint;
    private final WindowManager windowManager;
    private final View windowView;
    private final WindowManager.LayoutParams windowViewParams;
    private final ArrayList<Invertable> invertableViews = new ArrayList<>();
    private float invert = 0.0f;
    public float warmth = 0.75f;
    public float intensity = 1.0f;
    private final Matrix gradientMatrix = new Matrix();

    public interface Invertable {
        void invalidate();

        void setInvert(float f);
    }

    public static int getColor(float f) {
        if (f < 0.5f) {
            return ColorUtils.blendARGB(-7544833, -1, Utilities.clamp(f / 0.5f, 1.0f, 0.0f));
        }
        return ColorUtils.blendARGB(-1, -70004, Utilities.clamp((f - 0.5f) / 0.5f, 1.0f, 0.0f));
    }

    public FlashViews(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.context = context;
        this.windowManager = windowManager;
        this.windowView = view;
        this.windowViewParams = layoutParams;
        this.backgroundView = new View(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                FlashViews.this.invalidateGradient();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                FlashViews.this.gradientMatrix.reset();
                FlashViews.this.drawGradient(canvas, true);
            }
        };
        this.foregroundView = new View(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                FlashViews.this.gradientMatrix.reset();
                FlashViews.this.gradientMatrix.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                FlashViews.this.gradientMatrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                FlashViews.this.drawGradient(canvas, false);
            }
        };
        paint.setAlpha(0);
    }

    public void flash(final Utilities.Callback<Utilities.Callback<Runnable>> callback) {
        setScreenBrightness(intensityValue());
        flashTo(1.0f, 320L, new Runnable() {
            @Override
            public final void run() {
                FlashViews.this.lambda$flash$3(callback);
            }
        });
    }

    public void lambda$flash$3(final Utilities.Callback callback) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FlashViews.this.lambda$flash$2(callback);
            }
        }, 320L);
    }

    public void lambda$flash$2(Utilities.Callback callback) {
        callback.run(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                FlashViews.this.lambda$flash$1((Runnable) obj);
            }
        });
    }

    public void lambda$flash$1(final Runnable runnable) {
        setScreenBrightness(-1.0f);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FlashViews.this.lambda$flash$0(runnable);
            }
        }, 80L);
    }

    public void lambda$flash$0(Runnable runnable) {
        flashTo(0.0f, 240L, runnable);
    }

    private void setScreenBrightness(float f) {
        Window window;
        WindowManager.LayoutParams layoutParams = this.windowViewParams;
        if (layoutParams != null) {
            layoutParams.screenBrightness = f;
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.updateViewLayout(this.windowView, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.context);
        if (findActivity == null) {
            findActivity = LaunchActivity.instance;
        }
        if (findActivity == null || findActivity.isFinishing() || (window = findActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    public void previewStart() {
        flashTo(0.85f, 240L, null);
    }

    public void previewEnd() {
        flashTo(0.0f, 240L, null);
    }

    public void flashIn(Runnable runnable) {
        setScreenBrightness(intensityValue());
        flashTo(1.0f, 320L, runnable);
    }

    public void flashOut() {
        setScreenBrightness(-1.0f);
        flashTo(0.0f, 240L, null);
    }

    private void flashTo(final float f, long j, final Runnable runnable) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (j <= 0) {
            this.invert = f;
            update();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.invert, f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FlashViews.this.lambda$flashTo$4(valueAnimator2);
            }
        });
        this.animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                FlashViews.this.invert = f;
                FlashViews.this.update();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.animator.setDuration(j);
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_IN);
        this.animator.start();
    }

    public void lambda$flashTo$4(ValueAnimator valueAnimator) {
        this.invert = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        update();
    }

    public void update() {
        for (int i = 0; i < this.invertableViews.size(); i++) {
            this.invertableViews.get(i).setInvert(this.invert);
            this.invertableViews.get(i).invalidate();
        }
        this.paint.setAlpha((int) (intensityValue() * 255.0f * this.invert));
        this.backgroundView.invalidate();
        this.foregroundView.invalidate();
    }

    private float intensityValue() {
        return this.intensity;
    }

    public void add(Invertable invertable) {
        invertable.setInvert(this.invert);
        this.invertableViews.add(invertable);
    }

    public void setIntensity(float f) {
        this.intensity = f;
        update();
    }

    public void setWarmth(float f) {
        this.warmth = f;
        this.color = getColor(f);
        invalidateGradient();
    }

    public void invalidateGradient() {
        if (this.lastColor == this.color && this.lastWidth == this.backgroundView.getMeasuredWidth() && this.lastHeight == this.backgroundView.getMeasuredHeight() && Math.abs(this.lastInvert - this.invert) <= 0.005f) {
            return;
        }
        this.lastColor = this.color;
        this.lastWidth = this.backgroundView.getMeasuredWidth();
        int measuredHeight = this.backgroundView.getMeasuredHeight();
        this.lastHeight = measuredHeight;
        this.lastInvert = this.invert;
        if (this.lastWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i = this.lastWidth;
            int i2 = this.lastHeight;
            this.gradient = new RadialGradient(i * 0.5f, i2 * 0.4f, (Math.min(i, i2) / 2.0f) * 1.35f * (2.0f - this.invert), new long[]{Color.valueOf(Color.red(this.color) / 255.0f, Color.green(this.color) / 255.0f, Color.blue(this.color) / 255.0f, 0.0f, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)).pack(), Color.valueOf(Color.red(this.color) / 255.0f, Color.green(this.color) / 255.0f, Color.blue(this.color) / 255.0f, 1.0f, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)).pack()}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.invert), 1.0f}, Shader.TileMode.CLAMP);
        } else {
            int i3 = this.lastWidth;
            int i4 = this.lastHeight;
            this.gradient = new RadialGradient(i3 * 0.5f, 0.4f * i4, (Math.min(i3, i4) / 2.0f) * 1.35f * (2.0f - this.invert), new int[]{ColorUtils.setAlphaComponent(this.color, 0), this.color}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.invert), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.paint.setShader(this.gradient);
        invalidate();
    }

    private void invalidate() {
        this.backgroundView.invalidate();
        this.foregroundView.invalidate();
    }

    public void drawGradient(Canvas canvas, boolean z) {
        if (this.gradient != null) {
            invalidateGradient();
            this.gradient.setLocalMatrix(this.gradientMatrix);
            if (z) {
                canvas.drawRect(0.0f, 0.0f, this.lastWidth, this.lastHeight, this.paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.foregroundView.getMeasuredWidth(), this.foregroundView.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, this.paint);
        }
    }

    public static class ImageViewInvertable extends ImageView implements Invertable {
        public ImageViewInvertable(Context context) {
            super(context);
        }

        @Override
        public void setInvert(float f) {
            setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, f), PorterDuff.Mode.MULTIPLY));
        }
    }
}
