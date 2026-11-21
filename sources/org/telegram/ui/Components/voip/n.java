package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f41181a;
    public LinearGradient f41182b;
    public final Paint f41183c;
    public LinearGradient d;
    public final int f41184e;
    public int f41185f;
    public float f41186g;
    public long h;
    public final Matrix f41187i;
    public boolean f41188j;
    public boolean f41189k;
    public boolean f41190l;
    public float f41191m;
    public float f41192n;
    public ug.w1 f41193o;
    public org.telegram.ui.web.z0 f41194p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f41181a);
        if (this.f41189k) {
            boolean z10 = this.f41190l;
            Paint paint = this.f41183c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f41184e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41182b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f41181a.setShader(this.f41182b);
        this.f41183c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f41188j || this.f41186g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f41192n) + this.f41186g;
                    this.f41186g = f10;
                    if (f10 > this.f41191m) {
                        this.f41186g = 0.0f;
                        org.telegram.ui.web.z0 z0Var = this.f41194p;
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
        int i7 = this.f41185f;
        int i10 = this.f41184e;
        float f11 = (((i10 * 2) + i7) * this.f41186g) - i10;
        Matrix matrix = this.f41187i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f41182b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f41181a = paint;
        Paint paint2 = new Paint(1);
        this.f41183c = paint2;
        this.f41187i = new Matrix();
        this.f41188j = true;
        this.f41189k = true;
        this.f41190l = false;
        this.f41191m = 1.2f;
        this.f41192n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f41184e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41182b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f41182b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
