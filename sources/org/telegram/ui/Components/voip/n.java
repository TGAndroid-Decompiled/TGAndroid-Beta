package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f40791a;
    public LinearGradient f40792b;
    public final Paint f40793c;
    public LinearGradient d;
    public final int f40794e;
    public int f40795f;
    public float f40796g;
    public long h;
    public final Matrix f40797i;
    public boolean f40798j;
    public boolean f40799k;
    public boolean f40800l;
    public float f40801m;
    public float f40802n;
    public ug.w1 f40803o;
    public q2.d f40804p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f40791a);
        if (this.f40799k) {
            boolean z10 = this.f40800l;
            Paint paint = this.f40793c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f40794e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f40792b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f40791a.setShader(this.f40792b);
        this.f40793c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f40798j || this.f40796g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f40802n) + this.f40796g;
                    this.f40796g = f10;
                    if (f10 > this.f40801m) {
                        this.f40796g = 0.0f;
                        q2.d dVar = this.f40804p;
                        if (dVar != null) {
                            dVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i7 = this.f40795f;
        int i10 = this.f40794e;
        float f11 = (((i10 * 2) + i7) * this.f40796g) - i10;
        Matrix matrix = this.f40797i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f40792b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f40791a = paint;
        Paint paint2 = new Paint(1);
        this.f40793c = paint2;
        this.f40797i = new Matrix();
        this.f40798j = true;
        this.f40799k = true;
        this.f40800l = false;
        this.f40801m = 1.2f;
        this.f40802n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f40794e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f40792b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f40792b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
