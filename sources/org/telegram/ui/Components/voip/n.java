package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f41183a;
    public LinearGradient f41184b;
    public final Paint f41185c;
    public LinearGradient d;
    public final int f41186e;
    public int f41187f;
    public float f41188g;
    public long h;
    public final Matrix f41189i;
    public boolean f41190j;
    public boolean f41191k;
    public boolean f41192l;
    public float f41193m;
    public float f41194n;
    public ug.w1 f41195o;
    public org.telegram.ui.web.z0 f41196p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f41183a);
        if (this.f41191k) {
            boolean z10 = this.f41192l;
            Paint paint = this.f41185c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f41186e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41184b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f41183a.setShader(this.f41184b);
        this.f41185c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f41190j || this.f41188g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f41194n) + this.f41188g;
                    this.f41188g = f10;
                    if (f10 > this.f41193m) {
                        this.f41188g = 0.0f;
                        org.telegram.ui.web.z0 z0Var = this.f41196p;
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
        int i7 = this.f41187f;
        int i10 = this.f41186e;
        float f11 = (((i10 * 2) + i7) * this.f41188g) - i10;
        Matrix matrix = this.f41189i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f41184b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f41183a = paint;
        Paint paint2 = new Paint(1);
        this.f41185c = paint2;
        this.f41189i = new Matrix();
        this.f41190j = true;
        this.f41191k = true;
        this.f41192l = false;
        this.f41193m = 1.2f;
        this.f41194n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f41186e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41184b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f41184b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
