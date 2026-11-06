package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class o80 extends TextView {
    public final Matrix f36568a;
    public LinearGradient f36569b;
    public int f36570c;
    public boolean d;
    public boolean f36571e;
    public float f36572f;
    public long h;
    public final gp f36573n;
    public boolean f36574r;
    public int f36575s;

    public o80(Context context) {
        super(context);
        this.f36568a = new Matrix();
        this.f36573n = new gp(this, 24);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f36570c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f36569b = new LinearGradient(0.0f, 0.0f, this.f36570c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f36569b);
        } else {
            getPaint().setShader(null);
        }
        this.f36569b.setLocalMatrix(this.f36568a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z9;
        long j3;
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int L = org.telegram.messenger.g0.L(40.0f);
        float f11 = this.f36572f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.j9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f36568a;
        matrix.reset();
        float f13 = this.f36570c;
        matrix.postScale(com.google.android.recaptcha.internal.a.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f36575s / this.f36570c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f36572f, 0.0f);
        this.f36569b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f36572f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f36572f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f36571e) {
                float f15 = -this.f36572f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f36569b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f36572f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f36572f < 1.0E-4d) {
            z9 = true;
        } else {
            z9 = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.h;
        if (j10 != 0 && !z9) {
            j3 = Math.min(uptimeMillis - j10, 120L);
        } else {
            j3 = 16;
        }
        this.h = uptimeMillis;
        boolean z11 = this.d;
        gp gpVar = this.f36573n;
        if ((z11 && this.f36571e) || !z9) {
            float c10 = com.google.android.recaptcha.internal.a.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f36572f);
            this.f36572f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(gpVar);
                this.f36574r = false;
                this.f36571e = false;
                this.f36572f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f36571e && !(z10 = this.f36574r) && !z10) {
            this.f36574r = true;
            org.telegram.messenger.g0.i3(gpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f36570c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f36570c - this.f36575s) {
            z9 = true;
        }
        this.d = z9;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z9;
        this.f36575s = i7;
        if (getMeasuredWidth() > this.f36570c - this.f36575s) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (z9) {
            getPaint().setShader(this.f36569b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f36573n);
        this.f36574r = false;
        this.f36571e = false;
        this.f36572f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
