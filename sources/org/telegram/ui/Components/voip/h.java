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
    public final Paint f32051a;
    public LinearGradient f32052b;
    public final Paint f32053c;
    public LinearGradient d;
    public final int f32054e;
    public int f32055f;
    public float f32056g;
    public long h;
    public final Matrix f32057i;
    public boolean f32058j;
    public boolean f32059k;
    public boolean f32060l;
    public float f32061m;
    public float f32062n;
    public fg.t2 f32063o;
    public eh.m f32064p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f32051a);
        if (this.f32059k) {
            boolean z4 = this.f32060l;
            Paint paint = this.f32053c;
            if (z4) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f10 = this.f32054e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32052b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f32051a.setShader(this.f32052b);
        this.f32053c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f32058j || this.f32056g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((((float) j11) / 1200.0f) * this.f32062n) + this.f32056g;
                    this.f32056g = f10;
                    if (f10 > this.f32061m) {
                        this.f32056g = 0.0f;
                        eh.m mVar = this.f32064p;
                        if (mVar != null) {
                            mVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f32055f;
        int i11 = this.f32054e;
        float f11 = (((i11 * 2) + i10) * this.f32056g) - i11;
        Matrix matrix = this.f32057i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f32052b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f32051a = paint;
        Paint paint2 = new Paint(1);
        this.f32053c = paint2;
        this.f32057i = new Matrix();
        this.f32058j = true;
        this.f32059k = true;
        this.f32060l = false;
        this.f32061m = 1.2f;
        this.f32062n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f32054e = dp;
        float f10 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32052b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f32052b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
