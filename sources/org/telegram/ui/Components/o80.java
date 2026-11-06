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
    public final Matrix f36550a;
    public LinearGradient f36551b;
    public int f36552c;
    public boolean d;
    public boolean f36553e;
    public float f36554f;
    public long h;
    public final gp f36555n;
    public boolean f36556r;
    public int f36557s;

    public o80(Context context) {
        super(context);
        this.f36550a = new Matrix();
        this.f36555n = new gp(this, 24);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f36552c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f36551b = new LinearGradient(0.0f, 0.0f, this.f36552c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f36551b);
        } else {
            getPaint().setShader(null);
        }
        this.f36551b.setLocalMatrix(this.f36550a);
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
        float f11 = this.f36554f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.j9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f36550a;
        matrix.reset();
        float f13 = this.f36552c;
        matrix.postScale(com.google.android.recaptcha.internal.a.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f36557s / this.f36552c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f36554f, 0.0f);
        this.f36551b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f36554f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f36554f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f36553e) {
                float f15 = -this.f36554f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f36551b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f36554f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f36554f < 1.0E-4d) {
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
        gp gpVar = this.f36555n;
        if ((z11 && this.f36553e) || !z9) {
            float c10 = com.google.android.recaptcha.internal.a.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f36554f);
            this.f36554f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(gpVar);
                this.f36556r = false;
                this.f36553e = false;
                this.f36554f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f36553e && !(z10 = this.f36556r) && !z10) {
            this.f36556r = true;
            org.telegram.messenger.g0.i3(gpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f36552c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f36552c - this.f36557s) {
            z9 = true;
        }
        this.d = z9;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z9;
        this.f36557s = i7;
        if (getMeasuredWidth() > this.f36552c - this.f36557s) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (z9) {
            getPaint().setShader(this.f36551b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f36555n);
        this.f36556r = false;
        this.f36553e = false;
        this.f36554f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
