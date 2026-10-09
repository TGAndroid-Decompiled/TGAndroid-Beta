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
    public final Paint f31951a;
    public LinearGradient f31952b;
    public final Paint f31953c;
    public LinearGradient d;
    public final int f31954e;
    public int f31955f;
    public float f31956g;
    public long h;
    public final Matrix f31957i;
    public boolean f31958j;
    public boolean f31959k;
    public boolean f31960l;
    public float f31961m;
    public float f31962n;
    public rg.a2 f31963o;
    public org.telegram.ui.web.q0 f31964p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f31951a);
        if (this.f31959k) {
            boolean z10 = this.f31960l;
            Paint paint = this.f31953c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.f31954e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31952b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f31951a.setShader(this.f31952b);
        this.f31953c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f31958j || this.f31956g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f31962n) + this.f31956g;
                    this.f31956g = f7;
                    if (f7 > this.f31961m) {
                        this.f31956g = 0.0f;
                        org.telegram.ui.web.q0 q0Var = this.f31964p;
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
        int i10 = this.f31955f;
        int i11 = this.f31954e;
        float f10 = (((i11 * 2) + i10) * this.f31956g) - i11;
        Matrix matrix = this.f31957i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f31952b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31951a = paint;
        Paint paint2 = new Paint(1);
        this.f31953c = paint2;
        this.f31957i = new Matrix();
        this.f31958j = true;
        this.f31959k = true;
        this.f31960l = false;
        this.f31961m = 1.2f;
        this.f31962n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f31954e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f31952b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f31952b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
