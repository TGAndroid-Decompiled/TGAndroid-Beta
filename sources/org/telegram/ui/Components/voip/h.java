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
    public final Paint f31471a;
    public LinearGradient f31472b;
    public final Paint f31473c;
    public LinearGradient d;
    public final int e;
    public int f31474f;
    public float f31475g;
    public long h;
    public final Matrix f31476i;
    public boolean f31477j;
    public boolean f31478k;
    public boolean f31479l;
    public float f31480m;
    public float f31481n;
    public sg.z1 f31482o;
    public org.telegram.ui.web.z1 f31483p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31471a);
        if (this.f31478k) {
            boolean z10 = this.f31479l;
            Paint paint = this.f31473c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31472b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31471a.setShader(this.f31472b);
        this.f31473c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31477j || this.f31475g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31481n) + this.f31475g;
                    this.f31475g = f7;
                    if (f7 > this.f31480m) {
                        this.f31475g = 0.0f;
                        org.telegram.ui.web.z1 z1Var = this.f31483p;
                        if (z1Var != null) {
                            z1Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31474f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31475g) - i11;
        Matrix matrix = this.f31476i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31472b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31471a = paint;
        Paint paint2 = new Paint(1);
        this.f31473c = paint2;
        this.f31476i = new Matrix();
        this.f31477j = true;
        this.f31478k = true;
        this.f31479l = false;
        this.f31480m = 1.2f;
        this.f31481n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31472b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31472b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
