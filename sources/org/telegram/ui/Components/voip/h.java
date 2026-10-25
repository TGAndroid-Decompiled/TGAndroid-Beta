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
    public final Paint f33814a;
    public LinearGradient f33815b;
    public final Paint f33816c;
    public LinearGradient d;
    public final int e;
    public int f33817f;
    public float f33818g;
    public long h;
    public final Matrix f33819i;
    public boolean f33820j;
    public boolean f33821k;
    public boolean f33822l;
    public float f33823m;
    public float f33824n;
    public tg.a2 f33825o;
    public org.telegram.ui.web.h1 f33826p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f33814a);
        if (this.f33821k) {
            boolean z10 = this.f33822l;
            Paint paint = this.f33816c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33815b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f33814a.setShader(this.f33815b);
        this.f33816c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f33820j || this.f33818g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f33824n) + this.f33818g;
                    this.f33818g = f7;
                    if (f7 > this.f33823m) {
                        this.f33818g = 0.0f;
                        org.telegram.ui.web.h1 h1Var = this.f33826p;
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
        int i10 = this.f33817f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f33818g) - i11;
        Matrix matrix = this.f33819i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f33815b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f33814a = paint;
        Paint paint2 = new Paint(1);
        this.f33816c = paint2;
        this.f33819i = new Matrix();
        this.f33820j = true;
        this.f33821k = true;
        this.f33822l = false;
        this.f33823m = 1.2f;
        this.f33824n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33815b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f33815b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
