package org.telegram.ui.Components.voip;

import ag.p3;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class h {

    public final Paint f33587a;

    public LinearGradient f33588b;

    public final Paint f33589c;
    public LinearGradient d;

    public final int f33590e;

    public int f33591f;

    public float f33592g;
    public long h;

    public final Matrix f33593i;

    public boolean f33594j;

    public boolean f33595k;

    public boolean f33596l;

    public float f33597m;

    public float f33598n;

    public p3 f33599o;

    public af.e f33600p;

    public h() {
        this(64, 204, 160);
    }

    public final void a(float f10, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f10, f10, this.f33587a);
        if (this.f33595k) {
            boolean z10 = this.f33596l;
            Paint paint = this.f33589c;
            if (z10) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public final void b(int i10, int i11) {
        float f10 = this.f33590e;
        int[] iArr = {0, i0.b.k(i10, i11), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33588b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.b.k(i10, 204), 0}, (float[]) null, tileMode);
        this.f33587a.setShader(this.f33588b);
        this.f33589c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.f33594j || this.f33592g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.h;
            if (j10 != 0) {
                long j11 = jCurrentTimeMillis - j10;
                if (j11 > 10) {
                    float f10 = ((j11 / 1200.0f) * this.f33598n) + this.f33592g;
                    this.f33592g = f10;
                    if (f10 > this.f33597m) {
                        this.f33592g = 0.0f;
                        af.e eVar = this.f33600p;
                        if (eVar != null) {
                            eVar.run();
                        }
                    }
                    this.h = jCurrentTimeMillis;
                }
            } else {
                this.h = jCurrentTimeMillis;
            }
        }
        int i10 = this.f33591f;
        int i11 = this.f33590e;
        float f11 = (((i11 * 2) + i10) * this.f33592g) - i11;
        Matrix matrix = this.f33593i;
        matrix.reset();
        matrix.setTranslate(f11, 0.0f);
        this.f33588b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public h(int i10, int i11) {
        this(i10, i11, 160);
    }

    public h(int i10, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f33587a = paint;
        Paint paint2 = new Paint(1);
        this.f33589c = paint2;
        this.f33593i = new Matrix();
        this.f33594j = true;
        this.f33595k = true;
        this.f33596l = false;
        this.f33597m = 1.2f;
        this.f33598n = 1.0f;
        int iDp = AndroidUtilities.dp(i12);
        this.f33590e = iDp;
        float f10 = iDp;
        int[] iArr = {0, i0.b.k(-1, i10), 0};
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f33588b = new LinearGradient(0.0f, 0.0f, f10, 0.0f, iArr, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{0, i0.b.k(-1, i11), 0}, (float[]) null, tileMode);
        paint.setShader(this.f33588b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
