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
    public final Paint f29327a;
    public LinearGradient f29328b;
    public final Paint f29329c;
    public LinearGradient d;
    public final int e;
    public int f29330f;
    public float f29331g;
    public long h;
    public final Matrix f29332i;
    public boolean f29333j;
    public boolean f29334k;
    public boolean f29335l;
    public float f29336m;
    public float f29337n;
    public rg.z1 f29338o;
    public org.telegram.ui.web.r0 f29339p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29327a);
        if (this.f29334k) {
            boolean z10 = this.f29335l;
            Paint paint = this.f29329c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29328b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29327a.setShader(this.f29328b);
        this.f29329c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29333j || this.f29331g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f29337n) + this.f29331g;
                    this.f29331g = f7;
                    if (f7 > this.f29336m) {
                        this.f29331g = 0.0f;
                        org.telegram.ui.web.r0 r0Var = this.f29339p;
                        if (r0Var != null) {
                            r0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29330f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29331g) - i11;
        Matrix matrix = this.f29332i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29328b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29327a = paint;
        Paint paint2 = new Paint(1);
        this.f29329c = paint2;
        this.f29332i = new Matrix();
        this.f29333j = true;
        this.f29334k = true;
        this.f29335l = false;
        this.f29336m = 1.2f;
        this.f29337n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29328b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29328b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
