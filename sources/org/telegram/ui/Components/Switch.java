package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Keep;
import java.lang.reflect.Method;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class Switch extends View {
    private boolean attachedToWindow;
    private boolean bitmapsCreated;
    private ObjectAnimator checkAnimator;
    private int colorSet;
    private int drawIconType;
    private boolean drawRipple;
    private ObjectAnimator iconAnimator;
    private Drawable iconDrawable;
    private boolean isChecked;
    private int lastIconColor;
    private OnCheckedChangeListener onCheckedChangeListener;
    private Bitmap[] overlayBitmap;
    private Canvas[] overlayCanvas;
    private float overlayCx;
    private float overlayCy;
    private Paint overlayEraserPaint;
    private Bitmap overlayMaskBitmap;
    private Canvas overlayMaskCanvas;
    private Paint overlayMaskPaint;
    private float overlayRad;
    private int overrideColorProgress;
    private Paint paint2;
    private float progress;
    private RippleDrawable rippleDrawable;
    private Paint ripplePaint;
    private float iconProgress = 1.0f;
    private String trackColorKey = "switch2Track";
    private String trackCheckedColorKey = "switch2TrackChecked";
    private String thumbColorKey = "windowBackgroundWhite";
    private String thumbCheckedColorKey = "windowBackgroundWhite";
    private int[] pressedState = {16842910, 16842919};
    private boolean semHaptics = false;
    private RectF rectF = new RectF();
    private Paint paint = new Paint(1);

    public interface OnCheckedChangeListener {
        void onCheckedChanged(Switch r1, boolean z);
    }

    public Switch(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.paint2 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.paint2.setStrokeCap(Paint.Cap.ROUND);
        this.paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Keep
    public void setProgress(float f) {
        if (this.progress != f) {
            this.progress = f;
            invalidate();
        }
    }

    @Keep
    public float getProgress() {
        return this.progress;
    }

    @Keep
    public void setIconProgress(float f) {
        if (this.iconProgress != f) {
            this.iconProgress = f;
            invalidate();
        }
    }

    @Keep
    public float getIconProgress() {
        return this.iconProgress;
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void cancelIconAnimator() {
        ObjectAnimator objectAnimator = this.iconAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.iconAnimator = null;
        }
    }

    public void setDrawIconType(int i) {
        this.drawIconType = i;
    }

    public void setDrawRipple(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && z != this.drawRipple) {
            this.drawRipple = z;
            int i2 = 1;
            if (this.rippleDrawable == null) {
                Paint paint = new Paint(1);
                this.ripplePaint = paint;
                paint.setColor(-1);
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i >= 23 ? null : new Drawable() {
                    @Override
                    public int getOpacity() {
                        return 0;
                    }

                    @Override
                    public void setAlpha(int i3) {
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        Rect bounds = getBounds();
                        canvas.drawCircle(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(18.0f), Switch.this.ripplePaint);
                    }
                });
                this.rippleDrawable = rippleDrawable;
                if (i >= 23) {
                    rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
                }
                this.rippleDrawable.setCallback(this);
            }
            boolean z2 = this.isChecked;
            if ((z2 && this.colorSet != 2) || (!z2 && this.colorSet != 1)) {
                this.rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{Theme.getColor(z2 ? "switchTrackBlueSelectorChecked" : "switchTrackBlueSelector")}));
                if (this.isChecked) {
                    i2 = 2;
                }
                this.colorSet = i2;
            }
            if (i >= 28 && z) {
                this.rippleDrawable.setHotspot(this.isChecked ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
            }
            this.rippleDrawable.setState(z ? this.pressedState : StateSet.NOTHING);
            invalidate();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        RippleDrawable rippleDrawable;
        return super.verifyDrawable(drawable) || ((rippleDrawable = this.rippleDrawable) != null && drawable == rippleDrawable);
    }

    public void setColors(String str, String str2, String str3, String str4) {
        this.trackColorKey = str;
        this.trackCheckedColorKey = str2;
        this.thumbColorKey = str3;
        this.thumbCheckedColorKey = str4;
    }

    private void animateToCheckedState(boolean z) {
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", fArr);
        this.checkAnimator = ofFloat;
        ofFloat.setDuration(this.semHaptics ? 150L : 250L);
        this.checkAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Switch.this.checkAnimator = null;
            }
        });
        this.checkAnimator.start();
    }

    private void animateIcon(boolean z) {
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "iconProgress", fArr);
        this.iconAnimator = ofFloat;
        ofFloat.setDuration(this.semHaptics ? 150L : 250L);
        this.iconAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Switch.this.iconAnimator = null;
            }
        });
        this.iconAnimator.start();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(z, this.drawIconType, z2);
    }

    public void setChecked(boolean z, int i, boolean z2) {
        float f = 1.0f;
        if (z != this.isChecked) {
            this.isChecked = z;
            if (!this.attachedToWindow || !z2) {
                cancelCheckAnimator();
                setProgress(z ? 1.0f : 0.0f);
            } else {
                vibrateChecked();
                animateToCheckedState(z);
            }
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
        if (this.drawIconType != i) {
            this.drawIconType = i;
            if (!this.attachedToWindow || !z2) {
                cancelIconAnimator();
                if (i != 0) {
                    f = 0.0f;
                }
                setIconProgress(f);
                return;
            }
            animateIcon(i == 0);
        }
    }

    public void setIcon(int i) {
        if (i != 0) {
            Drawable mutate = getResources().getDrawable(i).mutate();
            this.iconDrawable = mutate;
            if (mutate != null) {
                int color = Theme.getColor(this.isChecked ? this.trackCheckedColorKey : this.trackColorKey);
                this.lastIconColor = color;
                mutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        this.iconDrawable = null;
    }

    public boolean hasIcon() {
        return this.iconDrawable != null;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setOverrideColor(int i) {
        if (this.overrideColorProgress != i) {
            if (this.overlayBitmap == null) {
                try {
                    this.overlayBitmap = new Bitmap[2];
                    this.overlayCanvas = new Canvas[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        this.overlayBitmap[i2] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.overlayCanvas[i2] = new Canvas(this.overlayBitmap[i2]);
                    }
                    this.overlayMaskBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.overlayMaskCanvas = new Canvas(this.overlayMaskBitmap);
                    Paint paint = new Paint(1);
                    this.overlayEraserPaint = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.overlayMaskPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.bitmapsCreated = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (this.bitmapsCreated) {
                this.overrideColorProgress = i;
                this.overlayCx = 0.0f;
                this.overlayCy = 0.0f;
                this.overlayRad = 0.0f;
                invalidate();
            }
        }
    }

    public void setOverrideColorProgress(float f, float f2, float f3) {
        this.overlayCx = f;
        this.overlayCy = f2;
        this.overlayRad = f3;
        invalidate();
    }

    @Override
    protected void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Switch.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }

    private void vibrateChecked() {
        Method method;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                method = HapticFeedbackConstants.class.getDeclaredMethod("hidden_semGetVibrationIndex", Integer.TYPE);
            } else {
                method = i >= 28 ? HapticFeedbackConstants.class.getMethod("semGetVibrationIndex", Integer.TYPE) : null;
            }
            if (method != null) {
                method.setAccessible(true);
                Integer num = (Integer) method.invoke(null, 27);
                if (num != null) {
                    performHapticFeedback(num.intValue(), 1);
                    this.semHaptics = true;
                }
            }
        } catch (Exception unused) {
        }
    }
}
