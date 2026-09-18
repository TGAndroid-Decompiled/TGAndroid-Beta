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
    public final Paint f29258a;
    public LinearGradient f29259b;
    public final Paint f29260c;
    public LinearGradient d;
    public final int e;
    public int f29261f;
    public float f29262g;
    public long h;
    public final Matrix f29263i;
    public boolean f29264j;
    public boolean f29265k;
    public boolean f29266l;
    public float f29267m;
    public float f29268n;
    public rg.z1 f29269o;
    public org.telegram.ui.web.u0 f29270p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29258a);
        if (this.f29265k) {
            boolean z10 = this.f29266l;
            Paint paint = this.f29260c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29259b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29258a.setShader(this.f29259b);
        this.f29260c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29264j || this.f29262g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f29268n) + this.f29262g;
                    this.f29262g = f7;
                    if (f7 > this.f29267m) {
                        this.f29262g = 0.0f;
                        org.telegram.ui.web.u0 u0Var = this.f29270p;
                        if (u0Var != null) {
                            u0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29261f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29262g) - i11;
        Matrix matrix = this.f29263i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29259b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29258a = paint;
        Paint paint2 = new Paint(1);
        this.f29260c = paint2;
        this.f29263i = new Matrix();
        this.f29264j = true;
        this.f29265k = true;
        this.f29266l = false;
        this.f29267m = 1.2f;
        this.f29268n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29259b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29259b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
