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
    public final Paint f28942a;
    public LinearGradient f28943b;
    public final Paint f28944c;
    public LinearGradient d;
    public final int e;
    public int f28945f;
    public float f28946g;
    public long h;
    public final Matrix f28947i;
    public boolean f28948j;
    public boolean f28949k;
    public boolean f28950l;
    public float f28951m;
    public float f28952n;
    public rg.z1 f28953o;
    public org.telegram.ui.web.u0 f28954p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f28942a);
        if (this.f28949k) {
            boolean z10 = this.f28950l;
            Paint paint = this.f28944c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28943b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f28942a.setShader(this.f28943b);
        this.f28944c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f28948j || this.f28946g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f28952n) + this.f28946g;
                    this.f28946g = f7;
                    if (f7 > this.f28951m) {
                        this.f28946g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f28954p;
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
        int i10 = this.f28945f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f28946g) - i11;
        Matrix matrix = this.f28947i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f28943b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f28942a = paint;
        Paint paint2 = new Paint(1);
        this.f28944c = paint2;
        this.f28947i = new Matrix();
        this.f28948j = true;
        this.f28949k = true;
        this.f28950l = false;
        this.f28951m = 1.2f;
        this.f28952n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28943b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f28943b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
