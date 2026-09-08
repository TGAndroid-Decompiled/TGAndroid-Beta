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
    public final Paint f31526a;
    public LinearGradient f31527b;
    public final Paint f31528c;
    public LinearGradient d;
    public final int f31529e;
    public int f31530f;
    public float f31531g;
    public long h;
    public final Matrix f31532i;
    public boolean f31533j;
    public boolean f31534k;
    public boolean f31535l;
    public float f31536m;
    public float f31537n;
    public sg.c2 f31538o;
    public sg.p0 f31539p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31526a);
        if (this.f31534k) {
            boolean z10 = this.f31535l;
            Paint paint = this.f31528c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31529e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31527b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31526a.setShader(this.f31527b);
        this.f31528c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31533j || this.f31531g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31537n) + this.f31531g;
                    this.f31531g = f7;
                    if (f7 > this.f31536m) {
                        this.f31531g = 0.0f;
                        sg.p0 p0Var = this.f31539p;
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
        int i10 = this.f31530f;
        int i11 = this.f31529e;
        float f10 = (((i11 * 2) + i10) * this.f31531g) - i11;
        Matrix matrix = this.f31532i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31527b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31526a = paint;
        Paint paint2 = new Paint(1);
        this.f31528c = paint2;
        this.f31532i = new Matrix();
        this.f31533j = true;
        this.f31534k = true;
        this.f31535l = false;
        this.f31536m = 1.2f;
        this.f31537n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31529e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31527b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31527b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
