package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
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
                this.f$0.startMarqueeInternal();
            }
        };
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        invalidateGradient();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        this.originalWidth = View.MeasureSpec.getSize(i);
        this.needMarquee = getMeasuredWidth() > this.originalWidth - this.rightPadding;
        invalidateGradient();
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        stopMarqueeInternal();
    }

    private void invalidateGradient() {
        float fMin = Math.min(AndroidUtilities.dp(10.0f) / this.originalWidth, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i = 1048575 & currentTextColor;
        this.gradient = new LinearGradient(0.0f, 0.0f, this.originalWidth, 0.0f, new int[]{i, currentTextColor, currentTextColor, i}, new float[]{0.0f, fMin, 1.0f - fMin, 1.0f}, Shader.TileMode.CLAMP);
        if (this.needMarquee) {
            getPaint().setShader(this.gradient);
        } else {
            getPaint().setShader(null);
        }
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }

    public boolean isNeedMarquee() {
        return this.needMarquee;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int iDp = AndroidUtilities.dp(40.0f);
        float f = this.scrollX;
        float f2 = measuredWidth;
        float fClamp = f < f2 ? MathUtils.clamp(f / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        this.gradientMatrix.reset();
        Matrix matrix = this.gradientMatrix;
        float fDp = AndroidUtilities.dp(10.0f);
        float f3 = this.originalWidth;
        matrix.postScale(((fDp / f3) * (1.0f - fClamp)) + 1.0f, 1.0f, f3, 0.0f);
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
                float f6 = iDp;
                matrix2.postTranslate(f5 - ((f5 + f2) + f6), 0.0f);
                this.gradient.setLocalMatrix(this.gradientMatrix);
                canvas.save();
                canvas.translate((-this.scrollX) + f2 + f6, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z = ((double) this.scrollX) < 1.0E-4d;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.lastFrameTime;
        long jMin = (j == 0 || z) ? 16L : Math.min(jUptimeMillis - j, 120L);
        this.lastFrameTime = jUptimeMillis;
        if ((this.needMarquee && this.marqueeIsStarted) || !z) {
            float fDp2 = this.scrollX + (AndroidUtilities.dp(60.0f) * (jMin / 1000.0f));
            this.scrollX = fDp2;
            if (fDp2 > measuredWidth + iDp) {
                stopMarqueeInternal();
            }
            invalidate();
        }
        if (!this.needMarquee || this.marqueeIsStarted || this.marqueeIsPending) {
            return;
        }
        pendingMarqueeInternal();
    }

    private void pendingMarqueeInternal() {
        if (this.marqueeIsPending) {
            return;
        }
        this.marqueeIsPending = true;
        AndroidUtilities.runOnUIThread(this.startMarquee, 1500L);
    }

    private void stopMarqueeInternal() {
        AndroidUtilities.cancelRunOnUIThread(this.startMarquee);
        this.marqueeIsPending = false;
        this.marqueeIsStarted = false;
        this.scrollX = 0.0f;
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

    public void setCustomPaddingRight(int i) {
        this.rightPadding = i;
        boolean z = getMeasuredWidth() > this.originalWidth - this.rightPadding;
        this.needMarquee = z;
        if (z) {
            getPaint().setShader(this.gradient);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }
}
