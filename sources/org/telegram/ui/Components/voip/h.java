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
    public final Paint f31527a;
    public LinearGradient f31528b;
    public final Paint f31529c;
    public LinearGradient d;
    public final int f31530e;
    public int f31531f;
    public float f31532g;
    public long h;
    public final Matrix f31533i;
    public boolean f31534j;
    public boolean f31535k;
    public boolean f31536l;
    public float f31537m;
    public float f31538n;
    public sg.c2 f31539o;
    public sg.p0 f31540p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31527a);
        if (this.f31535k) {
            boolean z10 = this.f31536l;
            Paint paint = this.f31529c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31530e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31528b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31527a.setShader(this.f31528b);
        this.f31529c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31534j || this.f31532g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31538n) + this.f31532g;
                    this.f31532g = f7;
                    if (f7 > this.f31537m) {
                        this.f31532g = 0.0f;
                        sg.p0 p0Var = this.f31540p;
                        if (p0Var != null) {
                            p0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f31531f;
        int i11 = this.f31530e;
        float f10 = (((i11 * 2) + i10) * this.f31532g) - i11;
        Matrix matrix = this.f31533i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31528b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31527a = paint;
        Paint paint2 = new Paint(1);
        this.f31529c = paint2;
        this.f31533i = new Matrix();
        this.f31534j = true;
        this.f31535k = true;
        this.f31536l = false;
        this.f31537m = 1.2f;
        this.f31538n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31530e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31528b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31528b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
