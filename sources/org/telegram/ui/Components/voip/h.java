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
    public final Paint f31428a;
    public LinearGradient f31429b;
    public final Paint f31430c;
    public LinearGradient d;
    public final int e;
    public int f31431f;
    public float f31432g;
    public long h;
    public final Matrix f31433i;
    public boolean f31434j;
    public boolean f31435k;
    public boolean f31436l;
    public float f31437m;
    public float f31438n;
    public sg.a2 f31439o;
    public org.telegram.ui.web.z1 f31440p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31428a);
        if (this.f31435k) {
            boolean z10 = this.f31436l;
            Paint paint = this.f31430c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31429b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31428a.setShader(this.f31429b);
        this.f31430c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31434j || this.f31432g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31438n) + this.f31432g;
                    this.f31432g = f7;
                    if (f7 > this.f31437m) {
                        this.f31432g = 0.0f;
                        org.telegram.ui.web.z1 z1Var = this.f31440p;
                        if (z1Var != null) {
                            z1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31431f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31432g) - i11;
        Matrix matrix = this.f31433i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31429b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31428a = paint;
        Paint paint2 = new Paint(1);
        this.f31430c = paint2;
        this.f31433i = new Matrix();
        this.f31434j = true;
        this.f31435k = true;
        this.f31436l = false;
        this.f31437m = 1.2f;
        this.f31438n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31429b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31429b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
