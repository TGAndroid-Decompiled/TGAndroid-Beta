package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kd {
    public float f27925a;
    public float f27926b;
    public float f27927c;
    public float d;
    public float f27928e;
    public float f27929f;
    public int f27930g;
    public float[] f27933k;
    public float[] f27934l;
    public float[] f27935m;
    public float[] f27936n;
    public float[] f27937o;
    public float[] f27938p;
    public float[] f27939q;
    public float[] f27940r;
    public float[] f27941s;
    public float[] f27942t;
    public float[] f27943u;
    public float[] v;
    public float[] f27944w;
    public int f27945x;
    public int h = -11318601;
    public final Paint f27931i = new Paint(1);
    public final Random f27932j = new Random();
    public int f27946y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27931i;
        paint.setColor(i10);
        paint.setAlpha((this.f27930g * this.f27946y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd.b(int):void");
    }

    public final void c(int i10) {
        this.f27945x = i10;
        this.f27933k = new float[i10];
        this.f27934l = new float[i10];
        this.f27935m = new float[i10];
        this.f27936n = new float[i10];
        this.f27937o = new float[i10];
        this.f27938p = new float[i10];
        this.f27939q = new float[i10];
        this.f27940r = new float[i10];
        this.f27941s = new float[i10];
        this.f27942t = new float[i10];
        this.f27943u = new float[i10];
        this.v = new float[i10];
        this.f27944w = new float[i10];
        for (int i11 = 0; i11 < this.f27945x; i11++) {
            float[] fArr = this.f27933k;
            Random random = this.f27932j;
            fArr[i11] = random.nextFloat();
            this.f27935m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27945x;
            b(i11);
            this.f27937o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27945x; i10++) {
            float[] fArr = this.f27937o;
            float f10 = fArr[i10];
            float f11 = this.f27938p[i10];
            jd jdVar = ld.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27933k[i10] = this.f27934l[i10];
                this.f27935m[i10] = this.f27936n[i10];
                b(i10);
            }
        }
    }
}
