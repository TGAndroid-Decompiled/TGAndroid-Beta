package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;

public class CheckBox extends View {
    private static Paint backgroundPaint;
    private static Paint eraser;
    private static Paint eraser2;
    private static Paint paint;
    private boolean attachedToWindow;
    private Canvas bitmapCanvas;
    private ObjectAnimator checkAnimator;
    private Bitmap checkBitmap;
    private Canvas checkCanvas;
    private Drawable checkDrawable;
    private int checkOffset;
    private String checkedText;
    private int color;
    private boolean drawBackground;
    private Bitmap drawBitmap;
    private boolean hasBorder;
    private boolean isCheckAnimation;
    private boolean isChecked;
    private float progress;
    private int size;
    private TextPaint textPaint;

    public CheckBox(Context context, int i) {
        super(context);
        this.isCheckAnimation = true;
        this.size = 22;
        if (paint == null) {
            paint = new Paint(1);
            Paint paint2 = new Paint(1);
            eraser = paint2;
            paint2.setColor(0);
            Paint paint3 = eraser;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            Paint paint4 = new Paint(1);
            eraser2 = paint4;
            paint4.setColor(0);
            Paint paint5 = eraser2;
            Paint.Style style = Paint.Style.STROKE;
            paint5.setStyle(style);
            eraser2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint6 = new Paint(1);
            backgroundPaint = paint6;
            paint6.setColor(-1);
            backgroundPaint.setStyle(style);
        }
        eraser2.setStrokeWidth(AndroidUtilities.dp(28.0f));
        backgroundPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.checkDrawable = context.getResources().getDrawable(i).mutate();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.drawBitmap == null) {
            try {
                int dp = AndroidUtilities.dp(this.size);
                int dp2 = AndroidUtilities.dp(this.size);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.drawBitmap = Bitmap.createBitmap(dp, dp2, config);
                this.bitmapCanvas = new Canvas(this.drawBitmap);
                this.checkBitmap = Bitmap.createBitmap(AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), config);
                this.checkCanvas = new Canvas(this.checkBitmap);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setHasBorder(boolean z) {
        this.hasBorder = z;
    }

    public void setCheckOffset(int i) {
        this.checkOffset = i;
    }

    public void setSize(int i) {
        this.size = i;
        if (i == 40) {
            this.textPaint.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i) {
        backgroundPaint.setStrokeWidth(i);
    }

    @Keep
    public float getProgress() {
        return this.progress;
    }

    public void setColor(int i, int i2) {
        this.color = i;
        this.checkDrawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.textPaint.setColor(i2);
        invalidate();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.color = i;
        invalidate();
    }

    public void setCheckColor(int i) {
        this.checkDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        this.textPaint.setColor(i);
        invalidate();
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void animateToCheckedState(boolean z) {
        this.isCheckAnimation = z;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(CheckBox.this.checkAnimator)) {
                    CheckBox.this.checkAnimator = null;
                }
                if (CheckBox.this.isChecked) {
                    return;
                }
                CheckBox.this.checkedText = null;
            }
        });
        this.checkAnimator.setDuration(300L);
        this.checkAnimator.start();
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

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
        } else if (this.checkAnimator == null) {
            this.checkedText = null;
        }
        invalidate();
    }

    public void setChecked(int i, boolean z, boolean z2) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
            invalidate();
        }
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            animateToCheckedState(z);
        } else {
            cancelCheckAnimator();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    @Override
    protected void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBox.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }
}
