package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class c90 extends TextView {
    public final Matrix f33933a;
    public LinearGradient f33934b;
    public int f33935c;
    public boolean d;
    public boolean f33936e;
    public float f33937f;
    public long h;
    public final mo f33938n;
    public boolean f33939r;
    public int f33940s;

    public c90(Context context) {
        super(context);
        this.f33933a = new Matrix();
        this.f33938n = new mo(this, 26);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f33935c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f33934b = new LinearGradient(0.0f, 0.0f, this.f33935c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f33934b);
        } else {
            getPaint().setShader(null);
        }
        this.f33934b.setLocalMatrix(this.f33933a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        long j3;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int L = org.telegram.messenger.g0.L(40.0f);
        float f11 = this.f33937f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.l9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f33933a;
        matrix.reset();
        float f13 = this.f33935c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f33940s / this.f33935c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f33937f, 0.0f);
        this.f33934b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f33937f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f33937f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f33936e) {
                float f15 = -this.f33937f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f33934b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f33937f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f33937f < 1.0E-4d) {
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
        mo moVar = this.f33938n;
        if ((z12 && this.f33936e) || !z10) {
            float c10 = com.google.android.gms.internal.vision.e2.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f33937f);
            this.f33937f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(moVar);
                this.f33939r = false;
                this.f33936e = false;
                this.f33937f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f33936e && !(z11 = this.f33939r) && !z11) {
            this.f33939r = true;
            org.telegram.messenger.g0.h3(moVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f33935c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f33935c - this.f33940s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z10;
        this.f33940s = i7;
        if (getMeasuredWidth() > this.f33935c - this.f33940s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f33934b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f33938n);
        this.f33939r = false;
        this.f33936e = false;
        this.f33937f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
