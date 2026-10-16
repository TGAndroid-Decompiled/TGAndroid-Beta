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
    public final Paint f29862a;
    public LinearGradient f29863b;
    public final Paint f29864c;
    public LinearGradient d;
    public final int e;
    public int f29865f;
    public float f29866g;
    public long h;
    public final Matrix f29867i;
    public boolean f29868j;
    public boolean f29869k;
    public boolean f29870l;
    public float f29871m;
    public float f29872n;
    public sg.a2 f29873o;
    public ri.h0 f29874p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29862a);
        if (this.f29869k) {
            boolean z10 = this.f29870l;
            Paint paint = this.f29864c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29863b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29862a.setShader(this.f29863b);
        this.f29864c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29868j || this.f29866g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f29872n) + this.f29866g;
                    this.f29866g = f7;
                    if (f7 > this.f29871m) {
                        this.f29866g = 0.0f;
                        ri.h0 h0Var = this.f29874p;
                        if (h0Var != null) {
                            h0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29865f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29866g) - i11;
        Matrix matrix = this.f29867i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29863b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29862a = paint;
        Paint paint2 = new Paint(1);
        this.f29864c = paint2;
        this.f29867i = new Matrix();
        this.f29868j = true;
        this.f29869k = true;
        this.f29870l = false;
        this.f29871m = 1.2f;
        this.f29872n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29863b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29863b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
