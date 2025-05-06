package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;

public class MarqueeTextView extends TextView {
    private LinearGradient gradient;
    private final Matrix gradientMatrix;
    private long lastFrameTime;
    private boolean marqueeIsPending;
    private boolean marqueeIsStarted;
    private boolean needMarquee;
    private int originalWidth;
    private int rightPadding;
    private float scrollX;
    private final Runnable startMarquee;

    public MarqueeTextView(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.startMarquee = new Runnable() {
            @Override
            public final void run() {
                MarqueeTextView.this.startMarqueeInternal();
            }
        };
    }

    private void invalidateGradient() {
        TextPaint paint;
        LinearGradient linearGradient;
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.originalWidth, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i = 1048575 & currentTextColor;
        this.gradient = new LinearGradient(0.0f, 0.0f, this.originalWidth, 0.0f, new int[]{i, currentTextColor, currentTextColor, i}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.needMarquee) {
            paint = getPaint();
            linearGradient = this.gradient;
        } else {
            paint = getPaint();
            linearGradient = null;
        }
        paint.setShader(linearGradient);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }

    private void pendingMarqueeInternal() {
        if (this.marqueeIsPending) {
            return;
        }
        this.marqueeIsPending = true;
        AndroidUtilities.runOnUIThread(this.startMarquee, 1500L);
    }

    public void startMarqueeInternal() {
        if (this.needMarquee) {
            this.marqueeIsStarted = true;
            this.marqueeIsPending = false;
            this.scrollX = 0.0f;
            this.lastFrameTime = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    private void stopMarqueeInternal() {
        AndroidUtilities.cancelRunOnUIThread(this.startMarquee);
        this.marqueeIsPending = false;
        this.marqueeIsStarted = false;
        this.scrollX = 0.0f;
    }

    public boolean isNeedMarquee() {
        return this.needMarquee;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f = this.scrollX;
        float f2 = measuredWidth;
        float clamp = f < f2 ? MathUtils.clamp(f / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        this.gradientMatrix.reset();
        Matrix matrix = this.gradientMatrix;
        float dp2 = AndroidUtilities.dp(10.0f);
        float f3 = this.originalWidth;
        matrix.postScale(((dp2 / f3) * (1.0f - clamp)) + 1.0f, 1.0f, f3, 0.0f);
        this.gradientMatrix.postScale(1.0f - (this.rightPadding / this.originalWidth), 1.0f, 0.0f, 0.0f);
        this.gradientMatrix.postTranslate(this.scrollX, 0.0f);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        canvas.save();
        canvas.translate(-this.scrollX, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f4 = this.scrollX;
            if (f4 > 0.0f && f4 + getWidth() > f2 && this.needMarquee && this.marqueeIsStarted) {
                Matrix matrix2 = this.gradientMatrix;
                float f5 = -this.scrollX;
                float f6 = dp;
                matrix2.postTranslate(f5 - ((f5 + f2) + f6), 0.0f);
                this.gradient.setLocalMatrix(this.gradientMatrix);
                canvas.save();
                canvas.translate((-this.scrollX) + f2 + f6, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z = ((double) this.scrollX) < 1.0E-4d;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.lastFrameTime;
        long min = (j == 0 || z) ? 16L : Math.min(uptimeMillis - j, 120L);
        this.lastFrameTime = uptimeMillis;
        if ((this.needMarquee && this.marqueeIsStarted) || !z) {
            float dp3 = this.scrollX + (AndroidUtilities.dp(60.0f) * (((float) min) / 1000.0f));
            this.scrollX = dp3;
            if (dp3 > measuredWidth + dp) {
                stopMarqueeInternal();
            }
            invalidate();
        }
        if (!this.needMarquee || this.marqueeIsStarted || this.marqueeIsPending) {
            return;
        }
        pendingMarqueeInternal();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        this.originalWidth = View.MeasureSpec.getSize(i);
        this.needMarquee = getMeasuredWidth() > this.originalWidth - this.rightPadding;
        invalidateGradient();
    }

    public void setCustomPaddingRight(int i) {
        TextPaint paint;
        LinearGradient linearGradient;
        this.rightPadding = i;
        boolean z = getMeasuredWidth() > this.originalWidth - this.rightPadding;
        this.needMarquee = z;
        if (z) {
            paint = getPaint();
            linearGradient = this.gradient;
        } else {
            paint = getPaint();
            linearGradient = null;
        }
        paint.setShader(linearGradient);
        invalidate();
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        stopMarqueeInternal();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        invalidateGradient();
    }
}
