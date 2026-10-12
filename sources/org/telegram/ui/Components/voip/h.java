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
    public final Paint f31683a;
    public LinearGradient f31684b;
    public final Paint f31685c;
    public LinearGradient d;
    public final int f31686e;
    public int f31687f;
    public float f31688g;
    public long h;
    public final Matrix f31689i;
    public boolean f31690j;
    public boolean f31691k;
    public boolean f31692l;
    public float f31693m;
    public float f31694n;
    public rg.a2 f31695o;
    public org.telegram.ui.web.t0 f31696p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31683a);
        if (this.f31691k) {
            boolean z10 = this.f31692l;
            Paint paint = this.f31685c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31686e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31684b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31683a.setShader(this.f31684b);
        this.f31685c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31690j || this.f31688g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31694n) + this.f31688g;
                    this.f31688g = f7;
                    if (f7 > this.f31693m) {
                        this.f31688g = 0.0f;
                        org.telegram.ui.web.t0 t0Var = this.f31696p;
                        if (t0Var != null) {
                            t0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31687f;
        int i11 = this.f31686e;
        float f10 = (((i11 * 2) + i10) * this.f31688g) - i11;
        Matrix matrix = this.f31689i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31684b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31683a = paint;
        Paint paint2 = new Paint(1);
        this.f31685c = paint2;
        this.f31689i = new Matrix();
        this.f31690j = true;
        this.f31691k = true;
        this.f31692l = false;
        this.f31693m = 1.2f;
        this.f31694n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31686e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31684b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31684b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
