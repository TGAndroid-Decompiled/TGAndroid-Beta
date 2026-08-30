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
    public final Paint f29653a;
    public LinearGradient f29654b;
    public final Paint f29655c;
    public LinearGradient d;
    public final int e;
    public int f29656f;
    public float f29657g;
    public long h;
    public final Matrix f29658i;
    public boolean f29659j;
    public boolean f29660k;
    public boolean f29661l;
    public float f29662m;
    public float f29663n;
    public eg.u2 f29664o;
    public ef.e f29665p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f29653a);
        if (this.f29660k) {
            boolean z4 = this.f29661l;
            Paint paint = this.f29655c;
            if (z4) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f10 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29654b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29653a.setShader(this.f29654b);
        this.f29655c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29659j || this.f29657g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((((float) j11) / 1200.0f) * this.f29663n) + this.f29657g;
                    this.f29657g = f10;
                    if (f10 > this.f29662m) {
                        this.f29657g = 0.0f;
                        ef.e eVar = this.f29665p;
                        if (eVar != null) {
                            eVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29656f;
        int i11 = this.e;
        float f11 = (((i11 * 2) + i10) * this.f29657g) - i11;
        Matrix matrix = this.f29658i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f29654b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29653a = paint;
        Paint paint2 = new Paint(1);
        this.f29655c = paint2;
        this.f29658i = new Matrix();
        this.f29659j = true;
        this.f29660k = true;
        this.f29661l = false;
        this.f29662m = 1.2f;
        this.f29663n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f10 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29654b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29654b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
