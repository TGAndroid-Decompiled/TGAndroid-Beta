package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f39314a;
    public LinearGradient f39315b;
    public final Paint f39316c;
    public LinearGradient d;
    public final int f39317e;
    public int f39318f;
    public float f39319g;
    public long h;
    public final Matrix f39320i;
    public boolean f39321j;
    public boolean f39322k;
    public boolean f39323l;
    public float f39324m;
    public float f39325n;
    public ug.t1 f39326o;
    public sg.t0 f39327p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39314a);
        if (this.f39322k) {
            boolean z9 = this.f39323l;
            Paint paint = this.f39316c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f39317e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39315b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f39314a.setShader(this.f39315b);
        this.f39316c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39321j || this.f39319g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f39325n) + this.f39319g;
                    this.f39319g = f10;
                    if (f10 > this.f39324m) {
                        this.f39319g = 0.0f;
                        sg.t0 t0Var = this.f39327p;
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
        int i7 = this.f39318f;
        int i10 = this.f39317e;
        float f11 = (((i10 * 2) + i7) * this.f39319g) - i10;
        Matrix matrix = this.f39320i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39315b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39314a = paint;
        Paint paint2 = new Paint(1);
        this.f39316c = paint2;
        this.f39320i = new Matrix();
        this.f39321j = true;
        this.f39322k = true;
        this.f39323l = false;
        this.f39324m = 1.2f;
        this.f39325n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39317e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39315b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39315b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
