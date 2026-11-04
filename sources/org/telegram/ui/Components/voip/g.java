package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class g {
    public final Paint f39345a;
    public LinearGradient f39346b;
    public final Paint f39347c;
    public LinearGradient d;
    public final int f39348e;
    public int f39349f;
    public float f39350g;
    public long h;
    public final Matrix f39351i;
    public boolean f39352j;
    public boolean f39353k;
    public boolean f39354l;
    public float f39355m;
    public float f39356n;
    public vg.w1 f39357o;
    public r4.u f39358p;

    public g() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f39345a);
        if (this.f39353k) {
            boolean z10 = this.f39354l;
            Paint paint = this.f39347c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i3, int i10) {
        float f10 = this.f39348e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39346b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i3, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(i3, 204), 0}, (float[]) null, tileMode);
        this.f39345a.setShader(this.f39346b);
        this.f39347c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f39352j || this.f39350g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((((float) j11) / 1200.0f) * this.f39356n) + this.f39350g;
                    this.f39350g = f10;
                    if (f10 > this.f39355m) {
                        this.f39350g = 0.0f;
                        r4.u uVar = this.f39358p;
                        if (uVar != null) {
                            uVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i3 = this.f39349f;
        int i10 = this.f39348e;
        float f11 = (((i10 * 2) + i3) * this.f39350g) - i10;
        Matrix matrix = this.f39351i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f39346b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public g(int i3, int i10) {
        this(i3, i10, 160);
    }

    public g(int i3, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39345a = paint;
        Paint paint2 = new Paint(1);
        this.f39347c = paint2;
        this.f39351i = new Matrix();
        this.f39352j = true;
        this.f39353k = true;
        this.f39354l = false;
        this.f39355m = 1.2f;
        this.f39356n = 1.0f;
        int L = org.telegram.messenger.g0.L(i11);
        this.f39348e = L;
        float f10 = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f39346b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i3), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        paint.setShader(this.f39346b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
