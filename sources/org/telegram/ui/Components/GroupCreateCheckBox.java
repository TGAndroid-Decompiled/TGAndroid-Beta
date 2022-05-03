package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class GroupCreateCheckBox extends View {
    private static Paint eraser;
    private static Paint eraser2;
    private boolean attachedToWindow;
    private Paint backgroundInnerPaint;
    private Paint backgroundPaint;
    private Canvas bitmapCanvas;
    private ObjectAnimator checkAnimator;
    private Paint checkPaint;
    private Bitmap drawBitmap;
    private int innerRadDiff;
    private boolean isChecked;
    private float progress;
    private boolean isCheckAnimation = true;
    private float checkScale = 1.0f;
    private String backgroundKey = "checkboxCheck";
    private String checkKey = "checkboxCheck";
    private String innerKey = "checkbox";

    public GroupCreateCheckBox(Context context) {
        super(context);
        if (eraser == null) {
            Paint paint = new Paint(1);
            eraser = paint;
            paint.setColor(0);
            eraser.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint(1);
            eraser2 = paint2;
            paint2.setColor(0);
            eraser2.setStyle(Paint.Style.STROKE);
            eraser2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.backgroundPaint = new Paint(1);
        this.backgroundInnerPaint = new Paint(1);
        Paint paint3 = new Paint(1);
        this.checkPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.innerRadDiff = AndroidUtilities.dp(2.0f);
        this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        eraser2.setStrokeWidth(AndroidUtilities.dp(28.0f));
        this.drawBitmap = Bitmap.createBitmap(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Bitmap.Config.ARGB_4444);
        this.bitmapCanvas = new Canvas(this.drawBitmap);
        updateColors();
    }

    public void setColorKeysOverrides(String str, String str2, String str3) {
        this.checkKey = str;
        this.innerKey = str2;
        this.backgroundKey = str3;
        updateColors();
    }

    public void updateColors() {
        this.backgroundInnerPaint.setColor(Theme.getColor(this.innerKey));
        this.backgroundPaint.setColor(Theme.getColor(this.backgroundKey));
        this.checkPaint.setColor(Theme.getColor(this.checkKey));
        invalidate();
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

    public void setCheckScale(float f) {
        this.checkScale = f;
    }

    private void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void animateToCheckedState(boolean z) {
        this.isCheckAnimation = z;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", fArr);
        this.checkAnimator = ofFloat;
        ofFloat.setDuration(300L);
        this.checkAnimator.start();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateColors();
        this.attachedToWindow = true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    public void setChecked(boolean z, boolean z2) {
        if (z != this.isChecked) {
            this.isChecked = z;
            if (!this.attachedToWindow || !z2) {
                cancelCheckAnimator();
                setProgress(z ? 1.0f : 0.0f);
                return;
            }
            animateToCheckedState(z);
        }
    }

    public void setInnerRadDiff(int i) {
        this.innerRadDiff = i;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        if (getVisibility() == 0 && this.progress != 0.0f) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            eraser2.setStrokeWidth(AndroidUtilities.dp(30.0f));
            this.drawBitmap.eraseColor(0);
            float f2 = this.progress;
            float f3 = f2 >= 0.5f ? 1.0f : f2 / 0.5f;
            float f4 = f2 < 0.5f ? 0.0f : (f2 - 0.5f) / 0.5f;
            if (!this.isCheckAnimation) {
                f2 = 1.0f - f2;
            }
            if (f2 < 0.2f) {
                f = (AndroidUtilities.dp(2.0f) * f2) / 0.2f;
            } else {
                f = f2 < 0.4f ? AndroidUtilities.dp(2.0f) - ((AndroidUtilities.dp(2.0f) * (f2 - 0.2f)) / 0.2f) : 0.0f;
            }
            if (f4 != 0.0f) {
                canvas.drawCircle(measuredWidth, measuredHeight, ((measuredWidth - AndroidUtilities.dp(2.0f)) + (AndroidUtilities.dp(2.0f) * f4)) - f, this.backgroundPaint);
            }
            float f5 = (measuredWidth - this.innerRadDiff) - f;
            float f6 = measuredWidth;
            float f7 = measuredHeight;
            this.bitmapCanvas.drawCircle(f6, f7, f5, this.backgroundInnerPaint);
            this.bitmapCanvas.drawCircle(f6, f7, f5 * (1.0f - f3), eraser);
            canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
            float dp = AndroidUtilities.dp(10.0f) * f4 * this.checkScale;
            float dp2 = AndroidUtilities.dp(5.0f) * f4 * this.checkScale;
            int dp3 = measuredWidth - AndroidUtilities.dp(1.0f);
            int dp4 = measuredHeight + AndroidUtilities.dp(4.0f);
            float sqrt = (float) Math.sqrt((dp2 * dp2) / 2.0f);
            float f8 = dp3;
            float f9 = dp4;
            canvas.drawLine(f8, f9, f8 - sqrt, f9 - sqrt, this.checkPaint);
            float sqrt2 = (float) Math.sqrt((dp * dp) / 2.0f);
            float dp5 = dp3 - AndroidUtilities.dp(1.2f);
            canvas.drawLine(dp5, f9, dp5 + sqrt2, f9 - sqrt2, this.checkPaint);
        }
    }
}
