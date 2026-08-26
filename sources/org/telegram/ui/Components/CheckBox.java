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
import org.telegram.messenger.AndroidUtilities;

public class CheckBox extends View {
    private static Paint backgroundPaint = null;
    private static Paint checkPaint = null;
    private static Paint eraser = null;
    private static Paint eraser2 = null;
    private static Paint paint = null;
    private static final float progressBounceDiff = 0.2f;
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

    private void animateToCheckedState(boolean z) {
        this.isCheckAnimation = z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
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

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float fDp;
        String str;
        float f;
        if (getVisibility() != 0 || this.drawBitmap == null || this.checkBitmap == null) {
            return;
        }
        if (this.drawBackground || this.progress != 0.0f) {
            eraser2.setStrokeWidth(AndroidUtilities.dp(this.size + 6));
            this.drawBitmap.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f2 = this.progress;
            float f3 = f2 >= 0.5f ? 1.0f : f2 / 0.5f;
            float f4 = f2 < 0.5f ? 0.0f : (f2 - 0.5f) / 0.5f;
            if (!this.isCheckAnimation) {
                f2 = 1.0f - f2;
            }
            if (f2 >= 0.2f) {
                if (f2 < 0.4f) {
                    fDp = AndroidUtilities.dp(2.0f) - (((f2 - 0.2f) * AndroidUtilities.dp(2.0f)) / 0.2f);
                }
                if (this.drawBackground) {
                    paint.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), paint);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), backgroundPaint);
                }
                paint.setColor(this.color);
                if (this.hasBorder) {
                    measuredWidth -= AndroidUtilities.dp(2.0f);
                }
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, paint);
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f3) * measuredWidth, eraser);
                canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
                this.checkBitmap.eraseColor(0);
                str = this.checkedText;
                if (str != null) {
                    int iCeil = (int) Math.ceil(this.textPaint.measureText(str));
                    Canvas canvas2 = this.checkCanvas;
                    String str2 = this.checkedText;
                    float measuredWidth2 = (getMeasuredWidth() - iCeil) / 2;
                    if (this.size == 40) {
                        f = 28.0f;
                    } else {
                        f = 21.0f;
                    }
                    canvas2.drawText(str2, measuredWidth2, AndroidUtilities.dp(f), this.textPaint);
                } else {
                    int intrinsicWidth = this.checkDrawable.getIntrinsicWidth();
                    int intrinsicHeight = this.checkDrawable.getIntrinsicHeight();
                    int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    Drawable drawable = this.checkDrawable;
                    int i = this.checkOffset;
                    drawable.setBounds(measuredWidth3, measuredHeight + i, intrinsicWidth + measuredWidth3, measuredHeight + intrinsicHeight + i);
                    this.checkDrawable.draw(this.checkCanvas);
                }
                this.checkCanvas.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f4) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), eraser2);
                canvas.drawBitmap(this.checkBitmap, 0.0f, 0.0f, (Paint) null);
            }
            fDp = (AndroidUtilities.dp(2.0f) * f2) / 0.2f;
            measuredWidth -= fDp;
            if (this.drawBackground) {
                paint.setColor(1140850688);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), paint);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), backgroundPaint);
            }
            paint.setColor(this.color);
            if (this.hasBorder) {
                measuredWidth -= AndroidUtilities.dp(2.0f);
            }
            this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, paint);
            this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f3) * measuredWidth, eraser);
            canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
            this.checkBitmap.eraseColor(0);
            str = this.checkedText;
            if (str != null) {
                int iCeil2 = (int) Math.ceil(this.textPaint.measureText(str));
                Canvas canvas3 = this.checkCanvas;
                String str3 = this.checkedText;
                float measuredWidth4 = (getMeasuredWidth() - iCeil2) / 2;
                if (this.size == 40) {
                    f = 28.0f;
                } else {
                    f = 21.0f;
                }
                canvas3.drawText(str3, measuredWidth4, AndroidUtilities.dp(f), this.textPaint);
            } else {
                int intrinsicWidth2 = this.checkDrawable.getIntrinsicWidth();
                int intrinsicHeight2 = this.checkDrawable.getIntrinsicHeight();
                int measuredWidth5 = (getMeasuredWidth() - intrinsicWidth2) / 2;
                int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                Drawable drawable2 = this.checkDrawable;
                int i2 = this.checkOffset;
                drawable2.setBounds(measuredWidth5, measuredHeight2 + i2, intrinsicWidth2 + measuredWidth5, measuredHeight2 + intrinsicHeight2 + i2);
                this.checkDrawable.draw(this.checkCanvas);
            }
            this.checkCanvas.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f4) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), eraser2);
            canvas.drawBitmap(this.checkBitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
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

    public void setCheckOffset(int i) {
        this.checkOffset = i;
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setColor(int i, int i2) {
        this.color = i;
        this.checkDrawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.textPaint.setColor(i2);
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setHasBorder(boolean z) {
        this.hasBorder = z;
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
        } else if (this.checkAnimator == null) {
            this.checkedText = null;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
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

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.drawBitmap == null) {
            try {
                int iDp = AndroidUtilities.dp(this.size);
                int iDp2 = AndroidUtilities.dp(this.size);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.drawBitmap = Bitmap.createBitmap(iDp, iDp2, config);
                this.bitmapCanvas = new Canvas(this.drawBitmap);
                this.checkBitmap = Bitmap.createBitmap(AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), config);
                this.checkCanvas = new Canvas(this.checkBitmap);
            } catch (Throwable unused) {
            }
        }
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
}
