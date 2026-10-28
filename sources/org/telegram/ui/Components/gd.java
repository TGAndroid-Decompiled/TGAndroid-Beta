package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class gd {
    public float f28543a;
    public float f28544b;
    public float f28545c;
    public float d;
    public float e;
    public float f28546f;
    public int f28547g;
    public float[] f28550k;
    public float[] f28551l;
    public float[] f28552m;
    public float[] f28553n;
    public float[] f28554o;
    public float[] f28555p;
    public float[] f28556q;
    public float[] f28557r;
    public float[] f28558s;
    public float[] f28559t;
    public float[] f28560u;
    public float[] v;
    public float[] f28561w;
    public int f28562x;
    public int h = -11318601;
    public final Paint f28548i = new Paint(1);
    public final Random f28549j = new Random();
    public int f28563y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f28548i;
        paint.setColor(i10);
        paint.setAlpha((this.f28547g * this.f28563y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gd.b(int):void");
    }

    public final void c(int i10) {
        this.f28562x = i10;
        this.f28550k = new float[i10];
        this.f28551l = new float[i10];
        this.f28552m = new float[i10];
        this.f28553n = new float[i10];
        this.f28554o = new float[i10];
        this.f28555p = new float[i10];
        this.f28556q = new float[i10];
        this.f28557r = new float[i10];
        this.f28558s = new float[i10];
        this.f28559t = new float[i10];
        this.f28560u = new float[i10];
        this.v = new float[i10];
        this.f28561w = new float[i10];
        for (int i11 = 0; i11 < this.f28562x; i11++) {
            float[] fArr = this.f28550k;
            Random random = this.f28549j;
            fArr[i11] = random.nextFloat();
            this.f28552m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f28562x;
            b(i11);
            this.f28554o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f28562x; i10++) {
            float[] fArr = this.f28554o;
            float f10 = fArr[i10];
            float f11 = this.f28555p[i10];
            fd fdVar = hd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f28550k[i10] = this.f28551l[i10];
                this.f28552m[i10] = this.f28553n[i10];
                b(i10);
            }
        }
    }
}
