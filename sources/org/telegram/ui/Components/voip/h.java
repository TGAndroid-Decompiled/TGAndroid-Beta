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
    public final Paint f29276a;
    public LinearGradient f29277b;
    public final Paint f29278c;
    public LinearGradient d;
    public final int e;
    public int f29279f;
    public float f29280g;
    public long h;
    public final Matrix f29281i;
    public boolean f29282j;
    public boolean f29283k;
    public boolean f29284l;
    public float f29285m;
    public float f29286n;
    public rg.z1 f29287o;
    public org.telegram.ui.web.q0 f29288p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f7, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f7, f7, this.f29276a);
        if (this.f29283k) {
            boolean z10 = this.f29284l;
            Paint paint = this.f29278c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f7 = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29277b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, i11), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f29276a.setShader(this.f29277b);
        this.f29278c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f29282j || this.f29280g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.h;
            if (j3 != 0) {
                long j10 = currentTimeMillis - j3;
                if (j10 > 10) {
                    float f7 = ((((float) j10) / 1200.0f) * this.f29286n) + this.f29280g;
                    this.f29280g = f7;
                    if (f7 > this.f29285m) {
                        this.f29280g = 0.0f;
                        org.telegram.ui.web.q0 q0Var = this.f29288p;
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
        int i10 = this.f29279f;
        int i11 = this.e;
        float f10 = (((i11 * 2) + i10) * this.f29280g) - i11;
        Matrix matrix = this.f29281i;
        matrix.reset();
        matrix.setTranslate(f10, 0.0f);
        this.f29277b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29276a = paint;
        Paint paint2 = new Paint(1);
        this.f29278c = paint2;
        this.f29281i = new Matrix();
        this.f29282j = true;
        this.f29283k = true;
        this.f29284l = false;
        this.f29285m = 1.2f;
        this.f29286n = 1.0f;
        int dp = AndroidUtilities.dp(i12);
        this.e = dp;
        float f7 = dp;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29277b = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i10), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{0, i0.a.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f29277b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
