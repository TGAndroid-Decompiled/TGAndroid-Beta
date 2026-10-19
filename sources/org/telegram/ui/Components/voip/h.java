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
    public final Paint f31473a;
    public LinearGradient f31474b;
    public final Paint f31475c;
    public LinearGradient d;
    public final int e;
    public int f31476f;
    public float f31477g;
    public long h;
    public final Matrix f31478i;
    public boolean f31479j;
    public boolean f31480k;
    public boolean f31481l;
    public float f31482m;
    public float f31483n;
    public sg.a2 f31484o;
    public org.telegram.ui.web.z1 f31485p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31473a);
        if (this.f31480k) {
            boolean z10 = this.f31481l;
            Paint paint = this.f31475c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31474b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31473a.setShader(this.f31474b);
        this.f31475c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31479j || this.f31477g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31483n) + this.f31477g;
                    this.f31477g = f7;
                    if (f7 > this.f31482m) {
                        this.f31477g = 0.0f;
                        org.telegram.ui.web.z1 z1Var = this.f31485p;
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
        int i10 = this.f31476f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31477g) - i11;
        Matrix matrix = this.f31478i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31474b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31473a = paint;
        Paint paint2 = new Paint(1);
        this.f31475c = paint2;
        this.f31478i = new Matrix();
        this.f31479j = true;
        this.f31480k = true;
        this.f31481l = false;
        this.f31482m = 1.2f;
        this.f31483n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31474b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31474b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
