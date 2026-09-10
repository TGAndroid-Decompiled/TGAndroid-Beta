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
public final class ba0 extends TextView {
    public final Matrix f21786a;
    public LinearGradient f21787b;
    public int f21788c;
    public boolean d;
    public boolean e;
    public float f21789f;
    public long h;
    public final dq f21790n;
    public boolean f21791r;
    public int f21792s;

    public ba0(Context context) {
        super(context);
        this.f21786a = new Matrix();
        this.f21790n = new dq(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f21788c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f21787b = new LinearGradient(0.0f, 0.0f, this.f21788c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f21787b);
        } else {
            getPaint().setShader(null);
        }
        this.f21787b.setLocalMatrix(this.f21786a);
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
        float f10 = this.f21789f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = w7.q.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f21786a;
        matrix.reset();
        float f12 = this.f21788c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, f7, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f21792s / this.f21788c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f21789f, 0.0f);
        this.f21787b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f21789f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f21789f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f21789f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f21787b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f21789f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f21789f < 1.0E-4d) {
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
        dq dqVar = this.f21790n;
        if ((z12 && this.e) || !z10) {
            float e = a4.a.e((float) j3, 1000.0f, AndroidUtilities.dp(60.0f), this.f21789f);
            this.f21789f = e;
            if (e > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(dqVar);
                this.f21791r = false;
                this.e = false;
                this.f21789f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z11 = this.f21791r) && !z11) {
            this.f21791r = true;
            AndroidUtilities.runOnUIThread(dqVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f21788c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f21788c - this.f21792s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f21792s = i10;
        if (getMeasuredWidth() > this.f21788c - this.f21792s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f21787b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f21790n);
        this.f21791r = false;
        this.e = false;
        this.f21789f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
