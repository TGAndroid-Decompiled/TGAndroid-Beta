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
    public final Paint f28962a;
    public LinearGradient f28963b;
    public final Paint f28964c;
    public LinearGradient d;
    public final int e;
    public int f28965f;
    public float f28966g;
    public long h;
    public final Matrix f28967i;
    public boolean f28968j;
    public boolean f28969k;
    public boolean f28970l;
    public float f28971m;
    public float f28972n;
    public rg.z1 f28973o;
    public org.telegram.ui.web.u0 f28974p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f28962a);
        if (this.f28969k) {
            boolean z10 = this.f28970l;
            Paint paint = this.f28964c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28963b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f28962a.setShader(this.f28963b);
        this.f28964c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f28968j || this.f28966g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f28972n) + this.f28966g;
                    this.f28966g = f7;
                    if (f7 > this.f28971m) {
                        this.f28966g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f28974p;
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
        int i10 = this.f28965f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f28966g) - i11;
        Matrix matrix = this.f28967i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f28963b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f28962a = paint;
        Paint paint2 = new Paint(1);
        this.f28964c = paint2;
        this.f28967i = new Matrix();
        this.f28968j = true;
        this.f28969k = true;
        this.f28970l = false;
        this.f28971m = 1.2f;
        this.f28972n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28963b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f28963b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
