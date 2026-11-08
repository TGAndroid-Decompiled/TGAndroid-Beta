package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f39370a;
    public LinearGradient f39371b;
    public final Paint f39372c;
    public LinearGradient d;
    public final int f39373e;
    public int f39374f;
    public float f39375g;
    public long h;
    public final Matrix f39376i;
    public boolean f39377j;
    public boolean f39378k;
    public boolean f39379l;
    public float f39380m;
    public float f39381n;
    public ug.t1 f39382o;
    public sg.t0 f39383p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39370a);
        if (this.f39378k) {
            boolean z9 = this.f39379l;
            Paint paint = this.f39372c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f39373e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39371b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f39370a.setShader(this.f39371b);
        this.f39372c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39377j || this.f39375g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f39381n) + this.f39375g;
                    this.f39375g = f10;
                    if (f10 > this.f39380m) {
                        this.f39375g = 0.0f;
                        sg.t0 t0Var = this.f39383p;
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
        int i7 = this.f39374f;
        int i10 = this.f39373e;
        float f11 = (((i10 * 2) + i7) * this.f39375g) - i10;
        Matrix matrix = this.f39376i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39371b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39370a = paint;
        Paint paint2 = new Paint(1);
        this.f39372c = paint2;
        this.f39376i = new Matrix();
        this.f39377j = true;
        this.f39378k = true;
        this.f39379l = false;
        this.f39380m = 1.2f;
        this.f39381n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39373e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39371b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39371b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
