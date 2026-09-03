package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.Random;
public final class yc {
    public float f30979a;
    public float f30980b;
    public float f30981c;
    public float d;
    public float e;
    public float f30982f;
    public int f30983g;
    public float[] f30986k;
    public float[] f30987l;
    public float[] f30988m;
    public float[] f30989n;
    public float[] f30990o;
    public float[] f30991p;
    public float[] f30992q;
    public float[] f30993r;
    public float[] f30994s;
    public float[] f30995t;
    public float[] f30996u;
    public float[] v;
    public float[] f30997w;
    public int f30998x;
    public int h = -11318601;
    public final Paint f30984i = new Paint(1);
    public final Random f30985j = new Random();
    public int f30999y = 255;

    public final void a() {
        int i10 = this.h;
        Paint paint = this.f30984i;
        paint.setColor(i10);
        paint.setAlpha((this.f30983g * this.f30999y) / 255);
    }

    public final void b(int i10) {
        float f10 = 0.18f / this.f30998x;
        float f11 = this.f30986k[i10];
        Random random = this.f30985j;
        float nextFloat = ((random.nextFloat() - 0.5f) * 2.0f * 0.35f) + f11;
        float[] fArr = this.f30987l;
        if (nextFloat < 0.0f) {
            nextFloat = 0.0f;
        } else if (nextFloat > 1.0f) {
            nextFloat = 1.0f;
        }
        fArr[i10] = nextFloat;
        float nextFloat2 = ((random.nextFloat() - 0.5f) * 2.0f * f10 * 0.35f) + this.f30988m[i10];
        float[] fArr2 = this.f30989n;
        float f12 = -f10;
        if (nextFloat2 < f12) {
            f10 = f12;
        } else if (nextFloat2 <= f10) {
            f10 = nextFloat2;
        }
        fArr2[i10] = f10;
        this.f30991p[i10] = ((random.nextFloat() * 0.003f) + 0.017f) * this.f30979a;
    }

    public final void c(int i10) {
        this.f30998x = i10;
        this.f30986k = new float[i10];
        this.f30987l = new float[i10];
        this.f30988m = new float[i10];
        this.f30989n = new float[i10];
        this.f30990o = new float[i10];
        this.f30991p = new float[i10];
        this.f30992q = new float[i10];
        this.f30993r = new float[i10];
        this.f30994s = new float[i10];
        this.f30995t = new float[i10];
        this.f30996u = new float[i10];
        this.v = new float[i10];
        this.f30997w = new float[i10];
        for (int i11 = 0; i11 < this.f30998x; i11++) {
            float[] fArr = this.f30986k;
            Random random = this.f30985j;
            fArr[i11] = random.nextFloat();
            this.f30988m[i11] = (((random.nextFloat() - 0.5f) * 2.0f) * 0.18f) / this.f30998x;
            b(i11);
            this.f30990o[i11] = random.nextFloat();
        }
        a();
    }

    public final void d(float f10) {
        for (int i10 = 0; i10 < this.f30998x; i10++) {
            float[] fArr = this.f30990o;
            float f11 = fArr[i10];
            float f12 = this.f30991p[i10];
            ih.a aVar = zc.H;
            float f13 = (f12 * f10 * 8.2f) + (0.8f * f12) + f11;
            fArr[i10] = f13;
            if (f13 >= 1.0f) {
                fArr[i10] = 0.0f;
                this.f30986k[i10] = this.f30987l[i10];
                this.f30988m[i10] = this.f30989n[i10];
                b(i10);
            }
        }
    }
}
