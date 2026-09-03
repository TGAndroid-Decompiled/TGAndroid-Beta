package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public final class sp {
    public float f31155g;
    public float f31158k;
    public final Path f31150a = new Path();
    public final float[] f31151b = new float[4];
    public final float[] f31152c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;
    public final Random f31156i = new Random();
    public final int f31154f = 6;
    public final float f31153e = (float) (Math.tan(3.141592653589793d / 12) * 1.3333333333333333d);
    public final float[] f31157j = new float[6];

    public sp() {
        for (int i10 = 0; i10 < this.f31154f; i10++) {
            this.f31157j[i10] = (this.f31156i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        float f12;
        int i10;
        float f13;
        sp spVar = this;
        float f14 = spVar.f31155g;
        float f15 = (f14 - 0.0f) - 0.0f;
        float f16 = f14 + 0.0f + 0.0f;
        float max = Math.max(f15, f16);
        float f17 = spVar.f31153e;
        float f18 = max * f17 * spVar.h;
        Path path = spVar.f31150a;
        path.reset();
        int i11 = 0;
        while (true) {
            int i12 = spVar.f31154f;
            if (i11 < i12) {
                Matrix matrix = spVar.d;
                matrix.reset();
                float f19 = 360.0f / i12;
                matrix.setRotate(i11 * f19, f10, f11);
                if (i11 % 2 == 0) {
                    f12 = f15;
                } else {
                    f12 = f16;
                }
                float f20 = spVar.f31158k;
                float[] fArr = spVar.f31157j;
                float f21 = (fArr[i11] * f20) + f12;
                float[] fArr2 = spVar.f31151b;
                fArr2[0] = f10;
                float f22 = f11 - f21;
                fArr2[1] = f22;
                float f23 = f16;
                fArr2[2] = e2.c.u(f20, fArr[i11], f17, f10 + f18);
                fArr2[3] = f22;
                matrix.mapPoints(fArr2);
                int i13 = i11 + 1;
                if (i13 >= i12) {
                    i10 = 0;
                } else {
                    i10 = i13;
                }
                if (i10 % 2 == 0) {
                    f13 = f15;
                } else {
                    f13 = f23;
                }
                float f24 = spVar.f31158k;
                float[] fArr3 = spVar.f31152c;
                fArr3[0] = f10;
                float f25 = f11 - ((fArr[i10] * f24) + f13);
                fArr3[1] = f25;
                float f26 = f15;
                fArr3[2] = e2.c.u(f24, fArr[i10], f17, f10 - f18);
                fArr3[3] = f25;
                matrix.reset();
                matrix.setRotate(f19 * i10, f10, f11);
                matrix.mapPoints(fArr3);
                if (i11 == 0) {
                    path.moveTo(fArr2[0], fArr2[1]);
                }
                path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
                i11 = i13;
                f16 = f23;
                f15 = f26;
                spVar = this;
            } else {
                canvas.save();
                canvas.rotate(0.0f, f10, f11);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }
}
