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
    public final Paint f33537a;
    public LinearGradient f33538b;
    public final Paint f33539c;
    public LinearGradient d;
    public final int f33540e;
    public int f33541f;
    public float f33542g;
    public long h;
    public final Matrix f33543i;
    public boolean f33544j;
    public boolean f33545k;
    public boolean f33546l;
    public float f33547m;
    public float f33548n;
    public zf.z1 f33549o;
    public pf.o1 f33550p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f33537a);
        if (this.f33545k) {
            boolean z10 = this.f33546l;
            Paint paint = this.f33539c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i9, int i10) {
        float f10 = this.f33540e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33538b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i9, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i9, 204), 0}, (float[]) null, tileMode);
        this.f33537a.setShader(this.f33538b);
        this.f33539c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f33544j || this.f33542g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((((float) j11) / 1200.0f) * this.f33548n) + this.f33542g;
                    this.f33542g = f10;
                    if (f10 > this.f33547m) {
                        this.f33542g = 0.0f;
                        pf.o1 o1Var = this.f33550p;
                        if (o1Var != null) {
                            o1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i9 = this.f33541f;
        int i10 = this.f33540e;
        float f11 = (((i10 * 2) + i9) * this.f33542g) - i10;
        Matrix matrix = this.f33543i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f33538b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i9, int i10) {
        this(i9, i10, 160);
    }

    public h(int i9, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f33537a = paint;
        Paint paint2 = new Paint(1);
        this.f33539c = paint2;
        this.f33543i = new Matrix();
        this.f33544j = true;
        this.f33545k = true;
        this.f33546l = false;
        this.f33547m = 1.2f;
        this.f33548n = 1.0f;
        int dp = AndroidUtilities.dp(i11);
        this.f33540e = dp;
        float f10 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33538b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i9), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f33538b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
