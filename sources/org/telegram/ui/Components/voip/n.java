package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f39317a;
    public LinearGradient f39318b;
    public final Paint f39319c;
    public LinearGradient d;
    public final int f39320e;
    public int f39321f;
    public float f39322g;
    public long h;
    public final Matrix f39323i;
    public boolean f39324j;
    public boolean f39325k;
    public boolean f39326l;
    public float f39327m;
    public float f39328n;
    public ug.t1 f39329o;
    public sg.t0 f39330p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39317a);
        if (this.f39325k) {
            boolean z9 = this.f39326l;
            Paint paint = this.f39319c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f39320e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39318b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f39317a.setShader(this.f39318b);
        this.f39319c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39324j || this.f39322g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f39328n) + this.f39322g;
                    this.f39322g = f10;
                    if (f10 > this.f39327m) {
                        this.f39322g = 0.0f;
                        sg.t0 t0Var = this.f39330p;
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
        int i7 = this.f39321f;
        int i10 = this.f39320e;
        float f11 = (((i10 * 2) + i7) * this.f39322g) - i10;
        Matrix matrix = this.f39323i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39318b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39317a = paint;
        Paint paint2 = new Paint(1);
        this.f39319c = paint2;
        this.f39323i = new Matrix();
        this.f39324j = true;
        this.f39325k = true;
        this.f39326l = false;
        this.f39327m = 1.2f;
        this.f39328n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39320e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39318b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39318b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
