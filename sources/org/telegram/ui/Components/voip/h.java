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
    public final Paint f29282a;
    public LinearGradient f29283b;
    public final Paint f29284c;
    public LinearGradient d;
    public final int e;
    public int f29285f;
    public float f29286g;
    public long h;
    public final Matrix f29287i;
    public boolean f29288j;
    public boolean f29289k;
    public boolean f29290l;
    public float f29291m;
    public float f29292n;
    public rg.z1 f29293o;
    public org.telegram.ui.web.q0 f29294p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29282a);
        if (this.f29289k) {
            boolean z10 = this.f29290l;
            Paint paint = this.f29284c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29283b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29282a.setShader(this.f29283b);
        this.f29284c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29288j || this.f29286g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f29292n) + this.f29286g;
                    this.f29286g = f7;
                    if (f7 > this.f29291m) {
                        this.f29286g = 0.0f;
                        org.telegram.ui.web.q0 q0Var = this.f29294p;
                        if (q0Var != null) {
                            q0Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29285f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29286g) - i11;
        Matrix matrix = this.f29287i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29283b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29282a = paint;
        Paint paint2 = new Paint(1);
        this.f29284c = paint2;
        this.f29287i = new Matrix();
        this.f29288j = true;
        this.f29289k = true;
        this.f29290l = false;
        this.f29291m = 1.2f;
        this.f29292n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29283b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29283b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
