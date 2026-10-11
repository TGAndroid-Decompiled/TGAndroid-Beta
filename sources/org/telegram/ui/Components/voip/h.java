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
    public final Paint f32061a;
    public LinearGradient f32062b;
    public final Paint f32063c;
    public LinearGradient d;
    public final int f32064e;
    public int f32065f;
    public float f32066g;
    public long h;
    public final Matrix f32067i;
    public boolean f32068j;
    public boolean f32069k;
    public boolean f32070l;
    public float f32071m;
    public float f32072n;
    public rg.a2 f32073o;
    public org.telegram.ui.web.t0 f32074p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f32061a);
        if (this.f32069k) {
            boolean z10 = this.f32070l;
            Paint paint = this.f32063c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f32064e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32062b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f32061a.setShader(this.f32062b);
        this.f32063c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f32068j || this.f32066g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f32072n) + this.f32066g;
                    this.f32066g = f7;
                    if (f7 > this.f32071m) {
                        this.f32066g = 0.0f;
                        org.telegram.ui.web.t0 t0Var = this.f32074p;
                        if (t0Var != null) {
                            t0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f32065f;
        int i11 = this.f32064e;
        float f10 = (((i11 * 2) + i10) * this.f32066g) - i11;
        Matrix matrix = this.f32067i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f32062b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f32061a = paint;
        Paint paint2 = new Paint(1);
        this.f32063c = paint2;
        this.f32067i = new Matrix();
        this.f32068j = true;
        this.f32069k = true;
        this.f32070l = false;
        this.f32071m = 1.2f;
        this.f32072n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f32064e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32062b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f32062b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
