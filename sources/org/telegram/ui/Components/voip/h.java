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
    public final Paint f31997a;
    public LinearGradient f31998b;
    public final Paint f31999c;
    public LinearGradient d;
    public final int f32000e;
    public int f32001f;
    public float f32002g;
    public long h;
    public final Matrix f32003i;
    public boolean f32004j;
    public boolean f32005k;
    public boolean f32006l;
    public float f32007m;
    public float f32008n;
    public rg.a2 f32009o;
    public org.telegram.ui.web.t0 f32010p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31997a);
        if (this.f32005k) {
            boolean z10 = this.f32006l;
            Paint paint = this.f31999c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f32000e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31998b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31997a.setShader(this.f31998b);
        this.f31999c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f32004j || this.f32002g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f32008n) + this.f32002g;
                    this.f32002g = f7;
                    if (f7 > this.f32007m) {
                        this.f32002g = 0.0f;
                        org.telegram.ui.web.t0 t0Var = this.f32010p;
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
        int i10 = this.f32001f;
        int i11 = this.f32000e;
        float f10 = (((i11 * 2) + i10) * this.f32002g) - i11;
        Matrix matrix = this.f32003i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31998b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31997a = paint;
        Paint paint2 = new Paint(1);
        this.f31999c = paint2;
        this.f32003i = new Matrix();
        this.f32004j = true;
        this.f32005k = true;
        this.f32006l = false;
        this.f32007m = 1.2f;
        this.f32008n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f32000e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31998b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31998b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
