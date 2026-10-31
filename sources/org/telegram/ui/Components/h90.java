package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class h90 extends TextView {
    public final Matrix f26657a;
    public LinearGradient f26658b;
    public int f26659c;
    public boolean d;
    public boolean e;
    public float f26660f;
    public long h;
    public final ho f26661n;
    public boolean f26662r;
    public int f26663s;

    public h90(Context context) {
        super(context);
        this.f26657a = new Matrix();
        this.f26661n = new ho(this, 27);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.i0.L(10.0f) / this.f26659c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f26658b = new LinearGradient(0.0f, 0.0f, this.f26659c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f26658b);
        } else {
            getPaint().setShader(null);
        }
        this.f26658b.setLocalMatrix(this.f26657a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int L = org.telegram.messenger.i0.L(40.0f);
        float f10 = this.f26660f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = w7.u.a(f10 / org.telegram.messenger.i0.L(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f26657a;
        matrix.reset();
        float f12 = this.f26659c;
        matrix.postScale(c3.i0.z(1.0f, f7, org.telegram.messenger.i0.L(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f26663s / this.f26659c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f26660f, 0.0f);
        this.f26658b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f26660f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f26660f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f26660f;
                float f15 = L;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f26658b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f26660f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f26660f < 1.0E-4d) {
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
        ho hoVar = this.f26661n;
        if ((z12 && this.e) || !z10) {
            float c10 = a1.g.c((float) j10, 1000.0f, org.telegram.messenger.i0.L(60.0f), this.f26660f);
            this.f26660f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.i0.r(hoVar);
                this.f26662r = false;
                this.e = false;
                this.f26660f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z11 = this.f26662r) && !z11) {
            this.f26662r = true;
            org.telegram.messenger.i0.h3(hoVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f26659c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f26659c - this.f26663s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f26663s = i10;
        if (getMeasuredWidth() > this.f26659c - this.f26663s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f26658b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        org.telegram.messenger.i0.r(this.f26661n);
        this.f26662r = false;
        this.e = false;
        this.f26660f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
