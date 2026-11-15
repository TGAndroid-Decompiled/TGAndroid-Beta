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
    public final Matrix f38896a;
    public LinearGradient f38897b;
    public int f38898c;
    public boolean d;
    public boolean f38899e;
    public float f38900f;
    public long h;
    public final fo f38901n;
    public boolean f38902r;
    public int f38903s;

    public r80(Context context) {
        super(context);
        this.f38896a = new Matrix();
        this.f38901n = new fo(this, 26);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.f38898c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.f38897b = new LinearGradient(0.0f, 0.0f, this.f38898c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f38897b);
        } else {
            getPaint().setShader(null);
        }
        this.f38897b.setLocalMatrix(this.f38896a);
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
        float f11 = this.f38900f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = c8.i9.a(f11 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f38896a;
        matrix.reset();
        float f13 = this.f38898c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f38903s / this.f38898c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f38900f, 0.0f);
        this.f38897b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f38900f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f38900f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f38899e) {
                float f15 = -this.f38900f;
                float f16 = L;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f38897b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f38900f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f38900f < 1.0E-4d) {
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
        fo foVar = this.f38901n;
        if ((z12 && this.f38899e) || !z10) {
            float c10 = com.google.android.gms.internal.vision.e2.c((float) j3, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f38900f);
            this.f38900f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(foVar);
                this.f38902r = false;
                this.f38899e = false;
                this.f38900f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f38899e && !(z11 = this.f38902r) && !z11) {
            this.f38902r = true;
            org.telegram.messenger.g0.i3(foVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f38898c = View.MeasureSpec.getSize(i7);
        if (getMeasuredWidth() > this.f38898c - this.f38903s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        boolean z10;
        this.f38903s = i7;
        if (getMeasuredWidth() > this.f38898c - this.f38903s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f38897b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.g0.r(this.f38901n);
        this.f38902r = false;
        this.f38899e = false;
        this.f38900f = 0.0f;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
