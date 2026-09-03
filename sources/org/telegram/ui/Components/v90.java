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
public final class v90 extends TextView {
    public final Matrix f31842a;
    public LinearGradient f31843b;
    public int f31844c;
    public boolean d;
    public boolean f31845e;
    public float f31846f;
    public long h;
    public final xp f31847n;
    public boolean f31848r;
    public int f31849s;

    public v90(Context context) {
        super(context);
        this.f31842a = new Matrix();
        this.f31847n = new xp(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f31844c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f31843b = new LinearGradient(0.0f, 0.0f, this.f31844c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f31843b);
        } else {
            getPaint().setShader(null);
        }
        this.f31843b.setLocalMatrix(this.f31842a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z4;
        long j10;
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f11 = this.f31846f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = k7.o.a(f11 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f31842a;
        matrix.reset();
        float f13 = this.f31844c;
        matrix.postScale(e2.c.w(1.0f, f10, AndroidUtilities.dp(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f31849s / this.f31844c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f31846f, 0.0f);
        this.f31843b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f31846f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f31846f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f31845e) {
                float f15 = -this.f31846f;
                float f16 = dp;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f31843b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f31846f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f31846f < 1.0E-4d) {
            z4 = true;
        } else {
            z4 = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.h;
        if (j11 != 0 && !z4) {
            j10 = Math.min(uptimeMillis - j11, 120L);
        } else {
            j10 = 16;
        }
        this.h = uptimeMillis;
        boolean z11 = this.d;
        xp xpVar = this.f31847n;
        if ((z11 && this.f31845e) || !z4) {
            float c3 = w.c.c((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f31846f);
            this.f31846f = c3;
            if (c3 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                this.f31848r = false;
                this.f31845e = false;
                this.f31846f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f31845e && !(z10 = this.f31848r) && !z10) {
            this.f31848r = true;
            AndroidUtilities.runOnUIThread(xpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f31844c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f31844c - this.f31849s) {
            z4 = true;
        }
        this.d = z4;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z4;
        this.f31849s = i10;
        if (getMeasuredWidth() > this.f31844c - this.f31849s) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        if (z4) {
            getPaint().setShader(this.f31843b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f31847n);
        this.f31848r = false;
        this.f31845e = false;
        this.f31846f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
