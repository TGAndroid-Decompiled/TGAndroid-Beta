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
public final class n90 extends TextView {
    public final Matrix f30935a;
    public LinearGradient f30936b;
    public int f30937c;
    public boolean d;
    public boolean f30938e;
    public float f30939f;
    public long h;
    public final rp f30940n;
    public boolean f30941r;
    public int f30942s;

    public n90(Context context) {
        super(context);
        this.f30935a = new Matrix();
        this.f30940n = new rp(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f30937c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f30936b = new LinearGradient(0.0f, 0.0f, this.f30937c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f30936b);
        } else {
            getPaint().setShader(null);
        }
        this.f30936b.setLocalMatrix(this.f30935a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f30939f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f9 = i7.w.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f9 = 0.0f;
        }
        Matrix matrix = this.f30935a;
        matrix.reset();
        float f12 = this.f30937c;
        matrix.postScale(com.google.android.recaptcha.internal.a.z(1.0f, f9, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f30942s / this.f30937c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f30939f, 0.0f);
        this.f30936b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f30939f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f30939f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.f30938e) {
                float f14 = -this.f30939f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f30936b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f30939f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f30939f < 1.0E-4d) {
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
        rp rpVar = this.f30940n;
        if ((z12 && this.f30938e) || !z10) {
            float c3 = u3.c.c((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f30939f);
            this.f30939f = c3;
            if (c3 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(rpVar);
                this.f30941r = false;
                this.f30938e = false;
                this.f30939f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f30938e && !(z11 = this.f30941r) && !z11) {
            this.f30941r = true;
            AndroidUtilities.runOnUIThread(rpVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f30937c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f30937c - this.f30942s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f30942s = i10;
        if (getMeasuredWidth() > this.f30937c - this.f30942s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f30936b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f30940n);
        this.f30941r = false;
        this.f30938e = false;
        this.f30939f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
