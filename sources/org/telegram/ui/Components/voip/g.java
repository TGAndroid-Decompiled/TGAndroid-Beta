package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class g {
    public final Paint f31491a;
    public LinearGradient f31492b;
    public final Paint f31493c;
    public LinearGradient d;
    public final int e;
    public int f31494f;
    public float f31495g;
    public long h;
    public final Matrix f31496i;
    public boolean f31497j;
    public boolean f31498k;
    public boolean f31499l;
    public float f31500m;
    public float f31501n;
    public kg.k2 f31502o;
    public gg.c f31503p;

    public g() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31491a);
        if (this.f31498k) {
            boolean z10 = this.f31499l;
            Paint paint = this.f31493c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31492b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31491a.setShader(this.f31492b);
        this.f31493c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31497j || this.f31495g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31501n) + this.f31495g;
                    this.f31495g = f7;
                    if (f7 > this.f31500m) {
                        this.f31495g = 0.0f;
                        gg.c cVar = this.f31503p;
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
        int i10 = this.f31494f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31495g) - i11;
        Matrix matrix = this.f31496i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31492b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public g(int i10, int i11) {
        this(i10, i11, 160);
    }

    public g(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31491a = paint;
        Paint paint2 = new Paint(1);
        this.f31493c = paint2;
        this.f31496i = new Matrix();
        this.f31497j = true;
        this.f31498k = true;
        this.f31499l = false;
        this.f31500m = 1.2f;
        this.f31501n = 1.0f;
        int L = org.telegram.messenger.i0.L(i12);
        this.e = L;
        float f7 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31492b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.b.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31492b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }
}
