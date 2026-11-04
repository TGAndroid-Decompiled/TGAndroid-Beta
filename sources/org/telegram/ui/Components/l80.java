package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class l80 extends TextView {
    public final Matrix f35619a;
    public LinearGradient f35620b;
    public int f35621c;
    public boolean d;
    public boolean f35622e;
    public float f35623f;
    public long h;
    public final gp f35624n;
    public boolean f35625r;
    public int f35626s;

    public l80(Context context) {
        super(context);
        this.f35619a = new Matrix();
        this.f35624n = new gp(this, 24);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f35621c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i3 = 1048575 & currentTextColor;
        this.f35620b = new LinearGradient(0.0f, 0.0f, this.f35621c, 0.0f, new int[]{i3, currentTextColor, currentTextColor, i3}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f35620b);
        } else {
            getPaint().setShader(null);
        }
        this.f35620b.setLocalMatrix(this.f35619a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int L = org.telegram.messenger.g0.L(40.0f);
        float f11 = this.f35623f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = b8.be.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f35619a;
        matrix.reset();
        float f13 = this.f35621c;
        matrix.postScale(com.google.android.recaptcha.internal.a.y(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f35626s / this.f35621c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f35623f, 0.0f);
        this.f35620b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f35623f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f35623f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f35622e) {
                float f15 = -this.f35623f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f35620b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f35623f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f35623f < 1.0E-4d) {
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
        gp gpVar = this.f35624n;
        if ((z12 && this.f35622e) || !z10) {
            float A = a1.g.A((float) j10, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f35623f);
            this.f35623f = A;
            if (A > measuredWidth + L) {
                org.telegram.messenger.g0.r(gpVar);
                this.f35625r = false;
                this.f35622e = false;
                this.f35623f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f35622e && !(z11 = this.f35625r) && !z11) {
            this.f35625r = true;
            org.telegram.messenger.g0.i3(gpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f35621c = View.MeasureSpec.getSize(i3);
        if (getMeasuredWidth() > this.f35621c - this.f35626s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i3) {
        boolean z10;
        this.f35626s = i3;
        if (getMeasuredWidth() > this.f35621c - this.f35626s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f35620b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f35624n);
        this.f35625r = false;
        this.f35622e = false;
        this.f35623f = 0.0f;
    }

    @Override
    public void setTextColor(int i3) {
        super.setTextColor(i3);
        a();
    }
}
