package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kd {
    public float f27933a;
    public float f27934b;
    public float f27935c;
    public float d;
    public float f27936e;
    public float f27937f;
    public int f27938g;
    public float[] f27941k;
    public float[] f27942l;
    public float[] f27943m;
    public float[] f27944n;
    public float[] f27945o;
    public float[] f27946p;
    public float[] f27947q;
    public float[] f27948r;
    public float[] f27949s;
    public float[] f27950t;
    public float[] f27951u;
    public float[] v;
    public float[] f27952w;
    public int f27953x;
    public int h = -11318601;
    public final Paint f27939i = new Paint(1);
    public final Random f27940j = new Random();
    public int f27954y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27939i;
        paint.setColor(i10);
        paint.setAlpha((this.f27938g * this.f27954y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd.b(int):void");
    }

    public final void c(int i10) {
        this.f27953x = i10;
        this.f27941k = new float[i10];
        this.f27942l = new float[i10];
        this.f27943m = new float[i10];
        this.f27944n = new float[i10];
        this.f27945o = new float[i10];
        this.f27946p = new float[i10];
        this.f27947q = new float[i10];
        this.f27948r = new float[i10];
        this.f27949s = new float[i10];
        this.f27950t = new float[i10];
        this.f27951u = new float[i10];
        this.v = new float[i10];
        this.f27952w = new float[i10];
        for (int i11 = 0; i11 < this.f27953x; i11++) {
            float[] fArr = this.f27941k;
            Random random = this.f27940j;
            fArr[i11] = random.nextFloat();
            this.f27943m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27953x;
            b(i11);
            this.f27945o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27953x; i10++) {
            float[] fArr = this.f27945o;
            float f10 = fArr[i10];
            float f11 = this.f27946p[i10];
            jd jdVar = ld.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27941k[i10] = this.f27942l[i10];
                this.f27943m[i10] = this.f27944n[i10];
                b(i10);
            }
        }
    }
}
