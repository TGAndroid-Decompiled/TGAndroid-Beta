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
    public final Paint f31870a;
    public LinearGradient f31871b;
    public final Paint f31872c;
    public LinearGradient d;
    public final int f31873e;
    public int f31874f;
    public float f31875g;
    public long h;
    public final Matrix f31876i;
    public boolean f31877j;
    public boolean f31878k;
    public boolean f31879l;
    public float f31880m;
    public float f31881n;
    public rg.b2 f31882o;
    public org.telegram.ui.web.u0 f31883p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31870a);
        if (this.f31878k) {
            boolean z10 = this.f31879l;
            Paint paint = this.f31872c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31873e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31871b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31870a.setShader(this.f31871b);
        this.f31872c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31877j || this.f31875g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31881n) + this.f31875g;
                    this.f31875g = f7;
                    if (f7 > this.f31880m) {
                        this.f31875g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f31883p;
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
        int i10 = this.f31874f;
        int i11 = this.f31873e;
        float f10 = (((i11 * 2) + i10) * this.f31875g) - i11;
        Matrix matrix = this.f31876i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31871b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31870a = paint;
        Paint paint2 = new Paint(1);
        this.f31872c = paint2;
        this.f31876i = new Matrix();
        this.f31877j = true;
        this.f31878k = true;
        this.f31879l = false;
        this.f31880m = 1.2f;
        this.f31881n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31873e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31871b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31871b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
