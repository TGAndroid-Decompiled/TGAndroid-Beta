package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public final class yp {
    public float f29470g;
    public float f29473k;
    public final Path f29466a = new Path();
    public final float[] f29467b = new float[4];
    public final float[] f29468c = new float[4];
    public final Matrix d = new Matrix();
    public final float h = 1.0f;
    public final Random f29471i = new Random();
    public final int f29469f = 6;
    public final float e = (float) (Math.tan(3.141592653589793d / 12) * 1.3333333333333333d);
    public final float[] f29472j = new float[6];

    public yp() {
        for (int i10 = 0; i10 < this.f29469f; i10++) {
            this.f29472j[i10] = (this.f29471i.nextInt() % 100) / 100.0f;
        }
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        float f11;
        int i10;
        float f12;
        yp ypVar = this;
        float f13 = ypVar.f29470g;
        float f14 = (f13 - 0.0f) - 0.0f;
        float f15 = f13 + 0.0f + 0.0f;
        float max = Math.max(f14, f15);
        float f16 = ypVar.e;
        float f17 = max * f16 * ypVar.h;
        Path path = ypVar.f29466a;
        path.reset();
        int i11 = 0;
        while (true) {
            int i12 = ypVar.f29469f;
            if (i11 < i12) {
                Matrix matrix = ypVar.d;
                matrix.reset();
                float f18 = 360.0f / i12;
                matrix.setRotate(i11 * f18, f7, f10);
                if (i11 % 2 == 0) {
                    f11 = f14;
                } else {
                    f11 = f15;
                }
                float f19 = ypVar.f29473k;
                float[] fArr = ypVar.f29472j;
                float f20 = (fArr[i11] * f19) + f11;
                float[] fArr2 = ypVar.f29467b;
                fArr2[0] = f7;
                float f21 = f10 - f20;
                fArr2[1] = f21;
                float f22 = f15;
                fArr2[2] = com.google.android.gms.internal.vision.e2.x(f19, fArr[i11], f16, f7 + f17);
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
                float f23 = ypVar.f29473k;
                float[] fArr3 = ypVar.f29468c;
                fArr3[0] = f7;
                float f24 = f10 - ((fArr[i10] * f23) + f12);
                fArr3[1] = f24;
                float f25 = f14;
                fArr3[2] = com.google.android.gms.internal.vision.e2.x(f23, fArr[i10], f16, f7 - f17);
                fArr3[3] = f24;
                matrix.reset();
                matrix.setRotate(f18 * i10, f7, f10);
                matrix.mapPoints(fArr3);
                if (i11 == 0) {
                    path.moveTo(fArr2[0], fArr2[1]);
                }
                path.cubicTo(fArr2[2], fArr2[3], fArr3[2], fArr3[3], fArr3[0], fArr3[1]);
                i11 = i13;
                f15 = f22;
                f14 = f25;
                ypVar = this;
            } else {
                canvas.save();
                canvas.rotate(0.0f, f7, f10);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }
}
