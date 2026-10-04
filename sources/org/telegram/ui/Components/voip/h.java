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
    public final Paint f31877a;
    public LinearGradient f31878b;
    public final Paint f31879c;
    public LinearGradient d;
    public final int f31880e;
    public int f31881f;
    public float f31882g;
    public long h;
    public final Matrix f31883i;
    public boolean f31884j;
    public boolean f31885k;
    public boolean f31886l;
    public float f31887m;
    public float f31888n;
    public rg.b2 f31889o;
    public org.telegram.ui.web.u0 f31890p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31877a);
        if (this.f31885k) {
            boolean z10 = this.f31886l;
            Paint paint = this.f31879c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31880e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31878b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31877a.setShader(this.f31878b);
        this.f31879c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31884j || this.f31882g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31888n) + this.f31882g;
                    this.f31882g = f7;
                    if (f7 > this.f31887m) {
                        this.f31882g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f31890p;
                        if (u0Var != null) {
                            u0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31881f;
        int i11 = this.f31880e;
        float f10 = (((i11 * 2) + i10) * this.f31882g) - i11;
        Matrix matrix = this.f31883i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31878b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31877a = paint;
        Paint paint2 = new Paint(1);
        this.f31879c = paint2;
        this.f31883i = new Matrix();
        this.f31884j = true;
        this.f31885k = true;
        this.f31886l = false;
        this.f31887m = 1.2f;
        this.f31888n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31880e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31878b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31878b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
