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
    public final Paint f32016a;
    public LinearGradient f32017b;
    public final Paint f32018c;
    public LinearGradient d;
    public final int f32019e;
    public int f32020f;
    public float f32021g;
    public long h;
    public final Matrix f32022i;
    public boolean f32023j;
    public boolean f32024k;
    public boolean f32025l;
    public float f32026m;
    public float f32027n;
    public rg.a2 f32028o;
    public org.telegram.ui.web.q0 f32029p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f32016a);
        if (this.f32024k) {
            boolean z10 = this.f32025l;
            Paint paint = this.f32018c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f32019e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32017b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f32016a.setShader(this.f32017b);
        this.f32018c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f32023j || this.f32021g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f32027n) + this.f32021g;
                    this.f32021g = f7;
                    if (f7 > this.f32026m) {
                        this.f32021g = 0.0f;
                        org.telegram.ui.web.q0 q0Var = this.f32029p;
                        if (q0Var != null) {
                            q0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f32020f;
        int i11 = this.f32019e;
        float f10 = (((i11 * 2) + i10) * this.f32021g) - i11;
        Matrix matrix = this.f32022i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f32017b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f32016a = paint;
        Paint paint2 = new Paint(1);
        this.f32018c = paint2;
        this.f32022i = new Matrix();
        this.f32023j = true;
        this.f32024k = true;
        this.f32025l = false;
        this.f32026m = 1.2f;
        this.f32027n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f32019e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32017b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f32017b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
