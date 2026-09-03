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
    public final Paint f29625a;
    public LinearGradient f29626b;
    public final Paint f29627c;
    public LinearGradient d;
    public final int e;
    public int f29628f;
    public float f29629g;
    public long h;
    public final Matrix f29630i;
    public boolean f29631j;
    public boolean f29632k;
    public boolean f29633l;
    public float f29634m;
    public float f29635n;
    public eg.u2 f29636o;
    public e3.h f29637p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f29625a);
        if (this.f29632k) {
            boolean z4 = this.f29633l;
            Paint paint = this.f29627c;
            if (z4) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f10 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29626b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29625a.setShader(this.f29626b);
        this.f29627c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29631j || this.f29629g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = currentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((((float) j11) / 1200.0f) * this.f29635n) + this.f29629g;
                    this.f29629g = f10;
                    if (f10 > this.f29634m) {
                        this.f29629g = 0.0f;
                        e3.h hVar = this.f29637p;
                        if (hVar != null) {
                            hVar.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i10 = this.f29628f;
        int i11 = this.e;
        float f11 = (((i11 * 2) + i10) * this.f29629g) - i11;
        Matrix matrix = this.f29630i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f29626b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29625a = paint;
        Paint paint2 = new Paint(1);
        this.f29627c = paint2;
        this.f29630i = new Matrix();
        this.f29631j = true;
        this.f29632k = true;
        this.f29633l = false;
        this.f29634m = 1.2f;
        this.f29635n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f10 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29626b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29626b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
