package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h {
    public final Paint f31499a;
    public LinearGradient f31500b;
    public final Paint f31501c;
    public LinearGradient d;
    public final int f31502e;
    public int f31503f;
    public float f31504g;
    public long h;
    public final Matrix f31505i;
    public boolean f31506j;
    public boolean f31507k;
    public boolean f31508l;
    public float f31509m;
    public float f31510n;
    public sg.c2 f31511o;
    public sg.p0 f31512p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31499a);
        if (this.f31507k) {
            boolean z10 = this.f31508l;
            Paint paint = this.f31501c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31502e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31500b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31499a.setShader(this.f31500b);
        this.f31501c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31506j || this.f31504g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31510n) + this.f31504g;
                    this.f31504g = f7;
                    if (f7 > this.f31509m) {
                        this.f31504g = 0.0f;
                        sg.p0 p0Var = this.f31512p;
                        if (p0Var != null) {
                            p0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31503f;
        int i11 = this.f31502e;
        float f10 = (((i11 * 2) + i10) * this.f31504g) - i11;
        Matrix matrix = this.f31505i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31500b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31499a = paint;
        Paint paint2 = new Paint(1);
        this.f31501c = paint2;
        this.f31505i = new Matrix();
        this.f31506j = true;
        this.f31507k = true;
        this.f31508l = false;
        this.f31509m = 1.2f;
        this.f31510n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31502e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31500b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31500b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
