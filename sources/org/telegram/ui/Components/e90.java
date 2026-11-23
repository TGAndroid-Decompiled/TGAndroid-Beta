package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class e90 extends TextView {
    public final Matrix f34703a;
    public LinearGradient f34704b;
    public int f34705c;
    public boolean d;
    public boolean f34706e;
    public float f34707f;
    public long h;
    public final oo f34708n;
    public boolean f34709r;
    public int f34710s;

    public e90(Context context) {
        super(context);
        this.f34703a = new Matrix();
        this.f34708n = new oo(this, 26);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f34705c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f34704b = new LinearGradient(0.0f, 0.0f, this.f34705c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f34704b);
        } else {
            getPaint().setShader(null);
        }
        this.f34704b.setLocalMatrix(this.f34703a);
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
        float f11 = this.f34707f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.l9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f34703a;
        matrix.reset();
        float f13 = this.f34705c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f34710s / this.f34705c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f34707f, 0.0f);
        this.f34704b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f34707f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f34707f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f34706e) {
                float f15 = -this.f34707f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f34704b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f34707f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f34707f < 1.0E-4d) {
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
        oo ooVar = this.f34708n;
        if ((z12 && this.f34706e) || !z10) {
            float c10 = com.google.android.gms.internal.vision.e2.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f34707f);
            this.f34707f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(ooVar);
                this.f34709r = false;
                this.f34706e = false;
                this.f34707f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f34706e && !(z11 = this.f34709r) && !z11) {
            this.f34709r = true;
            org.telegram.messenger.g0.h3(ooVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f34705c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f34705c - this.f34710s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z10;
        this.f34710s = i7;
        if (getMeasuredWidth() > this.f34705c - this.f34710s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f34704b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f34708n);
        this.f34709r = false;
        this.f34706e = false;
        this.f34707f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
