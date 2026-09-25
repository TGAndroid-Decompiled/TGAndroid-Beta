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
public final class ca0 extends TextView {
    public final Matrix f23297a;
    public LinearGradient f23298b;
    public int f23299c;
    public boolean d;
    public boolean e;
    public float f23300f;
    public long h;
    public final yp f23301n;
    public boolean f23302r;
    public int f23303s;

    public ca0(Context context) {
        super(context);
        this.f23297a = new Matrix();
        this.f23301n = new yp(this, 26);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f23299c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f23298b = new LinearGradient(0.0f, 0.0f, this.f23299c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f23298b);
        } else {
            getPaint().setShader(null);
        }
        this.f23298b.setLocalMatrix(this.f23297a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        long j3;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f23300f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = w7.q.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f23297a;
        matrix.reset();
        float f12 = this.f23299c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f7, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f23303s / this.f23299c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f23300f, 0.0f);
        this.f23298b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f23300f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f23300f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f23300f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f23298b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f23300f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f23300f < 1.0E-4d) {
            z10 = true;
        } else {
            z10 = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.h;
        if (j10 != 0 && !z10) {
            j3 = Math.min(uptimeMillis - j10, 120L);
        } else {
            j3 = 16;
        }
        this.h = uptimeMillis;
        boolean z12 = this.d;
        yp ypVar = this.f23301n;
        if ((z12 && this.e) || !z10) {
            float e = a4.a.e((float) j3, 1000.0f, AndroidUtilities.dp(60.0f), this.f23300f);
            this.f23300f = e;
            if (e > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(ypVar);
                this.f23302r = false;
                this.e = false;
                this.f23300f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z11 = this.f23302r) && !z11) {
            this.f23302r = true;
            AndroidUtilities.runOnUIThread(ypVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f23299c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f23299c - this.f23303s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f23303s = i10;
        if (getMeasuredWidth() > this.f23299c - this.f23303s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f23298b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f23301n);
        this.f23302r = false;
        this.e = false;
        this.f23300f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
