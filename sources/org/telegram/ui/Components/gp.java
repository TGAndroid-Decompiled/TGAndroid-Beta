package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;

public final class gp {

    public float f28792g;

    public float f28795k;

    public final Path f28787a = new Path();

    public final float[] f28788b = new float[4];

    public final float[] f28789c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;

    public final Random f28793i = new Random();

    public final int f28791f = 6;

    public final float f28790e = (float) (Math.tan(3.141592653589793d / ((double) 12)) * 1.3333333333333333d);

    public final float[] f28794j = new float[6];

    public gp() {
        for (int i10 = 0; i10 < this.f28791f; i10++) {
            this.f28794j[i10] = (this.f28793i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        gp gpVar = this;
        float f12 = gpVar.f28792g;
        float f13 = (f12 - 0.0f) - 0.0f;
        float f14 = f12 + 0.0f + 0.0f;
        float fMax = Math.max(f13, f14);
        float f15 = gpVar.f28790e;
        float f16 = fMax * f15 * gpVar.h;
        Path path = gpVar.f28787a;
        path.reset();
        int i10 = 0;
        while (true) {
            int i11 = gpVar.f28791f;
            if (i10 >= i11) {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            Matrix matrix = gpVar.d;
            matrix.reset();
            float f17 = 360.0f / i11;
            matrix.setRotate(i10 * f17, f10, f11);
            float f18 = i10 % 2 == 0 ? f13 : f14;
            float f19 = gpVar.f28795k;
            float[] fArr = gpVar.f28794j;
            float f20 = (fArr[i10] * f19) + f18;
            float[] fArr2 = gpVar.f28788b;
            fArr2[0] = f10;
            float f21 = f11 - f20;
            fArr2[1] = f21;
            float f22 = f14;
            fArr2[2] = com.google.android.recaptcha.internal.a.x(f19, fArr[i10], f15, f10 + f16);
            fArr2[3] = f21;
            matrix.mapPoints(fArr2);
            int i12 = i10 + 1;
            int i13 = i12 >= i11 ? 0 : i12;
            float f23 = i13 % 2 == 0 ? f13 : f22;
            float f24 = gpVar.f28795k;
            float f25 = (fArr[i13] * f24) + f23;
            float[] fArr3 = gpVar.f28789c;
            fArr3[0] = f10;
            float f26 = f11 - f25;
            fArr3[1] = f26;
            float f27 = f13;
            fArr3[2] = com.google.android.recaptcha.internal.a.x(f24, fArr[i13], f15, f10 - f16);
            fArr3[3] = f26;
            matrix.reset();
            matrix.setRotate(f17 * i13, f10, f11);
            matrix.mapPoints(fArr3);
            if (i10 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            }
            path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
            i10 = i12;
            f14 = f22;
            f13 = f27;
            gpVar = this;
        }
    }
}
