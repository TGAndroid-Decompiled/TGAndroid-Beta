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
public final class a90 extends TextView {
    public final Matrix f26735a;
    public LinearGradient f26736b;
    public int f26737c;
    public boolean d;
    public boolean f26738e;
    public float f26739f;
    public long h;
    public final np f26740n;
    public boolean f26741r;
    public int f26742s;

    public a90(Context context) {
        super(context);
        this.f26735a = new Matrix();
        this.f26740n = new np(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.f26737c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i9 = 1048575 & currentTextColor;
        this.f26736b = new LinearGradient(0.0f, 0.0f, this.f26737c, 0.0f, new int[]{i9, currentTextColor, currentTextColor, i9}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.f26736b);
        } else {
            getPaint().setShader(null);
        }
        this.f26736b.setLocalMatrix(this.f26735a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        long j10;
        boolean z11;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f11 = this.f26739f;
        float f12 = measuredWidth;
        if (f11 < f12) {
            f10 = g7.n.a(f11 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f);
        } else {
            f10 = 0.0f;
        }
        Matrix matrix = this.f26735a;
        matrix.reset();
        float f13 = this.f26737c;
        matrix.postScale(e2.c.z(1.0f, f10, AndroidUtilities.dp(10.0f) / f13, 1.0f), 1.0f, f13, 0.0f);
        matrix.postScale(1.0f - (this.f26742s / this.f26737c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f26739f, 0.0f);
        this.f26736b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f26739f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f14 = this.f26739f;
            if (f14 > 0.0f && f14 + getWidth() > f12 && this.d && this.f26738e) {
                float f15 = -this.f26739f;
                float f16 = dp;
                matrix.postTranslate(f15 - ((f15 + f12) + f16), 0.0f);
                this.f26736b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f26739f) + f12 + f16, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f26739f < 1.0E-4d) {
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
        np npVar = this.f26740n;
        if ((z12 && this.f26738e) || !z10) {
            float b10 = org.telegram.ui.Cells.j2.b((float) j10, 1000.0f, AndroidUtilities.dp(60.0f), this.f26739f);
            this.f26739f = b10;
            if (b10 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(npVar);
                this.f26741r = false;
                this.f26738e = false;
                this.f26739f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.f26738e && !(z11 = this.f26741r) && !z11) {
            this.f26741r = true;
            AndroidUtilities.runOnUIThread(npVar, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10 = false;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.f26737c = View.MeasureSpec.getSize(i9);
        if (getMeasuredWidth() > this.f26737c - this.f26742s) {
            z10 = true;
        }
        this.d = z10;
        a();
    }

    public void setCustomPaddingRight(int i9) {
        boolean z10;
        this.f26742s = i9;
        if (getMeasuredWidth() > this.f26737c - this.f26742s) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.f26736b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.f26740n);
        this.f26741r = false;
        this.f26738e = false;
        this.f26739f = 0.0f;
    }

    @Override
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        a();
    }
}
