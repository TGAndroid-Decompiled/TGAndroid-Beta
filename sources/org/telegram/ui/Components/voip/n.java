package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f39459a;
    public LinearGradient f39460b;
    public final Paint f39461c;
    public LinearGradient d;
    public final int f39462e;
    public int f39463f;
    public float f39464g;
    public long h;
    public final Matrix f39465i;
    public boolean f39466j;
    public boolean f39467k;
    public boolean f39468l;
    public float f39469m;
    public float f39470n;
    public ug.t1 f39471o;
    public sh.b f39472p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39459a);
        if (this.f39467k) {
            boolean z9 = this.f39468l;
            Paint paint = this.f39461c;
            if (z9) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f39462e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39460b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f39459a.setShader(this.f39460b);
        this.f39461c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39466j || this.f39464g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f39470n) + this.f39464g;
                    this.f39464g = f10;
                    if (f10 > this.f39469m) {
                        this.f39464g = 0.0f;
                        sh.b bVar = this.f39472p;
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
        int i7 = this.f39463f;
        int i10 = this.f39462e;
        float f11 = (((i10 * 2) + i7) * this.f39464g) - i10;
        Matrix matrix = this.f39465i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39460b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39459a = paint;
        Paint paint2 = new Paint(1);
        this.f39461c = paint2;
        this.f39465i = new Matrix();
        this.f39466j = true;
        this.f39467k = true;
        this.f39468l = false;
        this.f39469m = 1.2f;
        this.f39470n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39462e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39460b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39460b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
