package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class kc {
    public float f27708a;
    public float f27709b;
    public float f27710c;
    public float d;
    public float e;
    public float f27711f;
    public int f27712g;
    public float[] f27715k;
    public float[] f27716l;
    public float[] f27717m;
    public float[] f27718n;
    public float[] f27719o;
    public float[] f27720p;
    public float[] f27721q;
    public float[] f27722r;
    public float[] f27723s;
    public float[] f27724t;
    public float[] f27725u;
    public float[] v;
    public float[] f27726w;
    public int f27727x;
    public int h = -11318601;
    public final Paint f27713i = new Paint(1);
    public final Random f27714j = new Random();
    public int f27728y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f27713i;
        paint.setColor(i10);
        paint.setAlpha((this.f27712g * this.f27728y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kc.b(int):void");
    }

    public final void c(int i10) {
        this.f27727x = i10;
        this.f27715k = new float[i10];
        this.f27716l = new float[i10];
        this.f27717m = new float[i10];
        this.f27718n = new float[i10];
        this.f27719o = new float[i10];
        this.f27720p = new float[i10];
        this.f27721q = new float[i10];
        this.f27722r = new float[i10];
        this.f27723s = new float[i10];
        this.f27724t = new float[i10];
        this.f27725u = new float[i10];
        this.v = new float[i10];
        this.f27726w = new float[i10];
        for (int i11 = 0; i11 < this.f27727x; i11++) {
            float[] fArr = this.f27715k;
            Random random = this.f27714j;
            fArr[i11] = random.nextFloat();
            this.f27717m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f27727x;
            b(i11);
            this.f27719o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f27727x; i10++) {
            float[] fArr = this.f27719o;
            float f10 = fArr[i10];
            float f11 = this.f27720p[i10];
            nh.a aVar = lc.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f27715k[i10] = this.f27716l[i10];
                this.f27717m[i10] = this.f27718n[i10];
                b(i10);
            }
        }
    }
}
