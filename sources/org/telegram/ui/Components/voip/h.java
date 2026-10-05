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
    public final Paint f31944a;
    public LinearGradient f31945b;
    public final Paint f31946c;
    public LinearGradient d;
    public final int f31947e;
    public int f31948f;
    public float f31949g;
    public long h;
    public final Matrix f31950i;
    public boolean f31951j;
    public boolean f31952k;
    public boolean f31953l;
    public float f31954m;
    public float f31955n;
    public rg.b2 f31956o;
    public org.telegram.ui.web.u0 f31957p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31944a);
        if (this.f31952k) {
            boolean z10 = this.f31953l;
            Paint paint = this.f31946c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31947e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31945b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31944a.setShader(this.f31945b);
        this.f31946c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31951j || this.f31949g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31955n) + this.f31949g;
                    this.f31949g = f7;
                    if (f7 > this.f31954m) {
                        this.f31949g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f31957p;
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
        int i10 = this.f31948f;
        int i11 = this.f31947e;
        float f10 = (((i11 * 2) + i10) * this.f31949g) - i11;
        Matrix matrix = this.f31950i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31945b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31944a = paint;
        Paint paint2 = new Paint(1);
        this.f31946c = paint2;
        this.f31950i = new Matrix();
        this.f31951j = true;
        this.f31952k = true;
        this.f31953l = false;
        this.f31954m = 1.2f;
        this.f31955n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31947e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31945b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31945b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
