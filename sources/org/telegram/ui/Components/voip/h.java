package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h {
    public final Paint f31610a;
    public LinearGradient f31611b;
    public final Paint f31612c;
    public LinearGradient d;
    public final int e;
    public int f31613f;
    public float f31614g;
    public long h;
    public final Matrix f31615i;
    public boolean f31616j;
    public boolean f31617k;
    public boolean f31618l;
    public float f31619m;
    public float f31620n;
    public sg.a2 f31621o;
    public org.telegram.ui.web.a2 f31622p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31610a);
        if (this.f31617k) {
            boolean z10 = this.f31618l;
            Paint paint = this.f31612c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31611b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31610a.setShader(this.f31611b);
        this.f31612c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31616j || this.f31614g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31620n) + this.f31614g;
                    this.f31614g = f7;
                    if (f7 > this.f31619m) {
                        this.f31614g = 0.0f;
                        org.telegram.ui.web.a2 a2Var = this.f31622p;
                        if (a2Var != null) {
                            a2Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31613f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31614g) - i11;
        Matrix matrix = this.f31615i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31611b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31610a = paint;
        Paint paint2 = new Paint(1);
        this.f31612c = paint2;
        this.f31615i = new Matrix();
        this.f31616j = true;
        this.f31617k = true;
        this.f31618l = false;
        this.f31619m = 1.2f;
        this.f31620n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31611b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31611b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
