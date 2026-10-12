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
    public final Paint f30193a;
    public LinearGradient f30194b;
    public final Paint f30195c;
    public LinearGradient d;
    public final int e;
    public int f30196f;
    public float f30197g;
    public long h;
    public final Matrix f30198i;
    public boolean f30199j;
    public boolean f30200k;
    public boolean f30201l;
    public float f30202m;
    public float f30203n;
    public sg.a2 f30204o;
    public rh.j f30205p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f30193a);
        if (this.f30200k) {
            boolean z10 = this.f30201l;
            Paint paint = this.f30195c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30194b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f30193a.setShader(this.f30194b);
        this.f30195c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f30199j || this.f30197g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f7 = ((((float) j11) / 1200.0f) * this.f30203n) + this.f30197g;
                    this.f30197g = f7;
                    if (f7 > this.f30202m) {
                        this.f30197g = 0.0f;
                        rh.j jVar = this.f30205p;
                        if (jVar != null) {
                            jVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f30196f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f30197g) - i11;
        Matrix matrix = this.f30198i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f30194b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f30193a = paint;
        Paint paint2 = new Paint(1);
        this.f30195c = paint2;
        this.f30198i = new Matrix();
        this.f30199j = true;
        this.f30200k = true;
        this.f30201l = false;
        this.f30202m = 1.2f;
        this.f30203n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30194b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f30194b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
