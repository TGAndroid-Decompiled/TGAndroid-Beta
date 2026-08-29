package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public final class mp {
    public float f30747g;
    public float f30750k;
    public final Path f30742a = new Path();
    public final float[] f30743b = new float[4];
    public final float[] f30744c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;
    public final Random f30748i = new Random();
    public final int f30746f = 6;
    public final float f30745e = (float) (Math.tan(3.141592653589793d / 12) * 1.3333333333333333d);
    public final float[] f30749j = new float[6];

    public mp() {
        for (int i10 = 0; i10 < this.f30746f; i10++) {
            this.f30749j[i10] = (this.f30748i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f9, float f10, Canvas canvas, Paint paint) {
        float f11;
        int i10;
        float f12;
        mp mpVar = this;
        float f13 = mpVar.f30747g;
        float f14 = (f13 - 0.0f) - 0.0f;
        float f15 = f13 + 0.0f + 0.0f;
        float max = Math.max(f14, f15);
        float f16 = mpVar.f30745e;
        float f17 = max * f16 * mpVar.h;
        Path path = mpVar.f30742a;
        path.reset();
        int i11 = 0;
        while (true) {
            int i12 = mpVar.f30746f;
            if (i11 < i12) {
                Matrix matrix = mpVar.d;
                matrix.reset();
                float f18 = 360.0f / i12;
                matrix.setRotate(i11 * f18, f9, f10);
                if (i11 % 2 == 0) {
                    f11 = f14;
                } else {
                    f11 = f15;
                }
                float f19 = mpVar.f30750k;
                float[] fArr = mpVar.f30749j;
                float f20 = (fArr[i11] * f19) + f11;
                float[] fArr2 = mpVar.f30743b;
                fArr2[0] = f9;
                float f21 = f10 - f20;
                fArr2[1] = f21;
                float f22 = f15;
                fArr2[2] = com.google.android.recaptcha.internal.a.x(f19, fArr[i11], f16, f9 + f17);
                fArr2[3] = f21;
                matrix.mapPoints(fArr2);
                int i13 = i11 + 1;
                if (i13 >= i12) {
                    i10 = 0;
                } else {
                    i10 = i13;
                }
                if (i10 % 2 == 0) {
                    f12 = f14;
                } else {
                    f12 = f22;
                }
                float f23 = mpVar.f30750k;
                float[] fArr3 = mpVar.f30744c;
                fArr3[0] = f9;
                float f24 = f10 - ((fArr[i10] * f23) + f12);
                fArr3[1] = f24;
                float f25 = f14;
                fArr3[2] = com.google.android.recaptcha.internal.a.x(f23, fArr[i10], f16, f9 - f17);
                fArr3[3] = f24;
                matrix.reset();
                matrix.setRotate(f18 * i10, f9, f10);
                matrix.mapPoints(fArr3);
                if (i11 == 0) {
                    path.moveTo(fArr2[0], fArr2[1]);
                }
                path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
                i11 = i13;
                f15 = f22;
                f14 = f25;
                mpVar = this;
            } else {
                canvas.save();
                canvas.rotate(0.0f, f9, f10);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }
}
