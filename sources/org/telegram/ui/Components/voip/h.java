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
    public final Paint f33922a;
    public LinearGradient f33923b;
    public final Paint f33924c;
    public LinearGradient d;
    public final int e;
    public int f33925f;
    public float f33926g;
    public long h;
    public final Matrix f33927i;
    public boolean f33928j;
    public boolean f33929k;
    public boolean f33930l;
    public float f33931m;
    public float f33932n;
    public tg.a2 f33933o;
    public org.telegram.ui.web.h1 f33934p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f33922a);
        if (this.f33929k) {
            boolean z10 = this.f33930l;
            Paint paint = this.f33924c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33923b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f33922a.setShader(this.f33923b);
        this.f33924c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f33928j || this.f33926g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f33932n) + this.f33926g;
                    this.f33926g = f7;
                    if (f7 > this.f33931m) {
                        this.f33926g = 0.0f;
                        org.telegram.ui.web.h1 h1Var = this.f33934p;
                        if (h1Var != null) {
                            h1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f33925f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f33926g) - i11;
        Matrix matrix = this.f33927i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f33923b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f33922a = paint;
        Paint paint2 = new Paint(1);
        this.f33924c = paint2;
        this.f33927i = new Matrix();
        this.f33928j = true;
        this.f33929k = true;
        this.f33930l = false;
        this.f33931m = 1.2f;
        this.f33932n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33923b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f33923b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
