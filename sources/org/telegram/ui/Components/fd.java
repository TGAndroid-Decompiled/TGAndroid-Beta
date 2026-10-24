package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class fd {
    public float f26288a;
    public float f26289b;
    public float f26290c;
    public float d;
    public float e;
    public float f26291f;
    public int f26292g;
    public float[] f26295k;
    public float[] f26296l;
    public float[] f26297m;
    public float[] f26298n;
    public float[] f26299o;
    public float[] f26300p;
    public float[] f26301q;
    public float[] f26302r;
    public float[] f26303s;
    public float[] f26304t;
    public float[] f26305u;
    public float[] v;
    public float[] f26306w;
    public int f26307x;
    public int h = -11318601;
    public final Paint f26293i = new Paint(1);
    public final Random f26294j = new Random();
    public int f26308y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f26293i;
        paint.setColor(i10);
        paint.setAlpha((this.f26292g * this.f26308y) / 255);
    }

    public final void b(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fd.b(int):void");
    }

    public final void c(int i10) {
        this.f26307x = i10;
        this.f26295k = new float[i10];
        this.f26296l = new float[i10];
        this.f26297m = new float[i10];
        this.f26298n = new float[i10];
        this.f26299o = new float[i10];
        this.f26300p = new float[i10];
        this.f26301q = new float[i10];
        this.f26302r = new float[i10];
        this.f26303s = new float[i10];
        this.f26304t = new float[i10];
        this.f26305u = new float[i10];
        this.v = new float[i10];
        this.f26306w = new float[i10];
        for (int i11 = 0; i11 < this.f26307x; i11++) {
            float[] fArr = this.f26295k;
            Random random = this.f26294j;
            fArr[i11] = random.nextFloat();
            this.f26297m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f26307x;
            b(i11);
            this.f26299o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f7) {
        for (int i10 = 0; i10 < this.f26307x; i10++) {
            float[] fArr = this.f26299o;
            float f10 = fArr[i10];
            float f11 = this.f26300p[i10];
            ed edVar = gd.H;
            float f12 = (f11 * f7 * 8.2f) + (0.8f * f11) + f10;
            fArr[i10] = f12;
            if (f12 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f26295k[i10] = this.f26296l[i10];
                this.f26297m[i10] = this.f26298n[i10];
                b(i10);
            }
        }
    }
}
