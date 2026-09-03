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
public final class u90 extends TextView {
    public final Matrix f29157a;
    public LinearGradient f29158b;
    public int f29159c;
    public boolean d;
    public boolean e;
    public float f29160f;
    public long h;
    public final up f29161n;
    public boolean f29162r;
    public int f29163s;

    public u90(Context context) {
        super(context);
        this.f29157a = new Matrix();
        this.f29161n = new up(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f29159c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.f29158b = new LinearGradient(0.0f, 0.0f, this.f29159c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f29158b);
        } else {
            getPaint().setShader(null);
        }
        this.f29158b.setLocalMatrix(this.f29157a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z4;
        long j10;
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f11 = this.f29160f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = k7.n.a(f11 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f29157a;
        matrix.reset();
        float f13 = this.f29159c;
        matrix.postScale(e2.c.w(1.0f, f10, AndroidUtilities.dp(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f29163s / this.f29159c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f29160f, 0.0f);
        this.f29158b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f29160f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f29160f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.e) {
                float f15 = -this.f29160f;
                float f16 = dp;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f29158b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f29160f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f29160f < 1.0E-4d) {
            z4 = true;
        } else {
            z4 = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.h;
        if (j11 != 0 && !z4) {
            j10 = Math.min(uptimeMillis - j11, 120L);
        } else {
            j10 = 16;
        }
        this.h = uptimeMillis;
        boolean z11 = this.d;
        up upVar = this.f29161n;
        if ((z11 && this.e) || !z4) {
            float c3 = vh.w2.c((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f29160f);
            this.f29160f = c3;
            if (c3 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(upVar);
                this.f29162r = false;
                this.e = false;
                this.f29160f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z10 = this.f29162r) && !z10) {
            this.f29162r = true;
            AndroidUtilities.runOnUIThread(upVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.f29159c = View.MeasureSpec.getSize(i10);
        if (getMeasuredWidth() > this.f29159c - this.f29163s) {
            z4 = true;
        }
        this.d = z4;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        boolean z4;
        this.f29163s = i10;
        if (getMeasuredWidth() > this.f29159c - this.f29163s) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        if (z4) {
            getPaint().setShader(this.f29158b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f29161n);
        this.f29162r = false;
        this.e = false;
        this.f29160f = 0.0f;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
