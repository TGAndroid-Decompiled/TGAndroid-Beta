package org.telegram.ui.Stories.recorder;

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
import org.telegram.ui.PhotoViewer$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public final class FlashViews {
    public ValueAnimator animator;
    public final AnonymousClass1 backgroundView;
    public int color;
    public final Context context;
    public final AnonymousClass1 foregroundView;
    public RadialGradient gradient;
    public int lastColor;
    public int lastHeight;
    public float lastInvert;
    public int lastWidth;
    public final Paint paint;
    public final WindowManager windowManager;
    public final View windowView;
    public final WindowManager.LayoutParams windowViewParams;
    public final ArrayList invertableViews = new ArrayList();
    public float invert = 0.0f;
    public float warmth = 0.75f;
    public float intensity = 1.0f;
    public final Matrix gradientMatrix = new Matrix();

    public final class ImageViewInvertable extends ImageView implements Invertable {
        @Override
        public void setInvert(float f) {
            setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
    }

    public interface Invertable {
        void invalidate();

        void setInvert(float f);
    }

    public FlashViews(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.context = context;
        this.windowManager = windowManager;
        this.windowView = view;
        this.windowViewParams = layoutParams;
        final int i = 0;
        this.backgroundView = new View(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (i) {
                    case 0:
                        FlashViews flashViews = this;
                        flashViews.gradientMatrix.reset();
                        flashViews.drawGradient(canvas, true);
                        break;
                    default:
                        FlashViews flashViews2 = this;
                        flashViews2.gradientMatrix.reset();
                        flashViews2.gradientMatrix.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                        flashViews2.gradientMatrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                        flashViews2.drawGradient(canvas, false);
                        break;
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                switch (i) {
                    case 0:
                        super.onMeasure(i2, i3);
                        this.invalidateGradient();
                        break;
                    default:
                        super.onMeasure(i2, i3);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.foregroundView = new View(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                switch (i2) {
                    case 0:
                        FlashViews flashViews = this;
                        flashViews.gradientMatrix.reset();
                        flashViews.drawGradient(canvas, true);
                        break;
                    default:
                        FlashViews flashViews2 = this;
                        flashViews2.gradientMatrix.reset();
                        flashViews2.gradientMatrix.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                        flashViews2.gradientMatrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                        flashViews2.drawGradient(canvas, false);
                        break;
                }
            }

            @Override
            public void onMeasure(int i3, int i4) {
                switch (i2) {
                    case 0:
                        super.onMeasure(i3, i4);
                        this.invalidateGradient();
                        break;
                    default:
                        super.onMeasure(i3, i4);
                        break;
                }
            }
        };
        paint.setAlpha(0);
    }

    public static int getColor(float f) {
        return f < 0.5f ? ColorUtils.blendARGB(Utilities.clamp(f / 0.5f, 1.0f, 0.0f), -7544833, -1) : ColorUtils.blendARGB(Utilities.clamp((f - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void drawGradient(Canvas canvas, boolean z) {
        if (this.gradient != null) {
            invalidateGradient();
            this.gradient.setLocalMatrix(this.gradientMatrix);
            Paint paint = this.paint;
            if (z) {
                canvas.drawRect(0.0f, 0.0f, this.lastWidth, this.lastHeight, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            AnonymousClass1 anonymousClass1 = this.foregroundView;
            rectF.set(0.0f, 0.0f, anonymousClass1.getMeasuredWidth(), anonymousClass1.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void flashOut() {
        setScreenBrightness(-1.0f);
        flashTo(0.0f, 240L, null);
    }

    public final void flashTo(float f, long j, Runnable runnable) {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.invert, f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 7));
        this.animator.addListener(new StarReactionsOverlay.AnonymousClass1(this, f, runnable, 3));
        this.animator.setDuration(j);
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_IN);
        this.animator.start();
    }

    public final void invalidateGradient() {
        int i = this.lastColor;
        int i2 = this.color;
        AnonymousClass1 anonymousClass1 = this.backgroundView;
        if (i == i2 && this.lastWidth == anonymousClass1.getMeasuredWidth() && this.lastHeight == anonymousClass1.getMeasuredHeight() && Math.abs(this.lastInvert - this.invert) <= 0.005f) {
            return;
        }
        this.lastColor = this.color;
        this.lastWidth = anonymousClass1.getMeasuredWidth();
        int measuredHeight = anonymousClass1.getMeasuredHeight();
        this.lastHeight = measuredHeight;
        this.lastInvert = this.invert;
        if (this.lastWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i3 = this.lastWidth;
            float f = i3 * 0.5f;
            int i4 = this.lastHeight;
            float f2 = i4 * 0.4f;
            float fMin = (2.0f - this.invert) * (Math.min(i3, i4) / 2.0f) * 1.35f;
            float fRed = Color.red(this.color) / 255.0f;
            float fGreen = Color.green(this.color) / 255.0f;
            float fBlue = Color.blue(this.color) / 255.0f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(fRed, fGreen, fBlue, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.color) / 255.0f, Color.green(this.color) / 255.0f, Color.blue(this.color) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.invert), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.gradient = PhotoViewer$$ExternalSyntheticApiModelOutline3.m(f, f2, fMin, jArr, fArr);
        } else {
            int i5 = this.lastWidth;
            int i6 = this.lastHeight;
            this.gradient = new RadialGradient(i5 * 0.5f, i6 * 0.4f, (2.0f - this.invert) * (Math.min(i5, i6) / 2.0f) * 1.35f, new int[]{ColorUtils.setAlphaComponent(this.color, 0), this.color}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.invert), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.paint.setShader(this.gradient);
        anonymousClass1.invalidate();
        invalidate();
    }

    public final void setScreenBrightness(float f) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.windowView;
        if (view != null && (layoutParams = this.windowViewParams) != null) {
            layoutParams.screenBrightness = f;
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(this.context);
        if (activityFindActivity == null) {
            activityFindActivity = LaunchActivity.instance;
        }
        if (activityFindActivity == null || activityFindActivity.isFinishing() || (window = activityFindActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    public final void update() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.invertableViews;
            if (i >= arrayList.size()) {
                this.paint.setAlpha((int) (this.intensity * 255.0f * this.invert));
                invalidate();
                invalidate();
                return;
            } else {
                ((Invertable) arrayList.get(i)).setInvert(this.invert);
                ((Invertable) arrayList.get(i)).invalidate();
                i++;
            }
        }
    }
}
