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
public final class xa0 extends TextView {
    public final Matrix f32696a;
    public LinearGradient f32697b;
    public int f32698c;
    public boolean d;
    public boolean f32699e;
    public float f32700f;
    public long h;
    public final pq f32701n;
    public boolean f32702r;
    public int f32703s;

    public xa0(Context context) {
        super(context);
        this.f32696a = new Matrix();
        this.f32701n = new pq(this, 26);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f32698c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f32697b = new LinearGradient(0.0f, 0.0f, this.f32698c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f32697b);
        } else {
            getPaint().setShader(null);
        }
        this.f32697b.setLocalMatrix(this.f32696a);
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
        float f10 = this.f32700f;
        float f11 = measuredWidth;
        if (f10 < f11) {
            f7 = w7.n.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f7 = 0.0f;
        }
        Matrix matrix = this.f32696a;
        matrix.reset();
        float f12 = this.f32698c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.y(1.0f, f7, AndroidUtilities.dp(10.0f) / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.f32703s / this.f32698c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f32700f, 0.0f);
        this.f32697b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f32700f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f32700f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.f32699e) {
                float f14 = -this.f32700f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.f32697b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f32700f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f32700f < 1.0E-4d) {
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
        pq pqVar = this.f32701n;
        if ((z12 && this.f32699e) || !z10) {
            float e7 = a1.g.e((float) j3, 1000.0f, AndroidUtilities.dp(60.0f), this.f32700f);
            this.f32700f = e7;
            if (e7 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(pqVar);
                this.f32702r = false;
                this.f32699e = false;
                this.f32700f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f32699e && !(z11 = this.f32702r) && !z11) {
            this.f32702r = true;
            AndroidUtilities.runOnUIThread(pqVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f32698c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f32698c - this.f32703s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z10;
        this.f32703s = i10;
        if (getMeasuredWidth() > this.f32698c - this.f32703s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f32697b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f32701n);
        this.f32702r = false;
        this.f32699e = false;
        this.f32700f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
