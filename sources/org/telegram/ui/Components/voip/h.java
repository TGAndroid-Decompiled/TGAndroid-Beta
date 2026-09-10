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
    public final Paint f28144a;
    public LinearGradient f28145b;
    public final Paint f28146c;
    public LinearGradient d;
    public final int e;
    public int f28147f;
    public float f28148g;
    public long h;
    public final Matrix f28149i;
    public boolean f28150j;
    public boolean f28151k;
    public boolean f28152l;
    public float f28153m;
    public float f28154n;
    public qg.a2 f28155o;
    public qg.q0 f28156p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f28144a);
        if (this.f28151k) {
            boolean z10 = this.f28152l;
            Paint paint = this.f28146c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28145b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f28144a.setShader(this.f28145b);
        this.f28146c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f28150j || this.f28148g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f28154n) + this.f28148g;
                    this.f28148g = f7;
                    if (f7 > this.f28153m) {
                        this.f28148g = 0.0f;
                        qg.q0 q0Var = this.f28156p;
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
        int i10 = this.f28147f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f28148g) - i11;
        Matrix matrix = this.f28149i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f28145b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f28144a = paint;
        Paint paint2 = new Paint(1);
        this.f28146c = paint2;
        this.f28149i = new Matrix();
        this.f28150j = true;
        this.f28151k = true;
        this.f28152l = false;
        this.f28153m = 1.2f;
        this.f28154n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f28145b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f28145b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
