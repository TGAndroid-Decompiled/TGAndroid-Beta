package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class n {
    public final Paint f41144a;
    public LinearGradient f41145b;
    public final Paint f41146c;
    public LinearGradient d;
    public final int f41147e;
    public int f41148f;
    public float f41149g;
    public long h;
    public final Matrix f41150i;
    public boolean f41151j;
    public boolean f41152k;
    public boolean f41153l;
    public float f41154m;
    public float f41155n;
    public ug.w1 f41156o;
    public org.telegram.ui.web.i1 f41157p;

    public n() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f41144a);
        if (this.f41152k) {
            boolean z10 = this.f41153l;
            Paint paint = this.f41146c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i7, int i10) {
        float f10 = this.f41147e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41145b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i7, 204), 0}, (float[]) null, tileMode);
        this.f41144a.setShader(this.f41145b);
        this.f41146c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f41151j || this.f41149g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f10 = ((((float) j10) / 1200.0f) * this.f41155n) + this.f41149g;
                    this.f41149g = f10;
                    if (f10 > this.f41154m) {
                        this.f41149g = 0.0f;
                        org.telegram.ui.web.i1 i1Var = this.f41157p;
                        if (i1Var != null) {
                            i1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i7 = this.f41148f;
        int i10 = this.f41147e;
        float f11 = (((i10 * 2) + i7) * this.f41149g) - i10;
        Matrix matrix = this.f41150i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f41145b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public n(int i7, int i10) {
        this(i7, i10, 160);
    }

    public n(int i7, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f41144a = paint;
        Paint paint2 = new Paint(1);
        this.f41146c = paint2;
        this.f41150i = new Matrix();
        this.f41151j = true;
        this.f41152k = true;
        this.f41153l = false;
        this.f41154m = 1.2f;
        this.f41155n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f41147e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f41145b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i7), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f41145b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
