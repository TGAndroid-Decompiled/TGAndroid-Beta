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
    public final Paint f29286a;
    public LinearGradient f29287b;
    public final Paint f29288c;
    public LinearGradient d;
    public final int e;
    public int f29289f;
    public float f29290g;
    public long h;
    public final Matrix f29291i;
    public boolean f29292j;
    public boolean f29293k;
    public boolean f29294l;
    public float f29295m;
    public float f29296n;
    public rg.z1 f29297o;
    public org.telegram.ui.web.q0 f29298p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29286a);
        if (this.f29293k) {
            boolean z10 = this.f29294l;
            Paint paint = this.f29288c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29287b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29286a.setShader(this.f29287b);
        this.f29288c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29292j || this.f29290g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f29296n) + this.f29290g;
                    this.f29290g = f7;
                    if (f7 > this.f29295m) {
                        this.f29290g = 0.0f;
                        org.telegram.ui.web.q0 q0Var = this.f29298p;
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
        int i10 = this.f29289f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29290g) - i11;
        Matrix matrix = this.f29291i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29287b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29286a = paint;
        Paint paint2 = new Paint(1);
        this.f29288c = paint2;
        this.f29291i = new Matrix();
        this.f29292j = true;
        this.f29293k = true;
        this.f29294l = false;
        this.f29295m = 1.2f;
        this.f29296n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29287b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29287b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
