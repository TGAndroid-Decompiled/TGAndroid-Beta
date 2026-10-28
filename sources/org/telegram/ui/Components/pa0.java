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
public final class pa0 extends TextView {
    public final Matrix f31552a;
    public LinearGradient f31553b;
    public int f31554c;
    public boolean d;
    public boolean e;
    public float f31555f;
    public long h;
    public final cp f31556n;
    public boolean f31557r;
    public int f31558s;

    public pa0(Context context) {
        super(context);
        this.f31552a = new Matrix();
        this.f31556n = new cp(this, 28);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f31554c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f31553b = new LinearGradient(0.0f, 0.0f, this.f31554c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f31553b);
        } else {
            getPaint().setShader(null);
        }
        this.f31553b.setLocalMatrix(this.f31552a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f31555f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = a8.ee.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f31552a;
        matrix.reset();
        float f12 = this.f31554c;
        matrix.postScale(c3.h0.z(1.0f, f7, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f31558s / this.f31554c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f31555f, 0.0f);
        this.f31553b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f31555f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f31555f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f31555f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f31553b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f31555f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f31555f < 1.0E-4d) {
            z10 = true;
        } else {
            z10 = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.h;
        if (j11 != 0 && !z10) {
            j10 = Math.min(uptimeMillis - j11, 120L);
        } else {
            j10 = 16;
        }
        this.h = uptimeMillis;
        boolean z12 = this.d;
        cp cpVar = this.f31556n;
        if ((z12 && this.e) || !z10) {
            float c10 = a1.g.c((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f31555f);
            this.f31555f = c10;
            if (c10 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(cpVar);
                this.f31557r = false;
                this.e = false;
                this.f31555f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z11 = this.f31557r) && !z11) {
            this.f31557r = true;
            AndroidUtilities.runOnUIThread(cpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f31554c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f31554c - this.f31558s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f31558s = i10;
        if (getMeasuredWidth() > this.f31554c - this.f31558s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f31553b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f31556n);
        this.f31557r = false;
        this.e = false;
        this.f31555f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
