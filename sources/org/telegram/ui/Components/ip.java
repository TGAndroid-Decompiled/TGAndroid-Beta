package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public final class ip {
    public float f29501g;
    public float f29504k;
    public final Path f29496a = new Path();
    public final float[] f29497b = new float[4];
    public final float[] f29498c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;
    public final Random f29502i = new Random();
    public final int f29500f = 6;
    public final float f29499e = (float) (Math.tan(3.141592653589793d / 12) * 1.3333333333333333d);
    public final float[] f29503j = new float[6];

    public ip() {
        for (int i9 = 0; i9 < this.f29500f; i9++) {
            this.f29503j[i9] = (this.f29502i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        float f12;
        int i9;
        float f13;
        ip ipVar = this;
        float f14 = ipVar.f29501g;
        float f15 = (f14 - 0.0f) - 0.0f;
        float f16 = f14 + 0.0f + 0.0f;
        float max = Math.max(f15, f16);
        float f17 = ipVar.f29499e;
        float f18 = max * f17 * ipVar.h;
        Path path = ipVar.f29496a;
        path.reset();
        int i10 = 0;
        while (true) {
            int i11 = ipVar.f29500f;
            if (i10 < i11) {
                Matrix matrix = ipVar.d;
                matrix.reset();
                float f19 = 360.0f / i11;
                matrix.setRotate(i10 * f19, f10, f11);
                if (i10 % 2 == 0) {
                    f12 = f15;
                } else {
                    f12 = f16;
                }
                float f20 = ipVar.f29504k;
                float[] fArr = ipVar.f29503j;
                float f21 = (fArr[i10] * f20) + f12;
                float[] fArr2 = ipVar.f29497b;
                fArr2[0] = f10;
                float f22 = f11 - f21;
                fArr2[1] = f22;
                float f23 = f16;
                fArr2[2] = e2.c.x(f20, fArr[i10], f17, f10 + f18);
                fArr2[3] = f22;
                matrix.mapPoints(fArr2);
                int i12 = i10 + 1;
                if (i12 >= i11) {
                    i9 = 0;
                } else {
                    i9 = i12;
                }
                if (i9 % 2 == 0) {
                    f13 = f15;
                } else {
                    f13 = f23;
                }
                float f24 = ipVar.f29504k;
                float[] fArr3 = ipVar.f29498c;
                fArr3[0] = f10;
                float f25 = f11 - ((fArr[i9] * f24) + f13);
                fArr3[1] = f25;
                float f26 = f15;
                fArr3[2] = e2.c.x(f24, fArr[i9], f17, f10 - f18);
                fArr3[3] = f25;
                matrix.reset();
                matrix.setRotate(f19 * i9, f10, f11);
                matrix.mapPoints(fArr3);
                if (i10 == 0) {
                    path.moveTo(fArr2[0], fArr2[1]);
                }
                path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
                i10 = i12;
                f16 = f23;
                f15 = f26;
                ipVar = this;
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
