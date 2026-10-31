package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class g {
    public final Paint f31433a;
    public LinearGradient f31434b;
    public final Paint f31435c;
    public LinearGradient d;
    public final int e;
    public int f31436f;
    public float f31437g;
    public long h;
    public final Matrix f31438i;
    public boolean f31439j;
    public boolean f31440k;
    public boolean f31441l;
    public float f31442m;
    public float f31443n;
    public kg.k2 f31444o;
    public gg.c f31445p;

    public g() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31433a);
        if (this.f31440k) {
            boolean z10 = this.f31441l;
            Paint paint = this.f31435c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31434b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31433a.setShader(this.f31434b);
        this.f31435c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31439j || this.f31437g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31443n) + this.f31437g;
                    this.f31437g = f7;
                    if (f7 > this.f31442m) {
                        this.f31437g = 0.0f;
                        gg.c cVar = this.f31445p;
                        if (cVar != null) {
                            cVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31436f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31437g) - i11;
        Matrix matrix = this.f31438i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31434b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public g(int i10, int i11) {
        this(i10, i11, 160);
    }

    public g(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31433a = paint;
        Paint paint2 = new Paint(1);
        this.f31435c = paint2;
        this.f31438i = new Matrix();
        this.f31439j = true;
        this.f31440k = true;
        this.f31441l = false;
        this.f31442m = 1.2f;
        this.f31443n = 1.0f;
        int L = org.telegram.messenger.i0.L(i12);
        this.e = L;
        float f7 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31434b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31434b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }
}
