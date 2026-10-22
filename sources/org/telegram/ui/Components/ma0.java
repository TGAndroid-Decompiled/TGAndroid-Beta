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
public final class ma0 extends TextView {
    public final Matrix f28472a;
    public LinearGradient f28473b;
    public int f28474c;
    public boolean d;
    public boolean e;
    public float f28475f;
    public long h;
    public final hq f28476n;
    public boolean f28477r;
    public int f28478s;

    public ma0(Context context) {
        super(context);
        this.f28472a = new Matrix();
        this.f28476n = new hq(this, 26);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f28474c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f28473b = new LinearGradient(0.0f, 0.0f, this.f28474c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f28473b);
        } else {
            getPaint().setShader(null);
        }
        this.f28473b.setLocalMatrix(this.f28472a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f28475f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = w7.r.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f28472a;
        matrix.reset();
        float f12 = this.f28474c;
        matrix.postScale(com.google.android.gms.internal.play_billing.k3.y(1.0f, f7, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f28478s / this.f28474c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f28475f, 0.0f);
        this.f28473b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f28475f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f28475f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f28475f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f28473b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f28475f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f28475f < 1.0E-4d) {
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
        hq hqVar = this.f28476n;
        if ((z12 && this.e) || !z10) {
            float d = a1.g.d((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f28475f);
            this.f28475f = d;
            if (d > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(hqVar);
                this.f28477r = false;
                this.e = false;
                this.f28475f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z11 = this.f28477r) && !z11) {
            this.f28477r = true;
            AndroidUtilities.runOnUIThread(hqVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f28474c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f28474c - this.f28478s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f28478s = i10;
        if (getMeasuredWidth() > this.f28474c - this.f28478s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f28473b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f28476n);
        this.f28477r = false;
        this.e = false;
        this.f28475f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
