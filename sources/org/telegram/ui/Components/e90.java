package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class e90 extends TextView {

    public final Matrix f27990a;

    public LinearGradient f27991b;

    public int f27992c;
    public boolean d;

    public boolean f27993e;

    public float f27994f;
    public long h;

    public final lp f27995n;

    public boolean f27996r;

    public int f27997s;

    public e90(Context context) {
        super(context);
        this.f27990a = new Matrix();
        this.f27995n = new lp(this, 25);
    }

    public final void a() {
        float fMin = Math.min(AndroidUtilities.dp(10.0f) / this.f27992c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f27991b = new LinearGradient(0.0f, 0.0f, this.f27992c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, fMin, 1.0f - fMin, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f27991b);
        } else {
            getPaint().setShader(null);
        }
        this.f27991b.setLocalMatrix(this.f27990a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int iDp = AndroidUtilities.dp(40.0f);
        float f10 = this.f27994f;
        float f11 = measuredWidth;
        float fA = f10 < f11 ? h7.n.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.f27990a;
        matrix.reset();
        float fDp = AndroidUtilities.dp(10.0f);
        float f12 = this.f27992c;
        matrix.postScale(com.google.android.recaptcha.internal.a.z(1.0f, fA, fDp / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f27997s / this.f27992c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f27994f, 0.0f);
        this.f27991b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f27994f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f27994f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.f27993e) {
                float f14 = -this.f27994f;
                float f15 = iDp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f27991b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f27994f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z11 = ((double) this.f27994f) < 1.0E-4d;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.h;
        long jMin = (j10 == 0 || z11) ? 16L : Math.min(jUptimeMillis - j10, 120L);
        this.h = jUptimeMillis;
        boolean z12 = this.d;
        lp lpVar = this.f27995n;
        if ((z12 && this.f27993e) || !z11) {
            float fC = s3.c.c(jMin, 1000.0f, AndroidUtilities.dp(60.0f), this.f27994f);
            this.f27994f = fC;
            if (fC > measuredWidth + iDp) {
                AndroidUtilities.cancelRunOnUIThread(lpVar);
                this.f27996r = false;
                this.f27993e = false;
                this.f27994f = 0.0f;
            }
            invalidate();
        }
        if (!this.d || this.f27993e || (z10 = this.f27996r) || z10) {
            return;
        }
        this.f27996r = true;
        AndroidUtilities.runOnUIThread(lpVar, 1500L);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f27992c = View.MeasureSpec.getSize(i10);
        this.d = getMeasuredWidth() > this.f27992c - this.f27997s;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        this.f27997s = i10;
        boolean z10 = getMeasuredWidth() > this.f27992c - this.f27997s;
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f27991b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f27995n);
        this.f27996r = false;
        this.f27993e = false;
        this.f27994f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
