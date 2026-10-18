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
    public final Paint f31464a;
    public LinearGradient f31465b;
    public final Paint f31466c;
    public LinearGradient d;
    public final int e;
    public int f31467f;
    public float f31468g;
    public long h;
    public final Matrix f31469i;
    public boolean f31470j;
    public boolean f31471k;
    public boolean f31472l;
    public float f31473m;
    public float f31474n;
    public sg.a2 f31475o;
    public org.telegram.ui.web.a2 f31476p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31464a);
        if (this.f31471k) {
            boolean z10 = this.f31472l;
            Paint paint = this.f31466c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31465b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(i10, 204), 0}, (float[]) null, tileMode);
        this.f31464a.setShader(this.f31465b);
        this.f31466c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31470j || this.f31468g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f31474n) + this.f31468g;
                    this.f31468g = f7;
                    if (f7 > this.f31473m) {
                        this.f31468g = 0.0f;
                        org.telegram.ui.web.a2 a2Var = this.f31476p;
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
        int i10 = this.f31467f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f31468g) - i11;
        Matrix matrix = this.f31469i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31465b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31464a = paint;
        Paint paint2 = new Paint(1);
        this.f31466c = paint2;
        this.f31469i = new Matrix();
        this.f31470j = true;
        this.f31471k = true;
        this.f31472l = false;
        this.f31473m = 1.2f;
        this.f31474n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31465b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.o(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31465b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
