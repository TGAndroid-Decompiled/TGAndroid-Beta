package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f39379a;
    public LinearGradient f39380b;
    public final Paint f39381c;
    public LinearGradient d;
    public final int f39382e;
    public int f39383f;
    public float f39384g;
    public long h;
    public final Matrix f39385i;
    public boolean f39386j;
    public boolean f39387k;
    public boolean f39388l;
    public float f39389m;
    public float f39390n;
    public ug.t1 f39391o;
    public sh.b f39392p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39379a);
        if (this.f39387k) {
            boolean z9 = this.f39388l;
            Paint paint = this.f39381c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f39382e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39380b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f39379a.setShader(this.f39380b);
        this.f39381c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39386j || this.f39384g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f39390n) + this.f39384g;
                    this.f39384g = f10;
                    if (f10 > this.f39389m) {
                        this.f39384g = 0.0f;
                        sh.b bVar = this.f39392p;
                        if (bVar != null) {
                            bVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i7 = this.f39383f;
        int i10 = this.f39382e;
        float f11 = (((i10 * 2) + i7) * this.f39384g) - i10;
        Matrix matrix = this.f39385i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39380b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39379a = paint;
        Paint paint2 = new Paint(1);
        this.f39381c = paint2;
        this.f39385i = new Matrix();
        this.f39386j = true;
        this.f39387k = true;
        this.f39388l = false;
        this.f39389m = 1.2f;
        this.f39390n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39382e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39380b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39380b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
