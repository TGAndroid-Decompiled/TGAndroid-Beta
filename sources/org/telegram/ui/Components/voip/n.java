package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f41046a;
    public LinearGradient f41047b;
    public final Paint f41048c;
    public LinearGradient d;
    public final int f41049e;
    public int f41050f;
    public float f41051g;
    public long h;
    public final Matrix f41052i;
    public boolean f41053j;
    public boolean f41054k;
    public boolean f41055l;
    public float f41056m;
    public float f41057n;
    public ug.x1 f41058o;
    public org.telegram.ui.web.z0 f41059p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f41046a);
        if (this.f41054k) {
            boolean z10 = this.f41055l;
            Paint paint = this.f41048c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f41049e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41047b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f41046a.setShader(this.f41047b);
        this.f41048c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f41053j || this.f41051g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f41057n) + this.f41051g;
                    this.f41051g = f10;
                    if (f10 > this.f41056m) {
                        this.f41051g = 0.0f;
                        org.telegram.ui.web.z0 z0Var = this.f41059p;
                        if (z0Var != null) {
                            z0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i7 = this.f41050f;
        int i10 = this.f41049e;
        float f11 = (((i10 * 2) + i7) * this.f41051g) - i10;
        Matrix matrix = this.f41052i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f41047b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f41046a = paint;
        Paint paint2 = new Paint(1);
        this.f41048c = paint2;
        this.f41052i = new Matrix();
        this.f41053j = true;
        this.f41054k = true;
        this.f41055l = false;
        this.f41056m = 1.2f;
        this.f41057n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f41049e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41047b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f41047b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
