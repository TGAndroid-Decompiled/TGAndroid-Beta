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
    public final Paint f33716a;
    public LinearGradient f33717b;
    public final Paint f33718c;
    public LinearGradient d;
    public final int f33719e;
    public int f33720f;
    public float f33721g;
    public long h;
    public final Matrix f33722i;
    public boolean f33723j;
    public boolean f33724k;
    public boolean f33725l;
    public float f33726m;
    public float f33727n;
    public cg.w2 f33728o;
    public a4.g f33729p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f9, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f9, f9, this.f33716a);
        if (this.f33724k) {
            boolean z10 = this.f33725l;
            Paint paint = this.f33718c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f9, f9, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f9 = this.f33719e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33717b = new LinearGradient(0.0f, 0.0f, f9, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f9, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f33716a.setShader(this.f33717b);
        this.f33718c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f33723j || this.f33721g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f9 = ((((float) j11) / 1200.0f) * this.f33727n) + this.f33721g;
                    this.f33721g = f9;
                    if (f9 > this.f33726m) {
                        this.f33721g = 0.0f;
                        a4.g gVar = this.f33729p;
                        if (gVar != null) {
                            gVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f33720f;
        int i11 = this.f33719e;
        float f10 = (((i11 * 2) + i10) * this.f33721g) - i11;
        Matrix matrix = this.f33722i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f33717b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f33716a = paint;
        Paint paint2 = new Paint(1);
        this.f33718c = paint2;
        this.f33722i = new Matrix();
        this.f33723j = true;
        this.f33724k = true;
        this.f33725l = false;
        this.f33726m = 1.2f;
        this.f33727n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.f33719e = dp;
        float f9 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33717b = new LinearGradient(0.0f, 0.0f, f9, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f9, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f33717b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
