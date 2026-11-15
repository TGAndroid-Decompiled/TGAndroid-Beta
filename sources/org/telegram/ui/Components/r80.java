package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class r80 extends TextView {
    public final Matrix f38894a;
    public LinearGradient f38895b;
    public int f38896c;
    public boolean d;
    public boolean f38897e;
    public float f38898f;
    public long h;
    public final fo f38899n;
    public boolean f38900r;
    public int f38901s;

    public r80(Context context) {
        super(context);
        this.f38894a = new Matrix();
        this.f38899n = new fo(this, 26);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f38896c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f38895b = new LinearGradient(0.0f, 0.0f, this.f38896c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f38895b);
        } else {
            getPaint().setShader(null);
        }
        this.f38895b.setLocalMatrix(this.f38894a);
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
        float f11 = this.f38898f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.i9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f38894a;
        matrix.reset();
        float f13 = this.f38896c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f38901s / this.f38896c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f38898f, 0.0f);
        this.f38895b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f38898f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f38898f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f38897e) {
                float f15 = -this.f38898f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f38895b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f38898f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f38898f < 1.0E-4d) {
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
        fo foVar = this.f38899n;
        if ((z12 && this.f38897e) || !z10) {
            float c10 = com.google.android.gms.internal.vision.e2.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f38898f);
            this.f38898f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(foVar);
                this.f38900r = false;
                this.f38897e = false;
                this.f38898f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f38897e && !(z11 = this.f38900r) && !z11) {
            this.f38900r = true;
            org.telegram.messenger.g0.i3(foVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f38896c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f38896c - this.f38901s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z10;
        this.f38901s = i7;
        if (getMeasuredWidth() > this.f38896c - this.f38901s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f38895b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f38899n);
        this.f38900r = false;
        this.f38897e = false;
        this.f38898f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
