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
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import org.telegram.messenger.AndroidUtilities;

public final class MarqueeTextView extends TextView {
    public LinearGradient gradient;
    public final Matrix gradientMatrix;
    public long lastFrameTime;
    public boolean marqueeIsPending;
    public boolean marqueeIsStarted;
    public boolean needMarquee;
    public int originalWidth;
    public int rightPadding;
    public float scrollX;
    public final HintView$1$$ExternalSyntheticLambda0 startMarquee;

    public MarqueeTextView(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.startMarquee = new HintView$1$$ExternalSyntheticLambda0(this, 17);
    }

    public final void invalidateGradient() {
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

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int measuredWidth = getMeasuredWidth();
        int iDp = AndroidUtilities.dp(40.0f);
        float f = this.scrollX;
        float f2 = measuredWidth;
        float fClamp = f < f2 ? MathUtils.clamp(f / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.gradientMatrix;
        matrix.reset();
        float fDp = AndroidUtilities.dp(10.0f);
        float f3 = this.originalWidth;
        matrix.postScale(DiffUtil.m(1.0f, fClamp, fDp / f3, 1.0f), 1.0f, f3, 0.0f);
        matrix.postScale(1.0f - (this.rightPadding / this.originalWidth), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.scrollX, 0.0f);
        this.gradient.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.scrollX, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f4 = this.scrollX;
            if (f4 > 0.0f && f4 + getWidth() > f2 && this.needMarquee && this.marqueeIsStarted) {
                float f5 = -this.scrollX;
                float f6 = iDp;
                matrix.postTranslate(f5 - ((f5 + f2) + f6), 0.0f);
                this.gradient.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.scrollX) + f2 + f6, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z2 = ((double) this.scrollX) < 1.0E-4d;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.lastFrameTime;
        long jMin = (j == 0 || z2) ? 16L : Math.min(jUptimeMillis - j, 120L);
        this.lastFrameTime = jUptimeMillis;
        boolean z3 = this.needMarquee;
        HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = this.startMarquee;
        if ((z3 && this.marqueeIsStarted) || !z2) {
            float fM = zzjd.m(jMin, 1000.0f, AndroidUtilities.dp(60.0f), this.scrollX);
            this.scrollX = fM;
            if (fM > measuredWidth + iDp) {
                AndroidUtilities.cancelRunOnUIThread(hintView$1$$ExternalSyntheticLambda0);
                this.marqueeIsPending = false;
                this.marqueeIsStarted = false;
                this.scrollX = 0.0f;
            }
            invalidate();
        }
        if (!this.needMarquee || this.marqueeIsStarted || (z = this.marqueeIsPending) || z) {
            return;
        }
        this.marqueeIsPending = true;
        AndroidUtilities.runOnUIThread(hintView$1$$ExternalSyntheticLambda0, 1500L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        this.originalWidth = View.MeasureSpec.getSize(i);
        this.needMarquee = getMeasuredWidth() > this.originalWidth - this.rightPadding;
        invalidateGradient();
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

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.startMarquee);
        this.marqueeIsPending = false;
        this.marqueeIsStarted = false;
        this.scrollX = 0.0f;
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        invalidateGradient();
    }
}
